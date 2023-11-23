package AccesoDatos.JDBC;

import AccesoDatos.Interfaces.PartidaDAO;
import Modelo.Partida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPartidaDAO implements PartidaDAO {

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


    public String obtenerNombre(int id_to_usuario) {
        conectar();
        try {

            pstm = con.prepareStatement("SELECT nombre FROM Partida WHERE id_to_usuarios = ?");
            pstm.setInt(1, id_to_usuario);
            rs = pstm.executeQuery();
            while (rs.next()) {

            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda del minero con ID " + id_to_usuario + ".");
            ex.printStackTrace();
        }finally{
            desconectar();
        }
        System.out.println("---> No se ha encontrado ningun minero con id " + id_to_usuario + ".");
        return null;
    }

    @Override
    public boolean cambiarNombre(String nombre, Partida partida) {
        conectar();
        try {
            pstm = con.prepareStatement("UPDATE partida SET Nombre = ? WHERE id = ? AND id_to_usuarios = ?;");
            pstm.setString(1, nombre);
            pstm.setInt(2, partida.getId());
            pstm.setInt(3, partida.getId_to_usuario());
            return pstm.execute();
            //while (rs.next()) {
                
            //}
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda del minero con ID " + partida.getNombre() + ".");
            ex.printStackTrace();
            return false;
        }finally{
            desconectar();
        }
        
    }

    @Override
    public Partida obtenerPartida(int id_to_usuario, int id) {
        conectar();
        try {
            boolean existe = false;
            int exp = -1;
            int creditos = -1;
            String nombre = "";
            pstm = con.prepareStatement("SELECT * FROM Partida WHERE id_to_usuarios = ? AND id = ?");
            pstm.setInt(1, id_to_usuario);
            pstm.setInt(2, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                existe = true;
                creditos = rs.getInt(5);
                nombre = rs.getString(3);
                exp = rs.getInt(4);
            }
            if (existe) {
                return new Partida(id_to_usuario, id, nombre, exp, creditos);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda del minero con ID " + id_to_usuario + ".");
            ex.printStackTrace();
        }finally{
            desconectar();
        }
        System.out.println("---> No se ha encontrado ningun minero con id " + id_to_usuario + ".");
        return null;
    }


    public int obtenerId(int id_to_usuarios, String nombre) {
        conectar();
        try {
            int id = -1;
            pstm = con.prepareStatement("SELECT * FROM Partida WHERE Nombre = ? AND id_to_usuarios = ?");
            pstm.setString(1, nombre);
            pstm.setInt(2, id_to_usuarios);
            rs = pstm.executeQuery();
            if (rs.next()) {
                rs.getInt(1);
                return id;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda de la partida con ID " + nombre + ".");
            ex.printStackTrace();
        }finally{
            desconectar();
        }
        System.out.println("---> No se ha encontrado ninguna partida con ID " + nombre + ".");
        return -1;
    }
    
    @Override
    public boolean retornarPartida(Partida partida) {
        conectar();
        try {
            pstm = con.prepareStatement("UPDATE partida SET Creditos = ?, Exp = ? WHERE id = ? AND id_to_usuarios = ?;");
            pstm.setInt(1, partida.getCreditos());
            pstm.setInt(2, partida.getExp());
            pstm.setInt(3, partida.getId());
            pstm.setInt(4, partida.getId_to_usuario());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> No se ha podido guardar la partida " + partida.getNombre()  + ".");
            return false;
        }finally{
            desconectar();
        }
        return true;
    }

}
