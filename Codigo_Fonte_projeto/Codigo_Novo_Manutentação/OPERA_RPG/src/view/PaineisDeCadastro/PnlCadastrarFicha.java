/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PaineisDeCadastro;

import control.Controle_Ficha;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import model.classes.Constante_Atributo;
import model.exception.ArquivoInvalidoException;
import model.exception.FichaInvalidaException;
import model.exception.JTextFieldInvalidoException;
import view.validacao.ValidarCampos;

/**
 *
 * @author Luciano
 */
public class PnlCadastrarFicha extends javax.swing.JPanel {
    
    private boolean podeCadastrar;
    
    /**
     * Creates new form PnlCadastrarFicha
     */
    public PnlCadastrarFicha() {
        initComponents();
        PainelFuncoes.definirCorDaBordaJTextField(this, Color.GRAY);
        podeCadastrar = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTipoFicha = new javax.swing.ButtonGroup();
        pnlNome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPersonagem = new javax.swing.JTextField();
        txtJogador = new javax.swing.JTextField();
        pnlTipoFicha = new javax.swing.JPanel();
        rdbJogador = new javax.swing.JRadioButton();
        rdbNpc = new javax.swing.JRadioButton();
        rdbMonstro = new javax.swing.JRadioButton();
        pnlCampanha = new javax.swing.JPanel();
        txtCampanha = new javax.swing.JTextField();
        pnlExperiencia = new javax.swing.JPanel();
        txtExperiencia = new javax.swing.JTextField();
        pnlAtributos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtInteligencia = new javax.swing.JTextField();
        txtDestreza = new javax.swing.JTextField();
        txtFisico = new javax.swing.JTextField();
        txtVontade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPercepcao = new javax.swing.JTextField();
        txtMente = new javax.swing.JTextField();
        txtMana = new javax.swing.JTextField();
        txtSorte = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtDinheiro = new javax.swing.JTextField();

        pnlNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        jLabel1.setText("Jogador:");

        jLabel2.setText("Personagem:");

        txtPersonagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPersonagemFocusLost(evt);
            }
        });

        txtJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJogadorActionPerformed(evt);
            }
        });
        txtJogador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJogadorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlNomeLayout = new javax.swing.GroupLayout(pnlNome);
        pnlNome.setLayout(pnlNomeLayout);
        pnlNomeLayout.setHorizontalGroup(
            pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtJogador)
                    .addComponent(txtPersonagem))
                .addContainerGap())
        );
        pnlNomeLayout.setVerticalGroup(
            pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTipoFicha.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Ficha"));

        grpTipoFicha.add(rdbJogador);
        rdbJogador.setText("Jogador");
        rdbJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbJogadorActionPerformed(evt);
            }
        });

        grpTipoFicha.add(rdbNpc);
        rdbNpc.setText("NPC");
        rdbNpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNpcActionPerformed(evt);
            }
        });

        grpTipoFicha.add(rdbMonstro);
        rdbMonstro.setText("Monstro");
        rdbMonstro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMonstroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTipoFichaLayout = new javax.swing.GroupLayout(pnlTipoFicha);
        pnlTipoFicha.setLayout(pnlTipoFichaLayout);
        pnlTipoFichaLayout.setHorizontalGroup(
            pnlTipoFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoFichaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTipoFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbJogador)
                    .addComponent(rdbNpc)
                    .addComponent(rdbMonstro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTipoFichaLayout.setVerticalGroup(
            pnlTipoFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTipoFichaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbJogador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbNpc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbMonstro))
        );

        pnlCampanha.setBorder(javax.swing.BorderFactory.createTitledBorder("Campanha"));

        txtCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampanhaActionPerformed(evt);
            }
        });
        txtCampanha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCampanhaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlCampanhaLayout = new javax.swing.GroupLayout(pnlCampanha);
        pnlCampanha.setLayout(pnlCampanhaLayout);
        pnlCampanhaLayout.setHorizontalGroup(
            pnlCampanhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCampanha)
        );
        pnlCampanhaLayout.setVerticalGroup(
            pnlCampanhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlExperiencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Experiencia"));

        txtExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExperienciaActionPerformed(evt);
            }
        });
        txtExperiencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExperienciaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlExperienciaLayout = new javax.swing.GroupLayout(pnlExperiencia);
        pnlExperiencia.setLayout(pnlExperienciaLayout);
        pnlExperienciaLayout.setHorizontalGroup(
            pnlExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExperiencia, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        pnlExperienciaLayout.setVerticalGroup(
            pnlExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnlAtributos.setBorder(javax.swing.BorderFactory.createTitledBorder("Atributos"));

        jLabel3.setText("Fisico:");

        jLabel4.setText("Destreza:");

        jLabel5.setText("Inteligencia:");

        jLabel6.setText("Vontade:");

        txtInteligencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInteligenciaFocusLost(evt);
            }
        });

        txtDestreza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDestrezaFocusLost(evt);
            }
        });

        txtFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFisicoActionPerformed(evt);
            }
        });
        txtFisico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFisicoFocusLost(evt);
            }
        });

        txtVontade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVontadeFocusLost(evt);
            }
        });

        jLabel7.setText("Percepcao:");

        jLabel8.setText("Mente:");

        jLabel9.setText("Mana:");

        jLabel10.setText("Sorte:");

        txtPercepcao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPercepcaoFocusLost(evt);
            }
        });

        txtMente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMenteFocusLost(evt);
            }
        });

        txtMana.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtManaFocusLost(evt);
            }
        });

        txtSorte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSorteFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlAtributosLayout = new javax.swing.GroupLayout(pnlAtributos);
        pnlAtributos.setLayout(pnlAtributosLayout);
        pnlAtributosLayout.setHorizontalGroup(
            pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVontade, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(txtInteligencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDestreza, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFisico, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12)
                .addGroup(pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMana, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(txtMente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPercepcao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSorte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAtributosLayout.setVerticalGroup(
            pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFisico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPercepcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtVontade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtSorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dinheiro"));

        txtDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDinheiroActionPerformed(evt);
            }
        });
        txtDinheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDinheiroFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTipoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCampanha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addComponent(pnlExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pnlAtributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTipoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar)
                            .addComponent(btnCadastrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCampanha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        PainelFuncoes.limparTodosOsCampos(this);
        PainelFuncoes.definirCorDaBordaJTextField(this, Color.GRAY);
        grpTipoFicha.clearSelection();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtJogadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJogadorFocusLost
        try{
            ValidarCampos.validarCampoTexto((JTextField)evt.getSource(), false);
        } catch(JTextFieldInvalidoException e){ 
        }
    }//GEN-LAST:event_txtJogadorFocusLost

    private void txtPersonagemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPersonagemFocusLost
        try{
            ValidarCampos.validarCampoTexto((JTextField)evt.getSource(), true);
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtPersonagemFocusLost

    private void txtCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampanhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampanhaActionPerformed

    private void txtCampanhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCampanhaFocusLost
        try{
            ValidarCampos.validarCampoTexto((JTextField)evt.getSource(), true);
        } catch(JTextFieldInvalidoException e){
            
        }
    }//GEN-LAST:event_txtCampanhaFocusLost

    private void txtExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExperienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperienciaActionPerformed

    private void txtExperienciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExperienciaFocusLost
        // TODO add your handling code here:
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtExperienciaFocusLost

    private void txtFisicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFisicoFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtFisicoFocusLost

    private void txtDestrezaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDestrezaFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtDestrezaFocusLost

    private void txtInteligenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInteligenciaFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtInteligenciaFocusLost

    private void txtVontadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVontadeFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtVontadeFocusLost

    private void txtPercepcaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPercepcaoFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtPercepcaoFocusLost

    private void txtMenteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMenteFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtMenteFocusLost

    private void txtManaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtManaFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtManaFocusLost

    private void txtSorteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSorteFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtSorteFocusLost

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(podeCadastrar){
            cadastrarFicha();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void rdbJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbJogadorActionPerformed
        rdbJogador.setForeground(Color.BLACK);
        rdbNpc.setForeground(Color.BLACK);
        rdbMonstro.setForeground(Color.BLACK);
        
        rdbJogador.setToolTipText("");
        rdbNpc.setToolTipText("");
        rdbMonstro.setToolTipText("");
        
        txtJogador.setEnabled(true);
        try{
            ValidarCampos.validarCampoTexto(txtJogador, false);
        } catch(JTextFieldInvalidoException e){ 
        }
    }//GEN-LAST:event_rdbJogadorActionPerformed

    private void rdbNpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNpcActionPerformed
        rdbJogador.setForeground(Color.BLACK);
        rdbNpc.setForeground(Color.BLACK);
        rdbMonstro.setForeground(Color.BLACK);
        
        rdbJogador.setToolTipText("");
        rdbNpc.setToolTipText("");
        rdbMonstro.setToolTipText("");
        
        txtJogador.setEnabled(false);
        txtJogador.setBorder(new LineBorder(Color.GRAY));
    }//GEN-LAST:event_rdbNpcActionPerformed

    private void rdbMonstroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMonstroActionPerformed
        rdbJogador.setForeground(Color.BLACK);
        rdbNpc.setForeground(Color.BLACK);
        rdbMonstro.setForeground(Color.BLACK);
        
        rdbJogador.setToolTipText("");
        rdbNpc.setToolTipText("");
        rdbMonstro.setToolTipText("");
        
        txtJogador.setEnabled(false);
        txtJogador.setBorder(new LineBorder(Color.GRAY));
    }//GEN-LAST:event_rdbMonstroActionPerformed

    private void txtDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDinheiroActionPerformed

    private void txtDinheiroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDinheiroFocusLost
        try{
            ValidarCampos.validarCampoInteiro((JTextField)evt.getSource());
        } catch(JTextFieldInvalidoException e){
        }
    }//GEN-LAST:event_txtDinheiroFocusLost

    private void txtJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJogadorActionPerformed

    private void txtFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFisicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup grpTipoFicha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlAtributos;
    private javax.swing.JPanel pnlCampanha;
    private javax.swing.JPanel pnlExperiencia;
    private javax.swing.JPanel pnlNome;
    private javax.swing.JPanel pnlTipoFicha;
    private javax.swing.JRadioButton rdbJogador;
    private javax.swing.JRadioButton rdbMonstro;
    private javax.swing.JRadioButton rdbNpc;
    private javax.swing.JTextField txtCampanha;
    private javax.swing.JTextField txtDestreza;
    private javax.swing.JTextField txtDinheiro;
    private javax.swing.JTextField txtExperiencia;
    private javax.swing.JTextField txtFisico;
    private javax.swing.JTextField txtInteligencia;
    private javax.swing.JTextField txtJogador;
    private javax.swing.JTextField txtMana;
    private javax.swing.JTextField txtMente;
    private javax.swing.JTextField txtPercepcao;
    private javax.swing.JTextField txtPersonagem;
    private javax.swing.JTextField txtSorte;
    private javax.swing.JTextField txtVontade;
    // End of variables declaration//GEN-END:variables

    
    private void cadastrarFicha(){
        try{
            
            int atributo[] = new int[8];
            final int FISICO = Constante_Atributo.FISICO;
            final int DESTREZA = Constante_Atributo.DESTREZA;
            final int INTELIGENCIA = Constante_Atributo.INTELIGENCIA;
            final int VONTADE = Constante_Atributo.VONTADE;
            final int PERCEPCAO = Constante_Atributo.PERCEPCAO;
            final int MENTE = Constante_Atributo.MENTE;
            final int MANA = Constante_Atributo.MANA;
            final int SORTE = Constante_Atributo.SORTE;
            atributo[FISICO] = Integer.parseInt(txtFisico.getText());
            atributo[DESTREZA] = Integer.parseInt(txtDestreza.getText());
            atributo[INTELIGENCIA] = Integer.parseInt(txtInteligencia.getText());
            atributo[VONTADE] = Integer.parseInt(txtVontade.getText());
            atributo[PERCEPCAO] = Integer.parseInt(txtPercepcao.getText());
            atributo[MENTE] = Integer.parseInt(txtMente.getText());
            atributo[MANA] = Integer.parseInt(txtMana.getText());
            atributo[SORTE] = Integer.parseInt(txtSorte.getText());
            
            String tipo = null;
            if(rdbJogador.isSelected()){
                tipo = "Jogador";
            }
            if(rdbNpc.isSelected()){
                tipo = "NPC";
            }
            if(rdbMonstro.isSelected()){
                tipo = "Monstro";
            }

            if(tipo == null){
                rdbJogador.setForeground(Color.RED);
                rdbNpc.setForeground(Color.RED);
                rdbMonstro.setForeground(Color.RED);

                rdbJogador.setToolTipText("Algum dos Tipos de Ficha deve ser Selecionado");
                rdbNpc.setToolTipText("Algum dos Tipos de Ficha deve ser Selecionado");
                rdbMonstro.setToolTipText("Algum dos Tipos de Ficha deve ser Selecionado");
                pnlTipoFicha.setToolTipText("Algum dos Tipos de Ficha deve ser Selecionado");
                
                JOptionPane.showMessageDialog(null,"ERROR: " + "Tipo de Ficha nao Selecionado.","Erro",JOptionPane.ERROR_MESSAGE);
            }else{
                switch (tipo) {
                    case "NPC":
                        Controle_Ficha.cadNPC(txtPersonagem.getText(), txtCampanha.getText(), Integer.parseInt(txtExperiencia.getText())
                                , atributo, Integer.parseInt(txtDinheiro.getText()));
                        break;
                    case "Monstro":
                        Controle_Ficha.cadMonstro(txtPersonagem.getText(), txtCampanha.getText(), Integer.parseInt(txtExperiencia.getText())
                                , atributo, Integer.parseInt(txtDinheiro.getText()));
                        break;
                    case "Jogador":
                        Controle_Ficha.cadJogador(txtPersonagem.getText(), txtJogador.getText(), txtCampanha.getText(), Integer.parseInt(txtExperiencia.getText())
                                , atributo, Integer.parseInt(txtDinheiro.getText()));
                        break;
                    default:
                        break;
                }
                JOptionPane.showMessageDialog(null,"Cadastro Ficha: " + txtPersonagem.getText() +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                PainelFuncoes.limparTodosOsCampos(this);
                PainelFuncoes.definirCorDaBordaJTextField(this, Color.GRAY);
                grpTipoFicha.clearSelection();
            }
        } catch( FichaInvalidaException | ArquivoInvalidoException | IOException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"ERROR: " + "Local de Entrada do Tipo Numerico Inteiro \nRecebendo outro Tipo de Valor ou Vazio","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /*
     * Getters
     */

    public JButton getBtnCadastrar() {
        return btnCadastrar;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public JRadioButton getRdbJogador() {
        return rdbJogador;
    }

    public JRadioButton getRdbMonstro() {
        return rdbMonstro;
    }

    public JRadioButton getRdbNpc() {
        return rdbNpc;
    }

    public JTextField getTxtCampanha() {
        return txtCampanha;
    }

    public JTextField getTxtDestreza() {
        return txtDestreza;
    }

    public JTextField getTxtDinheiro() {
        return txtDinheiro;
    }

    public JTextField getTxtExperiencia() {
        return txtExperiencia;
    }

    public JTextField getTxtFisico() {
        return txtFisico;
    }

    public JTextField getTxtInteligencia() {
        return txtInteligencia;
    }

    public JTextField getTxtJogador() {
        return txtJogador;
    }

    public JTextField getTxtMana() {
        return txtMana;
    }

    public JTextField getTxtMente() {
        return txtMente;
    }

    public JTextField getTxtPercepcao() {
        return txtPercepcao;
    }

    public JTextField getTxtPersonagem() {
        return txtPersonagem;
    }

    public JTextField getTxtSorte() {
        return txtSorte;
    }

    public JTextField getTxtVontade() {
        return txtVontade;
    }

    public ButtonGroup getGrpTipoFicha() {
        return grpTipoFicha;
    }

    public JPanel getPnlTipoFicha() {
        return pnlTipoFicha;
    }

    public boolean isPodeCadastrar() {
        return podeCadastrar;
    }

    public void setPodeCadastrar(boolean podeCadastrar) {
        this.podeCadastrar = podeCadastrar;
    }
}
