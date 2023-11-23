package AccesoDatos.Interfaces;

import Modelo.Mision;
import Modelo.Partida;
import java.util.ArrayList;

public interface MisionDAO {
    
    /**
     * Devuelve todas las misiones existentes.
     * @param partida Es necesario introducir la partida para obtener las misiones por su ID.
     * @return ArrayList de misiones.
     */
    public ArrayList<Mision> listarMisiones(Partida partida);

    /**
     * Elimina una mision específica dada su ID e ID relacionada a la partida.
     * @param id es la Id de la mision.
     * @param partida es la Id de la partida.
     * @return ArrayList de misiones sin la misión específicada.
     */
    public boolean eliminarMision(String id, Partida partida);
    
    /**
     * Elimina todo el historial.
     * @param partida es la Id de la partida.
     * @return boolean para saber si se han eliminado o no.
     */
    public boolean eliminarHistorial(Partida partida);
    
    /**
     * Obtiene una mision en particular.
     * @param id es la Id para poder obtener la misión exacta.
     * @param partida es la Id de partida para obtener la misión exacta.
     * @return Mision especificada.
     */
    public Mision obtenerMision(int id, Partida partida);
    
    /**
     * Guarda la mision.
     * @param mision id es la Id para poder obtener la misión exacta.
     * @param partida partida es la Id de partida para obtener la misión exacta.
     * @return Boolean para saber si se ha guardado o no.
     */
    public boolean retornarMision(Mision mision, Partida partida);
    
    
    
}
