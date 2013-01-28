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
        
        System.out.println("*-------TESTE JOGADOR-------*");
        testeJogador();
        System.out.println("*-------FIM TESTE JOGADOR-------*");
        System.out.println("\n\n");
        System.out.println("*-------TESTE MONSTRO-------*");
        testeMonstro();
        System.out.println("*-------FIM TESTE MONSTRO-------*");
        System.out.println("\n\n");
        System.out.println("*-------TESTE NPC-------*");
        testeNpc();
        System.out.println("*-------FIM TESTE NPC-------*");
    }
    
    
    private static void testeNpc(){
        try{
            String nomeJogo = "Testando NPC";
            if(Controle_Jogo.jogoExiste(nomeJogo)){
                Controle_Jogo.abrirJogo(nomeJogo);
            }else{
                Controle_Jogo.criarJogo(nomeJogo);
            }
            
            String personagem = "Vendedor";
            String campanha = "Vender";
            int experiencia = 1000;
            int dinheiro = 100000;

            int atributos[] = new int[8];
            for(int i = 0; i < atributos.length; i++){
                atributos[i] = i;
            }

            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.NPCExiste(personagem));
            
            Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
            
            System.out.println("\nCriando Ficha NPC...");
            System.out.println("Ficha Cadastrada:");
            System.out.println(Controle_Ficha.encontrarNPC(personagem) + "\n");
            
            
            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.NPCExiste(personagem));
            
            System.out.println("Deletando Ficha NPC...");
            Controle_Ficha.removerNPC(personagem);
            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.NPCExiste(personagem));
            
            Controle_Jogo.apagarJogo(nomeJogo);
            
            System.out.println("\nTeste Concluido com SUCESSO!");
            
        } catch(ArquivoInvalidoException | DeletarInvalidoException | IOException |
                DiretorioInvalidoException | ClassNotFoundException | JogoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    private static void testeMonstro(){
        try{
            String nomeJogo = "Testando Monstro";
            if(Controle_Jogo.jogoExiste(nomeJogo)){
                Controle_Jogo.abrirJogo(nomeJogo);
            }else{
                Controle_Jogo.criarJogo(nomeJogo);
            }
            
            String personagem = "Orc";
            String campanha = "Matar";
            int experiencia = 1000;
            int dinheiro = 1000;

            int atributos[] = new int[8];
            for(int i = 0; i < atributos.length; i++){
                atributos[i] = i;
            }

            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.MonstroExiste(personagem));
            
            Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);
            
            System.out.println("\nCriando Ficha Monstro...");
            System.out.println("Ficha Cadastrada:");
            System.out.println(Controle_Ficha.encontrarMonstro(personagem) + "\n");
            
            
            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.MonstroExiste(personagem));
            
            System.out.println("Deletando Ficha Monstro...");
            Controle_Ficha.removerMonstro(personagem);
            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.MonstroExiste(personagem));
            
            Controle_Jogo.apagarJogo(nomeJogo);
            
            System.out.println("\nTeste Concluido com SUCESSO!");
            
        } catch(ArquivoInvalidoException | DeletarInvalidoException | IOException |
                DiretorioInvalidoException | ClassNotFoundException | JogoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
    
    
    private static void testeJogador(){
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
            
            System.out.println("\nCriando Ficha Jogador...");
            System.out.println("Ficha Cadastrada:");
            System.out.println(Controle_Ficha.encontrarJogador(personagem) + "\n");
            
            
            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.JogadorExiste(personagem));
            
            System.out.println("Deletando Ficha Jogador...");
            Controle_Ficha.removerJogador(personagem);
            System.out.println("Ficha " + personagem + " existe? R-)" + 
                    Controle_Ficha.JogadorExiste(personagem));
            
            Controle_Jogo.apagarJogo(nomeJogo);
            
            System.out.println("\nTeste Concluido com SUCESSO!");
            
        } catch(ArquivoInvalidoException | DeletarInvalidoException | IOException |
                DiretorioInvalidoException | ClassNotFoundException | JogoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
