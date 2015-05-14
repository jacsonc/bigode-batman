/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bilbioteca.view.principal;

import br.com.bilbioteca.view.Funcionario.BuscarFuncionario;
import br.com.bilbioteca.view.Funcionario.CadastroDeFuncionario;
import br.com.bilbioteca.view.Funcionario.EditarFuncionario;
import br.com.bilbioteca.view.Funcionario.RemoverFuncionario;

/**
 *
 * @author Usuario
 */
public class JFrameCrudFuncionario extends javax.swing.JFrame {

     private CadastroDeFuncionario addFuncionario = new CadastroDeFuncionario();
     private BuscarFuncionario buscarFuncionario = new BuscarFuncionario();
     private EditarFuncionario editarFuncionario = new EditarFuncionario();
     private RemoverFuncionario deletarFuncionario = new RemoverFuncionario();
    /**
     * Creates new form JFrameCrudFuncionario
     */
    public JFrameCrudFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonADDFuncionario = new javax.swing.JButton();
        jButtonBuscarFuncionario = new javax.swing.JButton();
        jButtonEditarFuncionario = new javax.swing.JButton();
        jButtonDeletarFuncionario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonADDFuncionario.setForeground(new java.awt.Color(51, 102, 0));
        jButtonADDFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca\\src\\br\\com\\biblioteca\\incone\\add.png")); // NOI18N
        jButtonADDFuncionario.setText("ADICIONAR FUNCIONARIO");
        jButtonADDFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonADDFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, -1));

        jButtonBuscarFuncionario.setForeground(new java.awt.Color(0, 102, 51));
        jButtonBuscarFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca\\src\\br\\com\\biblioteca\\incone\\search.png")); // NOI18N
        jButtonBuscarFuncionario.setText("BUSCAR FUNCIONARIO");
        jButtonBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 30));

        jButtonEditarFuncionario.setForeground(new java.awt.Color(0, 102, 0));
        jButtonEditarFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca\\src\\br\\com\\biblioteca\\incone\\pencil_edit_write_pen_drawing-20.png")); // NOI18N
        jButtonEditarFuncionario.setText("EDITAR FUNCIONARIO");
        jButtonEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 30));

        jButtonDeletarFuncionario.setForeground(new java.awt.Color(0, 153, 0));
        jButtonDeletarFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca\\src\\br\\com\\biblioteca\\incone\\delet.png")); // NOI18N
        jButtonDeletarFuncionario.setText("DELETAR FUNCIONARIO");
        jButtonDeletarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeletarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca\\src\\br\\com\\biblioteca\\incone\\Picture-26(bilbioteca).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDFuncionarioActionPerformed
        addFuncionario.setVisible(true);
    }//GEN-LAST:event_jButtonADDFuncionarioActionPerformed

    private void jButtonBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFuncionarioActionPerformed
        buscarFuncionario.setVisible(true);
    }//GEN-LAST:event_jButtonBuscarFuncionarioActionPerformed

    private void jButtonEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFuncionarioActionPerformed
        editarFuncionario.setVisible(true);
    }//GEN-LAST:event_jButtonEditarFuncionarioActionPerformed

    private void jButtonDeletarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarFuncionarioActionPerformed
        deletarFuncionario.setVisible(true);
    }//GEN-LAST:event_jButtonDeletarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCrudFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCrudFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCrudFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCrudFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCrudFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADDFuncionario;
    private javax.swing.JButton jButtonBuscarFuncionario;
    private javax.swing.JButton jButtonDeletarFuncionario;
    private javax.swing.JButton jButtonEditarFuncionario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}