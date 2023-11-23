package Modelo;

import java.io.Serializable;

public class Minero implements Serializable{
    
    private int id_to_Partida;
    private int exp;
    private String clase;
    private int Mejoras;

    public Minero(int exp, String clase, int Mejoras) {
        this.exp = exp;
        this.clase = clase;
        this.Mejoras = Mejoras;
    }

    public Minero(int id_to_Partida, int exp, String clase, int Mejoras) {
        this.id_to_Partida = id_to_Partida;
        this.exp = exp;
        this.clase = clase;
        this.Mejoras = Mejoras;
    }
    
    public int calcNivel() {
        double lv1;
        int lvl;
        lv1 = this.getExp() / 100; 
        Math.round(lv1);
        lvl = (int) lv1;
        return lvl;
    }

    public int getId_to_Partida() {
        return id_to_Partida;
    }

    public void setId_to_Partida(int id_to_Partida) {
        this.id_to_Partida = id_to_Partida;
    }
    

    public int getExp() {
        return exp;
    }

    public void setExp(int Nivel) {
        this.exp = Nivel;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getMejoras() {
        return Mejoras;
    }

    public void setMejoras(int Mejoras) {
        this.Mejoras = Mejoras;
    }
}
