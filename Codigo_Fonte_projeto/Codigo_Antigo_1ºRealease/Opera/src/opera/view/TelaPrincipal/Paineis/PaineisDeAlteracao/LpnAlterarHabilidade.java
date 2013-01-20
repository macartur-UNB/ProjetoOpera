/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal.Paineis.PaineisDeAlteracao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import opera.exception.HabilidadeInvalidaException;
import opera.view.Controle.Alterar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeAlteracao.PnlAlterarHabilidade;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnAlterarHabilidade extends LPainel implements ActionListener{

    
    private static LPainel lpnAlterarHabilidade;
    private static PnlAlterarHabilidade pnlAlterarHabilidade;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnAlterarHabilidade() {
        return lpnAlterarHabilidade;
    }

    public static void setLpnAlterarHabilidade(LPainel lpnAlterarHabilidade) {
        LpnAlterarHabilidade.lpnAlterarHabilidade = lpnAlterarHabilidade;
    }

    public static PnlAlterarHabilidade getPnlAlterarHabilidade() {
        return pnlAlterarHabilidade;
    }

    public static void setPnlAlterarHabilidade(PnlAlterarHabilidade pnlAlterarHabilidade) {
        LpnAlterarHabilidade.pnlAlterarHabilidade = pnlAlterarHabilidade;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnAlterarHabilidade.telaPrincipal = telaPrincipal;
    }

    
    
    public LpnAlterarHabilidade(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Habilidade.png"));
        String titulo = "Alterar Habilidade";
        pnlAlterarHabilidade = new PnlAlterarHabilidade(telaPrincipal.getJogo());
        
        lpnAlterarHabilidade = new LPainel(icone, titulo, pnlAlterarHabilidade);
        lpnAlterarHabilidade.adicionarseNaTab(telaPrincipal.getTabbedPane());
        
        iniciarEventos();
    }
    
    private void iniciarEventos(){
        if(pnlAlterarHabilidade != null){
            pnlAlterarHabilidade.getBtnAlterar().addActionListener(this);
            pnlAlterarHabilidade.getPnlCadastrarHabilidade().getBtnCancelar().addActionListener(this);
            pnlAlterarHabilidade.getCmbSelecionar().addActionListener(this);
            lpnAlterarHabilidade.getBtnFechar().addActionListener(this);
        }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        //Botao Cancelar e Fechar, fecha a TAB
        if(pnlAlterarHabilidade != null){
            if( (origem.equals(pnlAlterarHabilidade.getPnlCadastrarHabilidade().getBtnCancelar())) || (origem.equals(lpnAlterarHabilidade.getBtnFechar())) ){
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        }
        //Caixa de Combinacao, seleciona o objeto a ser alterado
        if(pnlAlterarHabilidade != null){
            if(origem.equals(pnlAlterarHabilidade.getCmbSelecionar())){
                try {
                    if(pnlAlterarHabilidade.getCmbSelecionar().getSelectedItem().toString().length() > 0){
                        pnlAlterarHabilidade.limparCampos();
                        pnlAlterarHabilidade.preencherCampos();
                        pnlAlterarHabilidade.habilitarCampos(true);
                    }else{
                        pnlAlterarHabilidade.limparCampos();
                        pnlAlterarHabilidade.habilitarCampos(false);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //Botao Alterar, altera a Habilidade selecionada e depois fecha a tab
        if(pnlAlterarHabilidade != null){
            if(origem.equals(pnlAlterarHabilidade.getBtnAlterar())){
                try {
                    Alterar.getInstance().alterarHabilidade(telaPrincipal.getJogo(), pnlAlterarHabilidade);
                    String nome = pnlAlterarHabilidade.getHabilidade().getNome();
                    JOptionPane.showMessageDialog(null,"Alterar: " + nome + "\nAlterado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaAlterarHabilidade(telaPrincipal);
                    telaPrincipal.atualizarJComboBox();
                    pnlAlterarHabilidade.limparCampos();
                } catch (HabilidadeInvalidaException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
