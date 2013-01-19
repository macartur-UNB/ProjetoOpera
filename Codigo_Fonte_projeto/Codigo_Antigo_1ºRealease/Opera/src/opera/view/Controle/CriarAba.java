/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.Controle;


import opera.view.TelaPrincipal.Paineis.*;
import opera.view.TelaPrincipal.Paineis.PaineisDeAlteracao.*;
import opera.view.TelaPrincipal.Paineis.PaineisDeCadastro.*;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class CriarAba {
    
    private static CriarAba instancia;
    
    public static CriarAba getInstance(){
        if(instancia == null){
            instancia = new CriarAba();
        }
        return instancia;
    }
    
    private CriarAba(){
        
    }
    
    
    
    public void criarAbaNovoJogo(TelaPrincipal telaPrincipal){
        if(telaPrincipal.getAbaCriarNovoJogo() == null){
            LpnCriarNovoJogo painel = new LpnCriarNovoJogo(telaPrincipal);
            telaPrincipal.setAbaCriarNovoJogo(painel);
        }else{
            if(telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo() == null){
                LpnCriarNovoJogo painel = new LpnCriarNovoJogo(telaPrincipal);
                telaPrincipal.setAbaCriarNovoJogo(painel);
            }else{
                telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    
    public void criarAbaAbrirJogo(TelaPrincipal telaPrincipal){
        if(telaPrincipal.getAbaAbrirJogo() == null){
            LpnAbrirJogo painel = new LpnAbrirJogo(telaPrincipal);
            telaPrincipal.setAbaAbrirJogo(painel);
        }else{
            if(telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo() == null){
                LpnAbrirJogo painel = new LpnAbrirJogo(telaPrincipal);
                telaPrincipal.setAbaAbrirJogo(painel);
            }else{
                telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    
    public void criarAbaDeletar(TelaPrincipal telaPrincipal){
        if(telaPrincipal.getAbaDeletar() == null){
            LpnDeletar painel = new LpnDeletar(telaPrincipal);
            telaPrincipal.setAbaDeletar(painel);
        }else{
            if(telaPrincipal.getAbaDeletar().getLpnDeletar() == null){
                LpnDeletar painel = new LpnDeletar(telaPrincipal);
                telaPrincipal.setAbaDeletar(painel);
            }else{
                telaPrincipal.getAbaDeletar().getLpnDeletar().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }

    public void criarAbaCadastrarFicha(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaCadastrarFicha() == null){
            LpnCadastrarFicha painel = new LpnCadastrarFicha(telaPrincipal);
            telaPrincipal.setAbaCadastrarFicha(painel);
        }else{
            if(telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha() == null){
                LpnCadastrarFicha painel = new LpnCadastrarFicha(telaPrincipal);
                telaPrincipal.setAbaCadastrarFicha(painel);
            }else{
                telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    public void criarAbaCadastrarHabilidade(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaCadastrarHabilidade() == null){
            LpnCadastrarHabilidade painel = new LpnCadastrarHabilidade(telaPrincipal);
            telaPrincipal.setAbaCadastrarHabilidade(painel);
        }else{
            if(telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade() == null){
                LpnCadastrarHabilidade painel = new LpnCadastrarHabilidade(telaPrincipal);
                telaPrincipal.setAbaCadastrarHabilidade(painel);
            }else{
                telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    public void criarAbaCadastrarCaracteristica(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaCadastrarCaracteristica() == null){
            LpnCadastrarCaracteristica painel = new LpnCadastrarCaracteristica(telaPrincipal);
            telaPrincipal.setAbaCadastrarCaracteristica(painel);
        }else{
            if(telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica() == null){
                LpnCadastrarCaracteristica painel = new LpnCadastrarCaracteristica(telaPrincipal);
                telaPrincipal.setAbaCadastrarCaracteristica(painel);
            }else{
                telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    public void criarAbaCadastrarEquipamento(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaCadastrarEquipamento() == null){
            LpnCadastrarEquipamento painel = new LpnCadastrarEquipamento(telaPrincipal);
            telaPrincipal.setAbaCadastrarEquipamento(painel);
        }else{
            if(telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento() == null){
                LpnCadastrarEquipamento painel = new LpnCadastrarEquipamento(telaPrincipal);
                telaPrincipal.setAbaCadastrarEquipamento(painel);
            }else{
                telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    public void criarAbaCadastrarDado(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaCadastrarDado() == null){
            LpnCadastrarDado painel = new LpnCadastrarDado(telaPrincipal);
            telaPrincipal.setAbaCadastrarDado(painel);
        }else{
            if(telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado() == null){
                LpnCadastrarDado painel = new LpnCadastrarDado(telaPrincipal);
                telaPrincipal.setAbaCadastrarDado(painel);
            }else{
                telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    public void criarAbaAlterarFicha(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaAlterarFicha() == null){
            LpnAlterarFicha painel = new LpnAlterarFicha(telaPrincipal);
            telaPrincipal.setAbaAlterarFicha(painel);
        }else{
            if(telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha() == null){
                LpnAlterarFicha painel = new LpnAlterarFicha(telaPrincipal);
                telaPrincipal.setAbaAlterarFicha(painel);
            }else{
                telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    public void criarAbaAlterarHabilidade(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaAlterarHabilidade() == null){
            LpnAlterarHabilidade painel = new LpnAlterarHabilidade(telaPrincipal);
            telaPrincipal.setAbaAlterarHabilidade(painel);
        }else{
            if(telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade() == null){
                LpnAlterarHabilidade painel = new LpnAlterarHabilidade(telaPrincipal);
                telaPrincipal.setAbaAlterarHabilidade(painel);
            }else{
                telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    public void criarAbaAlterarCaracteristica(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaAlterarCaracteristica() == null){
            LpnAlterarCaracteristica painel = new LpnAlterarCaracteristica(telaPrincipal);
            telaPrincipal.setAbaAlterarCaracteristica(painel);
        }else{
            if(telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica() == null){
                LpnAlterarCaracteristica painel = new LpnAlterarCaracteristica(telaPrincipal);
                telaPrincipal.setAbaAlterarCaracteristica(painel);
            }else{
                telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
    public void criarAbaAlterarEquipamento(TelaPrincipal telaPrincipal) {
        if(telaPrincipal.getAbaAlterarEquipamento() == null){
            LpnAlterarEquipamento painel = new LpnAlterarEquipamento(telaPrincipal);
            telaPrincipal.setAbaAlterarEquipamento(painel);
        }else{
            if(telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento() == null){
                LpnAlterarEquipamento painel = new LpnAlterarEquipamento(telaPrincipal);
                telaPrincipal.setAbaAlterarEquipamento(painel);
            }else{
                telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento().selecionarseNaTab(telaPrincipal.getTabbedPane());
            }
        }
    }
    
}
