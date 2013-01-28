/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import control.Controle_Ficha;
import control.Controle_Jogo;
import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import exception.DiretorioInvalidoException;
import exception.JogoInvalidoException;
import java.io.IOException;


/**
 *
 * @author Luciano
 */
public class TesteFicha {
    
    
    public static void main(String args[]){
        
        testeJogador();
        
    }
    
    
    
    public static void testeJogador(){
        try{
            String nomeJogo = "Testando Ficha";
            if(Controle_Jogo.jogoExiste(nomeJogo)){
                Controle_Jogo.abrirJogo(nomeJogo);
            }else{
                Controle_Jogo.criarJogo(nomeJogo);
            }
            
            String jogador = "Luciano";
            String personagem = "NtWarrior";
            String campanha = "Vencer";
            int experiencia = 1000;
            int dinheiro = 1000;

            int atributos[] = new int[8];
            for(int i = 0; i < atributos.length; i++){
                atributos[i] = i;
            }

            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.JogadorExiste(personagem));
            
            Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
            
            
            System.out.println("\nFicha Cadastrada:");
            System.out.println(Controle_Ficha.encontrarJogador(personagem) + "\n");
            
            
            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.JogadorExiste(personagem));
            
            Controle_Ficha.removerJogador(personagem);
            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.JogadorExiste(personagem));
            
            
        } catch(ArquivoInvalidoException | DeletarInvalidoException | IOException |
                DiretorioInvalidoException | ClassNotFoundException | JogoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
