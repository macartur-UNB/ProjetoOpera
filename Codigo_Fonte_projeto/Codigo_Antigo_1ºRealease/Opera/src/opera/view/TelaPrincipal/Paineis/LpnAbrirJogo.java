/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal.Paineis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import opera.view.PaineisCriarOuAbrirJogo.PnlAbrirJogo;
import opera.view.TelaPrincipal.LPainel;
import opera.view.Controle.RemoverAba;
import opera.view.TelaPrincipal.TelaPrincipal;
import opera.control.ControleJogo;
import opera.exception.CriacaoPastaInvalidaException;
import opera.exception.JogoInvalidoException;
import opera.model.Jogo;

/**
 *
 * @author Luciano
 */
public class LpnAbrirJogo extends LPainel implements ActionListener{

    
    private static LPainel lpnAbrirJogo;
    private static PnlAbrirJogo pnlAbrirJogo;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnAbrirJogo() {
        return lpnAbrirJogo;
    }

    public static void setLpnAbrirJogo(LPainel lpnAbrirJogo) {
        LpnAbrirJogo.lpnAbrirJogo = lpnAbrirJogo;
    }
    
    public static PnlAbrirJogo getPnlAbrirJogo() {
        return pnlAbrirJogo;
    }

    public static void setPnlAbrirJogo(PnlAbrirJogo pnlAbrirJogo) {
        LpnAbrirJogo.pnlAbrirJogo = pnlAbrirJogo;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnAbrirJogo.telaPrincipal = telaPrincipal;
    }

    
    
    
    
    public LpnAbrirJogo(TelaPrincipal telaPrincipal){
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Abrir Jogo.png"));
        String titulo = "Abrir Jogo";
        pnlAbrirJogo = new PnlAbrirJogo();
        
        lpnAbrirJogo = new LPainel(icone, titulo, pnlAbrirJogo);
        this.setTelaPrincipal(telaPrincipal);
        lpnAbrirJogo.adicionarseNaTab(this.getTelaPrincipal().getTabbedPane());
        
        iniciarEventos();
    }
    
    private void iniciarEventos(){
        if(pnlAbrirJogo != null){
            pnlAbrirJogo.getBtnAbrir().addActionListener(this);
            pnlAbrirJogo.getBtnCancelar().addActionListener(this);
            lpnAbrirJogo.getBtnFechar().addActionListener(this);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        // Botoes Cancelar e Fechar, fecham a 
        if( (lpnAbrirJogo != null) && (pnlAbrirJogo != null) ){
            if( (origem.equals(lpnAbrirJogo.getBtnFechar())) || (origem.equals(pnlAbrirJogo.getBtnCancelar())) ){
                RemoverAba.getInstance().remover(this.getTelaPrincipal().getTabbedPane(), this);
            }
        }
        
        // Botao ABRIR da TAB Abrir Jogo, abre um jogo e fecha a tab
        if(pnlAbrirJogo != null){
            if(origem.equals(pnlAbrirJogo.getBtnAbrir())){
                try {
                    String nome = pnlAbrirJogo.getCmbSelecionarJogo().getSelectedItem().toString();
                    Jogo jogo = new Jogo(ControleJogo.getInstance().abrirJogo(nome));
                    this.getTelaPrincipal().setJogo(jogo);
                    this.getTelaPrincipal().setTitle("Opera RPG - " + jogo.getNome());
                    RemoverAba.getInstance().removerTodas(telaPrincipal);
                    this.getTelaPrincipal().habilitarMenus(true);
                    JOptionPane.showMessageDialog(null,"Jogo: " + jogo.getNome() + "\nAberto com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (CriacaoPastaInvalidaException | JogoInvalidoException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
