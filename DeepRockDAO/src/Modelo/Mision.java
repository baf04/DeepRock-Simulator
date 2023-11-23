package Modelo;

import java.io.Serializable;
import java.util.Random;

public class Mision implements Serializable{
  
  private int id_to_Partida;
  private int id;
  private String dificultad;
  private String clase;
  private int creditos;
  private int experienciaPartida;
  private int experienciaMinero;
  private String resultado;
  
    public Mision(int id_to_Partida, int id, String dificultad, String clase, int creditos, int experienciaPartida, int experienciaMinero, String resultado) {
        this.id_to_Partida = id_to_Partida;
        this.id = id;
        this.dificultad = dificultad;
        this.clase = clase;
        this.creditos = creditos;
        this.experienciaPartida = experienciaPartida;
        this.experienciaMinero = experienciaMinero;
        this.resultado = resultado;
    }

    public int getId_to_Partida() {
        return id_to_Partida;
    }

    public void setId_to_Partida(int id_to_Partida) {
        this.id_to_Partida = id_to_Partida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getExperienciaPartida() {
        return experienciaPartida;
    }

    public void setExperienciaPartida(int experienciaPartida) {
        this.experienciaPartida = experienciaPartida;
    }

    public int getExperienciaMinero() {
        return experienciaMinero;
    }

    public void setExperienciaMinero(int experienciaMinero) {
        this.experienciaMinero = experienciaMinero;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
  
  
}
