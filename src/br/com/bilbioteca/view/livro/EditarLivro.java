/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bilbioteca.view.livro;

import br.com.biblioteca.controle.LivroControle;
import br.com.biblioteca.emprestimos.Livro;
import br.com.biblioteca.util.MensagensUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class EditarLivro extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    private Livro livro = new Livro();
    private LivroControle livroControle = new LivroControle();

    /**
     * Creates new form EditarLivro
     */
    public EditarLivro() {
        initComponents();
    }

    public void preencherCampos() {

        int linha = jTabelaEditarLivro.getSelectedRow();

        if (linha < 0) {
          //  JOptionPane.showMessageDialog(null, "Escolha um Livro");
         JOptionPane.showMessageDialog(null, MensagensUtil.getValor(MensagensUtil.MSG_SELECIONE_ELEMENTO_TABELA,"Livro"));
        } else {

            id = (Integer) jTabelaEditarLivro.getValueAt(linha, 0);

            //id = Integer.parseInt(id2);
            String titulo = (String) jTabelaEditarLivro.getValueAt(linha, 1);
            String ano = (String) jTabelaEditarLivro.getValueAt(linha, 2);
            String area = (String) jTabelaEditarLivro.getValueAt(linha, 3);
            String autor = (String) jTabelaEditarLivro.getValueAt(linha, 4);
            String genero = (String) jTabelaEditarLivro.getValueAt(linha, 5);
            String descricao = (String) jTabelaEditarLivro.getValueAt(linha, 6);
            String isbn = (String) jTabelaEditarLivro.getValueAt(linha, 7);

            jTextTitulo.setText(titulo);
            jTextAno.setText(ano);
            jTextArea.setText(area);
            jTextAutor.setText(autor);
            jTextGenero.setText(genero);
            jTextDescricao.setText(descricao);
            jTexIsbn.setText(isbn);

        }
    }

    public void preencherTabela() {

        modelo.setNumRows(0);

        try {
            //List<Aluno> listarAluno = alunoControle.listarAlunos();
            List<Livro> listarLivro = new ArrayList<Livro>();
            listarLivro = livroControle.listarLivro();
            //System.out.println(listarAluno);

            for (Livro livro : listarLivro) {

                modelo.addRow(new Object[]{livro.getId(), livro.getTitulo(), livro.getAno(),
                    livro.getArea(), livro.getAutor(), livro.getGenero(), livro.getDescricao(),
                    livro.getIsbn()

                }
                );

            }

            // e isso tem que ficar despois de tudo
            jTabelaEditarLivro.setModel(modelo);

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(BuscarLivro.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaEditarLivro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextGenero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextDescricao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTexIsbn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextAno = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabelaEditarLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTabelaEditarLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaEditarLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaEditarLivro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 740, 290));

        jLabel1.setText("Editar Livros");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca\\src\\br\\com\\biblioteca\\incone\\delet.png")); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 110, 40));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Biblioteca\\src\\br\\com\\biblioteca\\incone\\accept.png")); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 110, 40));

        jLabel2.setText("Titulo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));
        getContentPane().add(jTextTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 150, -1));

        jLabel4.setText("Area:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, -1, -1));
        getContentPane().add(jTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 150, -1));

        jLabel5.setText("Autor:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, -1, -1));
        getContentPane().add(jTextAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 150, -1));

        jLabel6.setText("Genero:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));
        getContentPane().add(jTextGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 150, -1));

        jLabel8.setText("Descrição:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, -1, -1));
        getContentPane().add(jTextDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 150, -1));

        jLabel9.setText("ISBN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, -1, -1));
        getContentPane().add(jTexIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 160, -1));

        jLabel3.setText("Ano:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, -1, -1));
        getContentPane().add(jTextAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 80, 50, -1));
        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, -30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelaEditarLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaEditarLivroMouseClicked
        preencherCampos();
    }//GEN-LAST:event_jTabelaEditarLivroMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Livro l = new Livro();

        l.setId(id);

        l.setTitulo(jTextTitulo.getText());
        l.setAno(jTextAno.getText());
        l.setArea(jTextArea.getText());
        l.setAutor(jTextAutor.getText());
        l.setGenero(jTextGenero.getText());
        l.setDescricao(jTextDescricao.getText());
        l.setIsbn(jTexIsbn.getText());

        try {

            livroControle.EditarLivro(l);

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(EditarLivro.class.getName()).log(Level.SEVERE, null, ex);
        }

        int resp = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja editado esse Livro ?", "editar", JOptionPane.YES_NO_OPTION);
            if (resp == 0) 
        JOptionPane.showMessageDialog(null, MensagensUtil.getValor(MensagensUtil.MSG_SUCESSO_EDITAR_GENERICA,"Livro"));
        
        jTextTitulo.setText("");
        jTextAno.setText("");
        jTextArea.setText("");
        jTextAutor.setText("");
        jTextGenero.setText("");
        jTextDescricao.setText("");
        jTexIsbn.setText("");

        preencherTabela();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       modelo = (DefaultTableModel) jTabelaEditarLivro.getModel();

        modelo.addColumn("ID");
        modelo.addColumn("TITULO");
        modelo.addColumn("ANO");
        modelo.addColumn("AREA");
        modelo.addColumn("AUTOR");
        modelo.addColumn("GENERO");
        modelo.addColumn("DESCRIÇÃO");
        modelo.addColumn("ISBN");

        jTabelaEditarLivro.getColumnModel().getColumn(0).setPreferredWidth(0);
        jTabelaEditarLivro.getColumnModel().getColumn(0).setMaxWidth(0);
        jTabelaEditarLivro.getColumnModel().getColumn(0).setMinWidth(0);

        jTabelaEditarLivro.getColumnModel().getColumn(1).setPreferredWidth(400);
        jTabelaEditarLivro.getColumnModel().getColumn(2).setPreferredWidth(400);

        jTabelaEditarLivro.getColumnModel().getColumn(3).setPreferredWidth(400);
        jTabelaEditarLivro.getColumnModel().getColumn(4).setPreferredWidth(400);
        jTabelaEditarLivro.getColumnModel().getColumn(5).setPreferredWidth(400);
        jTabelaEditarLivro.getColumnModel().getColumn(6).setPreferredWidth(700);
        jTabelaEditarLivro.getColumnModel().getColumn(7).setPreferredWidth(400);

        preencherTabela();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabelaEditarLivro;
    private javax.swing.JTextField jTexIsbn;
    private javax.swing.JTextField jTextAno;
    private javax.swing.JTextField jTextArea;
    private javax.swing.JTextField jTextAutor;
    private javax.swing.JTextField jTextDescricao;
    private javax.swing.JTextField jTextGenero;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
