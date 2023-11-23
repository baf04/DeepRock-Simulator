package AccesoDatos.JDBC;

import AccesoDatos.Interfaces.UsuarioDAO;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUsuarioDAO implements UsuarioDAO {

    private Connection con = null;
    private PreparedStatement pstm = null;
    private ResultSet rs = null;
    private static final String CADENA_CONEXION_BBDD = "jdbc:mysql://localhost:3306/";
    private static final String NOMBRE_BBDD = "DeepRock";
    private static final String USUARIO_BBDD = "root";
    private static final String PASSWD_BBDD = null;

    private void conectar() {
        System.out.println("------------------------------------------------");
        try {
            con = DriverManager.getConnection(CADENA_CONEXION_BBDD + NOMBRE_BBDD, USUARIO_BBDD, PASSWD_BBDD);
            System.out.println("---> Se ha realizado la conexi�n a la base de datos.");
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> No se ha podido abrir la conexi�n con la base de datos.");
        }
    }

    private void desconectar() {
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
    public boolean alta(String correo_e, String password_e) {
        conectar();
        try {
            pstm = con.prepareStatement("INSERT INTO usuarios (correo, password) VALUES (?,?);");
            pstm.setString(1, correo_e);
            pstm.setString(2, password_e);
            pstm.executeUpdate();
            System.out.println("El usuario " + correo_e + " se ha dado de alta.");
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> No se ha podido dar de alta al usuario.");
            return false;
        } finally {
            desconectar();
        }
    }

    @Override
    public boolean comprobar(String correo_e, String password_e) {
        conectar();
        try {
            // Utilizar consulta preparada para evitar la inyección de SQL
            pstm = con.prepareStatement("SELECT * FROM usuarios WHERE correo = ?");
            pstm.setString(1, correo_e);
            rs = pstm.executeQuery();

            if (rs.next()) {
                // Comparar las contraseñas de manera segura usando hashes (asumiendo que las contraseñas se almacenan con hash en la base de datos)
                String password = rs.getString("password"); // Reemplaza "password" con el nombre real de la columna en la base de datos
                if (password_e.equals(password)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la búsqueda del usuario con correo " + correo_e + ".");
            ex.printStackTrace();
        } finally {
            desconectar();
        }

        System.out.println("---> No se ha encontrado ningún usuario con correo " + correo_e + ".");
        return false;
    }

    @Override
    public Usuario obtenerUsuario(String correo_e, String contrasena_e) {
        conectar();
        try {
            int id = -1;
            pstm = con.prepareStatement("SELECT * FROM usuarios WHERE correo = ? AND password = ?");
            pstm.setString(1, correo_e);
            pstm.setString(2, contrasena_e);
            rs = pstm.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }
            return new Usuario(id, correo_e, contrasena_e);
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda del usuario con ID " + correo_e + ".");
            ex.printStackTrace();
        } finally {
            desconectar();
        }
        System.out.println("---> No se ha encontrado ningun usuario con id " + correo_e + ".");
        return null;
    }

    public int obtenerAmigos(String nombre_e) {
        int amigos = 0;
        try {

            pstm = con.prepareStatement("SELECT count(*) as contado FROM amigos WHERE id_usuario1 = (Select id from usuarios where nombreUsuario = ?)");
            pstm.setString(1, nombre_e);
            rs = pstm.executeQuery();
            if (rs.next()) {
                amigos = rs.getInt("contado");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda del usuario con ID " + nombre_e + ".");
            ex.printStackTrace();
        }
        //System.out.println("---> No se ha encontrado ningun usuario con id " + nombre_e + ".");
        return amigos;
    }

    public boolean modificarContrasena(Usuario usr) {
        conectar();
        try {
            pstm = con.prepareStatement("UPDATE usuarios SET correo = ? WHERE id_usuario1 = ?");
            pstm.setString(1, usr.getCorreo());
            pstm.setInt(1, usr.getId());
            rs = pstm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR SQL ---> Algo ha salido mal durante la busqueda del usuario con el correo " + usr.getCorreo() + ".");
            ex.printStackTrace();
        }finally{
            desconectar();
        }
        return false;
    }

}
