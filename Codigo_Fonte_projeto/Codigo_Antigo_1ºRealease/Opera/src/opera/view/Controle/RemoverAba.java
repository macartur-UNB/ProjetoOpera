/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.Controle;


import javax.swing.JTabbedPane;
import opera.view.TelaPrincipal.LPainel;
import opera.view.TelaPrincipal.Paineis.*;
import opera.view.TelaPrincipal.Paineis.PaineisDeAlteracao.*;
import opera.view.TelaPrincipal.Paineis.PaineisDeCadastro.*;
import opera.view.TelaPrincipal.TelaPrincipal;

/**
 *
 * @author Luciano
 */
public class RemoverAba {
    
    private static RemoverAba instancia;
    
    public static RemoverAba getInstance(){
        if(instancia == null){
            instancia = new RemoverAba();
        }
        return instancia;
    }
    
    private RemoverAba(){
        
    }
    
    public void remover(JTabbedPane tabbedPane, LPainel painel){

        
        if(painel instanceof LpnCriarNovoJogo){
            ((LpnCriarNovoJogo)painel).getLpnCriarNovoJogo().removerseDaTab(tabbedPane);
            ((LpnCriarNovoJogo)painel).setPnlCriarNovoJogo(null);
            ((LpnCriarNovoJogo)painel).setLpnCriarNovoJogo(null);
        }
        if(painel instanceof LpnAbrirJogo){
            ((LpnAbrirJogo)painel).getLpnAbrirJogo().removerseDaTab(tabbedPane);
            ((LpnAbrirJogo)painel).setPnlAbrirJogo(null);
            ((LpnAbrirJogo)painel).setLpnAbrirJogo(null);
        }
        if(painel instanceof LpnDeletar){
            ((LpnDeletar)painel).getLpnDeletar().removerseDaTab(tabbedPane);
            ((LpnDeletar)painel).setPnlDeletar(null);
            ((LpnDeletar)painel).setLpnDeletar(null);
        }
        if(painel instanceof LpnCadastrarFicha){
            ((LpnCadastrarFicha)painel).getLpnCadastrarFicha().removerseDaTab(tabbedPane);
            ((LpnCadastrarFicha)painel).setPnlCadastrarFicha(null);
            ((LpnCadastrarFicha)painel).setLpnCadastrarFicha(null);
        }
        if(painel instanceof LpnCadastrarHabilidade){
            ((LpnCadastrarHabilidade)painel).getLpnCadastrarHabilidade().removerseDaTab(tabbedPane);
            ((LpnCadastrarHabilidade)painel).setPnlCadastrarHabilidade(null);
            ((LpnCadastrarHabilidade)painel).setLpnCadastrarHabilidade(null);
        }
        if(painel instanceof LpnCadastrarCaracteristica){
            ((LpnCadastrarCaracteristica)painel).getLpnCadastrarCaracteristica().removerseDaTab(tabbedPane);
            ((LpnCadastrarCaracteristica)painel).setPnlCadastrarCaracteristica(null);
            ((LpnCadastrarCaracteristica)painel).setLpnCadastrarCaracteristica(null);
        }
        if(painel instanceof LpnCadastrarEquipamento){
            ((LpnCadastrarEquipamento)painel).getLpnCadastrarEquipamento().removerseDaTab(tabbedPane);
            ((LpnCadastrarEquipamento)painel).setPnlCadastrarEquipamento(null);
            ((LpnCadastrarEquipamento)painel).setLpnCadastrarEquipamento(null);
        }
        if(painel instanceof LpnCadastrarDado){
            ((LpnCadastrarDado)painel).getLpnCadastrarDado().removerseDaTab(tabbedPane);
            ((LpnCadastrarDado)painel).setPnlCadastrarDado(null);
            ((LpnCadastrarDado)painel).setLpnCadastrarDado(null);
        }
        if(painel instanceof LpnAlterarFicha){
            ((LpnAlterarFicha)painel).getLpnAlterarFicha().removerseDaTab(tabbedPane);
            ((LpnAlterarFicha)painel).setPnlAlterarFicha(null);
            ((LpnAlterarFicha)painel).setLpnAlterarFicha(null);
        }
        if(painel instanceof LpnAlterarHabilidade){
            ((LpnAlterarHabilidade)painel).getLpnAlterarHabilidade().removerseDaTab(tabbedPane);
            ((LpnAlterarHabilidade)painel).setPnlAlterarHabilidade(null);
            ((LpnAlterarHabilidade)painel).setLpnAlterarHabilidade(null);
        }
        if(painel instanceof LpnAlterarCaracteristica){
            ((LpnAlterarCaracteristica)painel).getLpnAlterarCaracteristica().removerseDaTab(tabbedPane);
            ((LpnAlterarCaracteristica)painel).setPnlAlterarCaracteristica(null);
            ((LpnAlterarCaracteristica)painel).setLpnAlterarCaracteristica(null);
        }
        if(painel instanceof LpnAlterarEquipamento){
            ((LpnAlterarEquipamento)painel).getLpnAlterarEquipamento().removerseDaTab(tabbedPane);
            ((LpnAlterarEquipamento)painel).setPnlAlterarEquipamento(null);
            ((LpnAlterarEquipamento)painel).setLpnAlterarEquipamento(null);
        }
    }
    
