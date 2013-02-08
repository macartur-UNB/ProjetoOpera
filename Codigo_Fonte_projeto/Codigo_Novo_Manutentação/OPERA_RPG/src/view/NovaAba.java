/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import view.PaineisDeAlteracao.*;
import view.PaineisDeCadastro.*;
import view.PaineisDeDeletacao.PnlDeletar;
import view.PaineisNovoAbrirDeletarJogo.*;

/**
 *
 * @author Luciano
 */
public class NovaAba {
    
    public static void abaNovoJogo(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Novo Jogo");
        if(index == -1){
            PnlNovoJogo painel = new PnlNovoJogo();
            tabbedPane.adicionarPainel(painel, "Novo Jogo", icone);
            index = tabbedPane.indexOfTab("Novo Jogo");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaAbrirJogo(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Abrir Jogo");
        if(index == -1){
            PnlAbrirJogo painel = new PnlAbrirJogo();
            tabbedPane.adicionarPainel(painel, "Abrir Jogo", icone);
            index = tabbedPane.indexOfTab("Abrir Jogo");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaDeletarJogo(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Deletar Jogo");
        if(index == -1){
            PnlDeletar painel = new PnlDeletar();
            tabbedPane.adicionarPainel(painel, "Deletar Jogo", icone);
            index = tabbedPane.indexOfTab("Deletar Jogo");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaCadastrarFicha(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Cadastrar Ficha");
        if(index == -1){
            PnlCadastrarFicha painel = new PnlCadastrarFicha();
            tabbedPane.adicionarPainel(painel, "Cadastrar Ficha", icone);
            index = tabbedPane.indexOfTab("Cadastrar Ficha");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaCadastrarHabilidade(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Cadastrar Habilidade");
        if(index == -1){
            PnlCadastrarHabilidade painel = new PnlCadastrarHabilidade();
            tabbedPane.adicionarPainel(painel, "Cadastrar Habilidade", icone);
            index = tabbedPane.indexOfTab("Cadastrar Habilidade");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaCadastrarCaracteristica(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Cadastrar Caracteristica");
        if(index == -1){
            PnlCadastrarCaracteristica painel = new PnlCadastrarCaracteristica();
            tabbedPane.adicionarPainel(painel, "Cadastrar Caracteristica", icone);
            index = tabbedPane.indexOfTab("Cadastrar Caracteristica");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaCadastrarEquipamento(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Cadastrar Equipamento");
        if(index == -1){
            PnlCadastrarItem painel = new PnlCadastrarItem();
            tabbedPane.adicionarPainel(painel, "Cadastrar Equipamento", icone);
            index = tabbedPane.indexOfTab("Cadastrar Equipamento");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaAlterarFicha(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Alterar Ficha");
        if(index == -1){
            PnlAlterarFicha painel = new PnlAlterarFicha();
            tabbedPane.adicionarPainel(painel, "Alterar Ficha", icone);
            index = tabbedPane.indexOfTab("Alterar Ficha");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaAlterarHabilidade(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Alterar Habilidade");
        if(index == -1){
            PnlAlterarHabilidade painel = new PnlAlterarHabilidade();
            tabbedPane.adicionarPainel(painel, "Alterar Habilidade", icone);
            index = tabbedPane.indexOfTab("Alterar Habilidade");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaAlterarCaracteristica(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Alterar Caracteristica");
        if(index == -1){
            PnlAlterarCaracteristica painel = new PnlAlterarCaracteristica();
            tabbedPane.adicionarPainel(painel, "Alterar Caracteristica", icone);
            index = tabbedPane.indexOfTab("Alterar Caracteristica");
        }
        tabbedPane.setSelectedIndex(index);
    }
    
    public static void abaAlterarEquipamento(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Alterar Equipamento");
        if(index == -1){
            PnlAlterarEquipamento painel = new PnlAlterarEquipamento();
            tabbedPane.adicionarPainel(painel, "Alterar Equipamento", icone);
            index = tabbedPane.indexOfTab("Alterar Equipamento");
        }
        tabbedPane.setSelectedIndex(index);
    }
}
