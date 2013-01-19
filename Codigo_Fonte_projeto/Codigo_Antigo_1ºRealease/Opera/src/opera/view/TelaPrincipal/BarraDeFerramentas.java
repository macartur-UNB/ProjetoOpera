/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author Luciano
 */
public class BarraDeFerramentas extends JToolBar{
    
    private JButton btnNovoJogo;
    private JButton btnAbrirJogo;
    private JButton btnDeletar;
    
    private JButton btnNovaFicha;
    private JButton btnNovaHabilidade;
    private JButton btnNovaCaracteristica;
    private JButton btnNovoEquipamento;
    private JButton btnNovoDado;
    
    private JButton btnAlterarFicha;
    private JButton btnAlterarHabilidade;
    private JButton btnAlterarCaracteristica;
    private JButton btnAlterarEquipamento;
    

    public JButton getBtnNovoJogo() {
        return btnNovoJogo;
    }

    public void setBtnNovoJogo(JButton btnNovoJogo) {
        this.btnNovoJogo = btnNovoJogo;
    }

    public JButton getBtnAbrirJogo() {
        return btnAbrirJogo;
    }

    public void setBtnAbrirJogo(JButton btnAbrirJogo) {
        this.btnAbrirJogo = btnAbrirJogo;
    }

    public JButton getBtnDeletar() {
        return btnDeletar;
    }

    public void setBtnDeletar(JButton btnDeletar) {
        this.btnDeletar = btnDeletar;
    }

    public JButton getBtnNovaFicha() {
        return btnNovaFicha;
    }

    public void setBtnNovaFicha(JButton btnNovaFicha) {
        this.btnNovaFicha = btnNovaFicha;
    }

    public JButton getBtnNovaHabilidade() {
        return btnNovaHabilidade;
    }

    public void setBtnNovaHabilidade(JButton btnNovaHabilidade) {
        this.btnNovaHabilidade = btnNovaHabilidade;
    }

    public JButton getBtnNovaCaracteristica() {
        return btnNovaCaracteristica;
    }

    public void setBtnNovaCaracteristica(JButton btnNovaCaracteristica) {
        this.btnNovaCaracteristica = btnNovaCaracteristica;
    }

    public JButton getBtnNovoEquipamento() {
        return btnNovoEquipamento;
    }

    public void setBtnNovoEquipamento(JButton btnNovaEquipamento) {
        this.btnNovoEquipamento = btnNovaEquipamento;
    }

    public JButton getBtnNovoDado() {
        return btnNovoDado;
    }

    public void setBtnNovoDado(JButton btnNovaDado) {
        this.btnNovoDado = btnNovaDado;
    }
    
    public JButton getBtnAlterarFicha() {
        return btnAlterarFicha;
    }

    public void setBtnAlterarFicha(JButton btnAlterarFicha) {
        this.btnAlterarFicha = btnAlterarFicha;
    }

    public JButton getBtnAlterarHabilidade() {
        return btnAlterarHabilidade;
    }

    public void setBtnAlterarHabilidade(JButton btnAlterarHabilidade) {
        this.btnAlterarHabilidade = btnAlterarHabilidade;
    }

    public JButton getBtnAlterarCaracteristica() {
        return btnAlterarCaracteristica;
    }

    public void setBtnAlterarCaracteristica(JButton btnAlterarCaracteristica) {
        this.btnAlterarCaracteristica = btnAlterarCaracteristica;
    }

    public JButton getBtnAlterarEquipamento() {
        return btnAlterarEquipamento;
    }

    public void setBtnAlterarEquipamento(JButton btnAlterarEquipament) {
        this.btnAlterarEquipamento = btnAlterarEquipament;
    }
    
    
    
    public BarraDeFerramentas(){
        
        btnNovoJogo = new JButton();
        btnAbrirJogo = new JButton();
        btnDeletar = new JButton();
        
        btnNovaFicha = new JButton();
        btnNovaHabilidade = new JButton();
        btnNovaCaracteristica = new JButton();
        btnNovoEquipamento = new JButton();
        btnNovoDado = new JButton();
        
        btnAlterarFicha = new JButton();
        btnAlterarHabilidade = new JButton();
        btnAlterarCaracteristica = new JButton();
        btnAlterarEquipamento = new JButton();
        
        
        
        btnNovoJogo.setToolTipText("Novo Jogo");
        btnAbrirJogo.setToolTipText("Abrir Jogo");
        btnDeletar.setToolTipText("Deletar");
        
        btnNovaFicha.setToolTipText("Nova Ficha");
        btnNovaHabilidade.setToolTipText("Nova Habilidade");
        btnNovaCaracteristica.setToolTipText("Nova Caracteristica");
        btnNovoEquipamento.setToolTipText("Novo Equipamento");
        btnNovoDado.setToolTipText("Novo Dado");
        
        btnAlterarFicha.setToolTipText("Alterar Ficha");
        btnAlterarHabilidade.setToolTipText("Alterar Habilidade");
        btnAlterarCaracteristica.setToolTipText("Alterar Caracteristica");
        btnAlterarEquipamento.setToolTipText("Alterar Equipamento");
        

        btnNovoJogo.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Novo Jogo.png")));
        btnAbrirJogo.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Abrir Jogo.png")));
        btnDeletar.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Deletar Jogo.png")));
        btnNovaFicha.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Ficha.png")));
        btnNovaHabilidade.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Habilidade.png")));
        btnNovaCaracteristica.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Caracteristica.png")));
        btnNovoEquipamento.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Equipamento.png")));
        btnNovoDado.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Dado.png")));

        btnAlterarFicha.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Ficha.png")));
        btnAlterarHabilidade.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Habilidade.png")));
        btnAlterarCaracteristica.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Caracteristica.png")));
        btnAlterarEquipamento.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Equipamento.png")));

        
        this.add(btnNovoJogo);
        this.add(btnAbrirJogo);
        this.add(btnDeletar);
        
        this.addSeparator();
        
        this.add(btnNovaFicha);
        this.add(btnNovaHabilidade);
        this.add(btnNovaCaracteristica);
        this.add(btnNovoEquipamento);
        this.add(btnNovoDado);
        
        this.addSeparator();
        
        this.add(btnAlterarFicha);
        this.add(btnAlterarHabilidade);
        this.add(btnAlterarCaracteristica);
        this.add(btnAlterarEquipamento);
    }
    
}
