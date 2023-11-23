package Vista;

import AccesoDatos.Interfaces.UsuarioDAO;
import Factoria.EnumDAO;
import Factoria.Factoria;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private static UsuarioDAO usrdao;
    private final String ruta = "./src/rsc/images/PersonajeExplorador.png";

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.tf_Usuario.setText("");
        this.tf_Contrasena.setText("");
        this.setTitle("Deep Rock");
        this.setIconImage(new ImageIcon(ruta).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_login = new javax.swing.JPanel();
        lb_bienvenida = new javax.swing.JLabel();
        tf_Usuario = new javax.swing.JTextField();
        lb_Usuario = new javax.swing.JLabel();
        lb_metodoGuardado = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        lb_Registro = new javax.swing.JLabel();
        tf_Contrasena = new javax.swing.JPasswordField();
        btn_nube = new javax.swing.JButton();
        btn_local = new javax.swing.JButton();
        lb_Contrasenia1 = new javax.swing.JLabel();
        bg_image = new javax.swing.JPanel();
        lb_imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1165, 538));
        setPreferredSize(new java.awt.Dimension(1165, 538));
        setResizable(false);
        setSize(new java.awt.Dimension(1165, 538));
        getContentPane().setLayout(null);

        bg_login.setBackground(new java.awt.Color(51, 0, 0));
        bg_login.setLayout(null);

        lb_bienvenida.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        lb_bienvenida.setForeground(new java.awt.Color(255, 153, 0));
        lb_bienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_bienvenida.setText("Bienvenido");
        bg_login.add(lb_bienvenida);
        lb_bienvenida.setBounds(0, 40, 340, 60);

        tf_Usuario.setBackground(new java.awt.Color(51, 51, 51));
        tf_Usuario.setForeground(new java.awt.Color(255, 153, 0));
        tf_Usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        tf_Usuario.setCaretColor(new java.awt.Color(255, 153, 0));
        bg_login.add(tf_Usuario);
        tf_Usuario.setBounds(60, 132, 220, 30);

        lb_Usuario.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lb_Usuario.setForeground(new java.awt.Color(255, 153, 0));
        lb_Usuario.setText("Correo");
        bg_login.add(lb_Usuario);
        lb_Usuario.setBounds(60, 110, 110, 20);

        lb_metodoGuardado.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        lb_metodoGuardado.setForeground(new java.awt.Color(255, 153, 0));
        bg_login.add(lb_metodoGuardado);
        lb_metodoGuardado.setBounds(60, 310, 220, 20);

        btn_login.setBackground(new java.awt.Color(102, 0, 0));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 153, 0));
        btn_login.setText("Login");
        btn_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        bg_login.add(btn_login);
        btn_login.setBounds(60, 390, 220, 30);

        lb_Registro.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        lb_Registro.setForeground(new java.awt.Color(255, 153, 0));
        lb_Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Registro.setText("<html><u>Clicka aquí para crear una nueva cuenta</u></html>");
        lb_Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_RegistroMouseClicked(evt);
            }
        });
        bg_login.add(lb_Registro);
        lb_Registro.setBounds(60, 450, 220, 17);

        tf_Contrasena.setBackground(new java.awt.Color(51, 51, 51));
        tf_Contrasena.setForeground(new java.awt.Color(255, 153, 0));
        tf_Contrasena.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        tf_Contrasena.setCaretColor(new java.awt.Color(255, 153, 0));
        tf_Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ContrasenaActionPerformed(evt);
            }
        });
        bg_login.add(tf_Contrasena);
        tf_Contrasena.setBounds(60, 202, 220, 30);

        btn_nube.setBackground(new java.awt.Color(102, 0, 0));
        btn_nube.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_nube.setForeground(new java.awt.Color(255, 153, 0));
        btn_nube.setText("Guardado Nube");
        btn_nube.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        btn_nube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nubeActionPerformed(evt);
            }
        });
        bg_login.add(btn_nube);
        btn_nube.setBounds(180, 340, 100, 30);

        btn_local.setBackground(new java.awt.Color(102, 0, 0));
        btn_local.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_local.setForeground(new java.awt.Color(255, 153, 0));
        btn_local.setText("Guardado Local");
        btn_local.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        btn_local.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_localActionPerformed(evt);
            }
        });
        bg_login.add(btn_local);
        btn_local.setBounds(60, 340, 100, 30);

        lb_Contrasenia1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lb_Contrasenia1.setForeground(new java.awt.Color(255, 153, 0));
        lb_Contrasenia1.setText("Contraseña");
        bg_login.add(lb_Contrasenia1);
        lb_Contrasenia1.setBounds(60, 180, 110, 20);

        getContentPane().add(bg_login);
        bg_login.setBounds(0, 0, 340, 499);

        bg_image.setBackground(new java.awt.Color(255, 255, 255));
        bg_image.setLayout(null);

        lb_imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/images/Wallpaper_Team_HD.jpg"))); // NOI18N
        bg_image.add(lb_imagenFondo);
        lb_imagenFondo.setBounds(0, -50, 890, 600);

        getContentPane().add(bg_image);
        bg_image.setBounds(340, 0, 810, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_RegistroMouseClicked
        this.setVisible(false);
        new VentanaRegistro();
    }//GEN-LAST:event_lb_RegistroMouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        usrdao = Factoria.crearUsuario(Factoria.getTipoDAO());
        if (usrdao.comprobar(tf_Usuario.getText(), tf_Contrasena.getText())) {
            new VentanaSeleccionPartida(usrdao.obtenerUsuario(tf_Usuario.getText(), tf_Contrasena.getText()));
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Algo malo ha ocurrido", "Oh oh...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_nubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nubeActionPerformed
        lb_metodoGuardado.setText("Guardado en nube");
        Factoria.setTipoDAO(EnumDAO.JDBC);
    }//GEN-LAST:event_btn_nubeActionPerformed

    private void btn_localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_localActionPerformed
        lb_metodoGuardado.setText("Guardado en local");
        Factoria.setTipoDAO(EnumDAO.Fichero);
    }//GEN-LAST:event_btn_localActionPerformed

    private void tf_ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ContrasenaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_image;
    private javax.swing.JPanel bg_login;
    private javax.swing.JButton btn_local;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_nube;
    private javax.swing.JLabel lb_Contrasenia1;
    private javax.swing.JLabel lb_Registro;
    private javax.swing.JLabel lb_Usuario;
    private javax.swing.JLabel lb_bienvenida;
    private javax.swing.JLabel lb_imagenFondo;
    private javax.swing.JLabel lb_metodoGuardado;
    private javax.swing.JPasswordField tf_Contrasena;
    private javax.swing.JTextField tf_Usuario;
    // End of variables declaration//GEN-END:variables
}
