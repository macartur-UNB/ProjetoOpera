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
import opera.exception.DadoInvalidoException;
import opera.view.Controle.Cadastrar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeCadastro.PnlCadastrarDado;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnCadastrarDado extends LPainel implements ActionListener{

    
    private static LPainel lpnCadastrarDado;
    private static PnlCadastrarDado pnlCadastrarDado;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnCadastrarDado() {
        return lpnCadastrarDado;
    }

    public static void setLpnCadastrarDado(LPainel lpnCadastrarDado) {
        LpnCadastrarDado.lpnCadastrarDado = lpnCadastrarDado;
    }

    public static PnlCadastrarDado getPnlCadastrarDado() {
        return pnlCadastrarDado;
    }

    public static void setPnlCadastrarDado(PnlCadastrarDado pnlCadastrarDado) {
        LpnCadastrarDado.pnlCadastrarDado = pnlCadastrarDado;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnCadastrarDado.telaPrincipal = telaPrincipal;
    }

    
    
    public LpnCadastrarDado(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Dado.png"));
        String titulo = "Cadastrar Dado";
        pnlCadastrarDado = new PnlCadastrarDado();
        
        lpnCadastrarDado = new LPainel(icone, titulo, pnlCadastrarDado);
        lpnCadastrarDado.adicionarseNaTab(telaPrincipal.getTabbedPane());
        
        iniciarEventos();
    }
    
    private void iniciarEventos(){
        if(pnlCadastrarDado != null){
            pnlCadastrarDado.getBtnCancelar().addActionListener(this);
            pnlCadastrarDado.getBtnCadastrar().addActionListener(this);
            lpnCadastrarDado.getBtnFechar().addActionListener(this);
        }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        //  Botao CADASTRAR da TAB Cadastrar Dado, cadastra e depois fecha a TAB
        if(pnlCadastrarDado != null){
            if(origem.equals(pnlCadastrarDado.getBtnCadastrar())){
                try {
                    Cadastrar.getInstance().cadastrarDado(telaPrincipal.getJogo(),pnlCadastrarDado);
                    String nome = pnlCadastrarDado.getTxtLados().getText();
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaCadastrarDado(telaPrincipal);
                    pnlCadastrarDado.limparCampos();
                    telaPrincipal.atualizarJComboBox();
                    JOptionPane.showMessageDialog(null,"Cadastro Dado: " + nome +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (DadoInvalidoException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        // Botao CANCELAR e FECHAR da TAB,feca a tab
        if(pnlCadastrarDado != null){
            if( (origem.equals(pnlCadastrarDado.getBtnCancelar())) || (origem.equals(lpnCadastrarDado.getBtnFechar())) ){
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
