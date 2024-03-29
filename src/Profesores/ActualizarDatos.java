/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Profesores;

import Administrador.*;
import Administrador.AdministradorProfesores;
import java.util.Arrays;

/**
 *
 * @author USUARIO
 */
public class ActualizarDatos extends javax.swing.JFrame {

    /**
     * Creates new form CrearProfesor
     */
    public ActualizarDatos() {
        initComponents();
        //No se cambie el tamaño de la ventana
        this.setResizable(false);
        //Utilizado para visualizar en el centro la ventana
        this.setLocationRelativeTo(null);
        meterDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        GeneroInput = new javax.swing.JTextField();
        CodigoInput = new javax.swing.JTextField();
        NombreInput = new javax.swing.JTextField();
        ApellidoInput = new javax.swing.JTextField();
        CorreoInput = new javax.swing.JTextField();
        PasswordInput = new javax.swing.JTextField();
        ActualizarBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Actualizar Datos Profesor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 31, -1, -1));

        jLabel2.setText("Género");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel3.setText("Código");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        getContentPane().add(GeneroInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 100, -1));
        getContentPane().add(CodigoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, -1));
        getContentPane().add(NombreInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 320, -1));
        getContentPane().add(ApellidoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 320, -1));
        getContentPane().add(CorreoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 320, -1));
        getContentPane().add(PasswordInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 320, -1));

        ActualizarBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ActualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 310, 40));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        InicioProfesores ap = new InicioProfesores();
        ap.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        // TODO add your handling code here:
        String codigo = CodigoInput.getText();
        String nombre = NombreInput.getText();
        String apellido = ApellidoInput.getText();
        String correo = CorreoInput.getText();
        String contraseña = PasswordInput.getText();
        String genero = GeneroInput.getText();

        Profesor nuevoProfesor = new Profesor(codigo, nombre, apellido, correo, contraseña, genero);
        int fila = AdministradorProfesores.fila;
        AdministradorProfesores.profesores[fila] = nuevoProfesor;

    }//GEN-LAST:event_ActualizarBtnActionPerformed

    public void meterDatos() {
        CodigoInput.setText(AdministradorProfesores.codigo);
        NombreInput.setText(AdministradorProfesores.nombre);
        ApellidoInput.setText(AdministradorProfesores.apellido);
        CorreoInput.setText(AdministradorProfesores.correo);
        PasswordInput.setText(AdministradorProfesores.contraseña);
        GeneroInput.setText(AdministradorProfesores.genero);
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
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JTextField ApellidoInput;
    private javax.swing.JTextField CodigoInput;
    private javax.swing.JTextField CorreoInput;
    private javax.swing.JTextField GeneroInput;
    private javax.swing.JTextField NombreInput;
    private javax.swing.JTextField PasswordInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
