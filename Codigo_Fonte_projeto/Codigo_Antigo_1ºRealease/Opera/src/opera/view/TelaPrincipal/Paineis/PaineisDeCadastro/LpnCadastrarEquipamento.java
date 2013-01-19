/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal.Paineis.PaineisDeCadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import opera.exception.EquipamentoInvalidoException;
import opera.view.Controle.Cadastrar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeCadastro.PnlCadastrarEquipamento;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnCadastrarEquipamento extends LPainel implements ActionListener{
    
    private static LPainel lpnCadastrarEquipamento;
    private static PnlCadastrarEquipamento pnlCadastrarEquipamento;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnCadastrarEquipamento() {
        return lpnCadastrarEquipamento;
    }

    public static void setLpnCadastrarEquipamento(LPainel lpnCadastrarEquipamento) {
        LpnCadastrarEquipamento.lpnCadastrarEquipamento = lpnCadastrarEquipamento;
    }

    public static PnlCadastrarEquipamento getPnlCadastrarEquipamento() {
        return pnlCadastrarEquipamento;
    }

    public static void setPnlCadastrarEquipamento(PnlCadastrarEquipamento pnlCadastrarEquipamento) {
        LpnCadastrarEquipamento.pnlCadastrarEquipamento = pnlCadastrarEquipamento;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnCadastrarEquipamento.telaPrincipal = telaPrincipal;
    }

    
    
    public LpnCadastrarEquipamento(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Equipamento.png"));
        String titulo = "Cadastrar Equipamento";
        pnlCadastrarEquipamento = new PnlCadastrarEquipamento();
        
        lpnCadastrarEquipamento = new LPainel(icone, titulo, pnlCadastrarEquipamento);
        lpnCadastrarEquipamento.adicionarseNaTab(telaPrincipal.getTabbedPane());
        
        iniciarEventos();
    }
    
    
    private void iniciarEventos(){
        if(pnlCadastrarEquipamento != null){
            pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Geral().getBtnCancelar().addActionListener(this);
            pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Geral().getBtnCadastrar().addActionListener(this);
            
            pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Arma().getBtnCancelar().addActionListener(this);
            pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Arma().getBtnCadastrar().addActionListener(this);
            
            pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Armadura().getBtnCancelar().addActionListener(this);
            pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Armadura().getBtnCadastrar().addActionListener(this);
            
            lpnCadastrarEquipamento.getBtnFechar().addActionListener(this);
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        
        //   Botao CANCELAR e FECHAR de qualquer um dos paineis do "pnlCadastrarEquipamento"
        //fecha a TAB CADASTRAR EQUIPAMENTO
        if(pnlCadastrarEquipamento != null){
            if( (origem.equals(pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Geral().getBtnCancelar())) ||(origem.equals(pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Arma().getBtnCancelar())) || (origem.equals(pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Armadura().getBtnCancelar())) || (origem.equals(lpnCadastrarEquipamento.getBtnFechar())) ){
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        }
        
        /**
         * Botoes do painel CADASTRAR EQUIPAMENTO_GERAL (Caso seja escolhido um item, é cadastrado sem prosseguir)
         */
        if(pnlCadastrarEquipamento != null){
            if(pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Geral().getRdbItem().isSelected()){
                if(origem.equals(pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Geral().getBtnCadastrar())){
                    try {
                        Cadastrar.getInstance().cadastrarEquipamento(telaPrincipal.getJogo(), pnlCadastrarEquipamento);
                        String nome = pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Geral().getTxtNome().getText(); 
                        //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                        //CriarAba.getInstance().criarAbaCadastrarEquipamento(telaPrincipal);
                        pnlCadastrarEquipamento.limparCampos();
                        telaPrincipal.atualizarJComboBox();
                        JOptionPane.showMessageDialog(null,"Cadastro Equipamento: " + nome +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                    } catch (EquipamentoInvalidoException | IOException e) {
                        JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        
        /**
         * Botoes do painel CADASTRAR EQUIPAMENTO_GERAL, EQUIPAMENTO_ARMA e EQUIPAMENTO_ARMADURA
         */
        //   Botoes CADASTRAR da TAB Cadastrar Equipamento, cadastra e depois fecha a aba
        if(pnlCadastrarEquipamento != null){
            if( (origem.equals(pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Arma().getBtnCadastrar())) || (origem .equals(pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Armadura().getBtnCadastrar())) ){
                try {
                    Cadastrar.getInstance().cadastrarEquipamento(telaPrincipal.getJogo(), pnlCadastrarEquipamento);
                    String nome = pnlCadastrarEquipamento.getPnlCadastrarEquipamento_Geral().getTxtNome().getText(); 
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaCadastrarEquipamento(telaPrincipal);
                    pnlCadastrarEquipamento.limparCampos();
                    telaPrincipal.atualizarJComboBox();
                    JOptionPane.showMessageDialog(null,"Cadastro Equipamento: " + nome +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (EquipamentoInvalidoException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
