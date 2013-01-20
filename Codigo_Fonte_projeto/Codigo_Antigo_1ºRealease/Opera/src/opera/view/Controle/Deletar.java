/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.Controle;

import opera.control.ControleCaracteristica;
import opera.control.ControleEquipamento;
import opera.control.ControleHabilidade;
import opera.control.ControleFicha;
import opera.control.ControleJogo;
import opera.exception.DeletarInvalidoException;
import opera.exception.HabilidadeInvalidaException;
import opera.exception.FichaInvalidaException;
import opera.exception.JogoInvalidoException;
import opera.exception.EquipamentoInvalidoException;
import opera.exception.CaracteristicaInvalidaException;
import opera.model.Ficha;
import opera.model.Equipamento_Arma_Fogo;
import opera.model.Caracteristica;
import opera.model.Jogo;
import opera.model.Habilidade;
import opera.model.Dado;
import opera.model.Equipamento_Arma_Branca;
import opera.model.Equipamento_Armadura;
import java.io.IOException;
import opera.view.PnlDeletar;

/**
 *
 * @author Luciano
 */
public class Deletar {
    
    private static Deletar instancia;
    
    public static Deletar getInstance(){
        if(instancia== null){
            instancia = new Deletar();
        }
        return instancia;
    }
    
    private Deletar(){
        
    }
    
    public void deletar(Jogo jogo, PnlDeletar painel) throws FichaInvalidaException, HabilidadeInvalidaException, CaracteristicaInvalidaException, EquipamentoInvalidoException, JogoInvalidoException, DeletarInvalidoException, IOException{
        
        Object objeto = painel.getObjeto();
        
        //System.out.println("Objeto: " + objeto);
        
        if(objeto != null){

            if(objeto instanceof Ficha){
                ControleFicha.getInstance().deletarFicha(jogo, (Ficha) objeto);
            }
            if(objeto instanceof Habilidade){
                ControleHabilidade.getInstance().deletarHabilidade(jogo, (Habilidade) objeto);
            }
            if(objeto instanceof Caracteristica){
                ControleCaracteristica.getInstance().deletarCaracteristica(jogo, (Caracteristica) objeto);
            }
            if(objeto instanceof Equipamento_Arma_Branca){
                ControleEquipamento.getInstance().deletarArmaBranca(jogo, (Equipamento_Arma_Branca) objeto);
            }
            if(objeto instanceof Equipamento_Arma_Fogo){
                ControleEquipamento.getInstance().deletarArmaDeFogo(jogo, (Equipamento_Arma_Fogo) objeto);
            }
            if(objeto instanceof Equipamento_Armadura){
                ControleEquipamento.getInstance().deletarArmadura(jogo, (Equipamento_Armadura) objeto);
            }
            if(objeto instanceof Jogo){
                ControleJogo.getInstance().deletarJogo((Jogo) objeto);
            }
            if(objeto instanceof Dado){

            }
        }else{
            throw new DeletarInvalidoException("Opcao Invalida");
        }
    }
}
