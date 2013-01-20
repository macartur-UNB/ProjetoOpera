/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UnsupportedLookAndFeelException;
import opera.model.Jogo;
import opera.view.Controle.CriarAba;
import opera.view.Controle.RemoverAba;
import opera.view.TelaPrincipal.Paineis.*;
import opera.view.TelaPrincipal.Paineis.PaineisDeAlteracao.*;
import opera.view.TelaPrincipal.Paineis.PaineisDeCadastro.*;

/**
 *
 * @author Luciano
 */
public class TelaPrincipal extends JFrame implements ActionListener{
    
    private static TelaPrincipal telaPrincipal;
    private Jogo jogo;
    
    private LpnCriarNovoJogo abaCriarNovoJogo;
    private LpnAbrirJogo abaAbrirJogo;
    private LpnDeletar abaDeletar;
    
    private LpnCadastrarFicha abaCadastrarFicha;
    private LpnCadastrarHabilidade abaCadastrarHabilidade;
    private LpnCadastrarCaracteristica abaCadastrarCaracteristica;
    private LpnCadastrarEquipamento abaCadastrarEquipamento;
    private LpnCadastrarDado abaCadastrarDado;
    
    private LpnAlterarFicha abaAlterarFicha;
    private LpnAlterarHabilidade abaAlterarHabilidade;
    private LpnAlterarCaracteristica abaAlterarCaracteristica;
    private LpnAlterarEquipamento abaAlterarEquipamento;
    
    private JTabbedPane tabbedPane;
    private BarraDeMenus barraDeMenus;
    private BarraDeFerramentas barraDeFerramentas;
    private LPainel pnlPrincipal;
    
    private PopupFecharTab popupFecharTab;

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    
    
    public LpnCriarNovoJogo getAbaCriarNovoJogo() {
        return abaCriarNovoJogo;
    }

    public void setAbaCriarNovoJogo(LpnCriarNovoJogo abaCriarNovoJogo) {
        this.abaCriarNovoJogo = abaCriarNovoJogo;
    }

    public LpnAbrirJogo getAbaAbrirJogo() {
        return abaAbrirJogo;
    }

    public void setAbaAbrirJogo(LpnAbrirJogo abaAbrirJogo) {
        this.abaAbrirJogo = abaAbrirJogo;
    }

    public LpnDeletar getAbaDeletar() {
        return abaDeletar;
    }

    public void setAbaDeletar(LpnDeletar abaDeletar) {
        this.abaDeletar = abaDeletar;
    }

    public LpnCadastrarFicha getAbaCadastrarFicha() {
        return abaCadastrarFicha;
    }

    public void setAbaCadastrarFicha(LpnCadastrarFicha abaCadastrarFicha) {
        this.abaCadastrarFicha = abaCadastrarFicha;
    }

    public LpnCadastrarHabilidade getAbaCadastrarHabilidade() {
        return abaCadastrarHabilidade;
    }

    public void setAbaCadastrarHabilidade(LpnCadastrarHabilidade abaCadastrarHabilidade) {
        this.abaCadastrarHabilidade = abaCadastrarHabilidade;
    }

    public LpnCadastrarCaracteristica getAbaCadastrarCaracteristica() {
        return abaCadastrarCaracteristica;
    }

    public void setAbaCadastrarCaracteristica(LpnCadastrarCaracteristica abaCadastrarCaracteristica) {
        this.abaCadastrarCaracteristica = abaCadastrarCaracteristica;
    }

    public LpnCadastrarDado getAbaCadastrarDado() {
        return abaCadastrarDado;
    }

    public void setAbaCadastrarDado(LpnCadastrarDado abaCadastrarDado) {
        this.abaCadastrarDado = abaCadastrarDado;
    }
    
    public LpnCadastrarEquipamento getAbaCadastrarEquipamento() {
        return abaCadastrarEquipamento;
    }

    public void setAbaCadastrarEquipamento(LpnCadastrarEquipamento abaCadastrarEquipamento) {
        this.abaCadastrarEquipamento = abaCadastrarEquipamento;
    }

    public LpnAlterarFicha getAbaAlterarFicha() {
        return abaAlterarFicha;
    }

