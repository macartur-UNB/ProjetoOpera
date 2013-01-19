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
import opera.exception.FichaInvalidaException;
import opera.view.Controle.Alterar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeAlteracao.PnlAlterarFicha;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnAlterarFicha extends LPainel implements ActionListener{

    
    private static LPainel lpnAlterarFicha;
    private static PnlAlterarFicha pnlAlterarFicha;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnAlterarFicha() {
        return lpnAlterarFicha;
    }

    public static void setLpnAlterarFicha(LPainel lpnAlterarFicha) {
        LpnAlterarFicha.lpnAlterarFicha = lpnAlterarFicha;
    }

    public static PnlAlterarFicha getPnlAlterarFicha() {
        return pnlAlterarFicha;
    }

    public static void setPnlAlterarFicha(PnlAlterarFicha pnlAlterarFicha) {
        LpnAlterarFicha.pnlAlterarFicha = pnlAlterarFicha;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnAlterarFicha.telaPrincipal = telaPrincipal;
    }
    
    
    
    public LpnAlterarFicha(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Ficha.png"));
        String titulo = "Alterar Ficha";
        pnlAlterarFicha = new PnlAlterarFicha(telaPrincipal.getJogo());
        
        lpnAlterarFicha = new LPainel(icone, titulo, pnlAlterarFicha);
        lpnAlterarFicha.adicionarseNaTab(telaPrincipal.getTabbedPane());
        
        iniciarEventos();
    }
    
    
    private void iniciarEventos(){
        if(pnlAlterarFicha != null){
            pnlAlterarFicha.getPnlCadastrarFichaParte02().getBtnCancelar().addActionListener(this);
            pnlAlterarFicha.getCmbSelecionar().addActionListener(this);
            pnlAlterarFicha.getBtnAlterar().addActionListener(this);
            lpnAlterarFicha.getBtnFechar().addActionListener(this);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        //Botao Cancelar e Fechar, fecha a tab
        if(pnlAlterarFicha != null){
            if( (origem.equals(pnlAlterarFicha.getPnlCadastrarFichaParte02().getBtnCancelar())) || (origem.equals(lpnAlterarFicha.getBtnFechar())) ){
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        }
        //Caixa de Combinacao, seleciona o objeto a ser alterado
        if(pnlAlterarFicha != null){
            if(origem.equals(pnlAlterarFicha.getCmbSelecionar())){
                try {
                    if(pnlAlterarFicha.getCmbSelecionar().getSelectedItem().toString().length() > 0){
                        pnlAlterarFicha.limparCampos();
                        pnlAlterarFicha.preencherCampos();
                    }else{
                        pnlAlterarFicha.limparCampos();
                    }
                } catch (IOException | ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //Botao Alterar, altera a Ficha selecionada e depois fecha a tab
        if(pnlAlterarFicha != null){
            if(origem.equals(pnlAlterarFicha.getBtnAlterar())){
                try {
                    Alterar.getInstance().alterarFicha(telaPrincipal.getJogo(), pnlAlterarFicha);
                    String nome = pnlAlterarFicha.getFicha().getPersonagem();
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaAlterarFicha(telaPrincipal);
                    telaPrincipal.atualizarJComboBox();
                    pnlAlterarFicha.limparCampos();
                    JOptionPane.showMessageDialog(null,"Alterar: " + nome + "\nAlterado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (FichaInvalidaException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
