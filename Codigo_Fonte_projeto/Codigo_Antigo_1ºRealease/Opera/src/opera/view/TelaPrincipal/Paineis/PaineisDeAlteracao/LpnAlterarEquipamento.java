/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal.Paineis.PaineisDeAlteracao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import opera.exception.EquipamentoInvalidoException;
import opera.view.Controle.Alterar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeAlteracao.PnlAlterarEquipamento;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnAlterarEquipamento extends LPainel implements ActionListener{

    
    private static LPainel lpnAlterarEquipamento;
    private static PnlAlterarEquipamento pnlAlterarEquipamento;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnAlterarEquipamento() {
        return lpnAlterarEquipamento;
    }

    public static void setLpnAlterarEquipamento(LPainel lpnAlterarEquipamento) {
        LpnAlterarEquipamento.lpnAlterarEquipamento = lpnAlterarEquipamento;
    }

    public static PnlAlterarEquipamento getPnlAlterarEquipamento() {
        return pnlAlterarEquipamento;
    }

    public static void setPnlAlterarEquipamento(PnlAlterarEquipamento pnlAlterarEquipamento) {
        LpnAlterarEquipamento.pnlAlterarEquipamento = pnlAlterarEquipamento;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnAlterarEquipamento.telaPrincipal = telaPrincipal;
    }
    
    
    
    public LpnAlterarEquipamento(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Equipamento.png"));
        String titulo = "Alterar Equipamento";
        pnlAlterarEquipamento = new PnlAlterarEquipamento(telaPrincipal.getJogo());
        
        lpnAlterarEquipamento = new LPainel(icone, titulo, pnlAlterarEquipamento);
        lpnAlterarEquipamento.adicionarseNaTab(telaPrincipal.getTabbedPane());;
        
        iniciarEventos();
    }
    
    
    private void iniciarEventos(){
        if(pnlAlterarEquipamento != null){
            pnlAlterarEquipamento.getPnlCadastrarEquipamento_Armadura().getBtnCancelar().addActionListener(this);
            lpnAlterarEquipamento.getBtnFechar().addActionListener(this);
            pnlAlterarEquipamento.getCmbSelecionar().addActionListener(this);
            pnlAlterarEquipamento.getBtnAlterar().addActionListener(this);
        }
    }
    
    

    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        
         //Botao Cancelar e Fechar, fecha a TAB
        if(pnlAlterarEquipamento != null){
            if( (origem.equals(pnlAlterarEquipamento.getPnlCadastrarEquipamento_Armadura().getBtnCancelar())) || (origem.equals(lpnAlterarEquipamento.getBtnFechar())) ){
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        }
        //Caixa de Combinacao, seleciona o objeto a ser alterado
        if(pnlAlterarEquipamento != null){
            if(origem.equals(pnlAlterarEquipamento.getCmbSelecionar())){
                try{
                    if(pnlAlterarEquipamento.getCmbSelecionar().getSelectedItem().toString().length() > 0){
                        pnlAlterarEquipamento.limparCampos();
                        pnlAlterarEquipamento.habilitarCampos(true);
                        pnlAlterarEquipamento.preencherCampos();
                    }else{
                        pnlAlterarEquipamento.limparCampos();
                        pnlAlterarEquipamento.habilitarCampos(false);
                    }
                } 
                catch (IOException | ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }            
            }
        }
        //Botao Alterar, altera a Caracteristica selecionada e depois fecha a tab
        if(pnlAlterarEquipamento != null){
            if(origem.equals(pnlAlterarEquipamento.getBtnAlterar())){
                try {
                    System.out.println("Alterando");
                    Alterar.getInstance().alterarEquipamento(telaPrincipal.getJogo(), pnlAlterarEquipamento);
                    String nome = pnlAlterarEquipamento.getEquipamento().getNome();
                    JOptionPane.showMessageDialog(null,"Alterar: " + nome + "\nAlterado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaAlterarEquipamento(telaPrincipal);
                    telaPrincipal.atualizarJComboBox();
                    pnlAlterarEquipamento.limparCampos();
                } catch (EquipamentoInvalidoException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
