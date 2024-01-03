/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgendaAlumnosCursos;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;

/**
 *
 * @author Iker Ruiz
 */
public class VentanaLogin extends javax.swing.JFrame {

    private int xMouse, yMouse;

    /**
     * Creates new form VentanaLogin
     */
    public VentanaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagDercha = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        introUsuario = new javax.swing.JTextField();
        separadorUsuario = new javax.swing.JSeparator();
        password = new javax.swing.JLabel();
        separadorPassword = new javax.swing.JSeparator();
        textoPass = new javax.swing.JPasswordField();
        botonEntrar = new javax.swing.JPanel();
        textBtEntrar = new javax.swing.JLabel();
        fondoCerarVent = new javax.swing.JPanel();
        btCerarVent = new javax.swing.JPanel();
        textBtVent = new javax.swing.JLabel();

        imagDercha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/colegio.png"))); // NOI18N
        imagDercha.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(51, 51, 51));
        bg.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logoJaker70.png"))); // NOI18N
        icono.setText("jLabel2");
        icono.setToolTipText("");
        bg.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 70, 70));

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/colegio.png"))); // NOI18N
        imagenFondo.setText("jLabel1");
        bg.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 370, 530));

        logo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(51, 51, 51));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/soloLogo.png"))); // NOI18N
        logo.setText("  JAKER");
        logo.setMaximumSize(new java.awt.Dimension(50, 50));
        logo.setMinimumSize(new java.awt.Dimension(50, 50));
        logo.setName(""); // NOI18N
        logo.setPreferredSize(new java.awt.Dimension(50, 50));
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 60));

        titulo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setText("Inicio de sesion");
        titulo.setToolTipText("");
        bg.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 156, 310, 30));

        usuario.setBackground(new java.awt.Color(51, 51, 51));
        usuario.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(51, 51, 51));
        usuario.setText("Usuario:");
        bg.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, -1));

        introUsuario.setBackground(new java.awt.Color(255, 255, 255));
        introUsuario.setText("Introduce el usuario");
        introUsuario.setBorder(null);
        introUsuario.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        introUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                introUsuarioMousePressed(evt);
            }
        });
        introUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introUsuarioActionPerformed(evt);
            }
        });
        bg.add(introUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 340, -1));

        separadorUsuario.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(separadorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 340, 10));

        password.setBackground(new java.awt.Color(51, 51, 51));
        password.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(51, 51, 51));
        password.setText("Password:");
        bg.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, -1));

        separadorPassword.setForeground(new java.awt.Color(51, 51, 51));
        bg.add(separadorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 340, 10));

        textoPass.setBackground(new java.awt.Color(255, 255, 255));
        textoPass.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textoPass.setText("*********");
        textoPass.setBorder(null);
        textoPass.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        textoPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textoPassMousePressed(evt);
            }
        });
        textoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPassActionPerformed(evt);
            }
        });
        bg.add(textoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 340, -1));

        botonEntrar.setBackground(new java.awt.Color(78, 156, 204));

        textBtEntrar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        textBtEntrar.setForeground(new java.awt.Color(255, 255, 255));
        textBtEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtEntrar.setText("Entrar");
        textBtEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textBtEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBtEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBtEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textBtEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonEntrarLayout = new javax.swing.GroupLayout(botonEntrar);
        botonEntrar.setLayout(botonEntrarLayout);
        botonEntrarLayout.setHorizontalGroup(
            botonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textBtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonEntrarLayout.setVerticalGroup(
            botonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textBtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 120, 40));

        fondoCerarVent.setBackground(new java.awt.Color(255, 255, 255));
        fondoCerarVent.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondoCerarVentMouseDragged(evt);
            }
        });
        fondoCerarVent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondoCerarVentMousePressed(evt);
            }
        });

        btCerarVent.setBackground(new java.awt.Color(255, 255, 255));

        textBtVent.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        textBtVent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtVent.setText("X");
        textBtVent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textBtVent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBtVentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBtVentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textBtVentMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btCerarVentLayout = new javax.swing.GroupLayout(btCerarVent);
        btCerarVent.setLayout(btCerarVentLayout);
        btCerarVentLayout.setHorizontalGroup(
            btCerarVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btCerarVentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textBtVent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btCerarVentLayout.setVerticalGroup(
            btCerarVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btCerarVentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textBtVent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout fondoCerarVentLayout = new javax.swing.GroupLayout(fondoCerarVent);
        fondoCerarVent.setLayout(fondoCerarVentLayout);
        fondoCerarVentLayout.setHorizontalGroup(
            fondoCerarVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoCerarVentLayout.createSequentialGroup()
                .addComponent(btCerarVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(769, Short.MAX_VALUE))
        );
        fondoCerarVentLayout.setVerticalGroup(
            fondoCerarVentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoCerarVentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCerarVent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(fondoCerarVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void introUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introUsuarioActionPerformed

    /**
     * Este metodo recoge la posicion del raton dentro de la barra de cerrados.
     * @param evt 
     */
    private void fondoCerarVentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoCerarVentMousePressed
        xMouse = evt.getX();//para posicion del raton respecto a la barra de cerrar en el eje x
        yMouse = evt.getY();//para posicion del raton respecto a la barra de cerrar en el eje y
    }//GEN-LAST:event_fondoCerarVentMousePressed

    /**
     * metodo para mover la ventana de login cuando mantenemos el click del raton presionado
     * en el panel superior y arrastramos
     * 
     * @param evt 
     */
    private void fondoCerarVentMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoCerarVentMouseDragged
        int x = evt.getXOnScreen();//para posicion del raton respecto a la patnalla en el eje x
        int y = evt.getYOnScreen();//para posicion del raton respecto a la patnalla en el eje y
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_fondoCerarVentMouseDragged

    /**
     * metodo para salir cuando cliqumos en ese panel
     * @param evt 
     */
    private void textBtVentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtVentMouseClicked
        System.exit(0);//Para que salga siempre que clickemos
    }//GEN-LAST:event_textBtVentMouseClicked

    /**
     * metodo para cambiar el color cuando pasa por encima el raton del boton de  cerrar
     * @param evt 
     */
    private void textBtVentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtVentMouseEntered
        btCerarVent.setBackground(Color.red);
        textBtVent.setForeground(Color.WHITE);
    }//GEN-LAST:event_textBtVentMouseEntered

    /**
     * metodo para cambiar el color cuando sale el raton del boton de  cerrar
     * @param evt 
     */
    private void textBtVentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtVentMouseExited
        btCerarVent.setBackground(Color.WHITE);
        textBtVent.setForeground(Color.BLACK);
    }//GEN-LAST:event_textBtVentMouseExited

    /**
     * metodo para cambiar el color cuando pasa por encima el raton del boton de entrar
     * @param evt 
     */
    private void textBtEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtEntrarMouseEntered
        botonEntrar.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textBtEntrarMouseEntered

    /**
     * metodo para cambiar el color cuando sale el raton del boton de entrar
     * @param evt 
     */
    private void textBtEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtEntrarMouseExited
        botonEntrar.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textBtEntrarMouseExited

    /**
     * metodo para cuando clicamos en las caja de usuario
     * @param evt 
     */
    private void introUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_introUsuarioMousePressed
        if (introUsuario.getText().equals("Introduce el usuario")) {
            introUsuario.setText("");
            introUsuario.setForeground(Color.BLACK);
        }
        if (String.valueOf(textoPass.getPassword()).isEmpty()) {
            textoPass.setText("*********");
            textoPass.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_introUsuarioMousePressed

    /**
     * metodo para cuando clicamos en la  caja de contrasena
     * @param evt 
     */
    private void textoPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoPassMousePressed
        if (String.valueOf(textoPass.getPassword()).equals("*********")) {
            textoPass.setText("");
            textoPass.setForeground(Color.BLACK);
        }
        if (introUsuario.getText().isEmpty()) {
            introUsuario.setText("Introduce el usuario");
            introUsuario.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_textoPassMousePressed

    private void textoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPassActionPerformed

    /**
     * metodo para clicamos en el boton de entrar que nos abre la ventana de Gestion y cierra esta
     * @param evt 
     */
    private void textBtEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtEntrarMouseClicked
        Ficheros f = new Ficheros();
        String usuario = introUsuario.getText();
        String contrasena = String.valueOf(textoPass.getPassword());
        if (f.usuarioCont("usuarios.txt", usuario, contrasena)) {
            VentaGestion vg = new VentaGestion(this);
            vg.setVisible(true);
            this.setVisible(false);
        }else
            javax.swing.JOptionPane.showMessageDialog(this, "Ha introducido mal el usuario o la contrasena", "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_textBtEntrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */


 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel botonEntrar;
    private javax.swing.JPanel btCerarVent;
    private javax.swing.JPanel fondoCerarVent;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel imagDercha;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JTextField introUsuario;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel password;
    private javax.swing.JSeparator separadorPassword;
    private javax.swing.JSeparator separadorUsuario;
    private javax.swing.JLabel textBtEntrar;
    private javax.swing.JLabel textBtVent;
    private javax.swing.JPasswordField textoPass;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
