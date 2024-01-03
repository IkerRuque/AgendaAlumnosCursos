/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AgendaAlumnosCursos;

import com.vistas.BienvenidaAlu;
import com.vistas.BienvenidaCurso;
import com.vistas.BienvenidaMat;
import com.vistas.PanelTrabajoPrincipal;
import com.vistas.SubMenuAlu;
import com.vistas.SubMenuCurso;
import com.vistas.SubMenuMat;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker Ruiz
 */
public class VentaGestion extends javax.swing.JFrame {

    
    /**
     * Creates new form VentaGestion. Aqui inicializamos todas las clases que vamos a utilizar y admas iniciamos la base de datos
     */
    public VentaGestion(VentanaLogin vl) {        
        initComponents();
        initContent();
        this.vl=vl;
        this.bd = new BaseDatos("conf.prop");
        
        this.gesAlu = new GestionAlumnos(this.bd);
        this.gesCurso = new GestionCursos(this.bd);
        this.gesIns = new GestionInscripciones(this.bd);
        try{
            bd.crearBase();
        }catch(Exception ex){            
            javax.swing.JOptionPane.showMessageDialog(this,"Comprueba que esta contectada la base de datos y vuelve a iniciar el programa", "CONEXION", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGround = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        tituloMenu = new javax.swing.JLabel();
        panelBtMenu = new javax.swing.JPanel();
        btGesAlumno = new javax.swing.JPanel();
        textBtGesAlu = new javax.swing.JLabel();
        btGesCursos = new javax.swing.JPanel();
        textGesCurs = new javax.swing.JLabel();
        btInscripciones = new javax.swing.JPanel();
        textInscrip = new javax.swing.JLabel();
        btGuardarCopia = new javax.swing.JPanel();
        textGuardarCopia = new javax.swing.JLabel();
        btCargarCopia = new javax.swing.JPanel();
        textCargarCopia = new javax.swing.JLabel();
        btCerrarSesion = new javax.swing.JPanel();
        textCerrarSesion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        header = new javax.swing.JPanel();
        nombreCentro = new javax.swing.JLabel();
        subMenu = new javax.swing.JPanel();
        panelTrabajo = new javax.swing.JPanel();
        panelEslogan = new javax.swing.JPanel();
        eslogan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 900));

        BackGround.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(49, 118, 187));
        menu.setPreferredSize(new java.awt.Dimension(270, 431));

        tituloMenu.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        tituloMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloMenu.setText("MENU");

        panelBtMenu.setBackground(new java.awt.Color(49, 118, 187));
        panelBtMenu.setForeground(new java.awt.Color(51, 51, 51));
        panelBtMenu.setLayout(new java.awt.GridLayout(6, 0));

        btGesAlumno.setBackground(new java.awt.Color(49, 118, 187));

