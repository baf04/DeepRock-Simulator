package Vista;

import AccesoDatos.Interfaces.MineroDAO;
import AccesoDatos.Interfaces.PartidaDAO;
import AccesoDatos.Interfaces.UsuarioDAO;
import Factoria.Factoria;
import Modelo.Minero;
import Modelo.Partida;
import Modelo.Usuario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaSeleccionPartida extends javax.swing.JFrame {

    private static PartidaDAO partidadao;
    private static MineroDAO minerodao;
    private Usuario usr;
    private Minero min;
    private Partida p1;
    private Partida p2;
    private Partida p3;

    private boolean p1Selected = false;
    private boolean p2Selected = false;
    private boolean p3Selected = false;

    private final Color borderColor = new Color(255,153,0);
    private final String[] clases = {"Ingeniero", "Artillero", "Taladrador", "Explorador"};

    public VentanaSeleccionPartida() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public VentanaSeleccionPartida(Usuario usr_e) {
        initComponents();
        this.usr = usr_e;
        this.minerodao = Factoria.crearMinero(Factoria.getTipoDAO());
        this.partidadao = Factoria.crearPartida(Factoria.getTipoDAO());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        cargarPartidas();
    }

    private void cargarPartidas() {
        int usrID1 = ((usr.getId() * 3) - 2);
        int usrID2 = ((usr.getId() * 3) - 1);
        int usrID3 = (usr.getId() * 3);
        
        p1 = partidadao.obtenerPartida(usr.getId(), usrID1);
        p2 = partidadao.obtenerPartida(usr.getId(), usrID2);
        p3 = partidadao.obtenerPartida(usr.getId(), usrID3);

        setearLabels(p1, p1_lvl_ingeniero, p1_lvl_artillero, p1_lvl_taladrador, p1_lvl_explorador);
        setearLabels(p2, p2_lvl_ingeniero, p2_lvl_artillero, p2_lvl_taladrador, p2_lvl_explorador);
        setearLabels(p3, p3_lvl_ingeniero, p3_lvl_artillero, p3_lvl_taladrador, p3_lvl_explorador);
    }
    
    private void setearLabels(Partida p, JLabel lvlIngeniero, JLabel lvlArtillero, JLabel lvlTaladrador, JLabel lvlExplorador) {

        this.img_partida1.setText(p1.getNombre());
        this.img_partida2.setText(p2.getNombre());
        this.img_partida3.setText(p3.getNombre());

        this.p1_lvl.setText(String.valueOf(p1.calcNivel()));
        this.p2_lvl.setText(String.valueOf(p2.calcNivel()));
        this.p3_lvl.setText(String.valueOf(p3.calcNivel()));

        this.p1_creditos.setText(String.valueOf(p1.getCreditos()));
        this.p2_creditos.setText(String.valueOf(p2.getCreditos()));
        this.p3_creditos.setText(String.valueOf(p3.getCreditos()));
        
        ArrayList<Minero> mineros = new ArrayList<>();
        for (String clase : clases) {
            mineros.add(minerodao.obtenerMinero(p, clase));
        }

        for (Minero minero : mineros) {
            switch (minero.getClase()) {
                case "Ingeniero":
                    lvlIngeniero.setText(String.valueOf(minero.calcNivel()));
                    break;
                case "Artillero":
                    lvlArtillero.setText(String.valueOf(minero.calcNivel()));
                    break;
                case "Taladrador":
                    lvlTaladrador.setText(String.valueOf(minero.calcNivel()));
                    break;
                case "Explorador":
                    lvlExplorador.setText(String.valueOf(minero.calcNivel()));
                    break;
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_seleccion = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        btn_seleccionar = new javax.swing.JButton();
        lb_titulo = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        pnl_partidas = new javax.swing.JPanel();
        separadorIzq = new javax.swing.JPanel();
        panel_Partida1 = new javax.swing.JPanel();
        img_partida1 = new javax.swing.JLabel();
        p1_lvl = new javax.swing.JLabel();
        p1_lb_creditos = new javax.swing.JLabel();
        p1_explorador = new javax.swing.JLabel();
        p1_creditos = new javax.swing.JLabel();
        p1_lb_nivel2 = new javax.swing.JLabel();
        p1_ingeniero = new javax.swing.JLabel();
        p1_artillero = new javax.swing.JLabel();
        p1_taladrador = new javax.swing.JLabel();
        p1_lvl_ingeniero = new javax.swing.JLabel();
        p1_lvl_artillero = new javax.swing.JLabel();
        p1_lvl_explorador = new javax.swing.JLabel();
        p1_lvl_taladrador = new javax.swing.JLabel();
        btn_renombrarp1 = new javax.swing.JButton();
        separador1 = new javax.swing.JPanel();
        panel_Partida2 = new javax.swing.JPanel();
        img_partida2 = new javax.swing.JLabel();
        p2_lb_creditos = new javax.swing.JLabel();
        p2_lb_nivel = new javax.swing.JLabel();
        p2_lvl = new javax.swing.JLabel();
        p2_creditos = new javax.swing.JLabel();
        p2_artillero1 = new javax.swing.JLabel();
        p2_explorador1 = new javax.swing.JLabel();
        p2_ingeniero1 = new javax.swing.JLabel();
        p2_taladrador1 = new javax.swing.JLabel();
        p2_lvl_artillero = new javax.swing.JLabel();
        p2_lvl_explorador = new javax.swing.JLabel();
        p2_lvl_taladrador = new javax.swing.JLabel();
        p2_lvl_ingeniero = new javax.swing.JLabel();
        btn_renombrarp2 = new javax.swing.JButton();
        separador2 = new javax.swing.JPanel();
        panel_Partida3 = new javax.swing.JPanel();
        img_partida3 = new javax.swing.JLabel();
        p3_lb_creditos3 = new javax.swing.JLabel();
        p3_lb_nivel = new javax.swing.JLabel();
        p3_creditos = new javax.swing.JLabel();
        p3_lvl = new javax.swing.JLabel();
        p3_explorador2 = new javax.swing.JLabel();
        p3_ingeniero2 = new javax.swing.JLabel();
        p3_taladrador2 = new javax.swing.JLabel();
        p3_artillero2 = new javax.swing.JLabel();
        p3_lvl_artillero = new javax.swing.JLabel();
        p3_lvl_taladrador = new javax.swing.JLabel();
        p3_lvl_ingeniero = new javax.swing.JLabel();
        p3_lvl_explorador = new javax.swing.JLabel();
        btn_renombrarp3 = new javax.swing.JButton();
        separadorDer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(700, 540));
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 540));

        bg_seleccion.setBackground(new java.awt.Color(51, 0, 0));
        bg_seleccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        bg_seleccion.setDoubleBuffered(false);
        bg_seleccion.setMaximumSize(new java.awt.Dimension(600, 530));
        bg_seleccion.setMinimumSize(new java.awt.Dimension(600, 530));
        bg_seleccion.setPreferredSize(new java.awt.Dimension(600, 530));
        bg_seleccion.setRequestFocusEnabled(false);
        bg_seleccion.setVerifyInputWhenFocusTarget(false);
        bg_seleccion.setLayout(null);

        btn_volver.setBackground(new java.awt.Color(102, 0, 0));
        btn_volver.setForeground(new java.awt.Color(255, 102, 0));
        btn_volver.setText("Volver");
        btn_volver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_volver.setDefaultCapable(false);
        btn_volver.setFocusPainted(false);
        btn_volver.setFocusable(false);
        btn_volver.setRequestFocusEnabled(false);
        btn_volver.setRolloverEnabled(false);
        btn_volver.setVerifyInputWhenFocusTarget(false);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        bg_seleccion.add(btn_volver);
        btn_volver.setBounds(220, 490, 90, 30);

        btn_seleccionar.setBackground(new java.awt.Color(102, 0, 0));
        btn_seleccionar.setForeground(new java.awt.Color(255, 102, 0));
        btn_seleccionar.setText("Seleccionar");
        btn_seleccionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_seleccionar.setDefaultCapable(false);
        btn_seleccionar.setEnabled(false);
        btn_seleccionar.setFocusPainted(false);
        btn_seleccionar.setRequestFocusEnabled(false);
        btn_seleccionar.setRolloverEnabled(false);
        btn_seleccionar.setVerifyInputWhenFocusTarget(false);
        btn_seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seleccionarActionPerformed(evt);
            }
        });
        bg_seleccion.add(btn_seleccionar);
        btn_seleccionar.setBounds(430, 490, 90, 30);

        lb_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 102, 0));
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setText("Escoja su partida");
        bg_seleccion.add(lb_titulo);
        lb_titulo.setBounds(40, 10, 620, 65);

        btn_cerrar.setBackground(new java.awt.Color(102, 0, 0));
        btn_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(255, 102, 0));
        btn_cerrar.setText("X");
        btn_cerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        bg_seleccion.add(btn_cerrar);
        btn_cerrar.setBounds(662, 8, 30, 25);

        pnl_partidas.setBackground(new java.awt.Color(102, 0, 0));
        pnl_partidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        pnl_partidas.setDoubleBuffered(false);
        pnl_partidas.setMaximumSize(new java.awt.Dimension(642, 389));
        pnl_partidas.setMinimumSize(new java.awt.Dimension(642, 389));
        pnl_partidas.setLayout(new javax.swing.BoxLayout(pnl_partidas, javax.swing.BoxLayout.LINE_AXIS));

        separadorIzq.setMaximumSize(new java.awt.Dimension(19, 387));
        separadorIzq.setMinimumSize(new java.awt.Dimension(19, 387));
        separadorIzq.setOpaque(false);
        separadorIzq.setPreferredSize(new java.awt.Dimension(19, 387));

        javax.swing.GroupLayout separadorIzqLayout = new javax.swing.GroupLayout(separadorIzq);
        separadorIzq.setLayout(separadorIzqLayout);
        separadorIzqLayout.setHorizontalGroup(
            separadorIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        separadorIzqLayout.setVerticalGroup(
            separadorIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        pnl_partidas.add(separadorIzq);

        panel_Partida1.setBackground(new java.awt.Color(51, 0, 0));
        panel_Partida1.setMaximumSize(new java.awt.Dimension(194, 350));
        panel_Partida1.setMinimumSize(new java.awt.Dimension(194, 350));
        panel_Partida1.setPreferredSize(new java.awt.Dimension(194, 350));
        panel_Partida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_Partida1MouseClicked(evt);
            }
        });
        panel_Partida1.setLayout(null);

        img_partida1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        img_partida1.setForeground(new java.awt.Color(255, 102, 0));
        img_partida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/IcTyrantShard.png"))); // NOI18N
        img_partida1.setText("Partida 1");
        panel_Partida1.add(img_partida1);
        img_partida1.setBounds(10, 0, 130, 80);

        p1_lvl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_lvl.setForeground(new java.awt.Color(255, 102, 0));
        p1_lvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1_lvl.setText("20");
        panel_Partida1.add(p1_lvl);
        p1_lvl.setBounds(80, 270, 100, 30);

        p1_lb_creditos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_lb_creditos.setForeground(new java.awt.Color(255, 102, 0));
        p1_lb_creditos.setText("Créditos:");
        panel_Partida1.add(p1_lb_creditos);
        p1_lb_creditos.setBounds(20, 300, 60, 30);

        p1_explorador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_explorador.setForeground(new java.awt.Color(255, 102, 0));
        p1_explorador.setText("Explorador:");
        panel_Partida1.add(p1_explorador);
        p1_explorador.setBounds(20, 210, 70, 30);

        p1_creditos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_creditos.setForeground(new java.awt.Color(255, 102, 0));
        p1_creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1_creditos.setText("25.000");
        panel_Partida1.add(p1_creditos);
        p1_creditos.setBounds(80, 300, 100, 30);

        p1_lb_nivel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_lb_nivel2.setForeground(new java.awt.Color(255, 102, 0));
        p1_lb_nivel2.setText("Nivel:");
        panel_Partida1.add(p1_lb_nivel2);
        p1_lb_nivel2.setBounds(20, 270, 60, 30);

        p1_ingeniero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_ingeniero.setForeground(new java.awt.Color(255, 102, 0));
        p1_ingeniero.setText("Ingeniero: ");
        panel_Partida1.add(p1_ingeniero);
        p1_ingeniero.setBounds(20, 120, 70, 30);

        p1_artillero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_artillero.setForeground(new java.awt.Color(255, 102, 0));
        p1_artillero.setText("Artillero:");
        panel_Partida1.add(p1_artillero);
        p1_artillero.setBounds(20, 150, 70, 30);

        p1_taladrador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_taladrador.setForeground(new java.awt.Color(255, 102, 0));
        p1_taladrador.setText("Taladrador:");
        panel_Partida1.add(p1_taladrador);
        p1_taladrador.setBounds(20, 180, 70, 30);

        p1_lvl_ingeniero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_lvl_ingeniero.setForeground(new java.awt.Color(255, 102, 0));
        p1_lvl_ingeniero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1_lvl_ingeniero.setText("1");
        panel_Partida1.add(p1_lvl_ingeniero);
        p1_lvl_ingeniero.setBounds(100, 120, 80, 30);

        p1_lvl_artillero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_lvl_artillero.setForeground(new java.awt.Color(255, 102, 0));
        p1_lvl_artillero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1_lvl_artillero.setText("1");
        panel_Partida1.add(p1_lvl_artillero);
        p1_lvl_artillero.setBounds(100, 150, 80, 30);

        p1_lvl_explorador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_lvl_explorador.setForeground(new java.awt.Color(255, 102, 0));
        p1_lvl_explorador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1_lvl_explorador.setText("1");
        panel_Partida1.add(p1_lvl_explorador);
        p1_lvl_explorador.setBounds(100, 210, 80, 30);

        p1_lvl_taladrador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p1_lvl_taladrador.setForeground(new java.awt.Color(255, 102, 0));
        p1_lvl_taladrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1_lvl_taladrador.setText("1");
        panel_Partida1.add(p1_lvl_taladrador);
        p1_lvl_taladrador.setBounds(100, 180, 80, 30);

        btn_renombrarp1.setBackground(new java.awt.Color(102, 0, 0));
        btn_renombrarp1.setForeground(new java.awt.Color(255, 102, 0));
        btn_renombrarp1.setText("Renombrar");
        btn_renombrarp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_renombrarp1.setFocusPainted(false);
        btn_renombrarp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renombrarp1ActionPerformed(evt);
            }
        });
        panel_Partida1.add(btn_renombrarp1);
        btn_renombrarp1.setBounds(50, 80, 80, 30);

        pnl_partidas.add(panel_Partida1);

        separador1.setMaximumSize(new java.awt.Dimension(10, 20));
        separador1.setMinimumSize(new java.awt.Dimension(10, 20));
        separador1.setOpaque(false);

        javax.swing.GroupLayout separador1Layout = new javax.swing.GroupLayout(separador1);
        separador1.setLayout(separador1Layout);
        separador1Layout.setHorizontalGroup(
            separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        separador1Layout.setVerticalGroup(
            separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnl_partidas.add(separador1);

        panel_Partida2.setBackground(new java.awt.Color(51, 0, 0));
        panel_Partida2.setMaximumSize(new java.awt.Dimension(194, 350));
        panel_Partida2.setMinimumSize(new java.awt.Dimension(194, 350));
        panel_Partida2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_Partida2MouseClicked(evt);
            }
        });
        panel_Partida2.setLayout(null);

        img_partida2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        img_partida2.setForeground(new java.awt.Color(255, 102, 0));
        img_partida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/IcRedSugar .png"))); // NOI18N
        img_partida2.setText("Partida 2");
        panel_Partida2.add(img_partida2);
        img_partida2.setBounds(10, 0, 130, 80);

        p2_lb_creditos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_lb_creditos.setForeground(new java.awt.Color(255, 102, 0));
        p2_lb_creditos.setText("Créditos:");
        panel_Partida2.add(p2_lb_creditos);
        p2_lb_creditos.setBounds(20, 300, 60, 30);

        p2_lb_nivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_lb_nivel.setForeground(new java.awt.Color(255, 102, 0));
        p2_lb_nivel.setText("Nivel:");
        panel_Partida2.add(p2_lb_nivel);
        p2_lb_nivel.setBounds(20, 270, 60, 30);

        p2_lvl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_lvl.setForeground(new java.awt.Color(255, 102, 0));
        p2_lvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2_lvl.setText("20");
        panel_Partida2.add(p2_lvl);
        p2_lvl.setBounds(80, 270, 100, 30);

        p2_creditos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_creditos.setForeground(new java.awt.Color(255, 102, 0));
        p2_creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2_creditos.setText("25.000");
        panel_Partida2.add(p2_creditos);
        p2_creditos.setBounds(80, 300, 100, 30);

        p2_artillero1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_artillero1.setForeground(new java.awt.Color(255, 102, 0));
        p2_artillero1.setText("Artillero:");
        panel_Partida2.add(p2_artillero1);
        p2_artillero1.setBounds(20, 150, 70, 30);

        p2_explorador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_explorador1.setForeground(new java.awt.Color(255, 102, 0));
        p2_explorador1.setText("Explorador:");
        panel_Partida2.add(p2_explorador1);
        p2_explorador1.setBounds(20, 210, 70, 30);

        p2_ingeniero1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_ingeniero1.setForeground(new java.awt.Color(255, 102, 0));
        p2_ingeniero1.setText("Ingeniero: ");
        panel_Partida2.add(p2_ingeniero1);
        p2_ingeniero1.setBounds(20, 120, 70, 30);

        p2_taladrador1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_taladrador1.setForeground(new java.awt.Color(255, 102, 0));
        p2_taladrador1.setText("Taladrador:");
        panel_Partida2.add(p2_taladrador1);
        p2_taladrador1.setBounds(20, 180, 70, 30);

        p2_lvl_artillero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_lvl_artillero.setForeground(new java.awt.Color(255, 102, 0));
        p2_lvl_artillero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2_lvl_artillero.setText("1");
        panel_Partida2.add(p2_lvl_artillero);
        p2_lvl_artillero.setBounds(100, 150, 80, 30);

        p2_lvl_explorador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_lvl_explorador.setForeground(new java.awt.Color(255, 102, 0));
        p2_lvl_explorador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2_lvl_explorador.setText("1");
        panel_Partida2.add(p2_lvl_explorador);
        p2_lvl_explorador.setBounds(100, 210, 80, 30);

        p2_lvl_taladrador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_lvl_taladrador.setForeground(new java.awt.Color(255, 102, 0));
        p2_lvl_taladrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2_lvl_taladrador.setText("1");
        panel_Partida2.add(p2_lvl_taladrador);
        p2_lvl_taladrador.setBounds(100, 180, 80, 30);

        p2_lvl_ingeniero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p2_lvl_ingeniero.setForeground(new java.awt.Color(255, 102, 0));
        p2_lvl_ingeniero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2_lvl_ingeniero.setText("1");
        panel_Partida2.add(p2_lvl_ingeniero);
        p2_lvl_ingeniero.setBounds(100, 120, 80, 30);

        btn_renombrarp2.setBackground(new java.awt.Color(102, 0, 0));
        btn_renombrarp2.setForeground(new java.awt.Color(255, 102, 0));
        btn_renombrarp2.setText("Renombrar");
        btn_renombrarp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_renombrarp2.setFocusPainted(false);
        btn_renombrarp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renombrarp2ActionPerformed(evt);
            }
        });
        panel_Partida2.add(btn_renombrarp2);
        btn_renombrarp2.setBounds(50, 80, 80, 30);

        pnl_partidas.add(panel_Partida2);

        separador2.setMaximumSize(new java.awt.Dimension(10, 20));
        separador2.setMinimumSize(new java.awt.Dimension(10, 20));
        separador2.setOpaque(false);

        javax.swing.GroupLayout separador2Layout = new javax.swing.GroupLayout(separador2);
        separador2.setLayout(separador2Layout);
        separador2Layout.setHorizontalGroup(
            separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        separador2Layout.setVerticalGroup(
            separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pnl_partidas.add(separador2);

        panel_Partida3.setBackground(new java.awt.Color(51, 0, 0));
        panel_Partida3.setMaximumSize(new java.awt.Dimension(194, 350));
        panel_Partida3.setMinimumSize(new java.awt.Dimension(194, 350));
        panel_Partida3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_Partida3MouseClicked(evt);
            }
        });
        panel_Partida3.setLayout(null);

        img_partida3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        img_partida3.setForeground(new java.awt.Color(255, 102, 0));
        img_partida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/IcDystrum.png"))); // NOI18N
        img_partida3.setText("Partida 3");
        panel_Partida3.add(img_partida3);
        img_partida3.setBounds(10, 0, 130, 80);

        p3_lb_creditos3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_lb_creditos3.setForeground(new java.awt.Color(255, 102, 0));
        p3_lb_creditos3.setText("Créditos:");
        panel_Partida3.add(p3_lb_creditos3);
        p3_lb_creditos3.setBounds(20, 300, 60, 30);

        p3_lb_nivel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_lb_nivel.setForeground(new java.awt.Color(255, 102, 0));
        p3_lb_nivel.setText("Nivel:");
        panel_Partida3.add(p3_lb_nivel);
        p3_lb_nivel.setBounds(20, 270, 60, 30);

        p3_creditos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_creditos.setForeground(new java.awt.Color(255, 102, 0));
        p3_creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3_creditos.setText("25.000");
        panel_Partida3.add(p3_creditos);
        p3_creditos.setBounds(80, 300, 100, 30);

        p3_lvl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_lvl.setForeground(new java.awt.Color(255, 102, 0));
        p3_lvl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3_lvl.setText("20");
        panel_Partida3.add(p3_lvl);
        p3_lvl.setBounds(80, 270, 100, 30);

        p3_explorador2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_explorador2.setForeground(new java.awt.Color(255, 102, 0));
        p3_explorador2.setText("Explorador:");
        panel_Partida3.add(p3_explorador2);
        p3_explorador2.setBounds(20, 210, 70, 30);

        p3_ingeniero2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_ingeniero2.setForeground(new java.awt.Color(255, 102, 0));
        p3_ingeniero2.setText("Ingeniero: ");
        panel_Partida3.add(p3_ingeniero2);
        p3_ingeniero2.setBounds(20, 120, 70, 30);

        p3_taladrador2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_taladrador2.setForeground(new java.awt.Color(255, 102, 0));
        p3_taladrador2.setText("Taladrador:");
        panel_Partida3.add(p3_taladrador2);
        p3_taladrador2.setBounds(20, 180, 70, 30);

        p3_artillero2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_artillero2.setForeground(new java.awt.Color(255, 102, 0));
        p3_artillero2.setText("Artillero:");
        panel_Partida3.add(p3_artillero2);
        p3_artillero2.setBounds(20, 150, 70, 30);

        p3_lvl_artillero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_lvl_artillero.setForeground(new java.awt.Color(255, 102, 0));
        p3_lvl_artillero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3_lvl_artillero.setText("1");
        panel_Partida3.add(p3_lvl_artillero);
        p3_lvl_artillero.setBounds(100, 150, 80, 30);

        p3_lvl_taladrador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_lvl_taladrador.setForeground(new java.awt.Color(255, 102, 0));
        p3_lvl_taladrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3_lvl_taladrador.setText("1");
        panel_Partida3.add(p3_lvl_taladrador);
        p3_lvl_taladrador.setBounds(100, 180, 80, 30);

        p3_lvl_ingeniero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_lvl_ingeniero.setForeground(new java.awt.Color(255, 102, 0));
        p3_lvl_ingeniero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3_lvl_ingeniero.setText("1");
        panel_Partida3.add(p3_lvl_ingeniero);
        p3_lvl_ingeniero.setBounds(100, 120, 80, 30);

        p3_lvl_explorador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p3_lvl_explorador.setForeground(new java.awt.Color(255, 102, 0));
        p3_lvl_explorador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3_lvl_explorador.setText("1");
        panel_Partida3.add(p3_lvl_explorador);
        p3_lvl_explorador.setBounds(100, 210, 80, 30);

        btn_renombrarp3.setBackground(new java.awt.Color(102, 0, 0));
        btn_renombrarp3.setForeground(new java.awt.Color(255, 102, 0));
        btn_renombrarp3.setText("Renombrar");
        btn_renombrarp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_renombrarp3.setFocusPainted(false);
        btn_renombrarp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_renombrarp3ActionPerformed(evt);
            }
        });
        panel_Partida3.add(btn_renombrarp3);
        btn_renombrarp3.setBounds(50, 80, 80, 30);

        pnl_partidas.add(panel_Partida3);

        separadorDer.setMaximumSize(new java.awt.Dimension(19, 387));
        separadorDer.setMinimumSize(new java.awt.Dimension(19, 387));
        separadorDer.setName(""); // NOI18N
        separadorDer.setOpaque(false);
        separadorDer.setPreferredSize(new java.awt.Dimension(19, 387));

        javax.swing.GroupLayout separadorDerLayout = new javax.swing.GroupLayout(separadorDer);
        separadorDer.setLayout(separadorDerLayout);
        separadorDerLayout.setHorizontalGroup(
            separadorDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        separadorDerLayout.setVerticalGroup(
            separadorDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        pnl_partidas.add(separadorDer);

        bg_seleccion.add(pnl_partidas);
        pnl_partidas.setBounds(30, 85, 642, 389);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.dispose();
        new Login();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seleccionarActionPerformed
        this.dispose();
        if (p1Selected) {
            new VentanaPrincipal(usr, p1);
        }
        if (p2Selected) {
            new VentanaPrincipal(usr, p2);
        }
        if (p3Selected) {
            new VentanaPrincipal(usr, p3);
        }

    }//GEN-LAST:event_btn_seleccionarActionPerformed

    private void panel_Partida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Partida1MouseClicked
        seleccionarPanel(this.panel_Partida1, true, false, false);
    }//GEN-LAST:event_panel_Partida1MouseClicked

    private void panel_Partida3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Partida3MouseClicked
        seleccionarPanel(this.panel_Partida3, false, false, true);
    }//GEN-LAST:event_panel_Partida3MouseClicked

    private void panel_Partida2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_Partida2MouseClicked
        seleccionarPanel(this.panel_Partida2, false, true, false);
    }//GEN-LAST:event_panel_Partida2MouseClicked

    private void seleccionarPanel(JPanel panel, boolean p1, boolean p2, boolean p3) {
        this.btn_seleccionar.setEnabled(true);
        this.p1Selected = p1;
        this.p2Selected = p2;
        this.p3Selected = p3;

        this.panel_Partida1.setBorder(null);
        this.panel_Partida2.setBorder(null);
        this.panel_Partida3.setBorder(null);

        if (panel != null) {
            panel.setBorder(BorderFactory.createLineBorder(borderColor, 1));
        }
    }

    private void btn_renombrarp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renombrarp1ActionPerformed
        renombrarPartida(this.img_partida1, p1);
    }//GEN-LAST:event_btn_renombrarp1ActionPerformed

    private void btn_renombrarp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renombrarp2ActionPerformed
        renombrarPartida(this.img_partida2, p2);
    }//GEN-LAST:event_btn_renombrarp2ActionPerformed

    private void btn_renombrarp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_renombrarp3ActionPerformed
        renombrarPartida(this.img_partida3, p3);
    }//GEN-LAST:event_btn_renombrarp3ActionPerformed

    private void renombrarPartida(JLabel label, Partida partida) {
        String rename = JOptionPane.showInputDialog(this, "Introduza el nuevo nombre", "Cambiando Nombre", JOptionPane.QUESTION_MESSAGE);
        partidadao.cambiarNombre(rename, partida);
        label.setText(rename);
    }

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSeleccionPartida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_seleccion;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_renombrarp1;
    private javax.swing.JButton btn_renombrarp2;
    private javax.swing.JButton btn_renombrarp3;
    private javax.swing.JButton btn_seleccionar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel img_partida1;
    private javax.swing.JLabel img_partida2;
    private javax.swing.JLabel img_partida3;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel p1_artillero;
    private javax.swing.JLabel p1_creditos;
    private javax.swing.JLabel p1_explorador;
    private javax.swing.JLabel p1_ingeniero;
    private javax.swing.JLabel p1_lb_creditos;
    private javax.swing.JLabel p1_lb_nivel2;
    private javax.swing.JLabel p1_lvl;
    private javax.swing.JLabel p1_lvl_artillero;
    private javax.swing.JLabel p1_lvl_explorador;
    private javax.swing.JLabel p1_lvl_ingeniero;
    private javax.swing.JLabel p1_lvl_taladrador;
    private javax.swing.JLabel p1_taladrador;
    private javax.swing.JLabel p2_artillero1;
    private javax.swing.JLabel p2_creditos;
    private javax.swing.JLabel p2_explorador1;
    private javax.swing.JLabel p2_ingeniero1;
    private javax.swing.JLabel p2_lb_creditos;
    private javax.swing.JLabel p2_lb_nivel;
    private javax.swing.JLabel p2_lvl;
    private javax.swing.JLabel p2_lvl_artillero;
    private javax.swing.JLabel p2_lvl_explorador;
    private javax.swing.JLabel p2_lvl_ingeniero;
    private javax.swing.JLabel p2_lvl_taladrador;
    private javax.swing.JLabel p2_taladrador1;
    private javax.swing.JLabel p3_artillero2;
    private javax.swing.JLabel p3_creditos;
    private javax.swing.JLabel p3_explorador2;
    private javax.swing.JLabel p3_ingeniero2;
    private javax.swing.JLabel p3_lb_creditos3;
    private javax.swing.JLabel p3_lb_nivel;
    private javax.swing.JLabel p3_lvl;
    private javax.swing.JLabel p3_lvl_artillero;
    private javax.swing.JLabel p3_lvl_explorador;
    private javax.swing.JLabel p3_lvl_ingeniero;
    private javax.swing.JLabel p3_lvl_taladrador;
    private javax.swing.JLabel p3_taladrador2;
    private javax.swing.JPanel panel_Partida1;
    private javax.swing.JPanel panel_Partida2;
    private javax.swing.JPanel panel_Partida3;
    private javax.swing.JPanel pnl_partidas;
    private javax.swing.JPanel separador1;
    private javax.swing.JPanel separador2;
    private javax.swing.JPanel separadorDer;
    private javax.swing.JPanel separadorIzq;
    // End of variables declaration//GEN-END:variables
}
