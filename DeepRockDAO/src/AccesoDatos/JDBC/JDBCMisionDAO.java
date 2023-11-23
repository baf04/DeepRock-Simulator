package AccesoDatos.JDBC;

import AccesoDatos.Interfaces.MisionDAO;
import Modelo.Mision;
import Modelo.Partida;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCMisionDAO implements MisionDAO {

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
    public ArrayList<Mision> listarMisiones(Partida partida) {
        conectar();
        try {
            boolean existe = false;
            int experienciaPartida = -1;
            int experienciaMinero = -1;
            int creditos = -1;
            int id = -1;
            String resultado = "";
            String clase = "";
            String dificultad = "";
            Mision mision;
            ArrayList<Mision> misiones = new ArrayList();

            pstm = con.prepareStatement("SELECT * FROM Mision WHERE id_to_Partida = ?");
            pstm.setInt(1, partida.getId());
            rs = pstm.executeQuery();
            while (rs.next()) {
                existe = true;
                id = rs.getInt(1);
                creditos = rs.getInt(5);
                resultado = rs.getString(8);
                clase = rs.getString(4);
                dificultad = rs.getString(3);
                experienciaMinero = rs.getInt(6);
                experienciaPartida = rs.getInt(7);
                mision = new Mision(partida.getId(), id, dificultad, clase, creditos, experienciaPartida, experienciaMinero, resultado);
                misiones.add(mision);
            }
            if (existe) {
                return misiones;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda de la Mision con ID " + partida.getId() + ".");
            ex.printStackTrace();
            desconectar();
        } finally {
            desconectar();
        }
        System.out.println("---> No se ha encontrado ninguna Mision con id " + partida.getId() + ".");
        return null;
    }

    public Mision obtenerMision(int id, Partida partida) {
        try {
            boolean existe = false;
            int experienciaPartida = -1;
            int experienciaMinero = -1;
            int creditos = -1;
            String resultado = "";
            String clase = "";
            String dificultad = "";

            pstm = con.prepareStatement("SELECT * FROM Mision WHERE id_to_Partida = ? AND id = ?");
            pstm.setInt(1, partida.getId());
            pstm.setInt(2, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                existe = true;
                creditos = rs.getInt(5);
                resultado = rs.getString(8);
                clase = rs.getString(4);
                dificultad = rs.getString(3);
                experienciaMinero = rs.getInt(6);
                experienciaPartida = rs.getInt(7);
            }
            if (existe) {
                return new Mision(partida.getId(), id, dificultad, clase, creditos, experienciaPartida, experienciaMinero, resultado);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda de la Mision con ID " + partida.getId() + ".");
            ex.printStackTrace();
        } finally {
            desconectar();
        }
        return null;
    }

    public boolean retornarMision(Mision mision, Partida partida) {
        conectar();
        try {
            int experienciaPartida = mision.getExperienciaPartida();
            int experienciaMinero = mision.getExperienciaMinero();
            int creditos = mision.getCreditos();
            String resultado = mision.getResultado();
            String clase = mision.getClase();
            String dificultad = mision.getDificultad();

            pstm = con.prepareStatement("INSERT INTO Mision (id_to_Partida,Dificultad,Clase,Creditos,ExperienciaPartida,ExperienciaMinero,Resultado) VALUES (?,?,?,?,?,?,?);");
            pstm.setInt(1, partida.getId());
            pstm.setString(2, dificultad);
            pstm.setString(3, clase);
            pstm.setInt(4, creditos);
            pstm.setInt(5, experienciaPartida);
            pstm.setInt(6, experienciaMinero);
            pstm.setString(7, resultado);
            pstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            desconectar();
        }

    }

    @Override
    public boolean eliminarMision(String id, Partida partida) {
        conectar();
        try {

            pstm = con.prepareStatement("DELETE FROM Mision WHERE id_to_Partida = ? AND id = ?");
            pstm.setInt(1, partida.getId());
            pstm.setInt(2, Integer.valueOf(id));
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
    }

    @Override
    public boolean eliminarHistorial(Partida partida) {
        conectar();
        try {

            pstm = con.prepareStatement("DELETE FROM Mision WHERE id_to_Partida = ?");
            pstm.setInt(1, partida.getId());
            pstm.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            desconectar();
        }
    }

    

}
