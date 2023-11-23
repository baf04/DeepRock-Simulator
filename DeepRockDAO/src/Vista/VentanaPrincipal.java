package Vista;

import AccesoDatos.Interfaces.MineroDAO;
import AccesoDatos.Interfaces.PartidaDAO;
import AccesoDatos.Interfaces.UsuarioDAO;
import AccesoDatos.JDBC.JDBCPartidaDAO;
import AccesoDatos.JDBC.JDBCUsuarioDAO;
import Factoria.Factoria;
import Modelo.Partida;
import Modelo.Usuario;
import java.awt.Color;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    private static MineroDAO minerodao;
    private static PartidaDAO partidadao;
    private Partida prt;
    private Usuario usr;

    public VentanaPrincipal() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public VentanaPrincipal(Usuario usr_e, Partida prt_e) {
        initComponents();
        this.minerodao = Factoria.crearMinero(Factoria.getTipoDAO());
        this.partidadao = Factoria.crearPartida(Factoria.getTipoDAO());
        this.usr = usr_e;
        this.prt = prt_e;
        this.pb_nivelUsuario.setValue(prt_e.getExp() % 100);
        this.lb_nivelUsuario.setText(String.valueOf(calcNivelUsuario(prt_e.getExp())));
        setearLabels();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    private void setearLabels(){
        //String.valueOf(partidadao.obtenerPartida(prt.getId_to_usuario(), usr.getId()).getCreditos())
        this.lb_creditos.setText(String.valueOf(partidadao.obtenerPartida(prt.getId_to_usuario(), prt.getId()).getCreditos()));
        this.lb_lvlArtillero.setText(String.valueOf(minerodao.obtenerMinero(prt, "Artillero").calcNivel()));
        this.lb_lvlIngeniero.setText(String.valueOf(minerodao.obtenerMinero(prt, "Ingeniero").calcNivel()));
        this.lb_lvlExplorador.setText(String.valueOf(minerodao.obtenerMinero(prt, "Explorador").calcNivel()));
        this.lb_lvlTaladrador.setText(String.valueOf(minerodao.obtenerMinero(prt, "Taladrador").calcNivel()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Enanos = new javax.swing.ButtonGroup();
        vp_panel_Misiones = new javax.swing.JPanel();
        btn_social1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_misiones = new javax.swing.JButton();
        btn_misiones1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vp_panel_Inventario = new javax.swing.JPanel();
        vp_panel_infoUsuario = new javax.swing.JPanel();
        lb_creditos = new javax.swing.JLabel();
        btn_inventario = new javax.swing.JButton();
        img_creditos1 = new javax.swing.JLabel();
        img_creditos2 = new javax.swing.JLabel();
        pb_nivelUsuario = new javax.swing.JProgressBar();
        lb_nivelUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        vp_img_fondoInventario = new javax.swing.JLabel();
        vp_panel_Seleccion = new javax.swing.JPanel();
        vp_panel_Personajes = new javax.swing.JPanel();
        IgualadorIzq = new javax.swing.JPanel();
        vp_casilla_Ingeniero = new javax.swing.JPanel();
        lb_lvlIngeniero = new javax.swing.JLabel();
        img_Ingeniero = new javax.swing.JLabel();
        selecIngeniero = new javax.swing.JRadioButton();
        Separador = new javax.swing.JPanel();
        vp_casilla_Artillero = new javax.swing.JPanel();
        lb_lvlArtillero = new javax.swing.JLabel();
        img_Artillero = new javax.swing.JLabel();
        selecArtillero = new javax.swing.JRadioButton();
        Separador1 = new javax.swing.JPanel();
        vp_casilla_Taladro = new javax.swing.JPanel();
        lb_lvlTaladrador = new javax.swing.JLabel();
        img_Taladrador = new javax.swing.JLabel();
        selecTaladrador = new javax.swing.JRadioButton();
        Separador2 = new javax.swing.JPanel();
        vp_casilla_Explorador = new javax.swing.JPanel();
        lb_lvlExplorador = new javax.swing.JLabel();
        img_Explorador = new javax.swing.JLabel();
        selecExplorador = new javax.swing.JRadioButton();
        IgualadorDer = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();
        vp_img_fondoSeleccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1264, 710));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1264, 710));
        getContentPane().setLayout(null);

        vp_panel_Misiones.setBackground(new java.awt.Color(255, 0, 0));
        vp_panel_Misiones.setLayout(null);

        btn_social1.setBackground(new java.awt.Color(102, 0, 0));
        btn_social1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_social1.setForeground(new java.awt.Color(255, 153, 0));
        btn_social1.setText("Volver");
        btn_social1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btn_social1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_social1.setDefaultCapable(false);
        btn_social1.setFocusPainted(false);
        btn_social1.setMaximumSize(new java.awt.Dimension(90, 30));
        btn_social1.setMinimumSize(new java.awt.Dimension(90, 30));
        btn_social1.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_social1.setRequestFocusEnabled(false);
        btn_social1.setRolloverEnabled(false);
        btn_social1.setVerifyInputWhenFocusTarget(false);
        btn_social1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_social1ActionPerformed(evt);
            }
        });
        vp_panel_Misiones.add(btn_social1);
        btn_social1.setBounds(20, 10, 80, 30);

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        btn_misiones.setBackground(new java.awt.Color(102, 0, 0));
        btn_misiones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_misiones.setForeground(new java.awt.Color(255, 153, 0));
        btn_misiones.setText("Misiones");
        btn_misiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btn_misiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btn_misiones1.setBackground(new java.awt.Color(102, 0, 0));
        btn_misiones1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_misiones1.setForeground(new java.awt.Color(255, 153, 0));
        btn_misiones1.setText("Historial Misiones");
        btn_misiones1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btn_misiones1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/ic_mision.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btn_misiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btn_misiones1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn_misiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_misiones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        vp_panel_Misiones.add(jPanel2);
        jPanel2.setBounds(40, 170, 380, 360);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/FondoMisiones.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        vp_panel_Misiones.add(jLabel1);
        jLabel1.setBounds(0, 0, 472, 710);

        getContentPane().add(vp_panel_Misiones);
        vp_panel_Misiones.setBounds(0, 0, 460, 710);

        vp_panel_Inventario.setBackground(new java.awt.Color(255, 102, 51));
        vp_panel_Inventario.setLayout(null);

        vp_panel_infoUsuario.setOpaque(false);
        vp_panel_infoUsuario.setLayout(null);

        lb_creditos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_creditos.setForeground(new java.awt.Color(255, 153, 0));
        lb_creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_creditos.setText("25,000");
        vp_panel_infoUsuario.add(lb_creditos);
        lb_creditos.setBounds(140, 250, 230, 20);

        btn_inventario.setBackground(new java.awt.Color(102, 0, 0));
        btn_inventario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_inventario.setForeground(new java.awt.Color(255, 153, 0));
        btn_inventario.setText("Inventario");
        btn_inventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btn_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inventario.setDefaultCapable(false);
        btn_inventario.setFocusPainted(false);
        btn_inventario.setMaximumSize(new java.awt.Dimension(90, 30));
        btn_inventario.setMinimumSize(new java.awt.Dimension(90, 30));
        btn_inventario.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_inventario.setRequestFocusEnabled(false);
        btn_inventario.setRolloverEnabled(false);
        btn_inventario.setVerifyInputWhenFocusTarget(false);
        btn_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inventarioActionPerformed(evt);
            }
        });
        vp_panel_infoUsuario.add(btn_inventario);
        btn_inventario.setBounds(390, 320, 90, 30);

        img_creditos1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        img_creditos1.setForeground(new java.awt.Color(255, 153, 0));
        img_creditos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/Ic_nivel.png"))); // NOI18N
        vp_panel_infoUsuario.add(img_creditos1);
        img_creditos1.setBounds(530, 100, 130, 130);

        img_creditos2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        img_creditos2.setForeground(new java.awt.Color(255, 153, 0));
        img_creditos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/Creditos.png"))); // NOI18N
        vp_panel_infoUsuario.add(img_creditos2);
        img_creditos2.setBounds(190, 100, 130, 130);

        pb_nivelUsuario.setBackground(new java.awt.Color(102, 0, 0));
        pb_nivelUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        pb_nivelUsuario.setForeground(new java.awt.Color(0, 102, 153));
        pb_nivelUsuario.setValue(12);
        pb_nivelUsuario.setBorder(null);
        pb_nivelUsuario.setBorderPainted(false);
        vp_panel_infoUsuario.add(pb_nivelUsuario);
        pb_nivelUsuario.setBounds(540, 240, 110, 30);

        lb_nivelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_nivelUsuario.setForeground(new java.awt.Color(0, 102, 153));
        lb_nivelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nivelUsuario.setText("12");
        vp_panel_infoUsuario.add(lb_nivelUsuario);
        lb_nivelUsuario.setBounds(480, 230, 60, 50);

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        vp_panel_infoUsuario.add(jPanel3);
        jPanel3.setBounds(480, 70, 0, 0);

        vp_panel_Inventario.add(vp_panel_infoUsuario);
        vp_panel_infoUsuario.setBounds(0, 0, 800, 379);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        vp_panel_Inventario.add(jPanel1);
        jPanel1.setBounds(150, 70, 210, 230);

        vp_img_fondoInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/FondoInventario.jpg"))); // NOI18N
        vp_img_fondoInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        vp_img_fondoInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vp_img_fondoInventario.setMaximumSize(new java.awt.Dimension(826, 390));
        vp_img_fondoInventario.setMinimumSize(new java.awt.Dimension(826, 390));
        vp_img_fondoInventario.setPreferredSize(new java.awt.Dimension(826, 390));
        vp_img_fondoInventario.setVerifyInputWhenFocusTarget(false);
        vp_panel_Inventario.add(vp_img_fondoInventario);
        vp_img_fondoInventario.setBounds(0, -10, 804, 390);

        getContentPane().add(vp_panel_Inventario);
        vp_panel_Inventario.setBounds(460, 330, 810, 380);

        vp_panel_Seleccion.setMinimumSize(new java.awt.Dimension(800, 330));
        vp_panel_Seleccion.setRequestFocusEnabled(false);
        vp_panel_Seleccion.setLayout(null);

        vp_panel_Personajes.setBackground(new Color(0,0,0,100));
        vp_panel_Personajes.setOpaque(false);
        vp_panel_Personajes.setPreferredSize(new java.awt.Dimension(712, 150));
        vp_panel_Personajes.setLayout(new javax.swing.BoxLayout(vp_panel_Personajes, javax.swing.BoxLayout.LINE_AXIS));

        IgualadorIzq.setBackground(new Color(0,0,0,100));
        IgualadorIzq.setOpaque(false);
        IgualadorIzq.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout IgualadorIzqLayout = new javax.swing.GroupLayout(IgualadorIzq);
        IgualadorIzq.setLayout(IgualadorIzqLayout);
        IgualadorIzqLayout.setHorizontalGroup(
            IgualadorIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        IgualadorIzqLayout.setVerticalGroup(
            IgualadorIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        vp_panel_Personajes.add(IgualadorIzq);

        vp_casilla_Ingeniero.setBackground(new Color(0,0,0,100));
        vp_casilla_Ingeniero.setOpaque(false);
        vp_casilla_Ingeniero.setLayout(new javax.swing.BoxLayout(vp_casilla_Ingeniero, javax.swing.BoxLayout.Y_AXIS));

        lb_lvlIngeniero.setBackground(new java.awt.Color(51, 0, 0));
        lb_lvlIngeniero.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lb_lvlIngeniero.setForeground(new java.awt.Color(255, 153, 0));
        lb_lvlIngeniero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lvlIngeniero.setText("1");
        lb_lvlIngeniero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        lb_lvlIngeniero.setFocusable(false);
        lb_lvlIngeniero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_lvlIngeniero.setMaximumSize(new java.awt.Dimension(153, 16));
        lb_lvlIngeniero.setMinimumSize(new java.awt.Dimension(153, 16));
        lb_lvlIngeniero.setOpaque(true);
        lb_lvlIngeniero.setPreferredSize(new java.awt.Dimension(153, 16));
        vp_casilla_Ingeniero.add(lb_lvlIngeniero);

        img_Ingeniero.setBackground(new Color(0,0,0,100));
        img_Ingeniero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/PersonajeIngeniero.png"))); // NOI18N
        vp_casilla_Ingeniero.add(img_Ingeniero);

        selecIngeniero.setBackground(new java.awt.Color(51, 0, 0));
        Enanos.add(selecIngeniero);
        selecIngeniero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selecIngeniero.setForeground(new java.awt.Color(255, 255, 255));
        selecIngeniero.setText("Ingeniero");
        selecIngeniero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        selecIngeniero.setBorderPainted(true);
        selecIngeniero.setContentAreaFilled(false);
        selecIngeniero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecIngeniero.setFocusPainted(false);
        selecIngeniero.setFocusable(false);
        selecIngeniero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selecIngeniero.setInheritsPopupMenu(true);
        selecIngeniero.setMaximumSize(new java.awt.Dimension(153, 21));
        selecIngeniero.setMinimumSize(new java.awt.Dimension(153, 21));
        selecIngeniero.setOpaque(true);
        selecIngeniero.setRolloverEnabled(false);
        selecIngeniero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecIngenieroActionPerformed(evt);
            }
        });
        vp_casilla_Ingeniero.add(selecIngeniero);

        vp_panel_Personajes.add(vp_casilla_Ingeniero);

        Separador.setMaximumSize(new java.awt.Dimension(10, 20));
        Separador.setMinimumSize(new java.awt.Dimension(10, 20));
        Separador.setOpaque(false);
        Separador.setPreferredSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout SeparadorLayout = new javax.swing.GroupLayout(Separador);
        Separador.setLayout(SeparadorLayout);
        SeparadorLayout.setHorizontalGroup(
            SeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        SeparadorLayout.setVerticalGroup(
            SeparadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        vp_panel_Personajes.add(Separador);

        vp_casilla_Artillero.setBackground(new Color(0,0,0,100));
        vp_casilla_Artillero.setOpaque(false);
        vp_casilla_Artillero.setLayout(new javax.swing.BoxLayout(vp_casilla_Artillero, javax.swing.BoxLayout.Y_AXIS));

        lb_lvlArtillero.setBackground(new java.awt.Color(51, 0, 0));
        lb_lvlArtillero.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lb_lvlArtillero.setForeground(new java.awt.Color(255, 153, 0));
        lb_lvlArtillero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lvlArtillero.setText("1");
        lb_lvlArtillero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        lb_lvlArtillero.setFocusable(false);
        lb_lvlArtillero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_lvlArtillero.setMaximumSize(new java.awt.Dimension(153, 16));
        lb_lvlArtillero.setMinimumSize(new java.awt.Dimension(153, 16));
        lb_lvlArtillero.setOpaque(true);
        lb_lvlArtillero.setPreferredSize(new java.awt.Dimension(153, 16));
        vp_casilla_Artillero.add(lb_lvlArtillero);

        img_Artillero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/PersonajeArtillero.png"))); // NOI18N
        vp_casilla_Artillero.add(img_Artillero);

        selecArtillero.setBackground(new java.awt.Color(51, 0, 0));
        Enanos.add(selecArtillero);
        selecArtillero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selecArtillero.setForeground(new java.awt.Color(255, 255, 255));
        selecArtillero.setText("Artillero");
        selecArtillero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        selecArtillero.setBorderPainted(true);
        selecArtillero.setContentAreaFilled(false);
        selecArtillero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecArtillero.setFocusPainted(false);
        selecArtillero.setFocusable(false);
        selecArtillero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selecArtillero.setInheritsPopupMenu(true);
        selecArtillero.setMaximumSize(new java.awt.Dimension(153, 21));
        selecArtillero.setMinimumSize(new java.awt.Dimension(153, 21));
        selecArtillero.setOpaque(true);
        selecArtillero.setRolloverEnabled(false);
        selecArtillero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecArtilleroActionPerformed(evt);
            }
        });
        vp_casilla_Artillero.add(selecArtillero);

        vp_panel_Personajes.add(vp_casilla_Artillero);

        Separador1.setMaximumSize(new java.awt.Dimension(10, 20));
        Separador1.setMinimumSize(new java.awt.Dimension(10, 20));
        Separador1.setOpaque(false);

        javax.swing.GroupLayout Separador1Layout = new javax.swing.GroupLayout(Separador1);
        Separador1.setLayout(Separador1Layout);
        Separador1Layout.setHorizontalGroup(
            Separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        Separador1Layout.setVerticalGroup(
            Separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        vp_panel_Personajes.add(Separador1);

        vp_casilla_Taladro.setBackground(new Color(0,0,0,100));
        vp_casilla_Taladro.setOpaque(false);
        vp_casilla_Taladro.setLayout(new javax.swing.BoxLayout(vp_casilla_Taladro, javax.swing.BoxLayout.Y_AXIS));

        lb_lvlTaladrador.setBackground(new java.awt.Color(51, 0, 0));
        lb_lvlTaladrador.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lb_lvlTaladrador.setForeground(new java.awt.Color(255, 153, 0));
        lb_lvlTaladrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lvlTaladrador.setText("1");
        lb_lvlTaladrador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        lb_lvlTaladrador.setFocusable(false);
        lb_lvlTaladrador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_lvlTaladrador.setMaximumSize(new java.awt.Dimension(153, 16));
        lb_lvlTaladrador.setMinimumSize(new java.awt.Dimension(153, 16));
        lb_lvlTaladrador.setOpaque(true);
        lb_lvlTaladrador.setPreferredSize(new java.awt.Dimension(153, 16));
        vp_casilla_Taladro.add(lb_lvlTaladrador);

        img_Taladrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/PersonajeTaladrador.png"))); // NOI18N
        vp_casilla_Taladro.add(img_Taladrador);

        selecTaladrador.setBackground(new java.awt.Color(51, 0, 0));
        Enanos.add(selecTaladrador);
        selecTaladrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selecTaladrador.setForeground(new java.awt.Color(255, 255, 255));
        selecTaladrador.setText("Taladrador");
        selecTaladrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        selecTaladrador.setBorderPainted(true);
        selecTaladrador.setContentAreaFilled(false);
        selecTaladrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecTaladrador.setFocusPainted(false);
        selecTaladrador.setFocusable(false);
        selecTaladrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selecTaladrador.setInheritsPopupMenu(true);
        selecTaladrador.setMaximumSize(new java.awt.Dimension(153, 21));
        selecTaladrador.setMinimumSize(new java.awt.Dimension(153, 21));
        selecTaladrador.setOpaque(true);
        selecTaladrador.setRolloverEnabled(false);
        selecTaladrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecTaladradorActionPerformed(evt);
            }
        });
        vp_casilla_Taladro.add(selecTaladrador);

        vp_panel_Personajes.add(vp_casilla_Taladro);

        Separador2.setMaximumSize(new java.awt.Dimension(10, 20));
        Separador2.setMinimumSize(new java.awt.Dimension(10, 20));
        Separador2.setOpaque(false);

        javax.swing.GroupLayout Separador2Layout = new javax.swing.GroupLayout(Separador2);
        Separador2.setLayout(Separador2Layout);
        Separador2Layout.setHorizontalGroup(
            Separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        Separador2Layout.setVerticalGroup(
            Separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        vp_panel_Personajes.add(Separador2);

        vp_casilla_Explorador.setBackground(new Color(0,0,0,100));
        vp_casilla_Explorador.setOpaque(false);
        vp_casilla_Explorador.setLayout(new javax.swing.BoxLayout(vp_casilla_Explorador, javax.swing.BoxLayout.Y_AXIS));

        lb_lvlExplorador.setBackground(new java.awt.Color(51, 0, 0));
        lb_lvlExplorador.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lb_lvlExplorador.setForeground(new java.awt.Color(255, 153, 0));
        lb_lvlExplorador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lvlExplorador.setText("1");
        lb_lvlExplorador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 0), 1, true));
        lb_lvlExplorador.setFocusable(false);
        lb_lvlExplorador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_lvlExplorador.setMaximumSize(new java.awt.Dimension(153, 16));
        lb_lvlExplorador.setMinimumSize(new java.awt.Dimension(153, 16));
        lb_lvlExplorador.setOpaque(true);
        lb_lvlExplorador.setPreferredSize(new java.awt.Dimension(153, 16));
        vp_casilla_Explorador.add(lb_lvlExplorador);

        img_Explorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/PersonajeExplorador.png"))); // NOI18N
        vp_casilla_Explorador.add(img_Explorador);

        selecExplorador.setBackground(new java.awt.Color(51, 0, 0));
        Enanos.add(selecExplorador);
        selecExplorador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selecExplorador.setForeground(new java.awt.Color(255, 255, 255));
        selecExplorador.setText("Explorador");
        selecExplorador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        selecExplorador.setBorderPainted(true);
        selecExplorador.setContentAreaFilled(false);
        selecExplorador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selecExplorador.setFocusPainted(false);
        selecExplorador.setFocusable(false);
        selecExplorador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selecExplorador.setInheritsPopupMenu(true);
        selecExplorador.setMaximumSize(new java.awt.Dimension(153, 21));
        selecExplorador.setMinimumSize(new java.awt.Dimension(153, 21));
        selecExplorador.setOpaque(true);
        selecExplorador.setRolloverEnabled(false);
        selecExplorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecExploradorActionPerformed(evt);
            }
        });
        vp_casilla_Explorador.add(selecExplorador);

        vp_panel_Personajes.add(vp_casilla_Explorador);

        IgualadorDer.setBackground(new Color(0,0,0,100));
        IgualadorDer.setOpaque(false);
        IgualadorDer.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout IgualadorDerLayout = new javax.swing.GroupLayout(IgualadorDer);
        IgualadorDer.setLayout(IgualadorDerLayout);
        IgualadorDerLayout.setHorizontalGroup(
            IgualadorDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        IgualadorDerLayout.setVerticalGroup(
            IgualadorDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        vp_panel_Personajes.add(IgualadorDer);

        vp_panel_Seleccion.add(vp_panel_Personajes);
        vp_panel_Personajes.setBounds(70, 60, 660, 210);

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
        vp_panel_Seleccion.add(btn_cerrar);
        btn_cerrar.setBounds(760, 10, 30, 30);

        vp_img_fondoSeleccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vp_img_fondoSeleccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/FondoSeleccion.jpg"))); // NOI18N
        vp_img_fondoSeleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        vp_panel_Seleccion.add(vp_img_fondoSeleccion);
        vp_img_fondoSeleccion.setBounds(0, 0, 804, 330);

        getContentPane().add(vp_panel_Seleccion);
        vp_panel_Seleccion.setBounds(460, 0, 820, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed
    
    private int calcNivelUsuario(int exp){
        double calc;
        int lvl;
        calc = exp / 100; 
        Math.round(calc);
        lvl = (int) calc;
        return lvl;
    }
    
    private void selecIngenieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecIngenieroActionPerformed
        this.img_Ingeniero.setIcon(new ImageIcon("./src/rsc/images/PersonajeIngenieroRemake.png"));
        this.img_Artillero.setIcon(new ImageIcon("./src/rsc/images/PersonajeArtillero.png"));
        this.img_Taladrador.setIcon(new ImageIcon("./src/rsc/images/PersonajeTaladrador.png"));
        this.img_Explorador.setIcon(new ImageIcon("./src/rsc/images/PersonajeExplorador.png"));
    }//GEN-LAST:event_selecIngenieroActionPerformed

    private void selecArtilleroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecArtilleroActionPerformed
        this.img_Ingeniero.setIcon(new ImageIcon("./src/rsc/images/PersonajeIngeniero.png"));
        this.img_Artillero.setIcon(new ImageIcon("./src/rsc/images/PersonajeArtilleroRemake.png"));
        this.img_Taladrador.setIcon(new ImageIcon("./src/rsc/images/PersonajeTaladrador.png"));
        this.img_Explorador.setIcon(new ImageIcon("./src/rsc/images/PersonajeExplorador.png"));
    }//GEN-LAST:event_selecArtilleroActionPerformed

    private void selecTaladradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecTaladradorActionPerformed
        this.img_Ingeniero.setIcon(new ImageIcon("./src/rsc/images/PersonajeIngeniero.png"));
        this.img_Artillero.setIcon(new ImageIcon("./src/rsc/images/PersonajeArtillero.png"));
        this.img_Taladrador.setIcon(new ImageIcon("./src/rsc/images/PersonajeTaladradorRemake.png"));
        this.img_Explorador.setIcon(new ImageIcon("./src/rsc/images/PersonajeExplorador.png"));
    }//GEN-LAST:event_selecTaladradorActionPerformed

    private void selecExploradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecExploradorActionPerformed
        this.img_Ingeniero.setIcon(new ImageIcon("./src/rsc/images/PersonajeIngeniero.png"));
        this.img_Artillero.setIcon(new ImageIcon("./src/rsc/images/PersonajeArtillero.png"));
        this.img_Taladrador.setIcon(new ImageIcon("./src/rsc/images/PersonajeTaladrador.png"));
        this.img_Explorador.setIcon(new ImageIcon("./src/rsc/images/PersonajeExploradorRemake.png"));
    }//GEN-LAST:event_selecExploradorActionPerformed

    private void btn_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inventarioActionPerformed
        if (this.selecArtillero.isSelected()) {
            this.dispose();
            new VentanaEnano("./src/rsc/images/TarjetaArtillero.jpg", prt, "Artillero",usr);
        } else if (this.selecIngeniero.isSelected()) {
            this.dispose();
            new VentanaEnano("./src/rsc/images/TarjetaIngeniero.jpg", prt, "Ingeniero",usr);
        } else if (this.selecTaladrador.isSelected()) {
            this.dispose();
            new VentanaEnano("./src/rsc/images/TarjetaTaladrador.jpg", prt, "Taladrador",usr);
        } else if (this.selecExplorador.isSelected()) {
            this.dispose();
            new VentanaEnano("./src/rsc/images/TarjetaExplorador.jpg", prt, "Explorador",usr);
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un minero", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_inventarioActionPerformed

    private void btn_misionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_misionesActionPerformed
        if (this.selecArtillero.isSelected()) {
            this.dispose();
            new VentanaMisiones(prt, usr, minerodao.obtenerMinero(prt, "Artillero"));
        } else if (this.selecIngeniero.isSelected()) {
            this.dispose();
            new VentanaMisiones(prt, usr, minerodao.obtenerMinero(prt, "Ingeniero"));
        } else if (this.selecTaladrador.isSelected()) {
            this.dispose();
            new VentanaMisiones(prt, usr, minerodao.obtenerMinero(prt, "Taladrador"));
        } else if (this.selecExplorador.isSelected()) {
            this.dispose();
            new VentanaMisiones(prt, usr, minerodao.obtenerMinero(prt, "Explorador"));
        } else {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un minero", "Cuidado", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_misionesActionPerformed

    private void btn_social1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_social1ActionPerformed
        this.dispose();
        new VentanaSeleccionPartida(usr);
    }//GEN-LAST:event_btn_social1ActionPerformed

    private void btn_misiones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_misiones1ActionPerformed
        new VentanaHistorialMisiones(prt);
    }//GEN-LAST:event_btn_misiones1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Enanos;
    private javax.swing.JPanel IgualadorDer;
    private javax.swing.JPanel IgualadorIzq;
    private javax.swing.JPanel Separador;
    private javax.swing.JPanel Separador1;
    private javax.swing.JPanel Separador2;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_inventario;
    private javax.swing.JButton btn_misiones;
    private javax.swing.JButton btn_misiones1;
    private javax.swing.JButton btn_social1;
    private javax.swing.JLabel img_Artillero;
    private javax.swing.JLabel img_Explorador;
    private javax.swing.JLabel img_Ingeniero;
    private javax.swing.JLabel img_Taladrador;
    private javax.swing.JLabel img_creditos1;
    private javax.swing.JLabel img_creditos2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_creditos;
    private javax.swing.JLabel lb_lvlArtillero;
    private javax.swing.JLabel lb_lvlExplorador;
    private javax.swing.JLabel lb_lvlIngeniero;
    private javax.swing.JLabel lb_lvlTaladrador;
    private javax.swing.JLabel lb_nivelUsuario;
    private javax.swing.JProgressBar pb_nivelUsuario;
    private javax.swing.JRadioButton selecArtillero;
    private javax.swing.JRadioButton selecExplorador;
    private javax.swing.JRadioButton selecIngeniero;
    private javax.swing.JRadioButton selecTaladrador;
    private javax.swing.JPanel vp_casilla_Artillero;
    private javax.swing.JPanel vp_casilla_Explorador;
    private javax.swing.JPanel vp_casilla_Ingeniero;
    private javax.swing.JPanel vp_casilla_Taladro;
    private javax.swing.JLabel vp_img_fondoInventario;
    private javax.swing.JLabel vp_img_fondoSeleccion;
    private javax.swing.JPanel vp_panel_Inventario;
    private javax.swing.JPanel vp_panel_Misiones;
    private javax.swing.JPanel vp_panel_Personajes;
    private javax.swing.JPanel vp_panel_Seleccion;
    private javax.swing.JPanel vp_panel_infoUsuario;
    // End of variables declaration//GEN-END:variables
}
