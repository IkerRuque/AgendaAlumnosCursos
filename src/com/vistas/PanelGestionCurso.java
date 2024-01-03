/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vistas;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import AgendaAlumnosCursos.GestionCursos;
import AgendaAlumnosCursos.MisExceptions;
import AgendaAlumnosCursos.Verificaciones;

/**
 *
 * @author Iker Ruiz
 */
public class PanelGestionCurso extends javax.swing.JPanel {

    /**
     * Creates new form PanelTrabAlumnos
     */
    public PanelGestionCurso(GestionCursos gesCurso) {
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
        cajaBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JPanel();
        textBtBuscar = new javax.swing.JLabel();
        btBorrar = new javax.swing.JPanel();
        textBtBorrar = new javax.swing.JLabel();
        btModificar = new javax.swing.JPanel();
        textBtModificar = new javax.swing.JLabel();
        eticDescrip = new javax.swing.JLabel();
        cajaDescCurso = new javax.swing.JTextField();
        eticHoras = new javax.swing.JLabel();
        cajaHorasCurso = new javax.swing.JTextField();
        eticNombre = new javax.swing.JLabel();
        cajaNombreCurso = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(970, 669));
        setPreferredSize(new java.awt.Dimension(970, 669));

        panelTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        panelTrabajo.setPreferredSize(new java.awt.Dimension(0, 589));

