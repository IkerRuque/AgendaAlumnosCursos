/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vistas;

import java.awt.Color;
import AgendaAlumnosCursos.GestionCursos;
import AgendaAlumnosCursos.MisExceptions;
import AgendaAlumnosCursos.Verificaciones;

/**
 *
 * @author Iker Ruiz
 */
public class PanelAltaCursos extends javax.swing.JPanel {

    /**
     * Creates new form PanelTrabAlumnos
     */
    public PanelAltaCursos(GestionCursos gesCurso) {
        initComponents();
        this.gesCurso = gesCurso;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTrabajo = new javax.swing.JPanel();
        eticNombre = new javax.swing.JLabel();
        cajaNomCurs = new javax.swing.JTextField();
        eticDescrip = new javax.swing.JLabel();
        cajaDescCurs = new javax.swing.JTextField();
        cajaCredCurs = new javax.swing.JTextField();
        eticCredit = new javax.swing.JLabel();
        btGuardar = new javax.swing.JPanel();
        textBtEntrar = new javax.swing.JLabel();

        panelTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        panelTrabajo.setPreferredSize(new java.awt.Dimension(0, 589));

        eticNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        eticNombre.setForeground(new java.awt.Color(51, 51, 51));
        eticNombre.setText("Nombre");

        cajaNomCurs.setBackground(new java.awt.Color(204, 204, 204));
        cajaNomCurs.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cajaNomCurs.setForeground(new java.awt.Color(51, 51, 51));
        cajaNomCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNomCursActionPerformed(evt);
            }
        });

        eticDescrip.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        eticDescrip.setForeground(new java.awt.Color(51, 51, 51));
        eticDescrip.setText("Descripcion");

        cajaDescCurs.setBackground(new java.awt.Color(204, 204, 204));
        cajaDescCurs.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cajaDescCurs.setForeground(new java.awt.Color(51, 51, 51));
        cajaDescCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDescCursActionPerformed(evt);
            }
        });

        cajaCredCurs.setBackground(new java.awt.Color(204, 204, 204));
        cajaCredCurs.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cajaCredCurs.setForeground(new java.awt.Color(51, 51, 51));
        cajaCredCurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCredCursActionPerformed(evt);
            }
        });

        eticCredit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        eticCredit.setForeground(new java.awt.Color(51, 51, 51));
        eticCredit.setText("Creditos");

        btGuardar.setBackground(new java.awt.Color(78, 156, 204));

        textBtEntrar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        textBtEntrar.setForeground(new java.awt.Color(255, 255, 255));
        textBtEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtEntrar.setText("Guardar");
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

        javax.swing.GroupLayout btGuardarLayout = new javax.swing.GroupLayout(btGuardar);
        btGuardar.setLayout(btGuardarLayout);
        btGuardarLayout.setHorizontalGroup(
            btGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
            .addGroup(btGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textBtEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        );
        btGuardarLayout.setVerticalGroup(
            btGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(btGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textBtEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTrabajoLayout = new javax.swing.GroupLayout(panelTrabajo);
        panelTrabajo.setLayout(panelTrabajoLayout);
        panelTrabajoLayout.setHorizontalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTrabajoLayout.createSequentialGroup()
                        .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelTrabajoLayout.createSequentialGroup()
                        .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eticNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaNomCurs, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaCredCurs, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eticCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(252, 252, 252))
                    .addGroup(panelTrabajoLayout.createSequentialGroup()
                        .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eticDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaDescCurs, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelTrabajoLayout.setVerticalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTrabajoLayout.createSequentialGroup()
                        .addComponent(eticNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaNomCurs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTrabajoLayout.createSequentialGroup()
                        .addComponent(eticCredit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajaCredCurs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(eticDescrip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDescCurs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNomCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNomCursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNomCursActionPerformed

    private void cajaDescCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDescCursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDescCursActionPerformed

    private void cajaCredCursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCredCursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCredCursActionPerformed

    /**
     * metodo para cuando clicamos recoge los datos que hay en las cajas las compruba
     *  y pasa los datos a gestion de Cursos
     * @param evt 
     */
    private void textBtEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtEntrarMouseClicked
       this.nombre = cajaNomCurs.getText().trim();
       this.descripcion =  cajaDescCurs.getText().trim();
       this.creditos = cajaCredCurs.getText().trim();      
       try{
           verif.hayAlgo(nombre);
           verif.tieneComa(nombre);
           verif.hayAlgo(descripcion);
           verif.tieneComa(descripcion);
           verif.hayAlgo(creditos);           
           verif.soloNum(creditos);    
           int n_creditos = Integer.parseInt(creditos);
           
           gesCurso.alta(nombre, descripcion, n_creditos);
            cajaNomCurs.setText("");
            cajaDescCurs.setText("");
            cajaCredCurs.setText("");            
           javax.swing.JOptionPane.showMessageDialog(this, "Curso dado de alta con exito", "ALTA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             
              
       }catch(MisExceptions me){
           System.out.println("Error: "+me);
            javax.swing.JOptionPane.showMessageDialog(this, "Error: "+me, "ALTA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
       }

    }//GEN-LAST:event_textBtEntrarMouseClicked

    /**
     * metodo para cambiar el color cuando pasa por encima el raton del boton de registrar
     * @param evt 
     */
    private void textBtEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtEntrarMouseEntered
        btGuardar.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textBtEntrarMouseEntered

    /**
     * metodo para cambiar el color cuando sale el raton del boton de registrar
     * @param evt 
     */
    private void textBtEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtEntrarMouseExited
        btGuardar.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textBtEntrarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btGuardar;
    private javax.swing.JTextField cajaCredCurs;
    private javax.swing.JTextField cajaDescCurs;
    private javax.swing.JTextField cajaNomCurs;
    private javax.swing.JLabel eticCredit;
    private javax.swing.JLabel eticDescrip;
    private javax.swing.JLabel eticNombre;
    private javax.swing.JPanel panelTrabajo;
    private javax.swing.JLabel textBtEntrar;
    // End of variables declaration//GEN-END:variables
    private String nombre;
    private String descripcion;
    private String creditos;
    private GestionCursos gesCurso;
    private Verificaciones verif = new Verificaciones();
}