    public void removerTodas(TelaPrincipal telaPrincipal){
        if(telaPrincipal.getAbaCriarNovoJogo() != null){
            if(telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo() != null){
                telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaCriarNovoJogo().setPnlCriarNovoJogo(null);
                telaPrincipal.getAbaCriarNovoJogo().setLpnCriarNovoJogo(null);
            }
        }
        if(telaPrincipal.getAbaAbrirJogo() != null){
            if(telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo() != null){
                telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaAbrirJogo().setPnlAbrirJogo(null);
                telaPrincipal.getAbaAbrirJogo().setLpnAbrirJogo(null);
            }
        }
        if(telaPrincipal.getAbaDeletar() != null){
            if(telaPrincipal.getAbaDeletar().getLpnDeletar() != null){
                telaPrincipal.getAbaDeletar().getLpnDeletar().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaDeletar().setPnlDeletar(null);
                telaPrincipal.getAbaDeletar().setLpnDeletar(null);
            }
        }
        if(telaPrincipal.getAbaCadastrarFicha() != null){
            if(telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha() != null){
                telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaCadastrarFicha().setPnlCadastrarFicha(null);
                telaPrincipal.getAbaCadastrarFicha().setLpnCadastrarFicha(null);
            }
        }
        if(telaPrincipal.getAbaCadastrarHabilidade() != null){
            if(telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade() != null){
                telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaCadastrarHabilidade().setPnlCadastrarHabilidade(null);
                telaPrincipal.getAbaCadastrarHabilidade().setLpnCadastrarHabilidade(null);
            }
        }
        if(telaPrincipal.getAbaCadastrarCaracteristica() != null){
            if(telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica() != null){
                telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaCadastrarCaracteristica().setPnlCadastrarCaracteristica(null);
                telaPrincipal.getAbaCadastrarCaracteristica().setLpnCadastrarCaracteristica(null);
            }
        }
        if(telaPrincipal.getAbaCadastrarEquipamento() != null){
            if(telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento() != null){
                telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaCadastrarEquipamento().setPnlCadastrarEquipamento(null);
                telaPrincipal.getAbaCadastrarEquipamento().setLpnCadastrarEquipamento(null);
            }
        }
        if(telaPrincipal.getAbaCadastrarDado() != null){
            if(telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado() != null){
                telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaCadastrarDado().setPnlCadastrarDado(null);
                telaPrincipal.getAbaCadastrarDado().setLpnCadastrarDado(null);
            }
        }
        if(telaPrincipal.getAbaAlterarFicha() != null){
            if(telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha() != null){
                telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaAlterarFicha().setPnlAlterarFicha(null);
                telaPrincipal.getAbaAlterarFicha().setLpnAlterarFicha(null);
            }
        }
        if(telaPrincipal.getAbaAlterarHabilidade() != null){
            if(telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade() != null){
                telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaAlterarHabilidade().setPnlAlterarHabilidade(null);
                telaPrincipal.getAbaAlterarHabilidade().setLpnAlterarHabilidade(null);
            }
        }
        if(telaPrincipal.getAbaAlterarCaracteristica() != null){
            if(telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica() != null){
                telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaAlterarCaracteristica().setPnlAlterarCaracteristica(null);
                telaPrincipal.getAbaAlterarCaracteristica().setLpnAlterarCaracteristica(null);
            }
        }
        if(telaPrincipal.getAbaAlterarEquipamento() != null){
            if(telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento() != null){
                telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento().removerseDaTab(telaPrincipal.getTabbedPane());
                telaPrincipal.getAbaAlterarEquipamento().setPnlAlterarEquipamento(null);
                telaPrincipal.getAbaAlterarEquipamento().setLpnAlterarEquipamento(null);
            }
        }
    }
    
