package AccesoDatos.Ficheros;

import AccesoDatos.Interfaces.UsuarioDAO;
import Modelo.Minero;
import Modelo.Partida;
import Modelo.Usuario;
import java.io.Serializable;
import java.util.ArrayList;

public class FicherosUsuarioDAO implements UsuarioDAO, Serializable {

    private final String[] clases = {"Ingeniero", "Artillero", "Taladrador", "Explorador"};

    @Override
    public boolean alta(String correo_e, String password_e) {

        int id = 1;
        if (listarUsuarios().size() != 0) {
            id = 1;
            for (Object usr : listarUsuarios()) {
                id++;
            }
        }

        Usuario usr = new Usuario(id, correo_e, password_e);
        Object usrobj = (Object) usr;
        EntradaSalida.guardar(usrobj, "Usuario.data");
        for (int i = 1; i < 4; i++) {
            Partida partida = new Partida(id, calcularId(id,i), "Partida " + i, 1, 1000);
            EntradaSalida.guardar((Object) partida, "Partida.data");
            for (int j = 0; j < 4; j++) {
                Minero minero = new Minero(calcularId(id,i), 1, clases[j], 0);
                EntradaSalida.guardar((Object) minero, "Minero.data");
            }
        }

        return true;
    }
    
    private int calcularId(int id_e, int iteracion){
        int sol = 0;
        if (iteracion == 1) {
            sol = (id_e * 3) - 2;
        }
        if (iteracion == 2) {
            sol = (id_e * 3) - 1;
        }
        if (iteracion == 3) {
            sol = (id_e * 3);
        }
        return sol;
    }

    @Override
    public boolean comprobar(String nombre_e, String contrasena_e) {
        if (listarUsuarios() != null) {
            for (Usuario usr : listarUsuarios()) {
                if (usr.getCorreo().equals(nombre_e) && usr.getContrasena().equals(contrasena_e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Usuario obtenerUsuario(String nombre_e, String contrasena_e) {
        if (listarUsuarios() != null) {
            for (Usuario usr : listarUsuarios()) {
                if (usr.getCorreo().equals(nombre_e) && usr.getContrasena().equals(contrasena_e)) {
                    return usr;
                }
            }
        }
        return null;
    }

    public ArrayList<Usuario> listarUsuarios() {
        ArrayList<Usuario> usrs = new ArrayList();
        for (Object objeto : EntradaSalida.leer("Usuario.data")) {
            if (objeto instanceof Usuario) {
                usrs.add((Usuario) objeto);
            }
        }
        return usrs;
    }
}
