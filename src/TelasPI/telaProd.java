/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelasPI;

import classespi.CadProd;
import classespi.InfoProduto;
import classespi.PI;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guikade
 */
public class telaProd extends javax.swing.JFrame {
    InfoProduto produto = new InfoProduto();
     
    
    
     
    /**
     * Creates new form telaProd
     */
    public telaProd() {
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

        produtonome = new javax.swing.JTextField();
        valorpreco = new javax.swing.JTextField();
        botaoadicionarlista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        produtonome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtonomeActionPerformed(evt);
            }
        });
        getContentPane().add(produtonome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, 40));

        valorpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorprecoActionPerformed(evt);
            }
        });
        getContentPane().add(valorpreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 130, 40));

        botaoadicionarlista.setText("CADASTRAR E VER LISTA DE PRODUTOS");
        botaoadicionarlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoadicionarlistaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoadicionarlista, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 280, 70));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor R$"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 290, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TelaLista_cadProd.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void produtonomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtonomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtonomeActionPerformed

    private void botaoadicionarlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoadicionarlistaActionPerformed
        CadProd funcao = new CadProd();
        PI co = new PI();
        int resposta;
        boolean conec = true;
        double converter = Double.parseDouble(valorpreco.getText());
        produto.setNome(produtonome.getText());
        produto.setValor(converter);
        
        
        if(produtonome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para validar o cadastro");
        }else if(valorpreco.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos para validar o cadastro");
} else{
          
       DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        model.addRow(new Object[]{produto.getNome(),produto.getValor()});
        
       co.getConnection();
        if(conec == false){
                JOptionPane.showMessageDialog(null, "erro de conexão");
            }else{
                resposta = funcao.CADASTRAR(produto);
                if (resposta == 1){
                    JOptionPane.showMessageDialog(null, "Cliente foi cadastrado");
                }
        }
        }
    }//GEN-LAST:event_botaoadicionarlistaActionPerformed

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded
         
         
    }//GEN-LAST:event_tabelaAncestorAdded

    private void valorprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorprecoActionPerformed

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
            java.util.logging.Logger.getLogger(telaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoadicionarlista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField produtonome;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField valorpreco;
    // End of variables declaration//GEN-END:variables
}
