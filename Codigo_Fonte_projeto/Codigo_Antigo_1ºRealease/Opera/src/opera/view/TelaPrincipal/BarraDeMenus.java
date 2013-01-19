/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Luciano
 */
public class BarraDeMenus extends JMenuBar {
    
    
    private JMenu menuArquivo;
    private JMenuItem itemNovoJogo;
    private JMenuItem itemAbrirJogo;
    private JMenuItem itemDeletar;
    private JMenuItem itemSair;
    private JMenu menuCadastrar;
    private JMenuItem itemNovaFichaRPG;
    private JMenuItem itemNovaHabilidade;
    private JMenuItem itemNovaCaracteristica;
    private JMenuItem itemNovoEquipamento;
    private JMenuItem itemNovoDado;
    
    private JMenu menuAlterar;
    private JMenuItem itemAlterarHabilidade;
    private JMenuItem itemAlterarCaracteristica;
    private JMenuItem itemAlterarEquipamento;
    private JMenuItem itemAlterarFicha;

    
    /**
     * Getters
     */
    public JMenu getMenuArquivo(){
        return menuArquivo;
    }
    public JMenu getMenuCadastrar(){
        return menuCadastrar;
    }
    public JMenu getMenuAlterar(){
        return menuAlterar;
    }
    public JMenuItem getItemAlterarFicha(){
        return itemAlterarFicha;
    }
    public JMenuItem getItemSair(){
        return itemSair;
    }
    public JMenuItem getItemAbrirJogo(){
        return itemAbrirJogo;
    }
    public JMenuItem getItemDeletar(){
        return itemDeletar;
    }
    public JMenuItem getItemNovaFichaRPG(){
        return itemNovaFichaRPG;
    }
    public JMenuItem getItemNovaHabilidade(){
        return itemNovaHabilidade;
    }
    public JMenuItem getItemNovaCaracteristica(){
        return itemNovaCaracteristica;
    }
    public JMenuItem getItemNovoEquipamento(){
        return itemNovoEquipamento;
    }
    public JMenuItem getItemNovoDado(){
        return itemNovoDado;
    }
    public JMenuItem getItemNovoJogo(){
        return itemNovoJogo;
    }

    public JMenuItem getItemAlterarHabilidade() {
        return itemAlterarHabilidade;
    }

    public JMenuItem getItemAlterarCaracteristica() {
        return itemAlterarCaracteristica;
    }

    public JMenuItem getItemAlterarEquipamento() {
        return itemAlterarEquipamento;
    }
    
    
    
    
    public BarraDeMenus(){
        /**
         * Menu Arquivo
         */
        menuArquivo = new JMenu("Arquivo");
        //Menu e itens dentro de menuArquivo
        itemNovoJogo = new JMenuItem("Novo Jogo");
        itemAbrirJogo = new JMenuItem("Abrir Jogo");
        itemDeletar = new JMenuItem("Deletar");
        itemSair = new JMenuItem("Sair");
        itemSair.setToolTipText("Fecha o Programa");
        menuCadastrar = new JMenu("Cadastrar");
        //itens dentro de "menuCadastrar"
        itemNovaFichaRPG = new JMenuItem("Ficha de RPG");
        itemNovaFichaRPG.setToolTipText("Abre uma aba para cadastrar uma nova Ficha de RPG");
        itemNovaHabilidade = new JMenuItem("Habilidade");
        itemNovaHabilidade.setToolTipText("Abre uma aba para cadastrar uma nova Ficha de RPG");
        itemNovaCaracteristica = new JMenuItem("Caracteristica");
        itemNovaCaracteristica.setToolTipText("Abre uma aba para cadastrar uma nova Habilidade");
        itemNovoEquipamento = new JMenuItem("Equipamento");
        itemNovoEquipamento.setToolTipText("Abre uma aba para cadastrar um novo Equipamento");
        itemNovoDado = new JMenuItem("Dado");
        itemNovoDado.setToolTipText("Abre uma aba para cadastrar um novo tipo de Dado");
        
        
        /**
         * Menu Alterar
         */
        menuAlterar = new JMenu("Alterar");
        //Itens dentro de menuAlterar
        itemAlterarFicha = new JMenuItem("Ficha");
        itemAlterarHabilidade = new JMenuItem("Habilidade");
        itemAlterarCaracteristica = new JMenuItem("Caracteristica");
        itemAlterarEquipamento = new JMenuItem("Equipamento");

        
        //Adicionando todos os menus e itens de menuArquivo ao menuArquivo
        menuCadastrar.add(itemNovaFichaRPG);
        menuCadastrar.add(itemNovaHabilidade);
        menuCadastrar.add(itemNovaCaracteristica);
        menuCadastrar.add(itemNovoEquipamento);
        menuCadastrar.add(itemNovoDado);
        menuArquivo.add(itemNovoJogo);
        menuArquivo.add(itemAbrirJogo);
        menuArquivo.add(itemDeletar);
        menuArquivo.add(menuCadastrar);
        menuArquivo.add(itemSair);
        
        //Adicionando todos os menus e itens de menuAlterar ao menuAlterar
        menuAlterar.add(itemAlterarFicha);
        menuAlterar.add(itemAlterarHabilidade);
        menuAlterar.add(itemAlterarCaracteristica);
        menuAlterar.add(itemAlterarEquipamento);
        
        
        this.add(menuArquivo);
        this.add(menuAlterar);
        
        ativarItens();
    }
    
    
    
    private void ativarItens(){
            itemNovoJogo.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Novo Jogo.png")));
            itemAbrirJogo.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Abrir Jogo.png")));
            itemDeletar.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Deletar Jogo.png")));
            itemNovaFichaRPG.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Ficha.png")));
            itemNovaHabilidade.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Habilidade.png")));
            itemNovaCaracteristica.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Caracteristica.png")));
            itemNovoEquipamento.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Equipamento.png")));
            itemNovoDado.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Cadastrar Dado.png")));
            
            itemAlterarFicha.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Ficha.png")));
            itemAlterarHabilidade.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Habilidade.png")));
            itemAlterarCaracteristica.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Caracteristica.png")));
            itemAlterarEquipamento.setIcon(new ImageIcon(getClass().getResource("/opera/view/icones/BarraDeMenu/Alterar Equipamento.png")));
       
    }
    
}
