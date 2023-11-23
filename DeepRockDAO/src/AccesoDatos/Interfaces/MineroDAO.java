package AccesoDatos.Interfaces;

import Modelo.Minero;
import Modelo.Partida;
        
public interface MineroDAO {
    /**
     * Guarda un minero específico
     * @param minero es la ID de la partida del minero
     * @param partida es la Clase del minero
     * @return Boolean dependiendo de si se ha guardado o no
     */
    public boolean retornarMinero(Minero minero, Partida partida);
    /**
     * Devuelve un minero especifico
     * @param partida es la ID de la partida del minero
     * @param clase es la Clase del minero
     * @return Minero deseado
     */
    public Minero obtenerMinero(Partida partida, String clase); 
    
    
}
