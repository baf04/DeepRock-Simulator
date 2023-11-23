package AccesoDatos.Interfaces;

import Modelo.Usuario;

    public interface UsuarioDAO {
    /**
     * se utiliza para crear un nuevo usuario.
     * @param correo_e es el correo del Usuario.
     * @param password_e es la contrasena del Usuario.
     * @return 
     */
    public boolean alta(String correo_e, String password_e);
    /**
     * se utiliza para comprobar que el usuario se encuentre ya registrado.
     * @param nombre_e es el correo del Usuario.
     * @param contrasena_e es la contrasena del Usuario.
     * @return 
     */
    public boolean comprobar(String nombre_e, String contrasena_e);
    /**
     * se utiliza para obtener el usuario deseado, comparando entre usuarios por medio del correo y la contrasena.
     * @param nombre_e es el correo del Usuario.
     * @param contrasena_e es la contrasena del Usuario.
     * @return 
     */
    public Usuario obtenerUsuario(String nombre_e, String contrasena_e);
    
}