        cajaBuscar.setBackground(new java.awt.Color(204, 204, 204));
        cajaBuscar.setForeground(new java.awt.Color(51, 51, 51));
        cajaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaBuscarActionPerformed(evt);
            }
        });

        btBuscar.setBackground(new java.awt.Color(78, 156, 204));

        textBtBuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        textBtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        textBtBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtBuscar.setText("Buscar");
        textBtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textBtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBtBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBtBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textBtBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btBuscarLayout = new javax.swing.GroupLayout(btBuscar);
        btBuscar.setLayout(btBuscarLayout);
        btBuscarLayout.setHorizontalGroup(
            btBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textBtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        btBuscarLayout.setVerticalGroup(
            btBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textBtBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btBorrar.setBackground(new java.awt.Color(78, 156, 204));

        textBtBorrar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        textBtBorrar.setForeground(new java.awt.Color(255, 255, 255));
        textBtBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtBorrar.setText("Borrar");
        textBtBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textBtBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBtBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBtBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textBtBorrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btBorrarLayout = new javax.swing.GroupLayout(btBorrar);
        btBorrar.setLayout(btBorrarLayout);
        btBorrarLayout.setHorizontalGroup(
            btBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(btBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textBtBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        btBorrarLayout.setVerticalGroup(
            btBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(btBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textBtBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
        );

        btModificar.setBackground(new java.awt.Color(78, 156, 204));

        textBtModificar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        textBtModificar.setForeground(new java.awt.Color(255, 255, 255));
        textBtModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtModificar.setText("Modificar");
        textBtModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textBtModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBtModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBtModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textBtModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btModificarLayout = new javax.swing.GroupLayout(btModificar);
        btModificar.setLayout(btModificarLayout);
        btModificarLayout.setHorizontalGroup(
            btModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(btModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textBtModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
        );
        btModificarLayout.setVerticalGroup(
            btModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textBtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
        );

        eticDescrip.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        eticDescrip.setForeground(new java.awt.Color(51, 51, 51));
        eticDescrip.setText("Descripcion");

        cajaDescCurso.setBackground(new java.awt.Color(204, 204, 204));
        cajaDescCurso.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cajaDescCurso.setForeground(new java.awt.Color(51, 51, 51));
        cajaDescCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDescCursoActionPerformed(evt);
            }
        });

        eticHoras.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        eticHoras.setForeground(new java.awt.Color(51, 51, 51));
        eticHoras.setText("Creditos");

        cajaHorasCurso.setBackground(new java.awt.Color(204, 204, 204));
        cajaHorasCurso.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cajaHorasCurso.setForeground(new java.awt.Color(51, 51, 51));
        cajaHorasCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaHorasCursoActionPerformed(evt);
            }
        });

        eticNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        eticNombre.setForeground(new java.awt.Color(51, 51, 51));
        eticNombre.setText("Nombre");

        cajaNombreCurso.setBackground(new java.awt.Color(204, 204, 204));
        cajaNombreCurso.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cajaNombreCurso.setForeground(new java.awt.Color(51, 51, 51));
        cajaNombreCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTrabajoLayout = new javax.swing.GroupLayout(panelTrabajo);
        panelTrabajo.setLayout(panelTrabajoLayout);
        panelTrabajoLayout.setHorizontalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajoLayout.createSequentialGroup()
                .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTrabajoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTrabajoLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajoLayout.createSequentialGroup()
                                .addComponent(btBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cajaNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eticNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cajaDescCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eticDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaHorasCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eticHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelTrabajoLayout.setVerticalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(eticNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(eticDescrip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaDescCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(eticHoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaHorasCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    /**
     * metodo para cuando clicamos en buscar que lo que haya en la caja de buscar
     * lo busca y si existe el curso lo muestra en las cajas
     * @param evt 
     */
    private void textBtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBuscarMouseClicked
        String nombre_curso = cajaBuscar.getText().trim();

        try {
            verif.hayAlgo(nombre_curso);
            verif.tieneComa(nombre_curso);
            ResultSet resultado = gesCurso.buscar(nombre_curso);
            if (resultado.next()) {
                cajaNombreCurso.setText(resultado.getString("nombre"));
                cajaDescCurso.setText(resultado.getString("descripcion"));
                cajaHorasCurso.setText(resultado.getString("creditos"));
            }
            this.nombre = cajaNombreCurso.getText();
        } catch (SQLException ex) {
//            ex.printStackTrace();

        } catch (MisExceptions me) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + me, "BUSQUEDA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_textBtBuscarMouseClicked

    /**
     * metodo para cambiar el color cuando pasa por encima el raton del boton de buscar
     * @param evt 
     */
    private void textBtBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBuscarMouseEntered
        btBuscar.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textBtBuscarMouseEntered

    /**
     * metodo para cambiar el color cuando sale el raton del boton de buscar
     * @param evt 
     */
    private void textBtBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBuscarMouseExited
        btBuscar.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textBtBuscarMouseExited

    /**
     * metodo para cuando clicamos en el boton de borrar borramos el curso que hemos buscado previamente y que lo busca a partir del nombre 
     * y lo borra preguntando antes
     * @param evt 
     */
    private void textBtBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBorrarMouseClicked

        int n = JOptionPane.showConfirmDialog(
                this,
                "¿Estas seguro de querer borrar el curso?",
                "Curso borrado",
                JOptionPane.YES_NO_OPTION);

        if (n == JOptionPane.OK_OPTION) {
            try {
                gesCurso.buscar(nombre);
                gesCurso.baja(nombre);
                cajaBuscar.setText("");
                cajaNombreCurso.setText("");
                cajaDescCurso.setText("");
                cajaHorasCurso.setText("");

                javax.swing.JOptionPane.showMessageDialog(this, "Borrado con exito", "BAJA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } catch (MisExceptions me) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: " + me, "BAJA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_textBtBorrarMouseClicked

    /**
     * metodo para cambiar el color cuando pasa por encima el raton del boton de borrar
     * @param evt 
     */
    private void textBtBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBorrarMouseEntered
        btBorrar.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textBtBorrarMouseEntered

    /**
     * metodo para cambiar el color cuando sale el raton del boton de borrar
     * @param evt 
     */
    private void textBtBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBorrarMouseExited
        btBorrar.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textBtBorrarMouseExited

    private void cajaDescCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDescCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDescCursoActionPerformed

    private void cajaHorasCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaHorasCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaHorasCursoActionPerformed

    private void cajaNombreCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreCursoActionPerformed

    private void cajaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaBuscarActionPerformed

    /**
     * metodo para cuando clicamos modifica cogiendo los paramatros que estan en las cajas buscando 
     * el curso al que pertencen esos datos por el nombre
     * @param evt 
     */
    private void textBtModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtModificarMouseClicked
        String nomNuevo = cajaNombreCurso.getText().trim();
        this.descripcion = cajaDescCurso.getText().trim();
        this.horas = cajaHorasCurso.getText().trim();

        try {
            verif.hayAlgo(nomNuevo);
            verif.tieneComa(nomNuevo);
            verif.hayAlgo(descripcion);
            verif.tieneComa(descripcion);
            verif.hayAlgo(horas);
            verif.soloNum(horas);

            this.rs = gesCurso.buscar(nombre);
            if (rs.next()) {
                int id = rs.getInt("id_curso");
                int n_creditos = Integer.parseInt(horas);
                gesCurso.modificar(nomNuevo, descripcion, n_creditos, id);
            }

            cajaNombreCurso.setText("");
            cajaDescCurso.setText("");
            cajaHorasCurso.setText("");
            javax.swing.JOptionPane.showMessageDialog(this, "Curso modificado con exito", "ALTA", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
//            ex.printStackTrace();
        } catch (MisExceptions me) {
            System.out.println("Error: " + me);
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + me, "ALTA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_textBtModificarMouseClicked

    /**
     * metodo para cambiar de color cuando pasamos por encima con el raton el boton de modificar
     * @param evt 
     */
    private void textBtModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtModificarMouseEntered
        btModificar.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textBtModificarMouseEntered

     /**
     * metodo para cambiar de color cuando salimos con el raton el boton de modificar
     * @param evt 
     */
    private void textBtModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtModificarMouseExited
         btModificar.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textBtModificarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btBorrar;
    private javax.swing.JPanel btBuscar;
    private javax.swing.JPanel btModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaDescCurso;
    private javax.swing.JTextField cajaHorasCurso;
    private javax.swing.JTextField cajaNombreCurso;
    private javax.swing.JLabel eticDescrip;
    private javax.swing.JLabel eticHoras;
    private javax.swing.JLabel eticNombre;
    private javax.swing.JPanel panelTrabajo;
    private javax.swing.JLabel textBtBorrar;
    private javax.swing.JLabel textBtBuscar;
    private javax.swing.JLabel textBtModificar;
    // End of variables declaration//GEN-END:variables
    private String nombre;
    private String horas;
    private String descripcion;
    private GestionCursos gesCurso;
    private Verificaciones verif = new Verificaciones();
    ResultSet rs;
}
