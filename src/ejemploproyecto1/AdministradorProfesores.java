/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemploproyecto1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class AdministradorProfesores extends javax.swing.JFrame {
    
    public static Profesor[] profesores = new Profesor[50];
    public static int contadorProfesores;

    //Utilizado para actualizar profesor
    public static int fila;
    public static String codigo;
    public static String nombre;
    public static String apellido;
    public static String correo;
    public static String contraseña;
    public static String genero;

    /**
     * Creates new form NewJFrame
     */
    public AdministradorProfesores() {
        initComponents();
        actualizarListadoProfesores();
        //No se cambie el tamaño de la ventana
        this.setResizable(false);
        //Utilizado para visualizar en el centro la ventana
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoProfesores = new javax.swing.JTable();
        CargaMBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CrearProfBtn = new javax.swing.JButton();
        EliminarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaGenero = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListadoProfesores1 = new javax.swing.JTable();
        CargaMBtn1 = new javax.swing.JButton();
        ActualizarBtn1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        CrearProfBtn1 = new javax.swing.JButton();
        EliminarBtn1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaGenero1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Listado Oficial");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        ListadoProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Apellido", "Correo", "Contraseña", "Genero"
            }
        ));
        jScrollPane1.setViewportView(ListadoProfesores);
        if (ListadoProfesores.getColumnModel().getColumnCount() > 0) {
            ListadoProfesores.getColumnModel().getColumn(5).setHeaderValue("Genero");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        CargaMBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CargaMBtn.setText("Carga Masiva");
        CargaMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CargaMBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 160, 40));

        ActualizarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ActualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 160, 40));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Exportar listado a HTML");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 350, 40));

        CrearProfBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CrearProfBtn.setText("Crear");
        CrearProfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CrearProfBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 160, 40));

        EliminarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 160, 40));

        TablaGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Genero", "Porcentaje"
            }
        ));
        TablaGenero.setEnabled(false);
        TablaGenero.setMinimumSize(new java.awt.Dimension(30, 40));
        jScrollPane2.setViewportView(TablaGenero);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 340, 190));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Género de Profesores");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jTabbedPane1.addTab("Profesores", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Listado Oficial");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        ListadoProfesores1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Creditos", "Alumnos", "Profesor"
            }
        ));
        jScrollPane3.setViewportView(ListadoProfesores1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        CargaMBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CargaMBtn1.setText("Carga Masiva");
        CargaMBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(CargaMBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 160, 40));

        ActualizarBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ActualizarBtn1.setText("Actualizar");
        ActualizarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(ActualizarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 160, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Exportar listado a HTML");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 350, 40));

        CrearProfBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CrearProfBtn1.setText("Crear");
        CrearProfBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(CrearProfBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 160, 40));

        EliminarBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EliminarBtn1.setText("Eliminar");
        EliminarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(EliminarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 160, 40));

        TablaGenero1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Genero", "Porcentaje"
            }
        ));
        TablaGenero1.setEnabled(false);
        jScrollPane4.setViewportView(TablaGenero1);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 340, 190));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Top 3 - Cursos con más estudiantes");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Cursos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargaMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        
        String filePath = fc.getSelectedFile().getAbsolutePath();
        System.out.println(filePath);
        
        BufferedReader reader = null;
        String line = "";
        
        contadorProfesores = 0;
        
        try {
            reader = new BufferedReader(new FileReader(filePath));
            int contadorFila = 0;
            while ((line = reader.readLine()) != null) {
                if (contadorFila > 0) {
                    String[] columnas = line.split(";");
                    
                    Profesor prof = new Profesor(columnas[0], columnas[1], columnas[2], columnas[3], "1234", columnas[4]);
                    
                    profesores[contadorFila - 1] = prof;
                }
                contadorFila++;
            }
            contadorProfesores = contadorFila - 1;
            System.out.println(Arrays.toString(profesores));
            actualizarListadoProfesores();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CargaMBtnActionPerformed

    private void CrearProfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CrearProfesor cp = new CrearProfesor();
        cp.setVisible(true);
    }//GEN-LAST:event_CrearProfBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoProfesores.getSelectedRow();
        
        codigo = ListadoProfesores.getModel().getValueAt(fila, 0).toString();
        nombre = ListadoProfesores.getModel().getValueAt(fila, 1).toString();
        apellido = ListadoProfesores.getModel().getValueAt(fila, 2).toString();
        correo = ListadoProfesores.getModel().getValueAt(fila, 3).toString();
        contraseña = ListadoProfesores.getModel().getValueAt(fila, 4).toString();
        genero = ListadoProfesores.getModel().getValueAt(fila, 5).toString();
        
        this.setVisible(false);
        ActualizarProfesor ap = new ActualizarProfesor();
        ap.setVisible(true);
    }//GEN-LAST:event_ActualizarBtnActionPerformed

    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoProfesores.getSelectedRow();

        //Usada para ocupar el espacio de la palabra elminada
        for (int i = fila; i < contadorProfesores; i++) {
            profesores[i] = profesores[i + 1];
        }
        //Se reduce en uno la cantidad de profesores
        contadorProfesores--;
        
        actualizarListadoProfesores();
    }//GEN-LAST:event_EliminarBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void CargaMBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargaMBtn1ActionPerformed

    private void ActualizarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarBtn1ActionPerformed

    private void CrearProfBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearProfBtn1ActionPerformed

    private void EliminarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarBtn1ActionPerformed
    
    public void actualizarListadoProfesores() {
        
        if (contadorProfesores > 0) {

            //Actualizar listado
            DefaultTableModel modeloListado = (DefaultTableModel) ListadoProfesores.getModel();
            modeloListado.setRowCount(contadorProfesores);
            
            for (int i = 0; i < contadorProfesores; i++) {
                modeloListado.setValueAt(profesores[i].codigo, i, 0);
                modeloListado.setValueAt(profesores[i].nombre, i, 1);
                modeloListado.setValueAt(profesores[i].apellido, i, 2);
                modeloListado.setValueAt(profesores[i].correo, i, 3);
                modeloListado.setValueAt(profesores[i].contraseña, i, 4);
                modeloListado.setValueAt(profesores[i].genero, i, 5);
            }

            //Contar generos
            int masculino = 0;
            int femenino = 0;
            
            for (int i = 0; i < contadorProfesores; i++) {
                //Si es hombre
                if (profesores[i].genero.equals("M")) {
                    masculino++;
                    //Si es mujer
                } else {
                    femenino++;
                }
            }

            //Actualizar tabla generos
            DefaultTableModel modeloListadoG = (DefaultTableModel) TablaGenero.getModel();
            modeloListadoG.setValueAt("Femenino", 0, 0);
            modeloListadoG.setValueAt("Masculino", 1, 0);
            modeloListadoG.setValueAt((double) ((double) femenino / (double) contadorProfesores) * 100 + "%", 0, 1);
            modeloListadoG.setValueAt((double) ((double) masculino / (double) contadorProfesores) * 100 + "%", 1, 1);
        }
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
            java.util.logging.Logger.getLogger(AdministradorProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton ActualizarBtn1;
    private javax.swing.JButton CargaMBtn;
    private javax.swing.JButton CargaMBtn1;
    private javax.swing.JButton CrearProfBtn;
    private javax.swing.JButton CrearProfBtn1;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JButton EliminarBtn1;
    private javax.swing.JTable ListadoProfesores;
    private javax.swing.JTable ListadoProfesores1;
    private javax.swing.JTable TablaGenero;
    private javax.swing.JTable TablaGenero1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}