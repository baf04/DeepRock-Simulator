package Modelo;

import java.io.Serializable;
import java.util.Random;

public class GenerarMision implements Serializable{

    private String dificultad;
    private int recompensaCreditos;
    private int recompensaExpUsuario;
    private int recompensaExpMinero;
    private int porcentajeVictoria;

    private static final String[] dificultades = {"Facil", "Medio", "Dificil", "Lethal"};
    private static Random rnd = new Random();

    public GenerarMision(String dificultad, int creditos, int experienciaPartida, int experienciaMinero, int porcentajeVictoria) {
        this.dificultad = dificultad;
        this.recompensaCreditos = creditos;
        this.recompensaExpUsuario = experienciaPartida;
        this.recompensaExpMinero = experienciaMinero;
        this.porcentajeVictoria = porcentajeVictoria;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getRecompensaCreditos() {
        return recompensaCreditos;
    }

    public void setRecompensaCreditos(int recompensaCreditos) {
        this.recompensaCreditos = recompensaCreditos;
    }

    public int getRecompensaExpUsuario() {
        return recompensaExpUsuario;
    }

    public void setRecompensaExpUsuario(int recompensaExpUsuario) {
        this.recompensaExpUsuario = recompensaExpUsuario;
    }

    public int getRecompensaExpMinero() {
        return recompensaExpMinero;
    }

    public void setRecompensaExpMinero(int recompensaExpMinero) {
        this.recompensaExpMinero = recompensaExpMinero;
    }

    public int getPorcentajeVictoria() {
        return porcentajeVictoria;
    }

    public void setPorcentajeVictoria(int porcentajeVictoria) {
        this.porcentajeVictoria = porcentajeVictoria;
    }

    public static GenerarMision generarFacil() {
        int recompensaCreditos_s = rnd.nextInt(100, 600);
        int recompensaExpUsuario_s = rnd.nextInt(20, 80);
        int recompensaExpMinero_s = rnd.nextInt(40, 160);
        int porcentajeVictoria_s = rnd.nextInt(70, 100);
        return new GenerarMision(dificultades[0], recompensaCreditos_s, recompensaExpUsuario_s, recompensaExpMinero_s, porcentajeVictoria_s);
    }

    public static GenerarMision generarNormal() {
        int recompensaCreditos_s = rnd.nextInt(200, 800);
        int recompensaExpUsuario_s = rnd.nextInt(25, 90);
        int recompensaExpMinero_s = rnd.nextInt(50, 190);
        int porcentajeVictoria_s = rnd.nextInt(40, 69);
        return new GenerarMision(dificultades[1], recompensaCreditos_s, recompensaExpUsuario_s, recompensaExpMinero_s, porcentajeVictoria_s);
    }

    public static GenerarMision generarDificil() {
        int recompensaCreditos_s = rnd.nextInt(400, 1500);
        int recompensaExpUsuario_s = rnd.nextInt(40, 120);
        int recompensaExpMinero_s = rnd.nextInt(90, 240);
        int porcentajeVictoria_s = rnd.nextInt(10, 39);
        return new GenerarMision(dificultades[2], recompensaCreditos_s, recompensaExpUsuario_s, recompensaExpMinero_s, porcentajeVictoria_s);
    }

    public static boolean calcVictoria(GenerarMision mision_e, int mejoras) {
        Random rand = new Random();
        return rand.nextInt(1, 100) < (mision_e.getPorcentajeVictoria() + mejoras);
    }
}
