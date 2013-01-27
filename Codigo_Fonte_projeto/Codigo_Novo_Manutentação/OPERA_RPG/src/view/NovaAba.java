/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import view.PaineisDeCadastro.PnlCadastrarCaracteristica;
import view.PaineisDeCadastro.PnlCadastrarFicha;
import view.PaineisNovoAbrirDeletarJogo.PnlAbrirJogo;
import view.PaineisNovoAbrirDeletarJogo.PnlNovoJogo;

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
    
    public static void abaCadastrarFicha(PanelTab tabbedPane, ImageIcon icone){
        int index = tabbedPane.indexOfTab("Cadastrar Ficha");
        if(index == -1){
            PnlCadastrarFicha painel = new PnlCadastrarFicha();
            tabbedPane.adicionarPainel(painel, "Cadastrar Ficha", icone);
            index = tabbedPane.indexOfTab("Cadastrar Ficha");
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
    
}
