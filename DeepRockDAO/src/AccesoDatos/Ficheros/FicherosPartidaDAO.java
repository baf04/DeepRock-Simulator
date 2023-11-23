package AccesoDatos.Ficheros;

import AccesoDatos.Interfaces.PartidaDAO;
import Modelo.Partida;
import java.io.Serializable;
import java.util.ArrayList;

public class FicherosPartidaDAO implements PartidaDAO, Serializable {

    @Override
    public boolean cambiarNombre(String nombre, Partida partida) {
        partida.setNombre(nombre);
        retornarPartida(partida);
        return true;
    }

    @Override
    public Partida obtenerPartida(int id_to_usr, int id) {

        for (Partida prt : listarPartida()) {
            if ((prt.getId_to_usuario() == id_to_usr) && (prt.getId() == id)) {
                return prt;
            }
        }
        return null;
    }

    @Override
    public boolean retornarPartida(Partida partida) {
        ArrayList<Object> sol = new ArrayList();
        for (Partida part : sobrePartida(partida)) {
            sol.add((Object)part);
        }
        EntradaSalida.sobreescribirObjetos(sol, "Partida.data");
        return true;
    }

    public ArrayList<Partida> listarPartida() {
        ArrayList<Partida> prts = new ArrayList();
        for (Object objeto : EntradaSalida.leer("Partida.data")) {
            if (objeto instanceof Partida) {
                prts.add((Partida) objeto);
            }
        }
        return prts;
    }

    public ArrayList<Partida> sobrePartida(Partida partida) {
        ArrayList<Partida> prts = new ArrayList();
        prts.add(partida);
        for (Object objeto : EntradaSalida.leer("Partida.data")) {
            if (objeto instanceof Partida partida1) {
                if (partida1.getId() != partida.getId()) {
                    prts.add(partida1);
                }
            }
        }
        return prts;
    }

}
