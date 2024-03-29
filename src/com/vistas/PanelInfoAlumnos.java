/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.vistas;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import AgendaAlumnosCursos.GestionInscripciones;
import AgendaAlumnosCursos.MisExceptions;
import AgendaAlumnosCursos.Verificaciones;

/**
 *
 * @author Iker Ruiz
 */
public class PanelInfoAlumnos extends javax.swing.JPanel {

    /**
     * Creates new form PanelTrabAlumnos
     */
    public PanelInfoAlumnos(GestionInscripciones gesInsc) {
        initComponents();
        this.gesInsc = gesInsc;
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
        panelTitulo = new javax.swing.JPanel();
        eticTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btBuscar = new javax.swing.JPanel();
        textBtBuscar = new javax.swing.JLabel();
        cajaBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(970, 669));
        setPreferredSize(new java.awt.Dimension(970, 669));

        panelTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        panelTrabajo.setPreferredSize(new java.awt.Dimension(0, 589));

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        eticTitulo.setBackground(new java.awt.Color(255, 255, 255));
        eticTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        eticTitulo.setForeground(new java.awt.Color(51, 51, 51));
        eticTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eticTitulo.setText("Listado de los cursos del alumno");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eticTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(eticTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
            .addGap(0, 138, Short.MAX_VALUE)
            .addGroup(btBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textBtBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        );
        btBuscarLayout.setVerticalGroup(
            btBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(btBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textBtBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
        );

        cajaBuscar.setBackground(new java.awt.Color(204, 204, 204));
        cajaBuscar.setForeground(new java.awt.Color(153, 153, 153));
        cajaBuscar.setText("Introduzca el telefono del Alumno");
        cajaBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cajaBuscarMousePressed(evt);
            }
        });

        tablaCursos.setBackground(new java.awt.Color(51, 51, 51));
        tablaCursos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tablaCursos.setForeground(new java.awt.Color(204, 204, 204));
        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Curso", "Descripcion", "Calificacion", "Creditos", "Fecha Matricuacion", "Fecha Calificacion"
            }
        ));
        jScrollPane1.setViewportView(tablaCursos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cajaBuscar))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelTrabajoLayout = new javax.swing.GroupLayout(panelTrabajo);
        panelTrabajo.setLayout(panelTrabajoLayout);
        panelTrabajoLayout.setHorizontalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTrabajoLayout.setVerticalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrabajoLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * Metodo utilizado para limpiar la tabla que muestra los resultados
     * previamente consultados para mostrar los nuevos
     *
     * @param telAlu
     */
    public void refrescar(String telAlu) {
        ResultSet rs;
        DefaultTableModel tabCursos = (DefaultTableModel) tablaCursos.getModel();
        tabCursos.setRowCount(0);
        try {
            rs = gesInsc.mostrarCursosAlu(telAlu);

            while (rs.next()) {
                String[] fila = {rs.getString("cursos.nombre"), rs.getString("cursos.descripcion"), rs.getString("inscripciones.calificacion"), rs.getString("cursos.creditos"), rs.getString("inscripciones.fecha_matriculacion"), rs.getString("inscripciones.fecha_calificacion")};
                tabCursos.addRow(fila);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (MisExceptions me) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + me, "BUSQUEDA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * Metodo evento al clicar sobre el boton buscar, utiliza el contenido de la
     * caja de texto en la que aparece el telefono del alumno para consultar en
     * la base de datos. Cada vez que se utiliza, refresca la tabla.
     *
     * @param evt
     */
    private void textBtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBuscarMouseClicked
        String telAlumno = cajaBuscar.getText().trim();
        try {
            verif.soloNum(telAlumno);
            verif.nuveCaracteres(telAlumno);
            refrescar(telAlumno);
        } catch (MisExceptions me) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + me, "BUSQUEDA", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_textBtBuscarMouseClicked

    /**
     * Metodo para cambiar de color cuando entra el raton en el boton
     *
     * @param evt
     */
    private void textBtBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBuscarMouseEntered
        btBuscar.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textBtBuscarMouseEntered

    /**
     * Metodo para cambiar de color cuando sale el raton del boton
     *
     * @param evt
     */
    private void textBtBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtBuscarMouseExited
        btBuscar.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textBtBuscarMouseExited

    /**
     * Metodo que cambia el color del boton cuando lo clicas
     *
     * @param evt
     */
    private void cajaBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaBuscarMousePressed
        if (cajaBuscar.getText().equals("Introduzca el telefono del Alumno")) {
            cajaBuscar.setText("");
            cajaBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_cajaBuscarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btBuscar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JLabel eticTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTrabajo;
    private javax.swing.JTable tablaCursos;
    private javax.swing.JLabel textBtBuscar;
    // End of variables declaration//GEN-END:variables
    GestionInscripciones gesInsc;
    Verificaciones verif = new Verificaciones();
}
