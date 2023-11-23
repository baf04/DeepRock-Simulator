package Vista;

import AccesoDatos.Interfaces.MineroDAO;
import AccesoDatos.Interfaces.MisionDAO;
import AccesoDatos.Interfaces.PartidaDAO;
import Factoria.Factoria;
import Modelo.GenerarMision;
import Modelo.Minero;
import Modelo.Mision;
import Modelo.Partida;
import Modelo.Usuario;
import java.util.Random;
import javax.swing.JOptionPane;

public class VentanaMisiones extends javax.swing.JFrame {

    private static PartidaDAO partidadao;
    private static MineroDAO minerodao;
    private static MisionDAO misiondao;
    
    private Partida prt;
    private Usuario usr;
    private Minero min;
    private GenerarMision m1;
    private GenerarMision m2;
    private GenerarMision m3;

    public VentanaMisiones() {
    }

    public VentanaMisiones(Partida partida_e, Usuario usr_e, Minero min_e) {
        initComponents();
        this.prt = partida_e;
        this.usr = usr_e;
        this.min = min_e;
        this.misiondao = Factoria.crearMision(Factoria.getTipoDAO());
        this.minerodao = Factoria.crearMinero(Factoria.getTipoDAO());
        this.partidadao = Factoria.crearPartida(Factoria.getTipoDAO());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setearMision1();
        setearMision2();
        setearMision3();
    }

    private void setearMision1() {
        m1 = GenerarMision.generarFacil();
        this.mision1_creditos.setText(mision1_creditos.getText() + " " + m1.getRecompensaCreditos());
        this.mision1_expUsuario.setText(mision1_expUsuario.getText() + " " + m1.getRecompensaExpUsuario());
        this.mision1_expMinero.setText(mision1_expMinero.getText() + " " + m1.getRecompensaExpMinero());
        this.mision1_porcentajeVictoria.setText(String.valueOf(m1.getPorcentajeVictoria()) + "%");
    }

    private void setearMision2() {
        m2 = GenerarMision.generarNormal();
        this.mision2_creditos.setText(mision2_creditos.getText() + " " + m2.getRecompensaCreditos());
        this.mision2_expUsuario.setText(mision2_expUsuario.getText() + " " + m2.getRecompensaExpUsuario());
        this.mision2_expMinero.setText(mision2_expMinero.getText() + " " + m2.getRecompensaExpMinero());
        this.mision2_porcentajeVictoria.setText(String.valueOf(m2.getPorcentajeVictoria()) + "%");
    }

