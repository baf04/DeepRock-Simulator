package AccesoDatos.Interfaces;

import Modelo.Partida;

public interface PartidaDAO {
   
    /**
     * se utiliza para cambiar rapidamente el nombre de la partida seleccionada.
     * @param nombre es el nuevo nombre de la partida.
     * @param partida es la Id de la partida.
     * @return 
     */
    public boolean cambiarNombre(String nombre, Partida partida);
    /**
     * se utiliza para obtener la partida deseada, comparando entre partidas por medio de ambas claves.
     * @param id_to_usr es el id_to_usr de la partida.
     * @param id es la Id de la partida.
     * @return 
     */
    public Partida obtenerPartida(int id_to_usr, int id); //comprobamos via base de datos si las pk coinciden
        
    /**
     * se utiliza para guardar la partida.
     * @param partida partida a ser guardada.
     * @return 
     */
    public boolean retornarPartida(Partida partida);
    
}
