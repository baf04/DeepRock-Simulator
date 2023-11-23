package Factoria;

import AccesoDatos.Ficheros.*;
import AccesoDatos.Interfaces.*;
import AccesoDatos.JDBC.*;

public class Factoria {
    
    private static EnumDAO tipoDAO = EnumDAO.JDBC; 
    
    public static UsuarioDAO crearUsuario(EnumDAO tipo){

        switch (tipo) {
            
            case JDBC -> {
                return new JDBCUsuarioDAO();
            }
                
            case Fichero -> {
                return new FicherosUsuarioDAO();
            }
        }
        return null;
    }
    
     public static PartidaDAO crearPartida(EnumDAO tipo){

        switch (tipo) {
            
            case JDBC -> {
                return new JDBCPartidaDAO();
            }
                
            case Fichero -> {
                return new FicherosPartidaDAO();
            }
        }
        return null;
    }
     
     public static MineroDAO crearMinero(EnumDAO tipo){

        switch (tipo) {
            
            case JDBC -> {
                return new JDBCMineroDAO();
            }
                
            case Fichero -> {
                return new FicherosMineroDAO();
            }
        }
        return null;
    }
     
      public static MisionDAO crearMision(EnumDAO tipo){

        switch (tipo) {
            
            case JDBC -> {
                return new JDBCMisionDAO();
            }
                
            case Fichero -> {
                return new FicherosMisionDAO();
            }
        }
        return null;
    }

    public static EnumDAO getTipoDAO() {
        return tipoDAO;
    }

    public static void setTipoDAO(EnumDAO tipoDAO) {
        Factoria.tipoDAO = tipoDAO;
    }
    
}
