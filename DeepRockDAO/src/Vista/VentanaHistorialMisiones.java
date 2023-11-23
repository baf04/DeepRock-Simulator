package Vista;

import AccesoDatos.Interfaces.MisionDAO;
import Factoria.Factoria;
import Modelo.Mision;
import Modelo.Partida;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaHistorialMisiones extends javax.swing.JFrame {

    private MisionDAO misiondao;
    private Partida prt;
    private Mision msn;

    private final Color fondoTarjetaVictoria = new Color(0, 51, 0);
    private final Color fondoTarjetaDerrota = new Color(102, 0, 0);
    private final Color bordeTarjeta = new Color(255, 102, 0);
    private final Color fuenteTarjeta = new Color(255, 153, 0);
    private final Dimension tamanoTarjeta = new Dimension(942, 105);
    private final Dimension localizacionResul = new Dimension(500, 50);
    private final int tamanoFuente = 12;

    public VentanaHistorialMisiones() {
        initComponents();
    }

    public VentanaHistorialMisiones(Partida partida_e) {
        initComponents();
        this.prt = partida_e;
        this.misiondao = Factoria.crearMision(Factoria.getTipoDAO());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_historialMisiones = new javax.swing.JPanel();
        scrollMisiones = new javax.swing.JScrollPane();
        panel_Historial = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();
        btn_victorias = new javax.swing.JButton();
        btn_derrotas = new javax.swing.JButton();
        btn_todas = new javax.swing.JButton();
        campo_idMision = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tarjetaVictoria = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tarjetaDerrota = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        bg_historialMisiones.setBackground(new java.awt.Color(51, 0, 0));
        bg_historialMisiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        bg_historialMisiones.setMaximumSize(new java.awt.Dimension(1000, 600));
        bg_historialMisiones.setMinimumSize(new java.awt.Dimension(1000, 600));
        bg_historialMisiones.setLayout(null);

        scrollMisiones.setBackground(new java.awt.Color(102, 0, 0));
        scrollMisiones.setBorder(null);
        scrollMisiones.setForeground(new java.awt.Color(102, 0, 0));
        scrollMisiones.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollMisiones.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollMisiones.setMaximumSize(new java.awt.Dimension(960, 450));
        scrollMisiones.setMinimumSize(new java.awt.Dimension(960, 450));
        scrollMisiones.setPreferredSize(new java.awt.Dimension(960, 450));

        panel_Historial.setBackground(new java.awt.Color(102, 0, 0));
        panel_Historial.setLayout(new javax.swing.BoxLayout(panel_Historial, javax.swing.BoxLayout.Y_AXIS));
        scrollMisiones.setViewportView(panel_Historial);

        bg_historialMisiones.add(scrollMisiones);
        scrollMisiones.setBounds(20, 130, 960, 450);

        btn_cerrar.setBackground(new java.awt.Color(102, 0, 0));
        btn_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(255, 153, 0));
        btn_cerrar.setText("X");
        btn_cerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setDefaultCapable(false);
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.setMaximumSize(new java.awt.Dimension(90, 30));
        btn_cerrar.setMinimumSize(new java.awt.Dimension(90, 30));
        btn_cerrar.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_cerrar.setRequestFocusEnabled(false);
        btn_cerrar.setRolloverEnabled(false);
        btn_cerrar.setVerifyInputWhenFocusTarget(false);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        bg_historialMisiones.add(btn_cerrar);
        btn_cerrar.setBounds(960, 10, 30, 30);

        btn_victorias.setBackground(new java.awt.Color(102, 0, 0));
        btn_victorias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_victorias.setForeground(new java.awt.Color(255, 153, 0));
        btn_victorias.setText("Victorias");
        btn_victorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        btn_victorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_victorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_victoriasActionPerformed(evt);
            }
        });
        bg_historialMisiones.add(btn_victorias);
        btn_victorias.setBounds(660, 80, 315, 40);

        btn_derrotas.setBackground(new java.awt.Color(102, 0, 0));
        btn_derrotas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_derrotas.setForeground(new java.awt.Color(255, 153, 0));
        btn_derrotas.setText("Derrotas");
        btn_derrotas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        btn_derrotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_derrotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_derrotasActionPerformed(evt);
            }
        });
        bg_historialMisiones.add(btn_derrotas);
        btn_derrotas.setBounds(20, 80, 315, 40);

        btn_todas.setBackground(new java.awt.Color(102, 0, 0));
        btn_todas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_todas.setForeground(new java.awt.Color(255, 153, 0));
        btn_todas.setText("Todas");
        btn_todas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        btn_todas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_todas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_todasActionPerformed(evt);
            }
        });
        bg_historialMisiones.add(btn_todas);
        btn_todas.setBounds(340, 80, 315, 40);

        campo_idMision.setBackground(new java.awt.Color(102, 0, 0));
        campo_idMision.setForeground(new java.awt.Color(255, 153, 0));
        campo_idMision.setText("ID");
        campo_idMision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        campo_idMision.setCaretColor(new java.awt.Color(255, 153, 0));
        campo_idMision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_idMisionMouseClicked(evt);
            }
        });
        campo_idMision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_idMisionActionPerformed(evt);
            }
        });
        bg_historialMisiones.add(campo_idMision);
        campo_idMision.setBounds(730, 10, 100, 30);

        jButton1.setBackground(new java.awt.Color(102, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Borrar Todo");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg_historialMisiones.add(jButton1);
        jButton1.setBounds(270, 10, 120, 30);

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Borrar Mision");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg_historialMisiones.add(jButton2);
        jButton2.setBounds(600, 10, 120, 30);

        tarjetaVictoria.setBackground(new java.awt.Color(0, 51, 0));
        tarjetaVictoria.setMaximumSize(new java.awt.Dimension(942, 100));
        tarjetaVictoria.setMinimumSize(new java.awt.Dimension(942, 100));
        tarjetaVictoria.setName(""); // NOI18N
        tarjetaVictoria.setPreferredSize(new java.awt.Dimension(942, 100));
        tarjetaVictoria.setLayout(new javax.swing.BoxLayout(tarjetaVictoria, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));
        tarjetaVictoria.add(jLabel1);

        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        tarjetaVictoria.add(jPanel1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));
        tarjetaVictoria.add(jLabel2);

        tarjetaDerrota.setBackground(new java.awt.Color(102, 0, 0));
        tarjetaDerrota.setMaximumSize(new java.awt.Dimension(942, 100));
        tarjetaDerrota.setMinimumSize(new java.awt.Dimension(942, 100));
        tarjetaDerrota.setPreferredSize(new java.awt.Dimension(942, 100));

        javax.swing.GroupLayout tarjetaDerrotaLayout = new javax.swing.GroupLayout(tarjetaDerrota);
        tarjetaDerrota.setLayout(tarjetaDerrotaLayout);
        tarjetaDerrotaLayout.setHorizontalGroup(
            tarjetaDerrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
        );
        tarjetaDerrotaLayout.setVerticalGroup(
            tarjetaDerrotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_historialMisiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tarjetaVictoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(47, Short.MAX_VALUE)
                    .addComponent(tarjetaDerrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_historialMisiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(tarjetaVictoria, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(260, Short.MAX_VALUE)
                    .addComponent(tarjetaDerrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(240, 240, 240)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_victoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_victoriasActionPerformed
        this.panel_Historial.removeAll();
        ArrayList<Mision> misiones = misiondao.listarMisiones(prt);
        if (misiones == null) {
            this.panel_Historial.revalidate();
            this.panel_Historial.repaint();
        } else {
            for (int i = 0; i < misiones.size(); i++) {
                if (misiones.get(i).getResultado().equals("Victoria")) {
                    this.panel_Historial.add(crearTarjetaVictoria(misiones.get(i)));
                    this.panel_Historial.revalidate();
                    this.panel_Historial.repaint();
                }
            }
        }
    }//GEN-LAST:event_btn_victoriasActionPerformed


    private void btn_derrotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_derrotasActionPerformed
        this.panel_Historial.removeAll();
        ArrayList<Mision> misiones = misiondao.listarMisiones(prt);
        if (misiones == null) {
            this.panel_Historial.revalidate();
            this.panel_Historial.repaint();
        } else {
            for (int i = 0; i < misiones.size(); i++) {
                if (misiones.get(i).getResultado().equals("Derrota")) {
                    this.panel_Historial.add(crearTarjetaDerrota(misiones.get(i)));
                }
                this.panel_Historial.revalidate();
                this.panel_Historial.repaint();
            }
        }
    }//GEN-LAST:event_btn_derrotasActionPerformed

    private void btn_todasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_todasActionPerformed
        this.panel_Historial.removeAll();
        ArrayList<Mision> misiones = misiondao.listarMisiones(prt);
        if (misiones == null) {
            this.panel_Historial.revalidate();
            this.panel_Historial.repaint();
        } else {
            for (Mision misione : misiones) {
                if (misione.getResultado().equals("Victoria")) {
                    this.panel_Historial.add(crearTarjetaVictoria(misione));
                } else if (misione.getResultado().equals("Derrota")) {
                    this.panel_Historial.add(crearTarjetaDerrota(misione));
                }
                this.panel_Historial.revalidate();
                this.panel_Historial.repaint();
            }
        }
    }//GEN-LAST:event_btn_todasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!(this.campo_idMision.getText().isEmpty())) {
            misiondao.eliminarMision(this.campo_idMision.getText(), prt);
        }else{
             JOptionPane.showMessageDialog(this, "El campo no puede ir vacío", "Oh oh...", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        misiondao.eliminarHistorial(prt);
        this.panel_Historial.revalidate();
        this.panel_Historial.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo_idMisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_idMisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_idMisionActionPerformed

    private void campo_idMisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_idMisionMouseClicked
        campo_idMision.setText("");
    }//GEN-LAST:event_campo_idMisionMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHistorialMisiones().setVisible(true);
            }
        });
    }

    private Component crearTarjetaVictoria(Mision msn_e) {
        JPanel sol = new JPanel();
        sol.setMaximumSize(tamanoTarjeta);
        sol.setMinimumSize(tamanoTarjeta);
        sol.setPreferredSize(tamanoTarjeta);
        sol.setBackground(fondoTarjetaVictoria);
        sol.setBorder(BorderFactory.createLineBorder(bordeTarjeta, 1));
        sol.setLayout(new BoxLayout(sol, BoxLayout.X_AXIS));
        sol.add(crearLabelResultadoVictoria());
        sol.add(crearEspaciador());
        sol.add(crearLabelDificultad(msn_e.getDificultad()));
        sol.add(crearEspaciador());
        sol.add(crearLabelCreditos(String.valueOf(msn_e.getCreditos())));
        sol.add(crearEspaciador());
        sol.add(crearLabelExperienciaMinero(String.valueOf(msn_e.getExperienciaMinero())));
        sol.add(crearEspaciador());
        sol.add(crearLabelExperienciaPartida(String.valueOf(msn_e.getExperienciaPartida())));
        sol.add(crearLabelIdPartida(String.valueOf(msn_e.getId())));
        return sol;
    }

    private Component crearTarjetaDerrota(Mision msn_e) {
        JPanel sol = new JPanel();
        sol.setMaximumSize(tamanoTarjeta);
        sol.setMinimumSize(tamanoTarjeta);
        sol.setPreferredSize(tamanoTarjeta);
        sol.setBackground(fondoTarjetaDerrota);
        sol.setBorder(BorderFactory.createLineBorder(bordeTarjeta, 1));
        sol.setLayout(new BoxLayout(sol, BoxLayout.X_AXIS));
        sol.add(crearLabelResultadoDerrota());
        sol.add(crearEspaciador());
        sol.add(crearLabelDificultad(msn_e.getDificultad()));
        sol.add(crearEspaciador());
        sol.add(crearLabelCreditos(String.valueOf(msn_e.getCreditos())));
        sol.add(crearEspaciador());
        sol.add(crearLabelExperienciaMinero(String.valueOf(msn_e.getExperienciaMinero())));
        sol.add(crearEspaciador());
        sol.add(crearLabelExperienciaPartida(String.valueOf(msn_e.getExperienciaPartida())));
        sol.add(crearLabelIdPartida(String.valueOf(msn_e.getId())));
        return sol;
    }

    private Component crearLabelResultadoDerrota() {
        JLabel label = new JLabel();
        label.setText(" Derrota");
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.setMaximumSize(new java.awt.Dimension(100, 100));
        label.setMinimumSize(new java.awt.Dimension(100, 100));
        label.setPreferredSize(new java.awt.Dimension(100, 100));
        label.setForeground(fuenteTarjeta);
        label.setFont(new Font("Segoe UI", 1, 18));
        return label;
    }

    private Component crearLabelResultadoVictoria() {
        JLabel label = new JLabel();
        label.setText(" Victoria");
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.setMaximumSize(new java.awt.Dimension(100, 100));
        label.setMinimumSize(new java.awt.Dimension(100, 100));
        label.setPreferredSize(new java.awt.Dimension(100, 100));
        label.setForeground(fuenteTarjeta);
        label.setFont(new Font("Segoe UI", 1, 18));
        return label;
    }

    private Component crearEspaciador() {
        JPanel panel = new JPanel();
        panel.setMaximumSize(new java.awt.Dimension(50, 100));
        panel.setMinimumSize(new java.awt.Dimension(50, 100));
        panel.setPreferredSize(new java.awt.Dimension(50, 100));
        panel.setOpaque(false);
        return panel;
    }

    private Component crearLabelCreditos(String entrada) {
        JLabel label = new JLabel();
        label.setText("Creditos: " + entrada);
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.setMaximumSize(new java.awt.Dimension(100, 100));
        label.setMinimumSize(new java.awt.Dimension(100, 100));
        label.setPreferredSize(new java.awt.Dimension(100, 100));
        label.setForeground(fuenteTarjeta);
        label.setFont(new Font("Segoe UI", 0, tamanoFuente));
        return label;
    }

    private Component crearLabelDificultad(String entrada) {
        JLabel label = new JLabel();
        label.setText("Dificultad: " + entrada);
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.setMaximumSize(new java.awt.Dimension(120, 100));
        label.setMinimumSize(new java.awt.Dimension(120, 100));
        label.setPreferredSize(new java.awt.Dimension(120, 100));
        label.setForeground(fuenteTarjeta);
        label.setFont(new Font("Segoe UI", 0, tamanoFuente));
        return label;
    }

    private Component crearLabelExperienciaMinero(String entrada) {
        JLabel label = new JLabel();
        label.setText("Exp Minero: " + entrada);
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.setMaximumSize(new java.awt.Dimension(140, 100));
        label.setMinimumSize(new java.awt.Dimension(140, 100));
        label.setPreferredSize(new java.awt.Dimension(120, 100));
        label.setForeground(fuenteTarjeta);
        label.setFont(new Font("Segoe UI", 0, tamanoFuente));
        return label;
    }

    private Component crearLabelExperienciaPartida(String entrada) {
        JLabel label = new JLabel();
        label.setText("Exp Partida: " + entrada);
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.setMaximumSize(new java.awt.Dimension(140, 100));
        label.setMinimumSize(new java.awt.Dimension(140, 100));
        label.setPreferredSize(new java.awt.Dimension(120, 100));
        label.setForeground(fuenteTarjeta);
        label.setFont(new Font("Segoe UI", 0, tamanoFuente));
        return label;
    }

    private Component crearLabelIdPartida(String entrada) {
        JLabel label = new JLabel();
        label.setText("ID: " + entrada);
        label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        label.setMaximumSize(new java.awt.Dimension(140, 100));
        label.setMinimumSize(new java.awt.Dimension(140, 100));
        label.setPreferredSize(new java.awt.Dimension(120, 100));
        label.setForeground(fuenteTarjeta);
        label.setFont(new Font("Segoe UI", 0, tamanoFuente));
        return label;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_historialMisiones;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_derrotas;
    private javax.swing.JButton btn_todas;
    private javax.swing.JButton btn_victorias;
    private javax.swing.JTextField campo_idMision;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_Historial;
    private javax.swing.JScrollPane scrollMisiones;
    private javax.swing.JPanel tarjetaDerrota;
    private javax.swing.JPanel tarjetaVictoria;
    // End of variables declaration//GEN-END:variables
}
