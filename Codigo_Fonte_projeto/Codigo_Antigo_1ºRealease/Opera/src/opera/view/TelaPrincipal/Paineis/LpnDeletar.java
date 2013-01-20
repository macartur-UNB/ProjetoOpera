/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal.Paineis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import opera.exception.CaracteristicaInvalidaException;
import opera.exception.DeletarInvalidoException;
import opera.exception.EquipamentoInvalidoException;
import opera.exception.FichaInvalidaException;
import opera.exception.HabilidadeInvalidaException;
import opera.exception.JogoInvalidoException;
import opera.view.Controle.Deletar;
import opera.view.Controle.RemoverAba;
import opera.view.PnlDeletar;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnDeletar extends LPainel implements ActionListener{

    
    private static LPainel lpnDeletar;
    private static PnlDeletar pnlDeletar;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnDeletar() {
        return lpnDeletar;
    }

    public static void setLpnDeletar(LPainel lpnDeletar) {
        LpnDeletar.lpnDeletar = lpnDeletar;
    }

    public static PnlDeletar getPnlDeletar() {
        return pnlDeletar;
    }

    public static void setPnlDeletar(PnlDeletar pnlDeletar) {
        LpnDeletar.pnlDeletar = pnlDeletar;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnDeletar.telaPrincipal = telaPrincipal;
    }
    
    
    public LpnDeletar(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Deletar Jogo.png"));
        String titulo = "Deletar";
        pnlDeletar = new PnlDeletar(telaPrincipal.getJogo());
        
        lpnDeletar = new LPainel(icone, titulo, pnlDeletar);
        lpnDeletar.adicionarseNaTab(this.getTelaPrincipal().getTabbedPane());
        
        iniciarEventos();
    }
    
    public void iniciarEventos(){
        if(pnlDeletar != null){
            pnlDeletar.getBtnCancelar().addActionListener(this);
            pnlDeletar.getBtnDeletar().addActionListener(this);
            pnlDeletar.getCmbSelecionar().addActionListener(this);
            lpnDeletar.getBtnFechar().addActionListener(this);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        // Botoes Cancelar e Fechar, fecham a 
        if( (lpnDeletar != null) && (pnlDeletar != null) ){
            if( (origem.equals(lpnDeletar.getBtnFechar())) || (origem.equals(pnlDeletar.getBtnCancelar())) ){
                RemoverAba.getInstance().remover(this.getTelaPrincipal().getTabbedPane(), this);
            }
        }
        
        //Caixa de Combinacao, seleciona o objeto a ser deletado
        if(pnlDeletar != null){
            if(origem.equals(pnlDeletar.getCmbSelecionar())){
                try {
                    pnlDeletar.selecionarObjeto();
                } catch (JogoInvalidoException | IOException | ClassNotFoundException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //Botao Deletar, deleta o que foi selecionado e depois fecha a tab
        if(pnlDeletar != null){
            if(origem.equals(pnlDeletar.getBtnDeletar())){
                try {
                    String nome = pnlDeletar.getCmbSelecionar().getSelectedItem().toString();
                    Deletar.getInstance().deletar(telaPrincipal.getJogo(), pnlDeletar);
                    if(nome.equals(telaPrincipal.getJogo().getNome())){
                        telaPrincipal.habilitarMenus(false);
                        RemoverAba.getInstance().removerTodas(telaPrincipal);
                    }else{
                        //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                        //CriarAba.getInstance().criarAbaDeletar(telaPrincipal);
                        telaPrincipal.atualizarJComboBox();
                    }
                    JOptionPane.showMessageDialog(null,"Deletar: " + nome + "\nDeletado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException | DeletarInvalidoException | FichaInvalidaException | HabilidadeInvalidaException | CaracteristicaInvalidaException | EquipamentoInvalidoException | JogoInvalidoException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
