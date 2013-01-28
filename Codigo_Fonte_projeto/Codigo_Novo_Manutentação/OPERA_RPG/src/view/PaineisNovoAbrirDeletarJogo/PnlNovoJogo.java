/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PaineisNovoAbrirDeletarJogo;

import control.Controle_Jogo;
import exception.ArquivoInvalidoException;
import exception.DiretorioInvalidoException;
import exception.JTextFieldInvalidoException;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import view.validacao.ValidarCampos;
import view.BarraDeFerramentas;
import view.BarraDeMenus;
import view.PaineisDeCadastro.PainelFuncoes;
import view.PanelTab;
import view.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class PnlNovoJogo extends javax.swing.JPanel {

    /**
     * Creates new form PnlNovoJogo
     */
    public PnlNovoJogo() {
        initComponents();
        PainelFuncoes.definirCorDaBordaJTextField(this, Color.GRAY);
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
        txtNome = new javax.swing.JTextField();
        btnCriarJogo = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Jogo"));

        jLabel1.setText("Nome:");

        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCriarJogo.setText("Criar Jogo");
        btnCriarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCriarJogo)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCriarJogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        // TODO add your handling code here:
        try{
            ValidarCampos.validarCampoTexto(txtNome, true);
        } catch(JTextFieldInvalidoException e){
            
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void btnCriarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarJogoActionPerformed
        // TODO add your handling code here:
        try{
            String nome = ValidarCampos.validarCampoTexto(txtNome, true);
            Controle_Jogo.criarJogo(nome);
            JOptionPane.showMessageDialog(null,"Jogo: " + nome +"\nCriado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
            PainelFuncoes.limparCamposJTextField(this);
            if(BarraDeFerramentas.existe()){
                BarraDeFerramentas.habilitarMenus(true);
            }
            if(BarraDeMenus.existe()){
                BarraDeMenus.habilitarMenus(true);
            }
            if(PanelTab.existe()){
                int index = TelaPrincipal.tabbedPane.indexOfTab("Novo Jogo");
                TelaPrincipal.tabbedPane.remove(index);
            }
        } catch(ArquivoInvalidoException | ClassNotFoundException | DiretorioInvalidoException | IOException | JTextFieldInvalidoException e){
            JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCriarJogoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
