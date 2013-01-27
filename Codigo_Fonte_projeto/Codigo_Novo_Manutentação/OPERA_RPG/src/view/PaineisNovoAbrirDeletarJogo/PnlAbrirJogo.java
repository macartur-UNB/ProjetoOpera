/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PaineisNovoAbrirDeletarJogo;

import control.Controle_Jogo;
import dao.DAO_Jogo;
import exception.JogoInvalidoException;
import java.io.IOException;
import javax.swing.JOptionPane;
import view.BarraDeFerramentas;
import view.BarraDeMenus;
import view.PanelTab;
import view.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class PnlAbrirJogo extends javax.swing.JPanel {

    
    /**
     * Creates new form PnlAbrirJogo
     */
    public PnlAbrirJogo() {
        initComponents();
        carregarJComboBox();
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
        cmbJogo = new javax.swing.JComboBox();
        btnAbrirJogo = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Abrir Jogo"));

        jLabel1.setText("Selecione o Jogo:");

        cmbJogo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbJogoMouseEntered(evt);
            }
        });
        cmbJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJogoActionPerformed(evt);
            }
        });
        cmbJogo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbJogoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbJogo, 0, 233, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAbrirJogo.setText("Abrir Jogo");
        btnAbrirJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAbrirJogo)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrirJogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJogoActionPerformed

    private void cmbJogoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbJogoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJogoFocusGained

    private void btnAbrirJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirJogoActionPerformed
        // TODO add your handling code here:
        if(cmbJogo.getSelectedItem().toString().length() > 0){
            try{
                Controle_Jogo.abrirJogo(cmbJogo.getSelectedItem().toString());
                JOptionPane.showMessageDialog(null,"Jogo: " + cmbJogo.getSelectedItem().toString() +"\nAberto com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                if(BarraDeFerramentas.existe()){
                    BarraDeFerramentas.habilitarMenus(true);
                }
                if(BarraDeMenus.existe()){
                    BarraDeMenus.habilitarMenus(true);
                }
            if(PanelTab.existe()){
                int index = TelaPrincipal.tabbedPane.indexOfTab("Abrir Jogo");
                TelaPrincipal.tabbedPane.remove(index);
            }
            } catch(ClassNotFoundException | IOException e){
                JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"ERROR: " + "Selecione um Jogo","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirJogoActionPerformed

    private void cmbJogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbJogoMouseEntered
        // TODO add your handling code here:
        carregarJComboBox();
    }//GEN-LAST:event_cmbJogoMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirJogo;
    private javax.swing.JComboBox cmbJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void carregarJComboBox(){
        cmbJogo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
        
        String diretorios[] = DAO_Jogo.jogosExistentes();
        if(diretorios.length > 0){
            for(int i = 0; i < diretorios.length; i++){
                cmbJogo.addItem(diretorios[i]);
            }
        }
    }
}
