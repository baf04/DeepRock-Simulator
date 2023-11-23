package Vista;

import AccesoDatos.Interfaces.UsuarioDAO;
import AccesoDatos.JDBC.JDBCUsuarioDAO;
import Factoria.Factoria;
import Modelo.Usuario;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class VentanaRegistro extends javax.swing.JFrame implements Serializable {

    private static UsuarioDAO usrdao;

    public VentanaRegistro() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.tf_correo.setText("");
        this.tf_contrasena.setText("");
        this.tf_confirmarContrasena.setText("");
        this.usrdao = Factoria.crearUsuario(Factoria.getTipoDAO());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_registro = new javax.swing.JPanel();
        lb_Titulo = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        lb_correo = new javax.swing.JLabel();
        tf_correo = new javax.swing.JTextField();
        lb_contrasena = new javax.swing.JLabel();
        lb_confirmarContrasena = new javax.swing.JLabel();
        tf_contrasena = new javax.swing.JPasswordField();
        tf_confirmarContrasena = new javax.swing.JPasswordField();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 360));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 360));

        bg_registro.setBackground(new java.awt.Color(51, 0, 0));
        bg_registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        bg_registro.setFocusable(false);
        bg_registro.setMaximumSize(new java.awt.Dimension(400, 360));
        bg_registro.setMinimumSize(new java.awt.Dimension(400, 360));
        bg_registro.setName(""); // NOI18N
        bg_registro.setPreferredSize(new java.awt.Dimension(400, 360));
        bg_registro.setLayout(null);

        lb_Titulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        lb_Titulo.setForeground(new java.awt.Color(255, 153, 0));
        lb_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Titulo.setText("Registrarse");
        bg_registro.add(lb_Titulo);
        lb_Titulo.setBounds(50, 30, 300, 60);

        btn_aceptar.setBackground(new java.awt.Color(102, 0, 0));
        btn_aceptar.setForeground(new java.awt.Color(255, 153, 0));
        btn_aceptar.setText("Aceptar");
        btn_aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        bg_registro.add(btn_aceptar);
        btn_aceptar.setBounds(280, 310, 90, 30);

        btn_cancelar.setBackground(new java.awt.Color(102, 0, 0));
        btn_cancelar.setForeground(new java.awt.Color(255, 153, 0));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        bg_registro.add(btn_cancelar);
        btn_cancelar.setBounds(40, 310, 90, 30);

        lb_correo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lb_correo.setForeground(new java.awt.Color(255, 153, 0));
        lb_correo.setText("Nombre de Usuario");
        bg_registro.add(lb_correo);
        lb_correo.setBounds(90, 100, 110, 20);

        tf_correo.setBackground(new java.awt.Color(51, 51, 51));
        tf_correo.setForeground(new java.awt.Color(255, 153, 0));
        tf_correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        tf_correo.setCaretColor(new java.awt.Color(255, 153, 0));
        tf_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_correoActionPerformed(evt);
            }
        });
        bg_registro.add(tf_correo);
        tf_correo.setBounds(90, 120, 200, 30);

        lb_contrasena.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lb_contrasena.setForeground(new java.awt.Color(255, 153, 0));
        lb_contrasena.setText("Contraseña");
        bg_registro.add(lb_contrasena);
        lb_contrasena.setBounds(90, 160, 110, 20);

        lb_confirmarContrasena.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        lb_confirmarContrasena.setForeground(new java.awt.Color(255, 153, 0));
        lb_confirmarContrasena.setText("Confirmar Contraseña");
        bg_registro.add(lb_confirmarContrasena);
        lb_confirmarContrasena.setBounds(90, 220, 130, 20);

        tf_contrasena.setBackground(new java.awt.Color(51, 51, 51));
        tf_contrasena.setForeground(new java.awt.Color(255, 153, 0));
        tf_contrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        tf_contrasena.setCaretColor(new java.awt.Color(255, 153, 0));
        tf_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contrasenaActionPerformed(evt);
            }
        });
        bg_registro.add(tf_contrasena);
        tf_contrasena.setBounds(90, 180, 200, 30);

        tf_confirmarContrasena.setBackground(new java.awt.Color(51, 51, 51));
        tf_confirmarContrasena.setForeground(new java.awt.Color(255, 153, 0));
        tf_confirmarContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        tf_confirmarContrasena.setCaretColor(new java.awt.Color(255, 153, 0));
        tf_confirmarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_confirmarContrasenaActionPerformed(evt);
            }
        });
        bg_registro.add(tf_confirmarContrasena);
        tf_confirmarContrasena.setBounds(90, 240, 200, 30);

        btn_cerrar.setBackground(new java.awt.Color(102, 0, 0));
        btn_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cerrar.setForeground(new java.awt.Color(255, 102, 0));
        btn_cerrar.setText("X");
        btn_cerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setFocusPainted(false);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        bg_registro.add(btn_cerrar);
        btn_cerrar.setBounds(350, 20, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
          String pass = tf_contrasena.getText();
        if (longitudContrasena(pass)) {
            if (compararContrasena(pass)) {
                if (usrdao.alta(tf_correo.getText(),pass)) {
                    Login l = new Login();
                    l.setVisible(true);
                    l.setLocationRelativeTo(null);
                    JOptionPane.showMessageDialog(this, "El usuario se ha dado de alta", "Exito", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Algo malo ha ocurrido", "Oh oh...", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Oh oh...", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña es demasiado corta. Mínimos 6 caracteres", "Oh oh...", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_aceptarActionPerformed

    private boolean compararContrasena(String entrada) {
        if (entrada.equals(tf_confirmarContrasena.getText())) {
            return true;
        }
        return false;
    }
    
    private boolean longitudContrasena(String entrada) {
        if (entrada.length() >= 6) {
            return true;
        }
        return false;
    }

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_contrasenaActionPerformed

    private void tf_confirmarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_confirmarContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_confirmarContrasenaActionPerformed

    private void tf_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_correoActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_registro;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JLabel lb_Titulo;
    private javax.swing.JLabel lb_confirmarContrasena;
    private javax.swing.JLabel lb_contrasena;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JPasswordField tf_confirmarContrasena;
    private javax.swing.JPasswordField tf_contrasena;
    private javax.swing.JTextField tf_correo;
    // End of variables declaration//GEN-END:variables
}
