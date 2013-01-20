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
import opera.exception.FichaInvalidaException;
import opera.view.Controle.Cadastrar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeCadastro.PnlCadastrarFicha;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnCadastrarFicha  extends LPainel implements ActionListener{

    
    private static LPainel lpnCadastrarFicha;
    private static PnlCadastrarFicha pnlCadastrarFicha;
    private static TelaPrincipal telaPrincipal;
    
    
    public static LPainel getLpnCadastrarFicha() {
        return lpnCadastrarFicha;
    }

    public static void setLpnCadastrarFicha(LPainel lpnCadastrarFicha) {
        LpnCadastrarFicha.lpnCadastrarFicha = lpnCadastrarFicha;
    }

    public static PnlCadastrarFicha getPnlCadastrarFicha() {
        return pnlCadastrarFicha;
    }

    public static void setPnlCadastrarFicha(PnlCadastrarFicha pnlCadastrarFicha) {
        LpnCadastrarFicha.pnlCadastrarFicha = pnlCadastrarFicha;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnCadastrarFicha.telaPrincipal = telaPrincipal;
    }
    
    
    
    public LpnCadastrarFicha(TelaPrincipal telaPrincipal){
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Ficha.png"));
        String titulo = "Cadastrar Ficha";
        pnlCadastrarFicha = new PnlCadastrarFicha();
        
        lpnCadastrarFicha = new LPainel(icone, titulo, pnlCadastrarFicha);
        this.setTelaPrincipal(telaPrincipal);
        lpnCadastrarFicha.adicionarseNaTab(this.getTelaPrincipal().getTabbedPane());
        
        iniciarEventos();
    }
    
    public void iniciarEventos(){
        if(pnlCadastrarFicha != null){
            pnlCadastrarFicha.getPnlCadastrarFichaParte02().getBtnCancelar().addActionListener(this);
            pnlCadastrarFicha.getPnlCadastrarFichaParte02().getBtnCadastrar().addActionListener(this);
            lpnCadastrarFicha.getBtnFechar().addActionListener(this);
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        //   Botao CADASTRAR da TAB Cadastrar Ficha, Cadastra a Ficha e depois fecha a aba
        if(pnlCadastrarFicha != null){
            if(origem.equals(pnlCadastrarFicha.getPnlCadastrarFichaParte02().getBtnCadastrar())){
                try {
                    Cadastrar.getInstance().cadastrarFicha(telaPrincipal.getJogo(), pnlCadastrarFicha);
                    String nome = pnlCadastrarFicha.getPnlCadastrarFichaParte01().getTxtNomePersonagem().getText();
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaCadastrarFicha(telaPrincipal);
                    telaPrincipal.atualizarJComboBox();
                    JOptionPane.showMessageDialog(null,"Cadastro Ficha: " + nome +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (FichaInvalidaException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //   Botao CANCELAR e FECHAR da TAB Cadastrar Ficha, fecha ela mesma 
        if(pnlCadastrarFicha != null){
            if( (origem.equals(pnlCadastrarFicha.getPnlCadastrarFichaParte02().getBtnCancelar())) || (origem.equals(lpnCadastrarFicha.getBtnFechar())) ){
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        }    
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
