package AccesoDatos.Ficheros;

import Modelo.Usuario;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class EntradaSalida implements Serializable {

    private final static String PATH = "./DeepRock/Files/";

    public static boolean crearDirectorio() {
        File directorio = new File(PATH);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                return true;
            }
        }
        return false;
    }
    
      public static boolean crearFichero(String path) {
        File directorio = new File(PATH + path);
        if (!directorio.exists()) {
            try {
                if (directorio.createNewFile()) {
                    return true;
                }
            } catch (IOException ex) {
                Logger.getLogger(EntradaSalida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
//    public static boolean existeArchivo(String path) {
//        File directorio = new File(PATH.concat(path));
//        if (directorio.exists()) {
//                return true;
//        }
//        return false;
//    }

//    public static ArrayList<Object> leerObjetos(String path) {
//        ArrayList<Object> list = new ArrayList();
//        File f = new File(PATH.concat(path));
//
//        if (f.exists()) {
//            try (FileInputStream fis = new FileInputStream(PATH.concat(path)); 
//                 ObjectInputStream ois = new ObjectInputStream(fis);) {
//                while (true) {
//                    Object aux = ois.readObject();
//                    list.add(aux);
//                }
//                
//            } catch (EOFException ex) {
//                System.out.println("Fin de Fichero");
//                return list;
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        } else {
//            System.out.println("ArrayListobjectos Vacio");
//            return null;
//        }
//        return list;
//    }
    
    public static ArrayList<Object> leer(String path){
        crearDirectorio();
        ArrayList<Object> arr = new ArrayList();
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        
        try {
            
            crearFichero(path);
            fis = new FileInputStream(PATH.concat(path));
            ois = new ObjectInputStream(fis);
            while(true){
                arr.add(ois.readObject());
            }
            
        } catch (ClassNotFoundException ex){
            System.out.println("Error"+ex);  
        } catch(EOFException ex){
            //System.out.println("");
        }catch(FileNotFoundException ex){
            System.out.println("FnFError: "+ex);
        } catch(IOException ex){
            System.out.println("Error: "+ex);
        }finally {
            try{
                if(fis != null){
                    fis.close();
                }
                if(ois != null){
                    ois.close();
                }
            } catch(IOException ex){
                System.out.println("error: "+ex);
            }
        }
        return arr;
    }
    
    public static void guardar(Object obj, String path){
        crearDirectorio();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        ArrayList<Object> datosYaGuardados = leer(path);
        
        try {
            
            File f = new File(PATH.concat(path));
            fos = new FileOutputStream(PATH.concat(path));
            oos = new ObjectOutputStream(fos);
            
            //guardamos los datos antiguos primero
            for (Object ent : datosYaGuardados) {
                oos.writeObject(ent);
            }
            //añadimos lo nuevo
                oos.writeObject(obj);
            
        } catch (FileNotFoundException ex) {
            System.out.println("FnFError: " + ex);
        } catch (IOException ex) {
            System.out.println("IOError: " + ex);
        } finally {

            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                //System.out.println("Cerrado correctamente");
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }

        }
    }
    
    public static void sobreescribirObjetos(ArrayList<Object> obj, String path){
        crearDirectorio();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        try {
            
            File f = new File(PATH.concat(path));
            fos = new FileOutputStream(PATH.concat(path));
            oos = new ObjectOutputStream(fos);
            
            //guardamos los datos antiguos primero
            for (Object ent : obj) {
                oos.writeObject(ent);
            }
            //añadimos lo nuevo
            
        } catch (FileNotFoundException ex) {
            System.out.println("FnFError: " + ex);
        } catch (IOException ex) {
            System.out.println("IOError: " + ex);
        } finally {

            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                //System.out.println("Cerrado correctamente");
                
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }

        }
    }
    

    public static void guardarObjetos(ArrayList<Object> data, String path) {
        crearDirectorio();
        File f = new File(PATH.concat(path));
        try (FileOutputStream fos = new FileOutputStream(f); FileOutputStream fosApp = new FileOutputStream(f, true); OosWritter moos = new OosWritter(fosApp); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            if (f.exists()) {
                for (Object objeto : data) {
                    moos.writeObject(objeto);
                }
                moos.flush();
            } else {
                for (Object objeto : data) {
                    oos.writeObject(objeto);
                }
                oos.flush();
            }
        } catch (IOException ex) {
        } finally {

        }
    }

    public static boolean guardarObjeto(Object data, String path) {
        crearDirectorio();
        File f = new File(PATH.concat(path));
        try (FileOutputStream fos = new FileOutputStream(f, true); OosWritter moos = new OosWritter(fos); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            if (!f.exists()) {
                oos.writeObject(data);
                oos.flush();
            } else {
                moos.writeObject(data);
                moos.flush();
            }
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

}
