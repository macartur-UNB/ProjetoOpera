/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Fichas;
import exception.FichaInvalidaException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Ficha;


public class Controle_Ficha {
    
    private static Controle_Ficha instancia;
    
    public Controle_Ficha() {
    }

    public static Controle_Ficha getInstancia() {
        if(instancia == null){
            instancia = new Controle_Ficha();
        }        
        return instancia;
    }
    
    public void cadJogador(String personagem,String jogador,String campanha,
                           int experiencia,int atributos[],int dinheiro) 
              throws FichaInvalidaException, FileNotFoundException, IOException{
        
        Ficha f = new Ficha(personagem, jogador,"Jogador", campanha,
                            experiencia, atributos, dinheiro);
        if(f!=null){
            DAO_Fichas.gravarFicha(f);
        }
    }
    
    public void cadNPC(String personagem,String campanha,int experiencia,
                       int atributos[],int dinheiro)
              throws FichaInvalidaException, FileNotFoundException, IOException{
        Ficha f = new Ficha(personagem,"","NPC", 
                            campanha, experiencia, 
                            atributos, dinheiro);
        if(f!=null){
            DAO_Fichas.gravarFicha(f);
        }
    }
    
    public void cadMonstro(String personagem,String campanha,int experiencia,
                       int atributos[],int dinheiro)
              throws FichaInvalidaException, FileNotFoundException, IOException{
        Ficha f = new Ficha(personagem,"","Monstro", 
                            campanha, experiencia, 
                            atributos, dinheiro);
        if(f!=null){
            DAO_Fichas.gravarFicha(f);
        }
    }
    
    public Ficha encontrarJogador(String personagem) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        
        return DAO_Fichas.fichaExiste(personagem, "Jogador")?
               DAO_Fichas.carregarFicha(personagem, "Jogador"):null;
    }
    
    public Ficha encontrarNPC(String personagem) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        
        return DAO_Fichas.fichaExiste(personagem, "NPC")?
               DAO_Fichas.carregarFicha(personagem, "NPC"):null;
    }
    
    public Ficha encontrarMostro(String personagem) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        
        return DAO_Fichas.fichaExiste(personagem, "Monstro")?
               DAO_Fichas.carregarFicha(personagem, "Monstro"):null;
    }
    
    public boolean jogadorExiste(String personagem){
        return DAO_Fichas.fichaExiste(personagem, "Jogador");
    }
    
    public boolean NPCExiste(String personagem){
        return DAO_Fichas.fichaExiste(personagem, "NPC");
    }
    
    public boolean MonstroExiste(String personagem){
        return DAO_Fichas.fichaExiste(personagem, "Monstro");
    }
    
    public boolean fichaExiste(String personagem){
        return (jogadorExiste(personagem) ||
                NPCExiste(personagem) ||
                MonstroExiste(personagem))?
                true:false;
    }
    
    public void removerJogador(String personagem){
        if(jogadorExiste(personagem)){
            DAO_Fichas.removerFicha(personagem, "Jogador");
        }
    }
    
    public void removerNPC(String personagem){
        if(NPCExiste(personagem)){
            DAO_Fichas.removerFicha(personagem,"NPC");
        }
    }
    
    public void removerMonstro(String personagem){
        if(NPCExiste(personagem)){
            DAO_Fichas.removerFicha(personagem,"Monstro");
        }
    }
    
    public void removerTodosJogadores(){
        DAO_Fichas.removerTodasFichas("Jogador");
    }
    
    public void removerTodosNPCs(){
        DAO_Fichas.removerTodasFichas("NPC");
    }
    
    public void removerTodosMonstros(){
        DAO_Fichas.removerTodasFichas("Mostro");
    }
    
    public String[] listarJogadores(){
        return DAO_Fichas.listarFichas("Jogador");
    }
    
    public String[] listarNPCs(){
        return DAO_Fichas.listarFichas("NPC");
    }
    public String[] listarMonstros(){
        return DAO_Fichas.listarFichas("Monstro");
    }
    
}