    private void setearMision3() {
        m3 = GenerarMision.generarDificil();
        this.mision3_creditos.setText(mision3_creditos.getText() + " " + m3.getRecompensaCreditos());
        this.mision3_expUsuario.setText(mision3_expUsuario.getText() + " " + m3.getRecompensaExpUsuario());
        this.mision3_expMinero.setText(mision3_expMinero.getText() + " " + m3.getRecompensaExpMinero());
        this.mision3_porcentajeVictoria.setText(String.valueOf(m3.getPorcentajeVictoria()) + "%");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_misiones = new javax.swing.JPanel();
        panel_selecMision = new javax.swing.JPanel();
        panelMision1 = new javax.swing.JPanel();
        mision1_titulo = new javax.swing.JLabel();
        mision1_creditos = new javax.swing.JLabel();
        lb_porcentaje = new javax.swing.JLabel();
        mision1_expUsuario = new javax.swing.JLabel();
        mision1_expMinero = new javax.swing.JLabel();
        mision1_porcentajeVictoria = new javax.swing.JLabel();
        btn_seleccionarMision1 = new javax.swing.JButton();
        mision1_creditos1 = new javax.swing.JLabel();
        panelMision2 = new javax.swing.JPanel();
        mision2_titulo = new javax.swing.JLabel();
        mision2_creditos = new javax.swing.JLabel();
        lb_porcentaje2 = new javax.swing.JLabel();
        mision2_expUsuario = new javax.swing.JLabel();
        mision2_expMinero = new javax.swing.JLabel();
        mision2_porcentajeVictoria = new javax.swing.JLabel();
        btn_seleccionarMision2 = new javax.swing.JButton();
        mision1_creditos2 = new javax.swing.JLabel();
        panelMision3 = new javax.swing.JPanel();
        mision3_titulo = new javax.swing.JLabel();
        mision3_creditos = new javax.swing.JLabel();
        lb_porcentaje3 = new javax.swing.JLabel();
        mision3_expUsuario = new javax.swing.JLabel();
        mision3_expMinero = new javax.swing.JLabel();
        mision3_porcentajeVictoria = new javax.swing.JLabel();
        btn_seleccionarMision3 = new javax.swing.JButton();
        mision1_creditos3 = new javax.swing.JLabel();
        btn_seleccionarMision6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setUndecorated(true);
        setSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        bg_misiones.setBackground(new java.awt.Color(51, 0, 0));
        bg_misiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        bg_misiones.setMaximumSize(new java.awt.Dimension(750, 500));
        bg_misiones.setMinimumSize(new java.awt.Dimension(750, 500));
        bg_misiones.setPreferredSize(new java.awt.Dimension(750, 500));
        bg_misiones.setLayout(null);

        panel_selecMision.setBackground(new java.awt.Color(102, 0, 0));
        panel_selecMision.setMaximumSize(new java.awt.Dimension(720, 370));
        panel_selecMision.setMinimumSize(new java.awt.Dimension(720, 370));
        panel_selecMision.setLayout(new javax.swing.BoxLayout(panel_selecMision, javax.swing.BoxLayout.LINE_AXIS));

        panelMision1.setBackground(new java.awt.Color(102, 0, 0));
        panelMision1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        panelMision1.setMaximumSize(new java.awt.Dimension(239, 368));
        panelMision1.setMinimumSize(new java.awt.Dimension(239, 368));
        panelMision1.setPreferredSize(new java.awt.Dimension(239, 368));
        panelMision1.setLayout(null);

        mision1_titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mision1_titulo.setForeground(new java.awt.Color(255, 102, 0));
        mision1_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision1_titulo.setText("Mision 1");
        panelMision1.add(mision1_titulo);
        mision1_titulo.setBounds(10, 10, 220, 50);

        mision1_creditos.setForeground(new java.awt.Color(255, 102, 0));
        mision1_creditos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision1_creditos.setText("Creditos: ");
        panelMision1.add(mision1_creditos);
        mision1_creditos.setBounds(10, 90, 220, 30);

        lb_porcentaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_porcentaje.setForeground(new java.awt.Color(255, 102, 0));
        lb_porcentaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_porcentaje.setText("Porcentaje Victoria");
        panelMision1.add(lb_porcentaje);
        lb_porcentaje.setBounds(10, 200, 220, 30);

        mision1_expUsuario.setForeground(new java.awt.Color(255, 102, 0));
        mision1_expUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision1_expUsuario.setText("Experiencia Usuario:");
        panelMision1.add(mision1_expUsuario);
        mision1_expUsuario.setBounds(10, 120, 220, 30);

        mision1_expMinero.setForeground(new java.awt.Color(255, 102, 0));
        mision1_expMinero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision1_expMinero.setText("Experiencia Minero:");
        panelMision1.add(mision1_expMinero);
        mision1_expMinero.setBounds(10, 150, 220, 30);

        mision1_porcentajeVictoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mision1_porcentajeVictoria.setForeground(new java.awt.Color(255, 102, 0));
        mision1_porcentajeVictoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision1_porcentajeVictoria.setText("0%");
        panelMision1.add(mision1_porcentajeVictoria);
        mision1_porcentajeVictoria.setBounds(17, 246, 200, 40);

        btn_seleccionarMision1.setBackground(new java.awt.Color(102, 0, 0));
        btn_seleccionarMision1.setForeground(new java.awt.Color(255, 102, 0));
        btn_seleccionarMision1.setText("Seleccionar");
        btn_seleccionarMision1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_seleccionarMision1.setDefaultCapable(false);
        btn_seleccionarMision1.setFocusPainted(false);
        btn_seleccionarMision1.setFocusable(false);
        btn_seleccionarMision1.setRequestFocusEnabled(false);
        btn_seleccionarMision1.setRolloverEnabled(false);
        btn_seleccionarMision1.setVerifyInputWhenFocusTarget(false);
        btn_seleccionarMision1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarMision1ActionPerformed(evt);
            }
        });
        panelMision1.add(btn_seleccionarMision1);
        btn_seleccionarMision1.setBounds(70, 310, 90, 30);

        mision1_creditos1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mision1_creditos1.setForeground(new java.awt.Color(255, 102, 0));
        mision1_creditos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision1_creditos1.setText("Recompensas");
        panelMision1.add(mision1_creditos1);
        mision1_creditos1.setBounds(10, 70, 220, 30);

        panel_selecMision.add(panelMision1);

        panelMision2.setBackground(new java.awt.Color(102, 0, 0));
        panelMision2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        panelMision2.setMaximumSize(new java.awt.Dimension(240, 368));
        panelMision2.setMinimumSize(new java.awt.Dimension(240, 368));
        panelMision2.setPreferredSize(new java.awt.Dimension(240, 368));
        panelMision2.setLayout(null);

        mision2_titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mision2_titulo.setForeground(new java.awt.Color(255, 102, 0));
        mision2_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision2_titulo.setText("Mision 2");
        panelMision2.add(mision2_titulo);
        mision2_titulo.setBounds(10, 10, 220, 50);

        mision2_creditos.setForeground(new java.awt.Color(255, 102, 0));
        mision2_creditos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision2_creditos.setText("Creditos: ");
        panelMision2.add(mision2_creditos);
        mision2_creditos.setBounds(10, 90, 220, 30);

        lb_porcentaje2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_porcentaje2.setForeground(new java.awt.Color(255, 102, 0));
        lb_porcentaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_porcentaje2.setText("Porcentaje Victoria");
        panelMision2.add(lb_porcentaje2);
        lb_porcentaje2.setBounds(10, 200, 220, 30);

        mision2_expUsuario.setForeground(new java.awt.Color(255, 102, 0));
        mision2_expUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision2_expUsuario.setText("Experiencia Usuario:");
        panelMision2.add(mision2_expUsuario);
        mision2_expUsuario.setBounds(10, 120, 220, 30);

        mision2_expMinero.setForeground(new java.awt.Color(255, 102, 0));
        mision2_expMinero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision2_expMinero.setText("Experiencia Minero:");
        panelMision2.add(mision2_expMinero);
        mision2_expMinero.setBounds(10, 150, 220, 30);

        mision2_porcentajeVictoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mision2_porcentajeVictoria.setForeground(new java.awt.Color(255, 102, 0));
        mision2_porcentajeVictoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision2_porcentajeVictoria.setText("0%");
        panelMision2.add(mision2_porcentajeVictoria);
        mision2_porcentajeVictoria.setBounds(17, 246, 200, 40);

        btn_seleccionarMision2.setBackground(new java.awt.Color(102, 0, 0));
        btn_seleccionarMision2.setForeground(new java.awt.Color(255, 102, 0));
        btn_seleccionarMision2.setText("Seleccionar");
        btn_seleccionarMision2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_seleccionarMision2.setDefaultCapable(false);
        btn_seleccionarMision2.setFocusPainted(false);
        btn_seleccionarMision2.setFocusable(false);
        btn_seleccionarMision2.setRequestFocusEnabled(false);
        btn_seleccionarMision2.setRolloverEnabled(false);
        btn_seleccionarMision2.setVerifyInputWhenFocusTarget(false);
        btn_seleccionarMision2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarMision2ActionPerformed(evt);
            }
        });
        panelMision2.add(btn_seleccionarMision2);
        btn_seleccionarMision2.setBounds(70, 310, 90, 30);

        mision1_creditos2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mision1_creditos2.setForeground(new java.awt.Color(255, 102, 0));
        mision1_creditos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision1_creditos2.setText("Recompensas");
        panelMision2.add(mision1_creditos2);
        mision1_creditos2.setBounds(10, 70, 220, 30);

        panel_selecMision.add(panelMision2);

        panelMision3.setBackground(new java.awt.Color(102, 0, 0));
        panelMision3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        panelMision3.setMaximumSize(new java.awt.Dimension(239, 368));
        panelMision3.setMinimumSize(new java.awt.Dimension(239, 368));
        panelMision3.setPreferredSize(new java.awt.Dimension(239, 368));
        panelMision3.setLayout(null);

        mision3_titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mision3_titulo.setForeground(new java.awt.Color(255, 102, 0));
        mision3_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision3_titulo.setText("Mision 3");
        panelMision3.add(mision3_titulo);
        mision3_titulo.setBounds(10, 10, 220, 50);

        mision3_creditos.setForeground(new java.awt.Color(255, 102, 0));
        mision3_creditos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision3_creditos.setText("Creditos: ");
        panelMision3.add(mision3_creditos);
        mision3_creditos.setBounds(10, 90, 220, 30);

        lb_porcentaje3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_porcentaje3.setForeground(new java.awt.Color(255, 102, 0));
        lb_porcentaje3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_porcentaje3.setText("Porcentaje Victoria");
        panelMision3.add(lb_porcentaje3);
        lb_porcentaje3.setBounds(10, 200, 220, 30);

        mision3_expUsuario.setForeground(new java.awt.Color(255, 102, 0));
        mision3_expUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision3_expUsuario.setText("Experiencia Usuario:");
        panelMision3.add(mision3_expUsuario);
        mision3_expUsuario.setBounds(10, 120, 220, 30);

        mision3_expMinero.setForeground(new java.awt.Color(255, 102, 0));
        mision3_expMinero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mision3_expMinero.setText("Experiencia Minero:");
        panelMision3.add(mision3_expMinero);
        mision3_expMinero.setBounds(10, 150, 220, 30);

        mision3_porcentajeVictoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mision3_porcentajeVictoria.setForeground(new java.awt.Color(255, 102, 0));
        mision3_porcentajeVictoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision3_porcentajeVictoria.setText("0%");
        panelMision3.add(mision3_porcentajeVictoria);
        mision3_porcentajeVictoria.setBounds(17, 246, 200, 40);

        btn_seleccionarMision3.setBackground(new java.awt.Color(102, 0, 0));
        btn_seleccionarMision3.setForeground(new java.awt.Color(255, 102, 0));
        btn_seleccionarMision3.setText("Seleccionar");
        btn_seleccionarMision3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_seleccionarMision3.setDefaultCapable(false);
        btn_seleccionarMision3.setFocusPainted(false);
        btn_seleccionarMision3.setFocusable(false);
        btn_seleccionarMision3.setRequestFocusEnabled(false);
        btn_seleccionarMision3.setRolloverEnabled(false);
        btn_seleccionarMision3.setVerifyInputWhenFocusTarget(false);
        btn_seleccionarMision3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarMision3ActionPerformed(evt);
            }
        });
        panelMision3.add(btn_seleccionarMision3);
        btn_seleccionarMision3.setBounds(70, 310, 90, 30);

        mision1_creditos3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mision1_creditos3.setForeground(new java.awt.Color(255, 102, 0));
        mision1_creditos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mision1_creditos3.setText("Recompensas");
        panelMision3.add(mision1_creditos3);
        mision1_creditos3.setBounds(10, 70, 220, 30);

        panel_selecMision.add(panelMision3);

        bg_misiones.add(panel_selecMision);
        panel_selecMision.setBounds(14, 40, 720, 370);

        btn_seleccionarMision6.setBackground(new java.awt.Color(102, 0, 0));
        btn_seleccionarMision6.setForeground(new java.awt.Color(255, 102, 0));
        btn_seleccionarMision6.setText("Volver");
        btn_seleccionarMision6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_seleccionarMision6.setDefaultCapable(false);
        btn_seleccionarMision6.setFocusPainted(false);
        btn_seleccionarMision6.setFocusable(false);
        btn_seleccionarMision6.setRequestFocusEnabled(false);
        btn_seleccionarMision6.setRolloverEnabled(false);
        btn_seleccionarMision6.setVerifyInputWhenFocusTarget(false);
        btn_seleccionarMision6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarMision6ActionPerformed(evt);
            }
        });
        bg_misiones.add(btn_seleccionarMision6);
        btn_seleccionarMision6.setBounds(330, 440, 90, 40);

        getContentPane().add(bg_misiones);
        bg_misiones.setBounds(0, 0, 750, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_seleccionarMision1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarMision1ActionPerformed
        ejecutarMision(m1);
    }//GEN-LAST:event_btn_seleccionarMision1ActionPerformed

    private void btn_seleccionarMision2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarMision2ActionPerformed
        ejecutarMision(m2);
    }//GEN-LAST:event_btn_seleccionarMision2ActionPerformed

    private void btn_seleccionarMision3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarMision3ActionPerformed
        ejecutarMision(m3);
    }//GEN-LAST:event_btn_seleccionarMision3ActionPerformed

    private void ejecutarMision(GenerarMision mision) {
        this.dispose();
        if (GenerarMision.calcVictoria(mision, min.getMejoras())) {
            JOptionPane.showMessageDialog(this, "Misión cumplida", "Victoria", JOptionPane.INFORMATION_MESSAGE);
            prt.setCreditos(prt.getCreditos() + mision.getRecompensaCreditos());
            prt.setExp(prt.getExp() + mision.getRecompensaExpUsuario());
            min.setExp(min.getExp() + mision.getRecompensaExpMinero());
            minerodao.retornarMinero(min, prt);
            partidadao.retornarPartida(prt);
            guardarMisionCumplida(mision);
            new VentanaPrincipal(usr, prt);
        } else {
            JOptionPane.showMessageDialog(this, "Misión fallida", "Derrota", JOptionPane.ERROR_MESSAGE);
            guardarMisionFallida(mision);
            new VentanaPrincipal(usr, prt);
        }
    }
    
    private void guardarMisionCumplida(GenerarMision msn_e){
        Random rnd = new Random();
        Mision sol = new Mision(prt.getId(), rnd.nextInt(1,1000000), msn_e.getDificultad(), min.getClase(), msn_e.getRecompensaCreditos(), msn_e.getRecompensaExpUsuario(),msn_e.getRecompensaExpMinero(),"Victoria");
        misiondao.retornarMision(sol,prt);
    }
    private void guardarMisionFallida(GenerarMision msn_e){
        Random rnd = new Random();
        Mision sol = new Mision(prt.getId(), rnd.nextInt(1,1000000), msn_e.getDificultad(), min.getClase(), 0, 0,0,"Derrota");
        misiondao.retornarMision(sol,prt);
    }

    private void btn_seleccionarMision6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarMision6ActionPerformed
        this.dispose();
        new VentanaPrincipal(usr,prt);
    }//GEN-LAST:event_btn_seleccionarMision6ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMisiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_misiones;
    private javax.swing.JButton btn_seleccionarMision1;
    private javax.swing.JButton btn_seleccionarMision2;
    private javax.swing.JButton btn_seleccionarMision3;
    private javax.swing.JButton btn_seleccionarMision6;
    private javax.swing.JLabel lb_porcentaje;
    private javax.swing.JLabel lb_porcentaje2;
    private javax.swing.JLabel lb_porcentaje3;
    private javax.swing.JLabel mision1_creditos;
    private javax.swing.JLabel mision1_creditos1;
    private javax.swing.JLabel mision1_creditos2;
    private javax.swing.JLabel mision1_creditos3;
    private javax.swing.JLabel mision1_expMinero;
    private javax.swing.JLabel mision1_expUsuario;
    private javax.swing.JLabel mision1_porcentajeVictoria;
    private javax.swing.JLabel mision1_titulo;
    private javax.swing.JLabel mision2_creditos;
    private javax.swing.JLabel mision2_expMinero;
    private javax.swing.JLabel mision2_expUsuario;
    private javax.swing.JLabel mision2_porcentajeVictoria;
    private javax.swing.JLabel mision2_titulo;
    private javax.swing.JLabel mision3_creditos;
    private javax.swing.JLabel mision3_expMinero;
    private javax.swing.JLabel mision3_expUsuario;
    private javax.swing.JLabel mision3_porcentajeVictoria;
    private javax.swing.JLabel mision3_titulo;
    private javax.swing.JPanel panelMision1;
    private javax.swing.JPanel panelMision2;
    private javax.swing.JPanel panelMision3;
    private javax.swing.JPanel panel_selecMision;
    // End of variables declaration//GEN-END:variables
}
