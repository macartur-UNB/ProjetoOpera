/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PaineisDeAlteracao;

import control.Controle_Habilidade;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.classes.Habilidade;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.HabilidadeInvalidaException;
import model.exception.JTextFieldInvalidoException;
import view.PaineisDeCadastro.PainelFuncoes;
import view.validacao.ValidarCampos;

/**
 *
 * @author Luciano
 */
public class PnlAlterarHabilidade extends javax.swing.JPanel {

    /**
     * Creates new form PnlAlterarHabilidade
     */
    public PnlAlterarHabilidade() {
        initComponents();
        cmbHabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
        cmbHabilidade.setEnabled(false);
        PainelFuncoes.habilitarCampos(pnlCadastrarHabilidade, false);
        iniciarBtnLimpar();
        pnlCadastrarHabilidade.getBtnCadastrar().setEnabled(false);
        iniciarBtnAlterar();
        pnlCadastrarHabilidade.setPodeCadastrar(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipoDeHabilidade = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        rdbFisica = new javax.swing.JRadioButton();
        rdbPsiquica = new javax.swing.JRadioButton();
        rdbBelica = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbHabilidade = new javax.swing.JComboBox();
        pnlCadastrarHabilidade = new view.PaineisDeCadastro.PnlCadastrarHabilidade();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Habilidade"));

        grpTipoDeHabilidade.add(rdbFisica);
        rdbFisica.setText("Fisica");
        rdbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFisicaActionPerformed(evt);
            }
        });

        grpTipoDeHabilidade.add(rdbPsiquica);
        rdbPsiquica.setText("Psiquica");
        rdbPsiquica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPsiquicaActionPerformed(evt);
            }
        });

        grpTipoDeHabilidade.add(rdbBelica);
        rdbBelica.setText("Belica");
        rdbBelica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbBelicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbFisica)
                .addGap(18, 18, 18)
                .addComponent(rdbPsiquica)
                .addGap(18, 18, 18)
                .addComponent(rdbBelica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbFisica)
                    .addComponent(rdbPsiquica)
                    .addComponent(rdbBelica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione a Habilidade"));

        jLabel1.setText("Habilidade:");

        cmbHabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHabilidadeActionPerformed(evt);
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
                .addComponent(cmbHabilidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCadastrarHabilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCadastrarHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFisicaActionPerformed
        // TODO add your handling code here:
        carregarJComboBox("Fisica");
        
        cmbHabilidade.setEnabled(true);
        PainelFuncoes.habilitarCampos(pnlCadastrarHabilidade, false);
        PainelFuncoes.limparTodosOsCampos(pnlCadastrarHabilidade);
        pnlCadastrarHabilidade.getGrpTipoHabilidade().clearSelection();
    }//GEN-LAST:event_rdbFisicaActionPerformed

    private void rdbPsiquicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPsiquicaActionPerformed
        // TODO add your handling code here:
        carregarJComboBox("Psiquica");
        
        cmbHabilidade.setEnabled(true);
        PainelFuncoes.habilitarCampos(pnlCadastrarHabilidade, false);
        PainelFuncoes.limparTodosOsCampos(pnlCadastrarHabilidade);
        pnlCadastrarHabilidade.getGrpTipoHabilidade().clearSelection();
    }//GEN-LAST:event_rdbPsiquicaActionPerformed

    private void rdbBelicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbBelicaActionPerformed
        // TODO add your handling code here:
        carregarJComboBox("Belica");
        
        cmbHabilidade.setEnabled(true);
        PainelFuncoes.habilitarCampos(pnlCadastrarHabilidade, false);
        PainelFuncoes.limparTodosOsCampos(pnlCadastrarHabilidade);
        pnlCadastrarHabilidade.getGrpTipoHabilidade().clearSelection();
    }//GEN-LAST:event_rdbBelicaActionPerformed

    private void cmbHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHabilidadeActionPerformed
        // TODO add your handling code here:
        try{
            PainelFuncoes.habilitarCampos(pnlCadastrarHabilidade, false);
            PainelFuncoes.limparTodosOsCampos(pnlCadastrarHabilidade);
            pnlCadastrarHabilidade.getGrpTipoHabilidade().clearSelection();
            pnlCadastrarHabilidade.getBtnCadastrar().setEnabled(false);
            
            if(!cmbHabilidade.getSelectedItem().toString().equals("Nenhuma")){
                PainelFuncoes.habilitarCampos(pnlCadastrarHabilidade, true);
                PainelFuncoes.habilitarCampos(pnlCadastrarHabilidade.getPnlTipo(), false);
                pnlCadastrarHabilidade.getBtnCadastrar().setEnabled(true);
                
                Habilidade habilidade = null;
                
                if(rdbBelica.isSelected()){
                    habilidade = Controle_Habilidade.encontrarHabilidade(cmbHabilidade.getSelectedItem().toString(), "Belica");
                    pnlCadastrarHabilidade.getRdbBelica().setSelected(true);
                }
                if(rdbFisica.isSelected()){
                    habilidade = Controle_Habilidade.encontrarHabilidade(cmbHabilidade.getSelectedItem().toString(), "Fisica");
                    pnlCadastrarHabilidade.getRdbFisica().setSelected(true);
                }
                if(rdbPsiquica.isSelected()){
                    habilidade = Controle_Habilidade.encontrarHabilidade(cmbHabilidade.getSelectedItem().toString(), "Psiquica");
                    pnlCadastrarHabilidade.getRdbPsiquica().setSelected(true);
                }
                
                pnlCadastrarHabilidade.getTxtNome().setText(habilidade.getNome());
                pnlCadastrarHabilidade.getTxtCusto().setText(""+habilidade.getCusto());
                pnlCadastrarHabilidade.getTxtTeste().setText(""+habilidade.getTeste());
                
            }
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbHabilidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbHabilidade;
    private javax.swing.ButtonGroup grpTipoDeHabilidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private view.PaineisDeCadastro.PnlCadastrarHabilidade pnlCadastrarHabilidade;
    private javax.swing.JRadioButton rdbBelica;
    private javax.swing.JRadioButton rdbFisica;
    private javax.swing.JRadioButton rdbPsiquica;
    // End of variables declaration//GEN-END:variables

    private void iniciarBtnLimpar(){
        pnlCadastrarHabilidade.getBtnLimpar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnLimparActionPerfomed();
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }
    
    private void iniciarBtnAlterar(){
        pnlCadastrarHabilidade.getBtnCadastrar().setText("Alterar");
        pnlCadastrarHabilidade.getBtnCadastrar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnAlterarActionPerformed();
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }
    
    private void btnLimparActionPerfomed(){
        rdbBelica.setForeground(Color.BLACK);
        rdbFisica.setForeground(Color.BLACK);
        rdbPsiquica.setForeground(Color.BLACK);
        
        cmbHabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
        cmbHabilidade.setEnabled(false);
        
        pnlCadastrarHabilidade.getBtnCadastrar().setEnabled(false);
        
        grpTipoDeHabilidade.clearSelection();
    }
    
    private void btnAlterarActionPerformed(){
        alterarHabilidade();
    }
    
     private void carregarJComboBox(String tipoDeHabilidade){
        cmbHabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
        
        String diretorios[] = null;
        
        switch(tipoDeHabilidade){
            case "Fisica":
                diretorios = Controle_Habilidade.listarHabilidadesFisicas();
                break;
            case "Psiquica":
                diretorios = Controle_Habilidade.listarHabilidadesPsiquicas();
                break;
            case "Belica":
                diretorios = Controle_Habilidade.listarHabilidadesBelicas();
                break;
        }
        
        if(diretorios != null){
            if(diretorios.length > 0){
                for(int i = 0; i < diretorios.length; i++){
                    cmbHabilidade.addItem(diretorios[i]);
                }
            }
        }
     }
     
     private void alterarHabilidade(){
         try{

            String nome = ValidarCampos.validarCampoTexto(pnlCadastrarHabilidade.getTxtNome(), true);
            int custo = ValidarCampos.validarCampoInteiro(pnlCadastrarHabilidade.getTxtCusto());
            int teste = ValidarCampos.validarCampoInteiro(pnlCadastrarHabilidade.getTxtTeste());

            String tipo = null;
            if (rdbBelica.isSelected()) {
                tipo = "Belica";
            }
            if (rdbFisica.isSelected()) {
                tipo = "Fisica";
            }
            if (rdbPsiquica.isSelected()) {
                tipo = "Psiquica";
            }
            
            String nomeTemp = cmbHabilidade.getSelectedItem().toString();
            Habilidade temp = Controle_Habilidade.encontrarHabilidade(nomeTemp, tipo);
            int nivel = temp.getNivel();

            System.out.println(cmbHabilidade.getSelectedItem().toString());

            
            switch(tipo){
                case "Fisica":
                    Controle_Habilidade.removeHabilidadeFisica(cmbHabilidade.getSelectedItem().toString());
                    break;
                case "Psiquica":
                    Controle_Habilidade.removeHabilidadePsiquica(cmbHabilidade.getSelectedItem().toString());
                    break;
                case "Belica":
                    Controle_Habilidade.removeHabilidadeBelica(cmbHabilidade.getSelectedItem().toString());
                    break;
            }
            
            Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
            JOptionPane.showMessageDialog(null,"Alterar Habilidade: " + nome +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);

            btnLimparActionPerfomed();

            PainelFuncoes.limparTodosOsCampos(pnlCadastrarHabilidade);
            pnlCadastrarHabilidade.getGrpTipoHabilidade().clearSelection();

         } catch(HabilidadeInvalidaException | ArquivoInvalidoException | ClassNotFoundException | DeletarInvalidoException | IOException | JTextFieldInvalidoException e){
             JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
         }
     }
}