    public void setAbaAlterarFicha(LpnAlterarFicha abaAlterarFicha) {
        this.abaAlterarFicha = abaAlterarFicha;
    }

    public LpnAlterarHabilidade getAbaAlterarHabilidade() {
        return abaAlterarHabilidade;
    }

    public void setAbaAlterarHabilidade(LpnAlterarHabilidade abaAlterarHabilidade) {
        this.abaAlterarHabilidade = abaAlterarHabilidade;
    }

    public LpnAlterarCaracteristica getAbaAlterarCaracteristica() {
        return abaAlterarCaracteristica;
    }

    public void setAbaAlterarCaracteristica(LpnAlterarCaracteristica abaAlterarCaracteristica) {
        this.abaAlterarCaracteristica = abaAlterarCaracteristica;
    }

    public LpnAlterarEquipamento getAbaAlterarEquipamento() {
        return abaAlterarEquipamento;
    }

    public void setAbaAlterarEquipamento(LpnAlterarEquipamento abaAlterarEquipamento) {
        this.abaAlterarEquipamento = abaAlterarEquipamento;
    }

    
    
    
    
    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }
    
    public void setTabbedPane(JTabbedPane tabbedPane) {
        this.tabbedPane = tabbedPane;
    }
    
    
    
    
    public TelaPrincipal(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Opera RPG");
        
        barraDeMenus = new BarraDeMenus();
        this.setJMenuBar(barraDeMenus);
        
        barraDeFerramentas = new BarraDeFerramentas();
        
        tabbedPane = new JTabbedPane();
        popupFecharTab = new PopupFecharTab();
        tabbedPane.setComponentPopupMenu(popupFecharTab);
        
        
        pnlPrincipal = new LPainel("Principal", barraDeFerramentas, tabbedPane);
        
        this.add(pnlPrincipal);
        
        iniciarEventos();
        
        habilitarMenus(false);
    }
    
    
    private void iniciarEventos(){
        barraDeMenus.getItemNovoJogo().addActionListener(this);
        barraDeFerramentas.getBtnNovoJogo().addActionListener(this);
        
        barraDeMenus.getItemAbrirJogo().addActionListener(this);
        barraDeFerramentas.getBtnAbrirJogo().addActionListener(this);
        
        barraDeMenus.getItemDeletar().addActionListener(this);
        barraDeFerramentas.getBtnDeletar().addActionListener(this);
        
        barraDeMenus.getItemNovaFichaRPG().addActionListener(this);
        barraDeFerramentas.getBtnNovaFicha().addActionListener(this);
        
        barraDeMenus.getItemNovaHabilidade().addActionListener(this);
        barraDeFerramentas.getBtnNovaHabilidade().addActionListener(this);
        
        barraDeMenus.getItemNovaCaracteristica().addActionListener(this);
        barraDeFerramentas.getBtnNovaCaracteristica().addActionListener(this);
        
        barraDeMenus.getItemNovoEquipamento().addActionListener(this);
        barraDeFerramentas.getBtnNovoEquipamento().addActionListener(this);
        
        barraDeMenus.getItemNovoDado().addActionListener(this);
        barraDeFerramentas.getBtnNovoDado().addActionListener(this);
        
        barraDeMenus.getItemAlterarFicha().addActionListener(this);
        barraDeFerramentas.getBtnAlterarFicha().addActionListener(this);
        
        barraDeMenus.getItemAlterarHabilidade().addActionListener(this);
        barraDeFerramentas.getBtnAlterarHabilidade().addActionListener(this);
        
        barraDeMenus.getItemAlterarCaracteristica().addActionListener(this);
        barraDeFerramentas.getBtnAlterarCaracteristica().addActionListener(this);
        
        barraDeMenus.getItemAlterarEquipamento().addActionListener(this);
        barraDeFerramentas.getBtnAlterarEquipamento().addActionListener(this);
        
        barraDeMenus.getItemSair().addActionListener(this);
        
        popupFecharTab.getItemFechar().addActionListener(this);
        popupFecharTab.getItemFecharOutros().addActionListener(this);
        popupFecharTab.getItemFecharTodos().addActionListener(this);
        
    }
    
    //   Faz com que os menus da barra de menus fiquem disponiveis
    //ou indisponiveis (Menu Alterar, Menu Deletar)
    public void habilitarMenus(boolean habilitar){
        barraDeMenus.getMenuCadastrar().setEnabled(habilitar);
        barraDeMenus.getMenuAlterar().setEnabled(habilitar);
        barraDeMenus.getItemDeletar().setEnabled(habilitar);
        habilitarItensBarraDeFerramentas(habilitar);
    }
    //   Faz com que os itens da barra de ferramentas fiquem disponiveis
    //ou indisponiveis
    public void habilitarItensBarraDeFerramentas(boolean habilitar){
        barraDeFerramentas.getBtnDeletar().setEnabled(habilitar);
        barraDeFerramentas.getBtnNovaFicha().setEnabled(habilitar);
        barraDeFerramentas.getBtnNovaHabilidade().setEnabled(habilitar);
        barraDeFerramentas.getBtnNovaCaracteristica().setEnabled(habilitar);
        barraDeFerramentas.getBtnNovoEquipamento().setEnabled(habilitar);
        barraDeFerramentas.getBtnNovoDado().setEnabled(habilitar);
        barraDeFerramentas.getBtnAlterarFicha().setEnabled(habilitar);
        barraDeFerramentas.getBtnAlterarHabilidade().setEnabled(habilitar);
        barraDeFerramentas.getBtnAlterarCaracteristica().setEnabled(habilitar);
        barraDeFerramentas.getBtnAlterarEquipamento().setEnabled(habilitar);
    }
    
    
    public void atualizarJComboBox(){
        if(abaAbrirJogo.getPnlAbrirJogo() != null){
            abaAbrirJogo.getPnlAbrirJogo().atualizarJComboBox();
        }
        if(abaDeletar.getPnlDeletar() != null){
            abaDeletar.getPnlDeletar().atualizarJComboBox();
        }
        if(abaAlterarFicha.getPnlAlterarFicha() != null){
            abaAlterarFicha.getPnlAlterarFicha().atualizarJComboBox();
        }
        if(abaAlterarHabilidade.getPnlAlterarHabilidade() != null){
            abaAlterarHabilidade.getPnlAlterarHabilidade().atualizarJComboBox();
        }
        if(abaAlterarCaracteristica.getPnlAlterarCaracteristica() != null){
            abaAlterarCaracteristica.getPnlAlterarCaracteristica().atualizarJComboBox();
        }
        if(abaAlterarEquipamento.getPnlAlterarEquipamento() != null){
            abaAlterarEquipamento.getPnlAlterarEquipamento().atualizarJComboBox();
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Definindo o tipo de desenho da interface como "NIMBUS"
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
            try {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        
        telaPrincipal = new TelaPrincipal();
        telaPrincipal.setMinimumSize(new Dimension(880, 720));
        telaPrincipal.setMaximumSize(new Dimension(880, 720));
        telaPrincipal.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        //Item Sair do Menu Arquivo
        if(origem.equals(barraDeMenus.getItemSair())){
            System.exit(0);
        }
        
        /*
         * Botoes para Abrir Nova Aba
         */
        // Abrir Aba "Novo Jogo"
        if( (origem.equals(barraDeMenus.getItemNovoJogo())) || (origem.equals(barraDeFerramentas.getBtnNovoJogo())) ){
            CriarAba.getInstance().criarAbaNovoJogo(telaPrincipal);
            
        }
        
        // Abrir Aba "Abrir Jogo"
        if( (origem.equals(barraDeMenus.getItemAbrirJogo())) || (origem.equals(barraDeFerramentas.getBtnAbrirJogo())) ){
            CriarAba.getInstance().criarAbaAbrirJogo(telaPrincipal);
        }
        
        // Abrir Aba "Deletar"
        if( (origem.equals(barraDeMenus.getItemDeletar())) || (origem.equals(barraDeFerramentas.getBtnDeletar())) ){
            CriarAba.getInstance().criarAbaDeletar(telaPrincipal);
        }
        
        // Abrir Aba "Cadastrar Ficha"
        if( (origem.equals(barraDeMenus.getItemNovaFichaRPG())) || (origem.equals(barraDeFerramentas.getBtnNovaFicha())) ){
            CriarAba.getInstance().criarAbaCadastrarFicha(telaPrincipal);
        }
        
        // Abrir Aba "Cadastrar Habilidade"
        if( (origem.equals(barraDeMenus.getItemNovaHabilidade())) || (origem.equals(barraDeFerramentas.getBtnNovaHabilidade())) ){
            CriarAba.getInstance().criarAbaCadastrarHabilidade(telaPrincipal);
        }
        
        // Abrir Aba "Cadastrar Caracteristica"
        if( (origem.equals(barraDeMenus.getItemNovaCaracteristica())) || (origem.equals(barraDeFerramentas.getBtnNovaCaracteristica())) ){
            CriarAba.getInstance().criarAbaCadastrarCaracteristica(telaPrincipal);
        }
        
        // Abrir Aba "Cadastrar Equipamento"
        if( (origem.equals(barraDeMenus.getItemNovoEquipamento())) || (origem.equals(barraDeFerramentas.getBtnNovoEquipamento())) ){
            CriarAba.getInstance().criarAbaCadastrarEquipamento(telaPrincipal);
        }
        
        // Abrir Aba "Cadastrar Dado"
        if( (origem.equals(barraDeMenus.getItemNovoDado())) || (origem.equals(barraDeFerramentas.getBtnNovoDado())) ){
            CriarAba.getInstance().criarAbaCadastrarDado(telaPrincipal);
        }
        
        // Abrir Aba "Alterar Ficha"
        if( (origem.equals(barraDeMenus.getItemAlterarFicha())) || (origem.equals(barraDeFerramentas.getBtnAlterarFicha())) ){
            CriarAba.getInstance().criarAbaAlterarFicha(telaPrincipal);
        }
        
        // Abrir Aba "Alterar Habilidade"
        if( (origem.equals(barraDeMenus.getItemAlterarHabilidade())) || (origem.equals(barraDeFerramentas.getBtnAlterarHabilidade())) ){
            CriarAba.getInstance().criarAbaAlterarHabilidade(telaPrincipal);
        }
        
        // Abrir Aba "Alterar Caracteristica"
        if( (origem.equals(barraDeMenus.getItemAlterarCaracteristica())) || (origem.equals(barraDeFerramentas.getBtnAlterarCaracteristica())) ){
            CriarAba.getInstance().criarAbaAlterarCaracteristica(telaPrincipal);
        }
        
        // Abrir Aba "Alterar Equipamento"
        if( (origem.equals(barraDeMenus.getItemAlterarEquipamento())) || (origem.equals(barraDeFerramentas.getBtnAlterarEquipamento())) ){
            CriarAba.getInstance().criarAbaAlterarEquipamento(telaPrincipal);
        }

        // Fechar Todas as Abas
        if(origem.equals(popupFecharTab.getItemFecharTodos())){
            RemoverAba.getInstance().removerTodas(telaPrincipal);
        }
        
        //Fechar Outras Abas
        if(origem.equals(popupFecharTab.getItemFecharOutros())){
            int index = tabbedPane.getSelectedIndex();
            //System.out.println("index: " + index);
            
            Object objeto = this.getTabbedPane().getComponentAt(index);
            //System.out.println("objeto: " + objeto);

            String titulo = ((LPainel)objeto).getTitulo();
            RemoverAba.getInstance().removerOutras(telaPrincipal, titulo);
        }
        
        // Fechar Aba
        if(origem.equals(popupFecharTab.getItemFechar())){  
            
            //System.out.println("Botao Pressionado");
            
            int index = tabbedPane.getSelectedIndex();
            //System.out.println("index: " + index);
            
            Object objeto = this.getTabbedPane().getComponentAt(index);
            //System.out.println("objeto: " + objeto);

            String titulo = ((LPainel)objeto).getTitulo();
            RemoverAba.getInstance().removerUma(telaPrincipal, titulo);
            
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
