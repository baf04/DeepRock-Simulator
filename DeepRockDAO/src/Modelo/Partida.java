package Modelo;

import java.io.Serializable;

public class Partida implements Serializable{
    
  private int id_to_usuario;  
  private int id;  
  private String nombre;
  private int exp;
  private int creditos;

    public Partida(int id_to_usuario, int id, String nombre, int exp, int creditos) {
        this.id_to_usuario = id_to_usuario;
        this.id = id;
        this.nombre = nombre;
        this.exp = exp;
        this.creditos = creditos;
    }
    
    public int calcNivel() {
        double lv1;
        int lvl;
        lv1 = this.getExp() / 100; 
        Math.round(lv1);
        lvl = (int) lv1;
        return lvl;
    }

    public int getId_to_usuario() {
        return id_to_usuario;
    }

    public void setId_to_usuario(int id_to_usuario) {
        this.id_to_usuario = id_to_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
  
}
