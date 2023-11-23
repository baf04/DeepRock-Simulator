package Vista;

import AccesoDatos.Interfaces.MineroDAO;
import AccesoDatos.Interfaces.PartidaDAO;
import Factoria.Factoria;
import Modelo.Minero;
import Modelo.Partida;
import Modelo.Usuario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaEnano extends javax.swing.JFrame {

    private MineroDAO minerodao;
    private PartidaDAO partidadao;
    private Minero min;
    private Partida prt;
    private Usuario usr;
    private String cls;
    private final int precioMejora = 1000;

    public VentanaEnano() {
        initComponents();
    }

    public VentanaEnano(String path_e, Partida part_e, String clase_e, Usuario usr_e) {
        initComponents();
        this.minerodao = Factoria.crearMinero(Factoria.getTipoDAO());
        this.partidadao = Factoria.crearPartida(Factoria.getTipoDAO());
        this.min = minerodao.obtenerMinero(part_e, clase_e);
        this.exp_minero.setValue(min.getExp() % 100);
        this.prt = part_e;
        this.usr = usr_e;
        this.cls = clase_e;
        this.lb_nivelMinero.setText(String.valueOf(min.calcNivel()));
        this.lb_expNecesario.setText(min.getExp() % 100 + "/100");
        this.fotoEnano.setIcon(new ImageIcon(path_e));
        this.lb_numeroDeMejoras.setText("Mejoras Actuales: " + min.getMejoras());
        this.lb_precioMejora.setText("Precio Mejora: " + precioMejora);
        this.lb_creditos.setText("Creditos: " + prt.getCreditos());
        this.lb_nombreClase.setText(clase_e);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CajaFoto = new javax.swing.JPanel();
        fotoEnano = new javax.swing.JLabel();
        CajaStats = new javax.swing.JPanel();
        btn_misiones = new javax.swing.JButton();
        exp_minero = new javax.swing.JProgressBar();
        lb_nivelMinero = new javax.swing.JLabel();
        lb_expNecesario = new javax.swing.JLabel();
        panel_mejoras = new javax.swing.JPanel();
        btn_misiones1 = new javax.swing.JButton();
        lb_numeroDeMejoras = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_precioMejora = new javax.swing.JLabel();
        lb_creditos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_nombreClase = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 490));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 490));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        CajaFoto.setBackground(new java.awt.Color(255, 102, 102));
        CajaFoto.setMaximumSize(new java.awt.Dimension(280, 490));
        CajaFoto.setMinimumSize(new java.awt.Dimension(280, 490));
        CajaFoto.setName(""); // NOI18N
        CajaFoto.setPreferredSize(new java.awt.Dimension(280, 490));

        fotoEnano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/TarjetaArtillero.jpg"))); // NOI18N
        fotoEnano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        fotoEnano.setMaximumSize(new java.awt.Dimension(282, 490));
        fotoEnano.setMinimumSize(new java.awt.Dimension(282, 490));
        fotoEnano.setName(""); // NOI18N
        fotoEnano.setPreferredSize(new java.awt.Dimension(282, 490));

        javax.swing.GroupLayout CajaFotoLayout = new javax.swing.GroupLayout(CajaFoto);
        CajaFoto.setLayout(CajaFotoLayout);
        CajaFotoLayout.setHorizontalGroup(
            CajaFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fotoEnano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CajaFotoLayout.setVerticalGroup(
            CajaFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fotoEnano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(CajaFoto);

        CajaStats.setBackground(new java.awt.Color(51, 0, 0));
        CajaStats.setMaximumSize(new java.awt.Dimension(320, 490));
        CajaStats.setMinimumSize(new java.awt.Dimension(320, 490));
        CajaStats.setPreferredSize(new java.awt.Dimension(320, 490));
        CajaStats.setLayout(null);

        btn_misiones.setBackground(new java.awt.Color(153, 0, 0));
        btn_misiones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_misiones.setForeground(new java.awt.Color(255, 204, 0));
        btn_misiones.setText("Cerrar");
        btn_misiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_misiones.setDefaultCapable(false);
        btn_misiones.setFocusPainted(false);
        btn_misiones.setMaximumSize(new java.awt.Dimension(90, 30));
        btn_misiones.setMinimumSize(new java.awt.Dimension(90, 30));
        btn_misiones.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_misiones.setRequestFocusEnabled(false);
        btn_misiones.setRolloverEnabled(false);
        btn_misiones.setVerifyInputWhenFocusTarget(false);
        btn_misiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_misionesActionPerformed(evt);
            }
        });
        CajaStats.add(btn_misiones);
        btn_misiones.setBounds(120, 430, 80, 30);

        exp_minero.setBackground(new java.awt.Color(153, 0, 0));
        exp_minero.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        exp_minero.setForeground(new java.awt.Color(102, 0, 0));
        exp_minero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        exp_minero.setBorderPainted(false);
        exp_minero.setFocusable(false);
        exp_minero.setRequestFocusEnabled(false);
        exp_minero.setVerifyInputWhenFocusTarget(false);
        CajaStats.add(exp_minero);
        exp_minero.setBounds(60, 210, 190, 30);

        lb_nivelMinero.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_nivelMinero.setForeground(new java.awt.Color(255, 204, 0));
        lb_nivelMinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nivelMinero.setText("1");
        CajaStats.add(lb_nivelMinero);
        lb_nivelMinero.setBounds(60, 160, 190, 50);

        lb_expNecesario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_expNecesario.setForeground(new java.awt.Color(255, 204, 0));
        lb_expNecesario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_expNecesario.setText("0/100");
        CajaStats.add(lb_expNecesario);
        lb_expNecesario.setBounds(170, 240, 80, 30);

        panel_mejoras.setBackground(new java.awt.Color(102, 0, 0));
        panel_mejoras.setMaximumSize(new java.awt.Dimension(280, 200));
        panel_mejoras.setMinimumSize(new java.awt.Dimension(280, 200));
        panel_mejoras.setLayout(null);

        btn_misiones1.setBackground(new java.awt.Color(153, 0, 0));
        btn_misiones1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_misiones1.setForeground(new java.awt.Color(255, 204, 0));
        btn_misiones1.setText("Mejorar");
        btn_misiones1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_misiones1.setDefaultCapable(false);
        btn_misiones1.setFocusPainted(false);
        btn_misiones1.setMaximumSize(new java.awt.Dimension(90, 30));
        btn_misiones1.setMinimumSize(new java.awt.Dimension(90, 30));
        btn_misiones1.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_misiones1.setRequestFocusEnabled(false);
        btn_misiones1.setRolloverEnabled(false);
        btn_misiones1.setVerifyInputWhenFocusTarget(false);
        btn_misiones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_misiones1ActionPerformed(evt);
            }
        });
        panel_mejoras.add(btn_misiones1);
        btn_misiones1.setBounds(170, 10, 80, 30);

        lb_numeroDeMejoras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_numeroDeMejoras.setForeground(new java.awt.Color(255, 204, 0));
        lb_numeroDeMejoras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_numeroDeMejoras.setText("Mejoras Actuales:");
        lb_numeroDeMejoras.setToolTipText("");
        panel_mejoras.add(lb_numeroDeMejoras);
        lb_numeroDeMejoras.setBounds(10, 0, 160, 50);

        CajaStats.add(panel_mejoras);
        panel_mejoras.setBounds(30, 350, 260, 50);

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        lb_precioMejora.setForeground(new java.awt.Color(255, 204, 0));
        lb_precioMejora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_precioMejora.setText("Precio Mejora: ");

        lb_creditos.setForeground(new java.awt.Color(255, 204, 0));
        lb_creditos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_creditos.setText("Creditos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lb_precioMejora, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_precioMejora)
                    .addComponent(lb_creditos))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        CajaStats.add(jPanel2);
        jPanel2.setBounds(20, 300, 280, 170);

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        lb_nombreClase.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_nombreClase.setForeground(new java.awt.Color(255, 204, 0));
        lb_nombreClase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_nombreClase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_nombreClase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        CajaStats.add(jPanel3);
        jPanel3.setBounds(20, 40, 280, 70);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        CajaStats.add(jPanel1);
        jPanel1.setBounds(50, 160, 210, 120);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/FondoDentroInventario.jpg"))); // NOI18N
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        CajaStats.add(fondo);
        fondo.setBounds(0, 0, 320, 490);

        getContentPane().add(CajaStats);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_misionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_misionesActionPerformed
        this.dispose();
        new VentanaPrincipal(usr,prt);
    }//GEN-LAST:event_btn_misionesActionPerformed

    private void btn_misiones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_misiones1ActionPerformed
        if (prt.getCreditos() > this.precioMejora) {
            min.setMejoras(min.getMejoras() + 1);
            prt.setCreditos(prt.getCreditos() - this.precioMejora);
            minerodao.retornarMinero(min, prt);
            partidadao.retornarPartida(prt);
            this.lb_creditos.setText("Creditos: " + prt.getCreditos());
            this.min = minerodao.obtenerMinero(prt, cls);
            this.lb_numeroDeMejoras.setText("Mejoras Actuales: " + min.getMejoras());
        } else {
            JOptionPane.showMessageDialog(this, "Creditos insuficientes", "Cuidado", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btn_misiones1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEnano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CajaFoto;
    private javax.swing.JPanel CajaStats;
    private javax.swing.JButton btn_misiones;
    private javax.swing.JButton btn_misiones1;
    private javax.swing.JProgressBar exp_minero;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fotoEnano;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_creditos;
    private javax.swing.JLabel lb_expNecesario;
    private javax.swing.JLabel lb_nivelMinero;
    private javax.swing.JLabel lb_nombreClase;
    private javax.swing.JLabel lb_numeroDeMejoras;
    private javax.swing.JLabel lb_precioMejora;
    private javax.swing.JPanel panel_mejoras;
    // End of variables declaration//GEN-END:variables
}
