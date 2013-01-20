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
import opera.exception.CaracteristicaInvalidaException;
import opera.view.Controle.Cadastrar;
import opera.view.Controle.RemoverAba;
import opera.view.PaineisDeCadastro.PnlCadastrarCaracteristica;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class LpnCadastrarCaracteristica extends LPainel implements ActionListener{
    
    private static LPainel lpnCadastrarCaracteristica;
    private static PnlCadastrarCaracteristica pnlCadastrarCaracteristica;
    private static TelaPrincipal telaPrincipal;

    public static LPainel getLpnCadastrarCaracteristica() {
        return lpnCadastrarCaracteristica;
    }

    public static void setLpnCadastrarCaracteristica(LPainel lpnCadastrarCaracteristica) {
        LpnCadastrarCaracteristica.lpnCadastrarCaracteristica = lpnCadastrarCaracteristica;
    }

    public static PnlCadastrarCaracteristica getPnlCadastrarCaracteristica() {
        return pnlCadastrarCaracteristica;
    }

    public static void setPnlCadastrarCaracteristica(PnlCadastrarCaracteristica pnlCadastrarCaracteristica) {
        LpnCadastrarCaracteristica.pnlCadastrarCaracteristica = pnlCadastrarCaracteristica;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        LpnCadastrarCaracteristica.telaPrincipal = telaPrincipal;
    }

    
    
    public LpnCadastrarCaracteristica(TelaPrincipal telaPrincipal){
        this.setTelaPrincipal(telaPrincipal);
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Caracteristica.png"));
        String titulo = "Cadastrar Caracteristica";
        pnlCadastrarCaracteristica = new PnlCadastrarCaracteristica();
        
        lpnCadastrarCaracteristica = new LPainel(icone, titulo, pnlCadastrarCaracteristica);
        lpnCadastrarCaracteristica.adicionarseNaTab(telaPrincipal.getTabbedPane());
        
        iniciarEventos();
    }
    
    
    private void iniciarEventos(){
        if(pnlCadastrarCaracteristica != null){
            pnlCadastrarCaracteristica.getBtnCancelar().addActionListener(this);
            pnlCadastrarCaracteristica.getBtnCadastrar().addActionListener(this);
            lpnCadastrarCaracteristica.getBtnFechar().addActionListener(this);
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        //   Botao CADASTRAR da TAB Cadastrar Caracteristica, Cadastra e depois fecha a aba
        if(pnlCadastrarCaracteristica != null){
            if(origem.equals(pnlCadastrarCaracteristica.getBtnCadastrar())){
                try {
                    Cadastrar.getInstance().cadastrarCaracteristica(telaPrincipal.getJogo(), pnlCadastrarCaracteristica);
                    String nome = pnlCadastrarCaracteristica.getTxtNome().getText();
                    //RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
                    //CriarAba.getInstance().criarAbaCadastrarCaracteristica(telaPrincipal);
                    pnlCadastrarCaracteristica.limparCampos();
                    telaPrincipal.atualizarJComboBox();
                    JOptionPane.showMessageDialog(null,"Cadastro Caracteristica: " + nome +"\nRealizado com Sucesso!","Concluido",JOptionPane.INFORMATION_MESSAGE);
                } catch (CaracteristicaInvalidaException | IOException e) {
                    JOptionPane.showMessageDialog(null,"ERROR: " + e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //   Botao CANCELAR e FECHAR da TAB Cadastrar Caracteristica, fecha ela mesma 
        if(pnlCadastrarCaracteristica != null){
            if( (origem.equals(pnlCadastrarCaracteristica.getBtnCancelar())) || (origem.equals(lpnCadastrarCaracteristica.getBtnFechar())) ){
                //System.out.println("Botao Pressionado");
                RemoverAba.getInstance().remover(telaPrincipal.getTabbedPane(), this);
            }
        } 
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
