package AccesoDatos.Ficheros;

import AccesoDatos.Interfaces.MineroDAO;
import Modelo.Minero;
import Modelo.Partida;
import java.io.Serializable;
import java.util.ArrayList;

public class FicherosMineroDAO implements MineroDAO, Serializable{

    @Override
    public boolean retornarMinero(Minero minero, Partida partida) {
        ArrayList<Object> sol = new ArrayList();
        for (Minero minero1 : sobreMinero(minero, partida)) {
            sol.add((Object)minero1);
        }
        EntradaSalida.sobreescribirObjetos(sol, "Minero.data");
        return true;
    }

    @Override
    public Minero obtenerMinero(Partida partida, String clase) {
        String clase_c;
        int id_to_partida_c;
        for (Minero min : listarMineros()) {
            clase_c = min.getClase();
            id_to_partida_c = min.getId_to_Partida();
            if (clase_c.equals(clase) && (id_to_partida_c == partida.getId())) {
                return min;
            }
        }
        return null;
    }

    public ArrayList<Minero> listarMineros() {
        ArrayList<Object> obj = EntradaSalida.leer("Minero.data");
        ArrayList<Minero> mins = new ArrayList<>();
        for (Object objeto : obj) {
            if (objeto instanceof Minero) {
                mins.add((Minero) objeto);
            }
        }
        return mins;
    }
    
    public ArrayList<Minero> sobreMinero(Minero minero_e, Partida partida) {

        ArrayList<Minero> nuevoMinero = new ArrayList();
        nuevoMinero.add(minero_e);
        for (Object objeto : EntradaSalida.leer("Minero.data")) {
            if (objeto instanceof Minero minerosLeidos) {
                if (!(minerosLeidos.getClase().equals(minero_e.getClase()) && minerosLeidos.getId_to_Partida() == partida.getId())) {
                    nuevoMinero.add(minerosLeidos);
                }
            }
        }
        return nuevoMinero;
    }

}


