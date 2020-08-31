
package com.mycompany;

import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joao_vitor
 */
public class ProdutoView extends javax.swing.JFrame {
    
    Produto pro = new Produto();
    ProdutoDAO prd = new ProdutoDAO();
    
    public ProdutoView() {
        initComponents();
        //Para centralizar a janela
        setLocationRelativeTo(null);
        tbProduto.setModel(new ProdutoTableModel(prd.listaTodos()));
        btExcluir.setEnabled(false);   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tfPesquisarDrescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");

        jLabel1.setText("Código:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço:");

        tfCodigo.setEditable(false);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        jLabel4.setText("Pesquisa(Descrição):");

        tfPesquisarDrescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarDrescricaoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDescricao)
                                    .addComponent(tfPreco)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btLimpar)
                        .addGap(36, 36, 36)
                        .addComponent(btExcluir)
                        .addGap(42, 42, 42)
                        .addComponent(btSalvar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfPesquisarDrescricao))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btSalvar)
                    .addComponent(btLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisarDrescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String regex= "^\\d{1,12}+(\\,)?+(\\d{0,2})$";
        
        if (!tfPreco.getText().matches(regex)) {
            JOptionPane.showMessageDialog(null, "Preço invalido", "Produto - AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (tfDescricao.getText().equals("") || tfPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ha campos em branco", "Produto - AVISO", JOptionPane.WARNING_MESSAGE);
            return;
        } else if (tfCodigo.getText().equals("")) {
            pro.setDescricao_produto(tfDescricao.getText());
            pro.setPreco_produto(Double.parseDouble(tfPreco.getText()));
            prd.inserir(pro);
        } else {
            //altera
            pro.setDescricao_produto(tfDescricao.getText());
            pro.setPreco_produto(Double.parseDouble(tfPreco.getText()));
            pro.setCodigo_produto(Integer.parseInt(tfCodigo.getText()));
            prd.alterar(pro);
        }

        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listaTodos()));
        tfCodigo.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        tfPesquisarDrescricao.setText("");
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        tfCodigo.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_CODIGO_PRODUTO).toString());
        tfDescricao.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_DESCRICAO_PRODUTO).toString());
        tfPreco.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_PRECO_PRODUTO).toString());
        
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfCodigo.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        tfPesquisarDrescricao.setText("");        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, " Quer excluir? ", " Produto - AVISO ", JOptionPane.YES_NO_OPTION);
        if (escolha == JOptionPane.YES_OPTION) {
            int codigo = Integer.parseInt(tfCodigo.getText());
            prd.excluir(codigo);
            tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listaTodos()));
            tfCodigo.setText("");
            tfDescricao.setText("");
            tfPreco.setText("");
            tfPesquisarDrescricao.setText("");
            btExcluir.setEnabled(false);
        }         
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisarDrescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarDrescricaoKeyPressed
        String pesquisa = tfPesquisarDrescricao.getText();
        tbProduto.setModel(new ProdutoTableModel(prd.listaTodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfPesquisarDrescricaoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfPesquisarDrescricao;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables

}
