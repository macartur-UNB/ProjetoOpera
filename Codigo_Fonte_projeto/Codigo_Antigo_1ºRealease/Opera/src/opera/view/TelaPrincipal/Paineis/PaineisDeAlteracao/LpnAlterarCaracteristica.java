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
import opera.exception.CaracteristicaInvalidaException;
import opera.view.Controle.Alterar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeAlteracao.PnlAlterarCaracteristica;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnAlterarCaracteristica extends LPainel implements ActionListener{

    
    private static LPainel lpnAlterarCaracteristica;
    private static PnlAlterarCaracteristica pnlAlterarCaracteristica;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnAlterarCaracteristica() {
        return lpnAlterarCaracteristica;
    }

    public static void setLpnAlterarCaracteristica(LPainel lpnAlterarCaracteristica) {
        LpnAlterarCaracteristica.lpnAlterarCaracteristica = lpnAlterarCaracteristica;
    }

    public static PnlAlterarCaracteristica getPnlAlterarCaracteristica() {
        return pnlAlterarCaracteristica;
    }

    public static void setPnlAlterarCaracteristica(PnlAlterarCaracteristica pnlAlterarCaracteristica) {
        LpnAlterarCaracteristica.pnlAlterarCaracteristica = pnlAlterarCaracteristica;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnAlterarCaracteristica.telaPrincipal = telaPrincipal;
    }
    
    
    public LpnAlterarCaracteristica(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Caracteristica.png"));
        String titulo = "Alterar Caracteristica";
        pnlAlterarCaracteristica = new PnlAlterarCaracteristica(telaPrincipal.getJogo());
        
        lpnAlterarCaracteristica = new LPainel(icone, titulo, pnlAlterarCaracteristica);
        lpnAlterarCaracteristica.adicionarseNaTab(telaPrincipal.getTabbedPane());
        
        iniciarEventos();
    }
    
    private void iniciarEventos(){
        if(pnlAlterarCaracteristica != null){
            pnlAlterarCaracteristica.getBtnAlterar().addActionListener(this);
            lpnAlterarCaracteristica.getBtnFechar().addActionListener(this);
            pnlAlterarCaracteristica.getPnlCadastrarCaracteristica().getBtnCancelar().addActionListener(this);
            pnlAlterarCaracteristica.getCmbSelecionar().addActionListener(this);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        //Botao Cancelar e Fechar, fecha a TAB
        if(pnlAlterarCaracteristica != null){
            if( (origem.equals(pnlAlterarCaracteristica.getPnlCadastrarCaracteristica().getBtnCancelar())) || (origem.equals(lpnAlterarCaracteristica.getBtnFechar())) ){
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        }
        //Caixa de Combinacao, seleciona o objeto a ser alterado
        if(pnlAlterarCaracteristica != null){
            if(origem.equals(pnlAlterarCaracteristica.getCmbSelecionar())){
                try {        
                    if(pnlAlterarCaracteristica.getCmbSelecionar().getSelectedItem().toString().length() > 0){
                        pnlAlterarCaracteristica.limparCampos();
                        pnlAlterarCaracteristica.preencherCampos();
                        pnlAlterarCaracteristica.habilitarCampos(true);
                    }else{
                        pnlAlterarCaracteristica.limparCampos();
                        pnlAlterarCaracteristica.habilitarCampos(false);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
        //Botao Alterar, altera a Caracteristica selecionada e depois fecha a tab
        if(pnlAlterarCaracteristica != null){
            if(origem.equals(pnlAlterarCaracteristica.getBtnAlterar())){
                try {
                    Alterar.getInstance().alterarCaracteristica(telaPrincipal.getJogo(), pnlAlterarCaracteristica);
                    String nome = pnlAlterarCaracteristica.getCaracteristica().getNome();
                    JOptionPane.showMessageDialog(null,"Alterar: " + nome + "\nAlterado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaAlterarCaracteristica(telaPrincipal);
                    telaPrincipal.atualizarJComboBox();
                    pnlAlterarCaracteristica.limparCampos();
                } catch (CaracteristicaInvalidaException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