    public void removerOutras(TelaPrincipal telaPrincipal, String titulo){
        
        if(telaPrincipal.getAbaCriarNovoJogo() != null){
            if(telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo() != null){
                if(!titulo.equals(telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo().getTitulo())){
                    telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCriarNovoJogo().setPnlCriarNovoJogo(null);
                    telaPrincipal.getAbaCriarNovoJogo().setLpnCriarNovoJogo(null);
                }
            }
        }
        if(telaPrincipal.getAbaAbrirJogo() != null){
            if(telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo() != null){
                if(!titulo.equals(telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo().getTitulo())){
                    telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAbrirJogo().setPnlAbrirJogo(null);
                    telaPrincipal.getAbaAbrirJogo().setLpnAbrirJogo(null);
                }
            }
        }
        if(telaPrincipal.getAbaDeletar() != null){
            if(telaPrincipal.getAbaDeletar().getLpnDeletar() != null){
                if(!titulo.equals(telaPrincipal.getAbaDeletar().getLpnDeletar().getTitulo())){
                    telaPrincipal.getAbaDeletar().getLpnDeletar().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaDeletar().setPnlDeletar(null);
                    telaPrincipal.getAbaDeletar().setLpnDeletar(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarFicha() != null){
            if(telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha() != null){
                if(!titulo.equals(telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha().getTitulo())){
                    telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarFicha().setPnlCadastrarFicha(null);
                    telaPrincipal.getAbaCadastrarFicha().setLpnCadastrarFicha(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarHabilidade() != null){
            if(telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade() != null){
                if(!titulo.equals(telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade().getTitulo())){
                    telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarHabilidade().setPnlCadastrarHabilidade(null);
                    telaPrincipal.getAbaCadastrarHabilidade().setLpnCadastrarHabilidade(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarCaracteristica() != null){
            if(telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica() != null){
                if(!titulo.equals(telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica().getTitulo())){
                    telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarCaracteristica().setPnlCadastrarCaracteristica(null);
                    telaPrincipal.getAbaCadastrarCaracteristica().setLpnCadastrarCaracteristica(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarEquipamento() != null){
            if(telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento() != null){
                if(!titulo.equals(telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento().getTitulo())){
                    telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarEquipamento().setPnlCadastrarEquipamento(null);
                    telaPrincipal.getAbaCadastrarEquipamento().setLpnCadastrarEquipamento(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarDado() != null){
            if(telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado() != null){
                if(!titulo.equals(telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado().getTitulo())){
                    telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarDado().setPnlCadastrarDado(null);
                    telaPrincipal.getAbaCadastrarDado().setLpnCadastrarDado(null);
                }
            }
        }
        if(telaPrincipal.getAbaAlterarFicha() != null){
            if(telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha() != null){
                if(!titulo.equals(telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha().getTitulo())){
                    telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAlterarFicha().setPnlAlterarFicha(null);
                    telaPrincipal.getAbaAlterarFicha().setLpnAlterarFicha(null);
                }
            }
        }
        if(telaPrincipal.getAbaAlterarHabilidade() != null){
            if(telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade() != null){
                if(!titulo.equals(telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade().getTitulo())){
                    telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAlterarHabilidade().setPnlAlterarHabilidade(null);
                    telaPrincipal.getAbaAlterarHabilidade().setLpnAlterarHabilidade(null);
                }
            }
        }
        if(telaPrincipal.getAbaAlterarCaracteristica() != null){
            if(telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica() != null){
                if(!titulo.equals(telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica().getTitulo())){
                    telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAlterarCaracteristica().setPnlAlterarCaracteristica(null);
                    telaPrincipal.getAbaAlterarCaracteristica().setLpnAlterarCaracteristica(null);
                }
            }
        }
        if(telaPrincipal.getAbaAlterarEquipamento() != null){
            if(telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento() != null){
                if(!titulo.equals(telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento().getTitulo())){
                    telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAlterarEquipamento().setPnlAlterarEquipamento(null);
                    telaPrincipal.getAbaAlterarEquipamento().setLpnAlterarEquipamento(null);
                }
            }
        }
    }
    
    public void removerUma(TelaPrincipal telaPrincipal, String titulo){
        
        if(telaPrincipal.getAbaCriarNovoJogo() != null){
            if(telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo() != null){
                if(titulo.equals(telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo().getTitulo())){
                    telaPrincipal.getAbaCriarNovoJogo().getLpnCriarNovoJogo().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCriarNovoJogo().setPnlCriarNovoJogo(null);
                    telaPrincipal.getAbaCriarNovoJogo().setLpnCriarNovoJogo(null);
                }
            }
        }
        if(telaPrincipal.getAbaAbrirJogo() != null){
            if(telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo() != null){
                if(titulo.equals(telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo().getTitulo())){
                    telaPrincipal.getAbaAbrirJogo().getLpnAbrirJogo().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAbrirJogo().setPnlAbrirJogo(null);
                    telaPrincipal.getAbaAbrirJogo().setLpnAbrirJogo(null);
                }
            }
        }
        if(telaPrincipal.getAbaDeletar() != null){
            if(telaPrincipal.getAbaDeletar().getLpnDeletar() != null){
                if(titulo.equals(telaPrincipal.getAbaDeletar().getLpnDeletar().getTitulo())){
                    telaPrincipal.getAbaDeletar().getLpnDeletar().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaDeletar().setPnlDeletar(null);
                    telaPrincipal.getAbaDeletar().setLpnDeletar(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarFicha() != null){
            if(telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha() != null){
                if(titulo.equals(telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha().getTitulo())){
                    telaPrincipal.getAbaCadastrarFicha().getLpnCadastrarFicha().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarFicha().setPnlCadastrarFicha(null);
                    telaPrincipal.getAbaCadastrarFicha().setLpnCadastrarFicha(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarHabilidade() != null){
            if(telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade() != null){
                if(titulo.equals(telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade().getTitulo())){
                    telaPrincipal.getAbaCadastrarHabilidade().getLpnCadastrarHabilidade().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarHabilidade().setPnlCadastrarHabilidade(null);
                    telaPrincipal.getAbaCadastrarHabilidade().setLpnCadastrarHabilidade(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarCaracteristica() != null){
            if(telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica() != null){
                if(titulo.equals(telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica().getTitulo())){
                    telaPrincipal.getAbaCadastrarCaracteristica().getLpnCadastrarCaracteristica().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarCaracteristica().setPnlCadastrarCaracteristica(null);
                    telaPrincipal.getAbaCadastrarCaracteristica().setLpnCadastrarCaracteristica(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarEquipamento() != null){
            if(telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento() != null){
                if(titulo.equals(telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento().getTitulo())){
                    telaPrincipal.getAbaCadastrarEquipamento().getLpnCadastrarEquipamento().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarEquipamento().setPnlCadastrarEquipamento(null);
                    telaPrincipal.getAbaCadastrarEquipamento().setLpnCadastrarEquipamento(null);
                }
            }
        }
        if(telaPrincipal.getAbaCadastrarDado() != null){
            if(telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado() != null){
                if(titulo.equals(telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado().getTitulo())){
                    telaPrincipal.getAbaCadastrarDado().getLpnCadastrarDado().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaCadastrarDado().setPnlCadastrarDado(null);
                    telaPrincipal.getAbaCadastrarDado().setLpnCadastrarDado(null);
                }
            }
        }
        if(telaPrincipal.getAbaAlterarFicha() != null){
            if(telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha() != null){
                if(titulo.equals(telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha().getTitulo())){
                    telaPrincipal.getAbaAlterarFicha().getLpnAlterarFicha().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAlterarFicha().setPnlAlterarFicha(null);
                    telaPrincipal.getAbaAlterarFicha().setLpnAlterarFicha(null);
                }
            }
        }
        if(telaPrincipal.getAbaAlterarHabilidade() != null){
            if(telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade() != null){
                if(titulo.equals(telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade().getTitulo())){
                    telaPrincipal.getAbaAlterarHabilidade().getLpnAlterarHabilidade().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAlterarHabilidade().setPnlAlterarHabilidade(null);
                    telaPrincipal.getAbaAlterarHabilidade().setLpnAlterarHabilidade(null);
                }
            }
        }
        if(telaPrincipal.getAbaAlterarCaracteristica() != null){
            if(telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica() != null){
                if(titulo.equals(telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica().getTitulo())){
                    telaPrincipal.getAbaAlterarCaracteristica().getLpnAlterarCaracteristica().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAlterarCaracteristica().setPnlAlterarCaracteristica(null);
                    telaPrincipal.getAbaAlterarCaracteristica().setLpnAlterarCaracteristica(null);
                }
            }
        }
        if(telaPrincipal.getAbaAlterarEquipamento() != null){
            if(telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento() != null){
                if(titulo.equals(telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento().getTitulo())){
                    telaPrincipal.getAbaAlterarEquipamento().getLpnAlterarEquipamento().removerseDaTab(telaPrincipal.getTabbedPane());
                    telaPrincipal.getAbaAlterarEquipamento().setPnlAlterarEquipamento(null);
                    telaPrincipal.getAbaAlterarEquipamento().setLpnAlterarEquipamento(null);
                }
            }
        }
    }
}
