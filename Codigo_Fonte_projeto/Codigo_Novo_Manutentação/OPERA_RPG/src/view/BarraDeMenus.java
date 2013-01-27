/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Luciano
 */
public class BarraDeMenus extends JMenuBar implements ActionListener{
    
    private static PanelTab tabbedPane;
    
    private static JMenu menuArquivo;
    private static JMenuItem itemNovoJogo;
    private static JMenuItem itemAbrirJogo;
    private static JMenuItem itemDeletar;
    private static JMenuItem itemSair;
    private static JMenu menuCadastrar;
    private static JMenuItem itemNovaFichaRPG;
    private static JMenuItem itemNovaHabilidade;
    private static JMenuItem itemNovaCaracteristica;
    private static JMenuItem itemNovoEquipamento;
    
    private static JMenu menuAlterar;
    private static JMenuItem itemAlterarHabilidade;
    private static JMenuItem itemAlterarCaracteristica;
    private static JMenuItem itemAlterarEquipamento;
    private static JMenuItem itemAlterarFicha;
    
    
    public BarraDeMenus(PanelTab tabbedPane){
        this.tabbedPane = tabbedPane;
        
        /**
         * Menu Arquivo
         */
        menuArquivo = new JMenu("Arquivo");
        //Menu e itens dentro de menuArquivo
        itemNovoJogo = new JMenuItem("Novo Jogo");
        itemNovoJogo.setToolTipText("Abre uma aba para criar um novo jogo");
        itemAbrirJogo = new JMenuItem("Abrir Jogo");
        itemAbrirJogo.setToolTipText("Abre uma aba para abrir um jogo");
        itemDeletar = new JMenuItem("Deletar");
        itemDeletar.setToolTipText("Abre uma aba para deletar");
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
        iniciarEventos();
        habilitarMenus(false);
    }
    
    public static boolean existe(){
        boolean existe = false;
        if(tabbedPane != null){
            existe = true;
        }
        return existe;
    }
    
    public static void habilitarMenus(boolean habilitar){
        itemNovaFichaRPG.setEnabled(habilitar);
        itemNovaHabilidade.setEnabled(habilitar);
        itemNovaCaracteristica.setEnabled(habilitar);
        itemNovoEquipamento.setEnabled(habilitar);
        
        itemAlterarHabilidade.setEnabled(habilitar);
        itemAlterarCaracteristica.setEnabled(habilitar);
        itemAlterarEquipamento.setEnabled(habilitar);
        itemAlterarFicha.setEnabled(habilitar);
    }
    
    private void ativarItens(){
            itemNovoJogo.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Novo Jogo.png")));
            itemAbrirJogo.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Abrir Jogo.png")));
            itemDeletar.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Deletar Jogo.png")));
            itemNovaFichaRPG.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Cadastrar Ficha.png")));
            itemNovaHabilidade.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Cadastrar Habilidade.png")));
            itemNovaCaracteristica.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Cadastrar Caracteristica.png")));
            itemNovoEquipamento.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Cadastrar Equipamento.png")));
            
            itemAlterarFicha.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Alterar Ficha.png")));
            itemAlterarHabilidade.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Alterar Habilidade.png")));
            itemAlterarCaracteristica.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Alterar Caracteristica.png")));
            itemAlterarEquipamento.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Alterar Equipamento.png")));
       
    }
    
    
    private void iniciarEventos(){

        itemNovoJogo.addActionListener(this);
        itemAbrirJogo.addActionListener(this);
        itemDeletar.addActionListener(this);
        itemSair.addActionListener(this);
        
        itemNovaFichaRPG.addActionListener(this);
        itemNovaHabilidade.addActionListener(this);
        itemNovaCaracteristica.addActionListener(this);
        itemNovoEquipamento.addActionListener(this);

        itemAlterarHabilidade.addActionListener(this);
        itemAlterarCaracteristica.addActionListener(this);
        itemAlterarEquipamento.addActionListener(this);
        itemAlterarFicha.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        if(origem.equals(itemNovoJogo)){
            NovaAba.abaNovoJogo(tabbedPane, (ImageIcon)itemNovoJogo.getIcon());
        }
        
        if(origem.equals(itemAbrirJogo)){
            NovaAba.abaAbrirJogo(tabbedPane, (ImageIcon)itemAbrirJogo.getIcon());
        }
        
        if(origem.equals(itemDeletar)){
            
        }
        
        if(origem.equals(itemSair)){
            System.exit(0);
        }
        
        if(origem.equals(itemNovaFichaRPG)){
            NovaAba.abaCadastrarFicha(tabbedPane, (ImageIcon)itemNovaFichaRPG.getIcon());
        }
        
        if(origem.equals(itemNovaHabilidade)){
            NovaAba.abaCadastrarHabilidade(tabbedPane, (ImageIcon)itemNovaHabilidade.getIcon());
        }
        
        if(origem.equals(itemNovaCaracteristica)){
            NovaAba.abaCadastrarCaracteristica(tabbedPane, (ImageIcon)itemNovaCaracteristica.getIcon());
        }
        
        if(origem.equals(itemNovoEquipamento)){
            
        }
        
        if(origem.equals(itemAlterarHabilidade)){
            
        }
        
        if(origem.equals(itemAlterarCaracteristica)){
            
        }
        
        if(origem.equals(itemAlterarEquipamento)){
            
        }
        
        if(origem.equals(itemAlterarFicha)){
            
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
