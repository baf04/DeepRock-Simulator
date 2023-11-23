package Modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private int id;
    private String correo;
    private String contrasena;

    public Usuario(int id, String correo, String contrasenia) {
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasena = contrasenia;
    }
    
    
    
}  
