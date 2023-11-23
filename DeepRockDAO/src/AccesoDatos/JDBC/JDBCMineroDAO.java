package AccesoDatos.JDBC;

import AccesoDatos.Interfaces.MineroDAO;
import Modelo.Minero;
import Modelo.Partida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCMineroDAO implements MineroDAO {

    private Connection con = null;
    private PreparedStatement pstm = null;
    private ResultSet rs = null;
    private static final String CADENA_CONEXION_BBDD = "jdbc:mysql://localhost:3306/";
    private static final String NOMBRE_BBDD = "DeepRock";
    private static final String USUARIO_BBDD = "root";
    private static final String PASSWD_BBDD = null;

    public void conectar() {
        System.out.println("------------------------------------------------");
        try {
            con = DriverManager.getConnection(CADENA_CONEXION_BBDD + NOMBRE_BBDD, USUARIO_BBDD, PASSWD_BBDD);
            System.out.println("---> Se ha realizado la conexi�n a la base de datos.");
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> No se ha podido abrir la conexi�n con la base de datos.");
        }
    }

    public void desconectar() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
            System.out.println("---> Se ha cerrado la conexi�n a la base de datos.");
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> No se ha podido cerrar la conexi�n con la base de datos.");
        }
        System.out.println("------------------------------------------------");
    }

    @Override
    public boolean retornarMinero(Minero minero, Partida partida) {
        conectar();
        try {
            pstm = con.prepareStatement("UPDATE mineros SET Exp = ?, Mejoras = ? WHERE Clase = ? AND id_to_Partida = ?;");
            pstm.setInt(1, minero.getExp());
            pstm.setInt(2, minero.getMejoras());
            pstm.setString(3, minero.getClase());
            pstm.setInt(4, partida.getId());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            return false;
        } finally {
            desconectar();
        }
        return true;
    }

    @Override
    public Minero obtenerMinero(Partida partida, String clase) {
        conectar();
        try {
            boolean existe = false;
            int exp = -1;
            int mejoras = -1;
            pstm = con.prepareStatement("SELECT * FROM mineros WHERE id_to_Partida = ? AND Clase = ?");
            pstm.setInt(1, partida.getId());
            pstm.setString(2, clase);
            rs = pstm.executeQuery();
            while (rs.next()) {
                existe = true;
                mejoras = rs.getInt(4);
                exp = rs.getInt(2);
            }
            if (existe) {
                return new Minero(partida.getId(), exp, clase, mejoras);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda del minero con ID " + partida.getId() + ".");
            ex.printStackTrace();
        } finally {
            desconectar();
        }
        System.out.println("---> No se ha encontrado ningun minero con id " + partida.getId() + ".");
        return null;
    }

}
