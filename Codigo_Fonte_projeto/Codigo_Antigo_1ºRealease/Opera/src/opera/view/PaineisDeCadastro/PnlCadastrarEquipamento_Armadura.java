/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.PaineisDeCadastro;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Luciano
 */
public class PnlCadastrarEquipamento_Armadura extends javax.swing.JPanel {

    /**
     * Getters
     */
    public JButton getBtnCancelar(){
        return btnCancelar;
    }
    public JButton getBtnCadastrar(){
        return btnCadastrar;
    }
    public JButton getBtnVoltar(){
        return btnVoltar;
    }

    public JPanel getPnlNovaArmadura() {
        return pnlNovaArmadura;
    }

    public void setPnlNovaArmadura(JPanel pnlNovaArmadura) {
        this.pnlNovaArmadura = pnlNovaArmadura;
    }
    
    
    
    public JTextField getTxtAbsorcaoArmaBranca(){
        return txtAbsorcaoArmaBranca;
    }
    public JTextField getTxtAbsorcaoArmaDeFogo(){
        return txtAbsorcaoArmaDeFogo;
    }
    public JTextField getTxtPenalidade(){
        return txtPenalidade;
    }
    public JTextField getTxtRegiaoDoCorpo(){
        return txtRegiaoDoCorpo;
    }

    public void setTxtAbsorcaoArmaBranca(JTextField txtAbsorcaoArmaBranca) {
        this.txtAbsorcaoArmaBranca = txtAbsorcaoArmaBranca;
    }

    public void setTxtAbsorcaoArmaDeFogo(JTextField txtAbsorcaoArmaDeFogo) {
        this.txtAbsorcaoArmaDeFogo = txtAbsorcaoArmaDeFogo;
    }

    public void setTxtPenalidade(JTextField txtPenalidade) {
        this.txtPenalidade = txtPenalidade;
    }

    public void setTxtRegiaoDoCorpo(JTextField txtRegiaoDoCorpo) {
        this.txtRegiaoDoCorpo = txtRegiaoDoCorpo;
    }
    
    
    /**
     * Creates new form PnlCadastrarEquipamento_Armadura
     */
    public PnlCadastrarEquipamento_Armadura() {
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

        pnlNovaArmadura = new javax.swing.JPanel();
        lblAbsorsaoArmaBranca = new javax.swing.JLabel();
        lblAbsorcaoArmaDeFogo = new javax.swing.JLabel();
        lblPenalidade = new javax.swing.JLabel();
        lblRegiaoDoCorpo = new javax.swing.JLabel();
        txtAbsorcaoArmaDeFogo = new javax.swing.JTextField();
        txtAbsorcaoArmaBranca = new javax.swing.JTextField();
        txtPenalidade = new javax.swing.JTextField();
        txtRegiaoDoCorpo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        pnlNovaArmadura.setBorder(javax.swing.BorderFactory.createTitledBorder("Nova Armadura"));

        lblAbsorsaoArmaBranca.setText("Absorcao de Arma Branca:");

        lblAbsorcaoArmaDeFogo.setText("Absorcao de Arma de Fogo:");

        lblPenalidade.setText("Penalidade:");

        lblRegiaoDoCorpo.setText("Regiao do Corpo:");

        javax.swing.GroupLayout pnlNovaArmaduraLayout = new javax.swing.GroupLayout(pnlNovaArmadura);
        pnlNovaArmadura.setLayout(pnlNovaArmaduraLayout);
        pnlNovaArmaduraLayout.setHorizontalGroup(
            pnlNovaArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovaArmaduraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNovaArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAbsorcaoArmaDeFogo)
                    .addComponent(lblAbsorsaoArmaBranca)
                    .addComponent(lblPenalidade)
                    .addComponent(lblRegiaoDoCorpo))
                .addGap(18, 18, 18)
                .addGroup(pnlNovaArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRegiaoDoCorpo)
                    .addComponent(txtPenalidade)
                    .addComponent(txtAbsorcaoArmaBranca)
                    .addComponent(txtAbsorcaoArmaDeFogo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNovaArmaduraLayout.setVerticalGroup(
            pnlNovaArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNovaArmaduraLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlNovaArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbsorsaoArmaBranca)
                    .addComponent(txtAbsorcaoArmaBranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlNovaArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbsorcaoArmaDeFogo)
                    .addComponent(txtAbsorcaoArmaDeFogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNovaArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPenalidade)
                    .addComponent(txtPenalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNovaArmaduraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegiaoDoCorpo)
                    .addComponent(txtRegiaoDoCorpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");

        btnCadastrar.setText("Cadastrar");

        btnVoltar.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlNovaArmadura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlNovaArmadura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblAbsorcaoArmaDeFogo;
    private javax.swing.JLabel lblAbsorsaoArmaBranca;
    private javax.swing.JLabel lblPenalidade;
    private javax.swing.JLabel lblRegiaoDoCorpo;
    private javax.swing.JPanel pnlNovaArmadura;
    private javax.swing.JTextField txtAbsorcaoArmaBranca;
    private javax.swing.JTextField txtAbsorcaoArmaDeFogo;
    private javax.swing.JTextField txtPenalidade;
    private javax.swing.JTextField txtRegiaoDoCorpo;
    // End of variables declaration//GEN-END:variables

}
