/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Profesores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class AdministracionCurso extends javax.swing.JFrame {

    /**
     * Creates new form AdministracionCurso
     */
    public static Alumno[] alumnos = new Alumno[300];
    public static int contadorAlumnos;
    public static Nota[] notas = new Nota[300];
    public static int contadorNotas;

    public static int fila;
    public String codigo;
    public String nombre;
    public String apellido;
    public String correo;
    public String genero;
    DefaultTableModel modelo;

    public String nota;

    public AdministracionCurso() {
        initComponents();
        actualizarListadoAlumnos();
        actualizarListadoNotas();
        //No se cambie el tamaño de la ventana
        this.setResizable(false);
        //Utilizado para visualizar en el centro la ventana
        this.setLocationRelativeTo(null);

        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Ponderación");
        this.ListadoActividades.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoAlumnos = new javax.swing.JTable();
        EliminarEstuBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CargaMAlumnos = new javax.swing.JButton();
        HTMLAlumnosBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListadoActividades = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PonderacionImput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NombreImput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DescripcionImput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CSVActividadBtn = new javax.swing.JButton();
        CrearActividadBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        AcumuladoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Curso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Actividades");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        ListadoAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Correo", "Genero", "Nota"
            }
        ));
        ListadoAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListadoAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListadoAlumnos);
        if (ListadoAlumnos.getColumnModel().getColumnCount() > 0) {
            ListadoAlumnos.getColumnModel().getColumn(0).setPreferredWidth(40);
            ListadoAlumnos.getColumnModel().getColumn(4).setPreferredWidth(40);
            ListadoAlumnos.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 410, 230));

        EliminarEstuBtn.setText("Eliminar Estudiante");
        EliminarEstuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEstuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarEstuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 410, -1));

        jLabel3.setText("Reporte");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        CargaMAlumnos.setText("Carga Masiva Alumnos");
        CargaMAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(CargaMAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 410, -1));

        HTMLAlumnosBtn.setText("Exportar Listado Alumnos HTML");
        HTMLAlumnosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTMLAlumnosBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HTMLAlumnosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 410, 30));

        jLabel4.setText("Listado Alumnos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        ListadoActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Ponderación"
            }
        ));
        jScrollPane2.setViewportView(ListadoActividades);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 370, 130));

        jLabel5.setText("Crear Actividad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        jLabel6.setText("Notas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));
        jPanel1.add(PonderacionImput, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 310, -1));

        jLabel7.setText("Nombre");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));
        jPanel1.add(NombreImput, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 310, -1));

        jLabel8.setText("Descripción");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));
        jPanel1.add(DescripcionImput, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 310, -1));

        jLabel9.setText("Ponderación");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        CSVActividadBtn.setText("Seleccionar Archivo CSV");
        CSVActividadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSVActividadBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CSVActividadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 310, -1));

        CrearActividadBtn.setText("Crear Avtividad");
        CrearActividadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActividadBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CrearActividadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 390, 30));

        jLabel10.setText("Acumulado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));

        AcumuladoLbl.setText("0/100");
        jPanel1.add(AcumuladoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListadoAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListadoAlumnosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ListadoAlumnosMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        InicioProfesores lg = new InicioProfesores();
        lg.setVisible(true);

    }//GEN-LAST:event_formWindowClosing

    private void CargaMAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMAlumnosActionPerformed
        // TODO add your handling code here:
        JFileChooser fcu = new JFileChooser();
        fcu.showOpenDialog(null);

        String filePath = fcu.getSelectedFile().getAbsolutePath();
        System.out.println(filePath);

        BufferedReader readerc = null;
        String line = "";

        contadorAlumnos = 0;

        try {
            readerc = new BufferedReader(new FileReader(filePath));
            int contadorFila = 0;
            while ((line = readerc.readLine()) != null) {
                if (contadorFila > 0) {
                    String[] columnas = line.split(";");

                    Alumno prof = new Alumno(columnas[0], columnas[1], columnas[2], columnas[3], columnas[4]);

                    alumnos[contadorFila - 1] = prof;
                }
                contadorFila++;
            }
            contadorAlumnos = contadorFila - 1;
            System.out.println(Arrays.toString(alumnos));
            actualizarListadoAlumnos();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CargaMAlumnosActionPerformed

    private void CrearActividadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActividadBtnActionPerformed
        // TODO add your handling code here:
        String[] info = new String[10];
        info[0] = NombreImput.getText();
        info[1] = DescripcionImput.getText();
        info[2] = PonderacionImput.getText();
        modelo.addRow(info);

        NombreImput.setText("");
        DescripcionImput.setText("");
        PonderacionImput.setText("");

        sumar();

    }//GEN-LAST:event_CrearActividadBtnActionPerformed

    private void CSVActividadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSVActividadBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fcn = new JFileChooser();
        fcn.showOpenDialog(null);

        String filePath = fcn.getSelectedFile().getAbsolutePath();
        System.out.println(filePath);

        BufferedReader readerc = null;
        String line = "";

        contadorNotas = 0;

        try {
            readerc = new BufferedReader(new FileReader(filePath));
            int contadorFila = 0;
            while ((line = readerc.readLine()) != null) {
                if (contadorFila > 0) {
                    String[] columnas = line.split(";");

                    Nota nt = new Nota(columnas[0], columnas[1]);

                    notas[contadorFila - 1] = nt;
                }
                contadorFila++;
            }
            contadorNotas = contadorFila - 1;
            System.out.println(Arrays.toString(alumnos));
            actualizarListadoNotas();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CSVActividadBtnActionPerformed

    private void HTMLAlumnosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTMLAlumnosBtnActionPerformed
        // TODO add your handling code here:

        String cadenaHTML = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<body>\n"
                + "\n"
                + "<h1>Resporte</h1>\n"
                + "\n"
                + "<table style=\"margin:auto\">\n"
                + "     <tr>\n"
                + "         <th>Codigo</th>\n"
                + "         <th>Nombre</th>\n"
                + "         <th>Apellido</th>\n"
                + "         <th>Correo</th>\n"
                + "         <th>Genero</th>\n"
                + "         <th>Nota</th>\n"
                + "     </tr>";

        for (int i = 0; i < contadorNotas; i++) {
            cadenaHTML += "<tr>\n"
                    + "<td>" + alumnos[i].codigo + "</td>\n"
                    + "<td>" + alumnos[i].nombre + "</td>\n"
                    + "<td>" + alumnos[i].apellido + "</td>\n"
                    + "<td>" + alumnos[i].correo + "</td>\n"
                    + "<td>" + alumnos[i].genero + "</td>\n"
                    + "<td>" + notas[i].nota + "</td>\n"
                    + "</tr>";

        }

        cadenaHTML += "</table>\n"
                + "</body>\n"
                + "</html>\n";

        System.out.println(cadenaHTML);

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter("./Reportes/ReporteAlumnosHTML.html");
            pw = new PrintWriter(fichero);

            pw.println(cadenaHTML);
            fichero.close();
            System.out.println(cadenaHTML);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_HTMLAlumnosBtnActionPerformed

    private void EliminarEstuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEstuBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoAlumnos.getSelectedRow();

        //Usada para ocupar el espacio de la palabra elminada
        for (int i = fila; i < contadorAlumnos; i++) {
            alumnos[i] = alumnos[i + 1];
            notas[i] = notas[i+1];
        }
        //Se reduce en uno la cantidad de profesores
        contadorAlumnos--;
        contadorNotas--;

        actualizarListadoAlumnos();
        actualizarListadoNotas();
    }//GEN-LAST:event_EliminarEstuBtnActionPerformed

    public void actualizarListadoAlumnos() {
        if (contadorAlumnos > 0) {

            //Actualizar listado
            DefaultTableModel modeloListadoc = (DefaultTableModel) ListadoAlumnos.getModel();
            modeloListadoc.setRowCount(contadorAlumnos);

            for (int i = 0; i < contadorAlumnos; i++) {
                modeloListadoc.setValueAt(alumnos[i].codigo, i, 0);
                modeloListadoc.setValueAt(alumnos[i].nombre, i, 1);
                modeloListadoc.setValueAt(alumnos[i].apellido, i, 2);
                modeloListadoc.setValueAt(alumnos[i].correo, i, 3);
                modeloListadoc.setValueAt(alumnos[i].genero, i, 4);
            }
            mayorTopcinco();

        }
    }

    public void actualizarListadoNotas() {
        if (contadorNotas > 0) {

            //Actualizar listado
            DefaultTableModel modeloListadoc = (DefaultTableModel) ListadoAlumnos.getModel();
            modeloListadoc.setRowCount(contadorNotas);

            for (int i = 0; i < contadorNotas; i++) {
                modeloListadoc.setValueAt(notas[i].codigo, i, 0);
                modeloListadoc.setValueAt(notas[i].nota, i, 5);
            }

        }

    }
    
    public static void mayorTopcinco(){
        //hacer top 3
            Nota[] arregloCopia = notas.clone();
            //Burbuja
            for (int comprobacion = 0; comprobacion < contadorNotas; comprobacion++) {
                //Ciclo para recorrer los elementos del arreglo
                for (int elementoArreglo = 0; elementoArreglo < contadorNotas - 1; elementoArreglo++) {
                    Nota elementoActual = arregloCopia[elementoArreglo];
                    Nota elementoSiguiente = arregloCopia[elementoArreglo + 1];

                    //Si el actual es mayor al siguiente
                    if (Integer.valueOf(elementoActual.nota) < Integer.valueOf(elementoSiguiente.nota)) {
                        //Se hace el intercambio
                        arregloCopia[elementoArreglo] = elementoSiguiente;
                        arregloCopia[elementoArreglo + 1] = elementoActual;
                    }
                }
            }
    }

    public void sumar() {
        int fila = 0;
        int total = 0;
        for (int i = 0; i < ListadoActividades.getRowCount(); i++) {
            fila = Integer.parseInt(ListadoActividades.getValueAt(i, 2).toString());
            total += fila;
        }
        AcumuladoLbl.setText(total + "/100");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministracionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcumuladoLbl;
    private javax.swing.JButton CSVActividadBtn;
    private javax.swing.JButton CargaMAlumnos;
    private javax.swing.JButton CrearActividadBtn;
    private javax.swing.JTextField DescripcionImput;
    private javax.swing.JButton EliminarEstuBtn;
    private javax.swing.JButton HTMLAlumnosBtn;
    private javax.swing.JTable ListadoActividades;
    private javax.swing.JTable ListadoAlumnos;
    private javax.swing.JTextField NombreImput;
    private javax.swing.JTextField PonderacionImput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