        textBtGesAlu.setBackground(new java.awt.Color(49, 118, 187));
        textBtGesAlu.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textBtGesAlu.setForeground(new java.awt.Color(255, 255, 255));
        textBtGesAlu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtGesAlu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/birrete_1.png"))); // NOI18N
        textBtGesAlu.setText("   GESTION ALUMNOS");
        textBtGesAlu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textBtGesAlu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBtGesAluMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textBtGesAluMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textBtGesAluMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btGesAlumnoLayout = new javax.swing.GroupLayout(btGesAlumno);
        btGesAlumno.setLayout(btGesAlumnoLayout);
        btGesAlumnoLayout.setHorizontalGroup(
            btGesAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textBtGesAlu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btGesAlumnoLayout.setVerticalGroup(
            btGesAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textBtGesAlu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        panelBtMenu.add(btGesAlumno);

        btGesCursos.setBackground(new java.awt.Color(49, 118, 187));

        textGesCurs.setBackground(new java.awt.Color(49, 118, 187));
        textGesCurs.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textGesCurs.setForeground(new java.awt.Color(255, 255, 255));
        textGesCurs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textGesCurs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/libro.png"))); // NOI18N
        textGesCurs.setText("  GESTION CURSOS");
        textGesCurs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textGesCurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textGesCursMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textGesCursMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textGesCursMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btGesCursosLayout = new javax.swing.GroupLayout(btGesCursos);
        btGesCursos.setLayout(btGesCursosLayout);
        btGesCursosLayout.setHorizontalGroup(
            btGesCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(btGesCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textGesCurs, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
        );
        btGesCursosLayout.setVerticalGroup(
            btGesCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(btGesCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(textGesCurs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
        );

        panelBtMenu.add(btGesCursos);

        btInscripciones.setBackground(new java.awt.Color(49, 118, 187));

        textInscrip.setBackground(new java.awt.Color(49, 118, 187));
        textInscrip.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textInscrip.setForeground(new java.awt.Color(255, 255, 255));
        textInscrip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textInscrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/gorro-de-graduacion.png"))); // NOI18N
        textInscrip.setText("   INSCRIPCIONES");
        textInscrip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textInscrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textInscripMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textInscripMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textInscripMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btInscripcionesLayout = new javax.swing.GroupLayout(btInscripciones);
        btInscripciones.setLayout(btInscripcionesLayout);
        btInscripcionesLayout.setHorizontalGroup(
            btInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textInscrip, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        btInscripcionesLayout.setVerticalGroup(
            btInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textInscrip, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        panelBtMenu.add(btInscripciones);

        btGuardarCopia.setBackground(new java.awt.Color(49, 118, 187));

        textGuardarCopia.setBackground(new java.awt.Color(49, 118, 187));
        textGuardarCopia.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textGuardarCopia.setForeground(new java.awt.Color(255, 255, 255));
        textGuardarCopia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textGuardarCopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Guardar.png"))); // NOI18N
        textGuardarCopia.setText("  GUARDAR COPIA");
        textGuardarCopia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textGuardarCopia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textGuardarCopiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textGuardarCopiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textGuardarCopiaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btGuardarCopiaLayout = new javax.swing.GroupLayout(btGuardarCopia);
        btGuardarCopia.setLayout(btGuardarCopiaLayout);
        btGuardarCopiaLayout.setHorizontalGroup(
            btGuardarCopiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textGuardarCopia, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        btGuardarCopiaLayout.setVerticalGroup(
            btGuardarCopiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textGuardarCopia, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        panelBtMenu.add(btGuardarCopia);

        btCargarCopia.setBackground(new java.awt.Color(49, 118, 187));

        textCargarCopia.setBackground(new java.awt.Color(49, 118, 187));
        textCargarCopia.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textCargarCopia.setForeground(new java.awt.Color(255, 255, 255));
        textCargarCopia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textCargarCopia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cargar.png"))); // NOI18N
        textCargarCopia.setText("  CARGAR COPIA");
        textCargarCopia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textCargarCopia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCargarCopiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textCargarCopiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textCargarCopiaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btCargarCopiaLayout = new javax.swing.GroupLayout(btCargarCopia);
        btCargarCopia.setLayout(btCargarCopiaLayout);
        btCargarCopiaLayout.setHorizontalGroup(
            btCargarCopiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCargarCopia, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        btCargarCopiaLayout.setVerticalGroup(
            btCargarCopiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCargarCopia, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        panelBtMenu.add(btCargarCopia);

        btCerrarSesion.setBackground(new java.awt.Color(49, 118, 187));

        textCerrarSesion.setBackground(new java.awt.Color(49, 118, 187));
        textCerrarSesion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        textCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        textCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/cerrarSesion.png"))); // NOI18N
        textCerrarSesion.setText("  CERRAR SESION");
        textCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textCerrarSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btCerrarSesionLayout = new javax.swing.GroupLayout(btCerrarSesion);
        btCerrarSesion.setLayout(btCerrarSesionLayout);
        btCerrarSesionLayout.setHorizontalGroup(
            btCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        btCerrarSesionLayout.setVerticalGroup(
            btCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );

        panelBtMenu.add(btCerrarSesion);

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AUTORES: IKER RUIZ Y JAVIER VILLARTA");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelBtMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(tituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(panelBtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        header.setBackground(new java.awt.Color(78, 156, 204));
        header.setPreferredSize(new java.awt.Dimension(500, 150));

        nombreCentro.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        nombreCentro.setForeground(new java.awt.Color(255, 255, 255));
        nombreCentro.setText("Centro de Formacion Jaker");

        subMenu.setBackground(new java.awt.Color(49, 118, 187));

        javax.swing.GroupLayout subMenuLayout = new javax.swing.GroupLayout(subMenu);
        subMenu.setLayout(subMenuLayout);
        subMenuLayout.setHorizontalGroup(
            subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        subMenuLayout.setVerticalGroup(
            subMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(nombreCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(subMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(nombreCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        panelTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        panelTrabajo.setPreferredSize(new java.awt.Dimension(0, 589));

        javax.swing.GroupLayout panelTrabajoLayout = new javax.swing.GroupLayout(panelTrabajo);
        panelTrabajo.setLayout(panelTrabajoLayout);
        panelTrabajoLayout.setHorizontalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTrabajoLayout.setVerticalGroup(
            panelTrabajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );

        panelEslogan.setBackground(new java.awt.Color(255, 255, 255));

        eslogan.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        eslogan.setForeground(new java.awt.Color(49, 118, 187));
        eslogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eslogan.setText("EDUCAR PARA CREAR");

        javax.swing.GroupLayout panelEsloganLayout = new javax.swing.GroupLayout(panelEslogan);
        panelEslogan.setLayout(panelEsloganLayout);
        panelEsloganLayout.setHorizontalGroup(
            panelEsloganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelEsloganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEsloganLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(eslogan, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelEsloganLayout.setVerticalGroup(
            panelEsloganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(panelEsloganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEsloganLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(eslogan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout BackGroundLayout = new javax.swing.GroupLayout(BackGround);
        BackGround.setLayout(BackGroundLayout);
        BackGroundLayout.setHorizontalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundLayout.createSequentialGroup()
                        .addComponent(panelEslogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                    .addComponent(panelTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)))
        );
        BackGroundLayout.setVerticalGroup(
            BackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(BackGroundLayout.createSequentialGroup()
                .addComponent(panelEslogan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
 * Metodo para la accion de clicar sobre el panel de Gestion de alumnos
 * @param evt 
 */
    private void textBtGesAluMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtGesAluMouseClicked
        mostrarPanelTrabajo(new BienvenidaAlu());
        mostrarPanelSubM(new SubMenuAlu(this,gesAlu));
    }//GEN-LAST:event_textBtGesAluMouseClicked

    /**
 * Metodo para cuando pasa el raton por encima del panel
 * @param evt 
 */
    private void textBtGesAluMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtGesAluMouseEntered
        btGesAlumno.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textBtGesAluMouseEntered

    /**
 * Metodo para cuando pasa el raton sale del panel
 * @param evt 
 */
    private void textBtGesAluMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBtGesAluMouseExited

        btGesAlumno.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textBtGesAluMouseExited

      /**
 * Metodo para cuando pasa el raton por encima del panel
 * @param evt 
 */
    private void textGesCursMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGesCursMouseEntered
        btGesCursos.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textGesCursMouseEntered

      /**
    * Metodo para cuando pasa el raton sale del panel
    * @param evt 
    */
    private void textGesCursMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGesCursMouseExited
        btGesCursos.setBackground(new Color(49, 118, 187));

    }//GEN-LAST:event_textGesCursMouseExited

      /**
 * Metodo para cuando pasa el raton por encima del panel
 * @param evt 
 */
    private void textInscripMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textInscripMouseEntered
        btInscripciones.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textInscripMouseEntered

      /**
 * Metodo para cuando pasa el raton sale del panel
 * @param evt 
 */
    private void textInscripMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textInscripMouseExited
        btInscripciones.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textInscripMouseExited

      /**
 * Metodo la accion de clicar  sobre el panel de Gestion de Cursos
 * @param evt 
 */
    private void textGesCursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGesCursMouseClicked
        mostrarPanelSubM(new SubMenuCurso(this,gesCurso));
        mostrarPanelTrabajo(new BienvenidaCurso());
    }//GEN-LAST:event_textGesCursMouseClicked

     /**
 * Metodo la accion de clicar  sobre el panel de Gestion de inscripciones
 * @param evt 
 */
    private void textInscripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textInscripMouseClicked
        mostrarPanelSubM(new SubMenuMat(this, gesIns));
        mostrarPanelTrabajo(new BienvenidaMat());
    }//GEN-LAST:event_textInscripMouseClicked

     /**
 * Metodo la accion de clicar  sobre el panel de Guardado, genera una copia de seguridad
 * @param evt 
 */
    private void textGuardarCopiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGuardarCopiaMouseClicked
        gesCurso.guardarCursos();
        gesAlu.guardarAlumnos();
        gesIns.guardarInscripciones();
         javax.swing.JOptionPane.showMessageDialog(this, "Base de Datos guardada con exito", "Guardado con exito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_textGuardarCopiaMouseClicked

     /**
 * Metodo para  cuando entra el raton en el panel de guardar
 * @param evt 
 */
    private void textGuardarCopiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGuardarCopiaMouseEntered
        btGuardarCopia.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textGuardarCopiaMouseEntered

     /**
 * Metodo para cuando sale el rato del panel de guardar
 * @param evt 
 */
    private void textGuardarCopiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGuardarCopiaMouseExited
       btGuardarCopia.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textGuardarCopiaMouseExited

     /**
 * Metodo accion de clicar en el panel de cargar, carga la copia antes guardada 
 * @param evt 
 */
    private void textCargarCopiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCargarCopiaMouseClicked
       int n = JOptionPane.showConfirmDialog(
                this,
                "¿Desea sobreescribir la base de datos?",
                "Cargar Base de Datos",
                JOptionPane.YES_NO_OPTION);
         if (n == JOptionPane.OK_OPTION) {
            try{
                gesCurso.leer();
                gesAlu.leer();
                gesIns.leer();
                
                bd.borrarTabla("inscripciones");
                bd.borrarTabla("cursos");
                bd.borrarTabla("alumnos");

                    gesCurso.cargarCursos();
                    gesAlu.cargarAlumnos();
                    gesIns.cargarInscripciones();
                 javax.swing.JOptionPane.showMessageDialog(this, "Base de Datos cargada con exito", "Cargar Base de Datos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             }catch (MisExceptions me){
                 javax.swing.JOptionPane.showMessageDialog(this, "ERROR: "+me, "Cargar Base de Datos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
             }
         }
    }//GEN-LAST:event_textCargarCopiaMouseClicked

    /**
     * Metodo para cuando entras con el raton en el panel de Cargar copia
     * @param evt 
     */
    private void textCargarCopiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCargarCopiaMouseEntered
       btCargarCopia.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textCargarCopiaMouseEntered

     /**
     * Metodo para cuando el raton sale del panel de cargar copia
     * @param evt 
     */
    private void textCargarCopiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCargarCopiaMouseExited
        btCargarCopia.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textCargarCopiaMouseExited

    /**
     * Metodo para la accion de clicar en cerrar sesion hace visible la ventana de login 
     * e invisble esta
     * @param evt 
     */
    private void textCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCerrarSesionMouseClicked
       this.vl.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_textCerrarSesionMouseClicked

    /**
     * Metodo para cuando el raton entra en el panel de cargar copia
     * @param evt 
     */
    private void textCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCerrarSesionMouseEntered
        btCerrarSesion.setBackground(new Color(78, 156, 204));
    }//GEN-LAST:event_textCerrarSesionMouseEntered
    
    /**
     * Metodo para cuando el raton sale del panel de cargar copia
     * @param evt 
     */
    private void textCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCerrarSesionMouseExited
        btCerrarSesion.setBackground(new Color(49, 118, 187));
    }//GEN-LAST:event_textCerrarSesionMouseExited

    /**
     * Metodo inicia el panel de Bienvenida del inicio 
     * @param evt 
     */
    private void initContent() {
        mostrarPanelTrabajo(new PanelTrabajoPrincipal());

    }

    /**
     * Metodo para mostrar los paneles de los submenus que le pasemos por parametro
     * @param p
     */
    public void mostrarPanelSubM(JPanel p) {
        p.setSize(970, 33);
        p.setLocation(0, 0);

        subMenu.removeAll();
        subMenu.add(p, BorderLayout.CENTER);
        subMenu.revalidate();
        subMenu.repaint();

    }

    /**
     * Metodo para mostrar los paneles de trabajo que le pasemos por parametro
     * @param p
     */
    public void mostrarPanelTrabajo(JPanel p) {
        p.setSize(970, 669);
        p.setLocation(0, 0);

        panelTrabajo.removeAll();
        panelTrabajo.add(p, BorderLayout.CENTER);
        panelTrabajo.revalidate();
        panelTrabajo.repaint();

    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        FlatLightLaf.setup();
//
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentaGestion(null).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.JPanel btCargarCopia;
    private javax.swing.JPanel btCerrarSesion;
    private javax.swing.JPanel btGesAlumno;
    private javax.swing.JPanel btGesCursos;
    private javax.swing.JPanel btGuardarCopia;
    private javax.swing.JPanel btInscripciones;
    private javax.swing.JLabel eslogan;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombreCentro;
    private javax.swing.JPanel panelBtMenu;
    private javax.swing.JPanel panelEslogan;
    public javax.swing.JPanel panelTrabajo;
    private javax.swing.JPanel subMenu;
    private javax.swing.JLabel textBtGesAlu;
    private javax.swing.JLabel textCargarCopia;
    private javax.swing.JLabel textCerrarSesion;
    private javax.swing.JLabel textGesCurs;
    private javax.swing.JLabel textGuardarCopia;
    private javax.swing.JLabel textInscrip;
    private javax.swing.JLabel tituloMenu;
    // End of variables declaration//GEN-END:variables
    private BaseDatos bd;
    private VentanaLogin vl;
    private GestionAlumnos gesAlu;
    private GestionCursos gesCurso;
    private GestionInscripciones gesIns;
}

