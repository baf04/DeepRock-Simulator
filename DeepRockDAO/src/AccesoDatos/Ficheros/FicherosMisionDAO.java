package AccesoDatos.Ficheros;

import AccesoDatos.Interfaces.MisionDAO;
import Modelo.Mision;
import Modelo.Partida;
import java.io.Serializable;
import java.util.ArrayList;

public class FicherosMisionDAO implements MisionDAO, Serializable {

    @Override
    public ArrayList<Mision> listarMisiones(Partida partida) {
        ArrayList<Object> obj = EntradaSalida.leer("Mision.data");
        ArrayList<Mision> misiones = new ArrayList<>();

        for (Object objeto : obj) {

            if (objeto instanceof Mision mision) {

                if (mision.getId_to_Partida() == partida.getId()) {
                    misiones.add(mision);
                }
            }
        }
        return misiones;
    }

    @Override
    public Mision obtenerMision(int id, Partida partida) {
        int id_c;
        int id_to_partida_c;
        ArrayList<Mision> misions = listarMision();
        for (Mision mis : misions) {
            id_c = mis.getId();
            id_to_partida_c = mis.getId_to_Partida();
            if ((id_c == id) && (id_to_partida_c == partida.getId())) {
                return mis;
            }
        }
        return null;
    }

    @Override
    public boolean retornarMision(Mision mision, Partida partida) {
        EntradaSalida.guardar((Object) mision, "Mision.data");
        return true;
    }
    
    
    //Falta meter retorno de False
    @Override
    public boolean eliminarMision(String id, Partida partida) {
       ArrayList<Object> sol = new ArrayList();
        for (Mision msn : sobreMision(id,partida)) {
            sol.add((Object)msn);
        }
        EntradaSalida.sobreescribirObjetos(sol, "Mision.data");
        return true;
    }

    public ArrayList<Mision> listarMision() {
        ArrayList<Object> obj = EntradaSalida.leer("Mision.data");
        ArrayList<Mision> misiones = new ArrayList<>();
        for (Object objeto : obj) {
            if (objeto instanceof Mision) {
                misiones.add((Mision) objeto);
            }
        }
        return misiones;
    }
    
    //Falta meter retorno de False
    @Override
    public boolean eliminarHistorial(Partida partida) {
        ArrayList<Object> sol = new ArrayList();
        for (Mision msn : sobreHistorial(partida)) {
            sol.add((Object)msn);
        }
        EntradaSalida.sobreescribirObjetos(sol, "Mision.data");
        return true;
    }

    public ArrayList<Mision> sobreMision(String id_e, Partida partida) {

        ArrayList<Mision> nuevoMision = new ArrayList();

        for (Object objeto : EntradaSalida.leer("Mision.data")) {
            if (objeto instanceof Mision MisionsLeidos) {
                if (!(MisionsLeidos.getId() == Integer.valueOf(id_e) && MisionsLeidos.getId_to_Partida() == partida.getId())) {
                    nuevoMision.add(MisionsLeidos);
                }
            }
        }
        return nuevoMision;
    }

    public ArrayList<Mision> sobreHistorial(Partida partida) {

        ArrayList<Mision> nuevoMision = new ArrayList();

        for (Object objeto : EntradaSalida.leer("Mision.data")) {
            if (objeto instanceof Mision MisionsLeidos) {
                if (MisionsLeidos.getId_to_Partida() != partida.getId()) {
                    nuevoMision.add(MisionsLeidos);
                }
            }
        }
        return nuevoMision;
    }
}
