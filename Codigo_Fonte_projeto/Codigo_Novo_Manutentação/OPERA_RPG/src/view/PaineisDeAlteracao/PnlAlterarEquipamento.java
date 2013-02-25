/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PaineisDeAlteracao;

import control.Controle_Habilidade;
import control.Controle_Item;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.classes.Arma;
import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Constante_Atributo;
import model.classes.Item;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.HabilidadeInvalidaException;
import model.exception.ItemInvalidoException;
import view.PaineisDeCadastro.PainelFuncoes;

/**
 *
 * @author Luciano
 */
public class PnlAlterarEquipamento extends javax.swing.JPanel {

    /**
     * Creates new form PnlAlterarEquipamento
     */
    public PnlAlterarEquipamento() {
        initComponents();
        cmbEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
        cmbEquipamento.setEnabled(false);
        PainelFuncoes.habilitarCampos(pnlCadastrarItem, false);
        iniciarBtnLimpar();
        pnlCadastrarItem.getBtnCadastrar().setEnabled(false);
        iniciarBtnAlterar();
        pnlCadastrarItem.setPodeCadastrar(false);
        PainelFuncoes.habilitarCampos(pnlTipoDeArma, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipoDeEquipamento = new javax.swing.ButtonGroup();
        grpTipoDeArma = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdbItem = new javax.swing.JRadioButton();
        rdbArma = new javax.swing.JRadioButton();
        rdbArmadura = new javax.swing.JRadioButton();
        pnlTipoDeArma = new javax.swing.JPanel();
        rdbArmaADistancia = new javax.swing.JRadioButton();
        rdbArmaCorpoACorpo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbEquipamento = new javax.swing.JComboBox();
        pnlCadastrarItem = new view.PaineisDeCadastro.PnlCadastrarItem();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Equipamento"));

        grpTipoDeEquipamento.add(rdbItem);
        rdbItem.setText("Item");
        rdbItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbItemActionPerformed(evt);
            }
        });

        grpTipoDeEquipamento.add(rdbArma);
        rdbArma.setText("Arma");
        rdbArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbArmaActionPerformed(evt);
            }
        });

        grpTipoDeEquipamento.add(rdbArmadura);
        rdbArmadura.setText("Armadura");
        rdbArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbArmaduraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbArma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbArmadura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbItem)
                    .addComponent(rdbArma)
                    .addComponent(rdbArmadura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTipoDeArma.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Arma"));

        grpTipoDeArma.add(rdbArmaADistancia);
        rdbArmaADistancia.setText("Arma a Distancia");
        rdbArmaADistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbArmaADistanciaActionPerformed(evt);
            }
        });

        grpTipoDeArma.add(rdbArmaCorpoACorpo);
        rdbArmaCorpoACorpo.setText("Arma Corpo a Corpo");
        rdbArmaCorpoACorpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbArmaCorpoACorpoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTipoDeArmaLayout = new javax.swing.GroupLayout(pnlTipoDeArma);
        pnlTipoDeArma.setLayout(pnlTipoDeArmaLayout);
        pnlTipoDeArmaLayout.setHorizontalGroup(
            pnlTipoDeArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoDeArmaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(rdbArmaADistancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbArmaCorpoACorpo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTipoDeArmaLayout.setVerticalGroup(
            pnlTipoDeArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoDeArmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTipoDeArmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbArmaADistancia)
                    .addComponent(rdbArmaCorpoACorpo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o Equipamento"));

        jLabel1.setText("Equipamento:");

        cmbEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEquipamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbEquipamento, 0, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlCadastrarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTipoDeArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTipoDeArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCadastrarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbItemActionPerformed
        
        carregarJComboBox("Generico");
        
        grpTipoDeArma.clearSelection();
        PainelFuncoes.habilitarCampos(pnlTipoDeArma, false);
        pnlCadastrarItem.getBtnCadastrar().setEnabled(false);
        
        cmbEquipamento.setEnabled(true);
        PainelFuncoes.habilitarCampos(pnlCadastrarItem, false);
        PainelFuncoes.limparTodosOsCampos(pnlCadastrarItem);
        pnlCadastrarItem.getGrpTipoDeArma().clearSelection();
        pnlCadastrarItem.getGrpTipoEquipamento().clearSelection();
        pnlCadastrarItem.getGrpTipoHabilidade().clearSelection();
        
        pnlCadastrarItem.getCmbHabilidade().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
    }//GEN-LAST:event_rdbItemActionPerformed

    private void rdbArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbArmaActionPerformed
    
        cmbEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
        cmbEquipamento.setEnabled(false);
        
        PainelFuncoes.habilitarCampos(pnlTipoDeArma, true);
        pnlCadastrarItem.getBtnCadastrar().setEnabled(false);
        
        cmbEquipamento.setEnabled(false);
        PainelFuncoes.habilitarCampos(pnlCadastrarItem, false);
        PainelFuncoes.limparTodosOsCampos(pnlCadastrarItem);
        pnlCadastrarItem.getGrpTipoDeArma().clearSelection();
        pnlCadastrarItem.getGrpTipoEquipamento().clearSelection();
        pnlCadastrarItem.getGrpTipoHabilidade().clearSelection();
        
        pnlCadastrarItem.getCmbHabilidade().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
    }//GEN-LAST:event_rdbArmaActionPerformed

    private void rdbArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbArmaduraActionPerformed
     
        carregarJComboBox("Armadura");
        
        grpTipoDeArma.clearSelection();
        PainelFuncoes.habilitarCampos(pnlTipoDeArma, false);
        pnlCadastrarItem.getBtnCadastrar().setEnabled(false);
        
        cmbEquipamento.setEnabled(true);
        PainelFuncoes.habilitarCampos(pnlCadastrarItem, false);
        PainelFuncoes.limparTodosOsCampos(pnlCadastrarItem);
        pnlCadastrarItem.getGrpTipoDeArma().clearSelection();
        pnlCadastrarItem.getGrpTipoEquipamento().clearSelection();
        pnlCadastrarItem.getGrpTipoHabilidade().clearSelection();
        
        pnlCadastrarItem.getCmbHabilidade().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
    }//GEN-LAST:event_rdbArmaduraActionPerformed

    private void rdbArmaCorpoACorpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbArmaCorpoACorpoActionPerformed
     
        carregarJComboBox("Arma Corpo a Corpo");
        
        pnlCadastrarItem.getBtnCadastrar().setEnabled(false);
        
        cmbEquipamento.setEnabled(true);
        PainelFuncoes.habilitarCampos(pnlCadastrarItem, false);
        PainelFuncoes.limparTodosOsCampos(pnlCadastrarItem);
        pnlCadastrarItem.getGrpTipoDeArma().clearSelection();
        pnlCadastrarItem.getGrpTipoEquipamento().clearSelection();
        pnlCadastrarItem.getGrpTipoHabilidade().clearSelection();
        
        pnlCadastrarItem.getCmbHabilidade().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
    }//GEN-LAST:event_rdbArmaCorpoACorpoActionPerformed

    private void rdbArmaADistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbArmaADistanciaActionPerformed
      
        carregarJComboBox("Arma a Distancia");
        
        pnlCadastrarItem.getBtnCadastrar().setEnabled(false);
        
        cmbEquipamento.setEnabled(true);
        PainelFuncoes.habilitarCampos(pnlCadastrarItem, false);
        PainelFuncoes.limparTodosOsCampos(pnlCadastrarItem);
        pnlCadastrarItem.getGrpTipoDeArma().clearSelection();
        pnlCadastrarItem.getGrpTipoEquipamento().clearSelection();
        pnlCadastrarItem.getGrpTipoHabilidade().clearSelection();
        
        pnlCadastrarItem.getCmbHabilidade().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
    }//GEN-LAST:event_rdbArmaADistanciaActionPerformed

    private void cmbEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEquipamentoActionPerformed
   
        try{
            PainelFuncoes.habilitarCampos(pnlCadastrarItem, false);
            PainelFuncoes.limparTodosOsCampos(pnlCadastrarItem);
            pnlCadastrarItem.getGrpTipoDeArma().clearSelection();
            pnlCadastrarItem.getGrpTipoEquipamento().clearSelection();
            pnlCadastrarItem.getGrpTipoHabilidade().clearSelection();
            pnlCadastrarItem.getBtnCadastrar().setEnabled(false);
            
            String nomeSelecionado = cmbEquipamento.getSelectedItem().toString();
            
            if(!nomeSelecionado.equals("Nenhuma")){
                PainelFuncoes.habilitarCampos(pnlCadastrarItem, true);
                PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlTipo(), false);
                PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlTipoDeArma(), false);
                PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlArma(), false);
                PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlArmadura(), false);
                pnlCadastrarItem.getBtnCadastrar().setEnabled(true);
                
                Item item = null;
                
                if(rdbItem.isSelected()) {
                    item = Controle_Item.encontrarItemGenerico(nomeSelecionado);
                    pnlCadastrarItem.getRdbItem().setSelected(true);
                }
                if(rdbArmadura.isSelected()) {
                    item = Controle_Item.encontrarArmadura(nomeSelecionado);
                    pnlCadastrarItem.getRdbArmadura().setSelected(true);
                }
                if(rdbArmaADistancia.isSelected()) {
                    item = Controle_Item.encontrarArma_A_Distancia(nomeSelecionado);
                    pnlCadastrarItem.getRdbArma().setSelected(true);
                }
                if(rdbArmaCorpoACorpo.isSelected()) {
                    item = Controle_Item.encontrarArma_Corpo_A_Corpo(nomeSelecionado);
                    pnlCadastrarItem.getRdbArma().setSelected(true);
                }
                                
                pnlCadastrarItem.getTxtNome().setText(item.getNome());
                pnlCadastrarItem.getTxtDescricao().setText(item.getDescricao());
                pnlCadastrarItem.getTxtPreco().setText(""+item.getPreco());
                
                if(item.getHabilidade_Necessaria().equals("Nenhuma")){
                    pnlCadastrarItem.getCmbHabilidade().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
                    pnlCadastrarItem.getCmbHabilidade().setEnabled(false);
                }else{                    
                    String tipoDeHabilidade = Controle_Habilidade.getTipoHabildiade(item.getHabilidade_Necessaria());
                    switch(tipoDeHabilidade){
                        case "Fisica":
                            pnlCadastrarItem.getRdbFisica().setSelected(true);
                            pnlCadastrarItem.carregarJComboBox("Fisica");
                            break;
                        case "Psiquica":
                            pnlCadastrarItem.getRdbPsiquica().setSelected(true);
                            pnlCadastrarItem.carregarJComboBox("Psiquica");
                            break;
                        case "Belica":
                            pnlCadastrarItem.getRdbBelica().setSelected(true);
                            pnlCadastrarItem.carregarJComboBox("Belica");
                            break;
                    }
                    for(int i = 0; i < pnlCadastrarItem.getCmbHabilidade().getItemCount(); i++){
                        if(pnlCadastrarItem.getCmbHabilidade().getItemAt(i).toString().equals(item.getHabilidade_Necessaria())){
                            pnlCadastrarItem.getCmbHabilidade().setSelectedIndex(i);
                        }
                    }
                }
                
                final int FISICO = Constante_Atributo.FISICO;
                final int DESTREZA = Constante_Atributo.DESTREZA;
                final int INTELIGENCIA = Constante_Atributo.INTELIGENCIA;
                final int VONTADE = Constante_Atributo.VONTADE;
                final int PERCEPCAO = Constante_Atributo.PERCEPCAO;
                final int MENTE = Constante_Atributo.MENTE;
                final int MANA = Constante_Atributo.MANA;
                final int SORTE = Constante_Atributo.SORTE;
                
                if(item.getBonus_atributo() != null){
                    if(item.getBonus_atributo()[FISICO] > 0){
                        pnlCadastrarItem.getChkFisico().setSelected(true);
                        pnlCadastrarItem.getTxtFisico().setText(""+item.getBonus_atributo()[FISICO]);
                    }
                    if(item.getBonus_atributo()[DESTREZA] > 0){
                        pnlCadastrarItem.getChkDestreza().setSelected(true);
                        pnlCadastrarItem.getTxtDestreza().setText(""+item.getBonus_atributo()[DESTREZA]);
                    }
                    if(item.getBonus_atributo()[INTELIGENCIA] > 0){
                        pnlCadastrarItem.getChkInteligencia().setSelected(true);
                        pnlCadastrarItem.getTxtInteligencia().setText(""+item.getBonus_atributo()[INTELIGENCIA]);
                    }
                    if(item.getBonus_atributo()[VONTADE] > 0){
                        pnlCadastrarItem.getChkVontade().setSelected(true);
                        pnlCadastrarItem.getTxtVontade().setText(""+item.getBonus_atributo()[VONTADE]);
                    }
                    if(item.getBonus_atributo()[PERCEPCAO] > 0){
                        pnlCadastrarItem.getChkPercepcao().setSelected(true);
                        pnlCadastrarItem.getTxtPercepcao().setText(""+item.getBonus_atributo()[PERCEPCAO]);
                    }
                    if(item.getBonus_atributo()[MENTE] > 0){
                        pnlCadastrarItem.getChkMente().setSelected(true);
                        pnlCadastrarItem.getTxtMente().setText(""+item.getBonus_atributo()[MENTE]);
                    }
                    if(item.getBonus_atributo()[MANA] > 0){
                        pnlCadastrarItem.getChkMana().setSelected(true);
                        pnlCadastrarItem.getTxtMana().setText(""+item.getBonus_atributo()[MANA]);
                    }
                    if(item.getBonus_atributo()[SORTE] > 0){
                        pnlCadastrarItem.getChkSorte().setSelected(true);
                        pnlCadastrarItem.getTxtSorte().setText(""+item.getBonus_atributo()[SORTE]);
                    }
                }
                
                
                if(rdbArmaADistancia.isSelected()){
                    PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlArma(), true);
                    PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlArmaCorpoACorpo(), false);
                    PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlTipoDeArma(), false);
                    
                    pnlCadastrarItem.getRdbArmaADistancia().setSelected(true);
                    
                    Arma_A_Distancia arma = Controle_Item.encontrarArma_A_Distancia(nomeSelecionado);
                    pnlCadastrarItem.getTxtLados().setText(""+((Arma)arma).getDano().getLados());
                    pnlCadastrarItem.getTxtRolagem().setText(""+((Arma)arma).getDano().getRolagem());
                    pnlCadastrarItem.getTxtDanoAdicional().setText(""+((Arma)arma).getDanoAdicional());
                    
                    pnlCadastrarItem.getTxtTiroRapido().setText(""+arma.getTiro_Rapido());
                    pnlCadastrarItem.getTxtTiroMirado().setText(""+arma.getTiro_Mirado());
                    pnlCadastrarItem.getTxtCadencia().setText(""+arma.getCadencia());
                }
                if(rdbArmaCorpoACorpo.isSelected()){
                    PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlArma(), true);
                    PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlArmaADistancia(), false);
                    PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlTipoDeArma(), false);
                    
                    pnlCadastrarItem.getRdbArmaCorpoACorpo().setSelected(true);
                    
                    Arma_Corpo_A_Corpo arma = Controle_Item.encontrarArma_Corpo_A_Corpo(nomeSelecionado);
                    pnlCadastrarItem.getTxtLados().setText(""+((Arma)arma).getDano().getLados());
                    pnlCadastrarItem.getTxtRolagem().setText(""+((Arma)arma).getDano().getRolagem());
                    pnlCadastrarItem.getTxtDanoAdicional().setText(""+((Arma)arma).getDanoAdicional());
                    
                    pnlCadastrarItem.getTxtGolpe().setText(""+arma.getGolpe());
                    pnlCadastrarItem.getTxtAparo().setText(""+arma.getAparo());
                    pnlCadastrarItem.getTxtEsquiva().setText(""+arma.getEsquiva());
                    
                }
                
                if(rdbArmadura.isSelected()){
                    PainelFuncoes.habilitarCampos(pnlCadastrarItem.getPnlArmadura(), true);
                    
                    Armadura armadura = Controle_Item.encontrarArmadura(nomeSelecionado);
                    
                    pnlCadastrarItem.getTxtAbsorcaoArmaBranca().setText(""+armadura.getAbsorcao_Distancia());
                    pnlCadastrarItem.getTxtAbsorcaoArmaDeFogo().setText(""+armadura.getAbsorcao_CorpoACorpo());
                    pnlCadastrarItem.getTxtPenalidade().setText(""+armadura.getPenalidade());
                    pnlCadastrarItem.getCmbRegiaoDoCorpo().setSelectedItem(""+armadura.getRegiao_Do_Corpo());
                }
                
            }else{
                pnlCadastrarItem.getCmbHabilidade().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
            }
            
        } catch(IOException | ArquivoInvalidoException | ClassNotFoundException | HabilidadeInvalidaException e){
            JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbEquipamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbEquipamento;
    private javax.swing.ButtonGroup grpTipoDeArma;
    private javax.swing.ButtonGroup grpTipoDeEquipamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private view.PaineisDeCadastro.PnlCadastrarItem pnlCadastrarItem;
    private javax.swing.JPanel pnlTipoDeArma;
    private javax.swing.JRadioButton rdbArma;
    private javax.swing.JRadioButton rdbArmaADistancia;
    private javax.swing.JRadioButton rdbArmaCorpoACorpo;
    private javax.swing.JRadioButton rdbArmadura;
    private javax.swing.JRadioButton rdbItem;
    // End of variables declaration//GEN-END:variables

    
    private void iniciarBtnLimpar(){
        pnlCadastrarItem.getBtnLimpar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                limparCampos();
            }
        });
    }
    
    private void iniciarBtnAlterar(){
        pnlCadastrarItem.getBtnCadastrar().setText("Alterar");
        
        pnlCadastrarItem.getBtnCadastrar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
                btnAlterarActionPerfomed();
            }
        });
    }
    
    private void btnAlterarActionPerfomed(){
        try{
            Item item = pnlCadastrarItem.pegarDadosDoPainel();
            String nomeSelecionado = cmbEquipamento.getSelectedItem().toString();
            
            if(rdbItem.isSelected()){
                Controle_Item.removerItemGenerico(nomeSelecionado);
                Controle_Item.cadItemGenerico(item.getNome(), item.getDescricao(), item.isUsando(), item.getBonus_atributo(), item.getPreco(), item.getHabilidade_Necessaria());
                JOptionPane.showMessageDialog(null,"Alterar Item: " + item.getNome() +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
            }
            
            if(rdbArma.isSelected()){
                if(rdbArmaADistancia.isSelected()){
                    Arma_A_Distancia arma = (Arma_A_Distancia)item;
                    Controle_Item.removerArmaADistancia(nomeSelecionado);
                    Controle_Item.cadArma_A_Distancia(arma.getNome(), arma.getDescricao(), arma.getDano(), arma.getDanoAdicional(), arma.getTiro_Rapido(), arma.getTiro_Mirado(), arma.getCadencia(), arma.isUsando(), arma.getBonus_atributo(), arma.getPreco(), arma.getHabilidade_Necessaria());
                    JOptionPane.showMessageDialog(null,"Alterar Arma a Distancia: " + arma.getNome() +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                }
                if(rdbArmaCorpoACorpo.isSelected()){
                    Arma_Corpo_A_Corpo arma = (Arma_Corpo_A_Corpo)item;
                    Controle_Item.removerArmaCorpoACorpo(nomeSelecionado);
                    Controle_Item.cadArma_Corpo_A_Corpo(arma.getNome(), arma.getDescricao(), arma.getDano(), arma.getDanoAdicional(), arma.getGolpe(), arma.getAparo(), arma.getEsquiva(), arma.isUsando(), arma.getBonus_atributo(), arma.getPreco(), arma.getHabilidade_Necessaria());
                    JOptionPane.showMessageDialog(null,"Alterar Arma Corpo a Corpo: " + arma.getNome() +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
            if(rdbArmadura.isSelected()){
                Armadura armadura = (Armadura)item;
                Controle_Item.removerArmadura(nomeSelecionado);
                Controle_Item.cadArmadura(armadura.getNome(), armadura.getDescricao(), armadura.getAbsorcao_Distancia(), armadura.getAbsorcao_CorpoACorpo(), armadura.getPenalidade(), armadura.getRegiao_Do_Corpo(), armadura.isUsando(), armadura.getBonus_atributo(), armadura.getPreco(), armadura.getHabilidade_Necessaria());
                JOptionPane.showMessageDialog(null,"Alterar Armadura: " + armadura.getNome() +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
            }
            
            limparCampos();
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"ERROR: Campo Nulo","Erro",JOptionPane.ERROR_MESSAGE);
        } catch(DeletarInvalidoException | ArquivoInvalidoException | HeadlessException | IOException | ItemInvalidoException e){
            JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    private void limparCampos(){
        cmbEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));
        cmbEquipamento.setEnabled(false);
        PainelFuncoes.habilitarCampos(pnlCadastrarItem, false);
        pnlCadastrarItem.getBtnCadastrar().setEnabled(false);
        
        grpTipoDeEquipamento.clearSelection();
        grpTipoDeArma.clearSelection();
        
        PainelFuncoes.habilitarCampos(pnlTipoDeArma, false);
    }
    
    private void carregarJComboBox(String tipo){
        cmbEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhuma"}));
        
        String diretorios[] = null;
        
        switch(tipo){
            case "Generico":
                diretorios = Controle_Item.listarItemGenerico();
                break;
            case "Arma a Distancia":
                diretorios = Controle_Item.listarItemArmaADistancia();
                break;
            case "Arma Corpo a Corpo":
                diretorios = Controle_Item.listarItemArmaCorpoACorpo();
                break;
            case "Armadura":
                diretorios = Controle_Item.listarItemArmadura();
                break;
        }
        
        if(diretorios != null){
            if(diretorios.length > 0){
                for(int i = 0; i < diretorios.length; i++){
                    cmbEquipamento.addItem(diretorios[i]);
                }
            }
        }
    }

}
