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
import opera.exception.HabilidadeInvalidaException;
import opera.view.Controle.Cadastrar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeCadastro.PnlCadastrarHabilidade;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnCadastrarHabilidade extends LPainel implements ActionListener{
    
    private static LPainel lpnCadastrarHabilidade;
    private static PnlCadastrarHabilidade pnlCadastrarHabilidade;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnCadastrarHabilidade() {
        return lpnCadastrarHabilidade;
    }

    public static void setLpnCadastrarHabilidade(LPainel lpnCadastrarHabilidade) {
        LpnCadastrarHabilidade.lpnCadastrarHabilidade = lpnCadastrarHabilidade;
    }

    public static PnlCadastrarHabilidade getPnlCadastrarHabilidade() {
        return pnlCadastrarHabilidade;
    }

    public static void setPnlCadastrarHabilidade(PnlCadastrarHabilidade pnlCadastrarHabilidade) {
        LpnCadastrarHabilidade.pnlCadastrarHabilidade = pnlCadastrarHabilidade;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnCadastrarHabilidade.telaPrincipal = telaPrincipal;
    }

    
    public LpnCadastrarHabilidade(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Habilidade.png"));
        String titulo = "Cadastrar Habilidade";
        pnlCadastrarHabilidade = new PnlCadastrarHabilidade();
        
        lpnCadastrarHabilidade = new LPainel(icone, titulo, pnlCadastrarHabilidade);
        lpnCadastrarHabilidade.adicionarseNaTab(telaPrincipal.getTabbedPane());
        
        iniciarEventos();
    }
    
    private void iniciarEventos(){
        if(pnlCadastrarHabilidade != null){
            pnlCadastrarHabilidade.getBtnCancelar().addActionListener(this);
            pnlCadastrarHabilidade.getBtnCadastrar().addActionListener(this);
            lpnCadastrarHabilidade.getBtnFechar().addActionListener(this);
        }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        
        //   Botao CADASTRAR da TAB Cadastrar Habilidade, Cadastra a Habilidade e depois fecha a aba
        if(pnlCadastrarHabilidade != null){
            if(origem.equals(pnlCadastrarHabilidade.getBtnCadastrar())){
                try {
                    Cadastrar.getInstance().cadastrarHabilidade(telaPrincipal.getJogo(), pnlCadastrarHabilidade);
                    String nome = pnlCadastrarHabilidade.getTxtNome().getText();
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaCadastrarHabilidade(telaPrincipal);
                    telaPrincipal.atualizarJComboBox();
                    JOptionPane.showMessageDialog(null,"Cadastro Habilidade: " + nome +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (HabilidadeInvalidaException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //   Botao CANCELAR e FECHAR da TAB Cadastrar Habilidade, fecha ela mesma
        if(pnlCadastrarHabilidade != null){
            if( (origem.equals(pnlCadastrarHabilidade.getBtnCancelar())) || (origem.equals(lpnCadastrarHabilidade.getBtnFechar())) ){               
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
