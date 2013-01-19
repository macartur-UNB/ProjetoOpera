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
import opera.exception.CriacaoPastaInvalidaException;
import opera.exception.JogoInvalidoException;
import opera.model.Jogo;
import opera.view.Controle.Cadastrar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisCriarOuAbrirJogo.PnlCriarNovoJogo;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;


/**
 *
 * @author Luciano
 */
public class LpnCriarNovoJogo extends LPainel implements ActionListener{

    
    private static LPainel lpnCriarNovoJogo;
    private static PnlCriarNovoJogo pnlCriarNovoJogo;
    private static TelaPrincipal telaPrincipal;

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnCriarNovoJogo.telaPrincipal = telaPrincipal;
    }

    

    public LPainel getLpnCriarNovoJogo() {
        return lpnCriarNovoJogo;
    }

    public void setLpnCriarNovoJogo(LPainel lpnCriarNovoJogo) {
        this.lpnCriarNovoJogo = lpnCriarNovoJogo;
    }

    public PnlCriarNovoJogo getPnlCriarNovoJogo() {
        return pnlCriarNovoJogo;
    }

    public void setPnlCriarNovoJogo(PnlCriarNovoJogo pnlCriarNovoJogo) {
        this.pnlCriarNovoJogo = pnlCriarNovoJogo;
    }
    
    
    
    public LpnCriarNovoJogo(TelaPrincipal telaPrincipal){
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Novo Jogo.png"));
        String titulo = "Criar Novo Jogo";
        pnlCriarNovoJogo = new PnlCriarNovoJogo();
        
        lpnCriarNovoJogo = new LPainel(icone, titulo, pnlCriarNovoJogo);
        this.setTelaPrincipal(telaPrincipal);
        lpnCriarNovoJogo.adicionarseNaTab(this.getTelaPrincipal().getTabbedPane());
        
        iniciarEventos();
    }
    
    private void iniciarEventos(){
        if(pnlCriarNovoJogo != null){
            pnlCriarNovoJogo.getBtnCriar().addActionListener(this);
            pnlCriarNovoJogo.getBtnCancelar().addActionListener(this);
            lpnCriarNovoJogo.getBtnFechar().addActionListener(this);
        }
    }
    
    

    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        //Botoes Cancelar e Fechar, fecham a TAB
        if( (lpnCriarNovoJogo != null) && (pnlCriarNovoJogo != null) ){
            if( (origem.equals(lpnCriarNovoJogo.getBtnFechar())) || (origem.equals(pnlCriarNovoJogo.getBtnCancelar())) ){
                RemoverAba.getInstance().remover(this.getTelaPrincipal().getTabbedPane(), this);
            }
        }
        
        //Botao Cadastrar, cadastra um Novo Jogo e fecha todas as TABs
        if(pnlCriarNovoJogo != null){
            if(origem.equals(pnlCriarNovoJogo.getBtnCriar())){
                try {
                    Cadastrar.getInstance().cadastrarJogo(pnlCriarNovoJogo);
                    Jogo jogo = new Jogo(pnlCriarNovoJogo.getTxtNome().getText());
                    this.getTelaPrincipal().setJogo(jogo);
                    this.getTelaPrincipal().setTitle("Opera RPG - " + jogo.getNome());
                    RemoverAba.getInstance().removerTodas(telaPrincipal);
                    this.getTelaPrincipal().habilitarMenus(true);
                    JOptionPane.showMessageDialog(null,"Jogo: " + jogo.getNome() + "\nCriado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (CriacaoPastaInvalidaException | JogoInvalidoException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
