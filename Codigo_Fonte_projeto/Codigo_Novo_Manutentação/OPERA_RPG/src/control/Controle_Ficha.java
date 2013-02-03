/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.dao.DAO_Ficha;
import model.dao.DAO_Habilidade;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Ficha;


public class Controle_Ficha {
    
    
    
    public static void cadJogador(String personagem,String jogador,
            String campanha,int experiencia,int atributos[],int dinheiro)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        Ficha f = new Ficha(personagem, jogador,"Jogador", campanha, experiencia, atributos, dinheiro);
        DAO_Ficha.gravarFicha(f);
    }
    public static void cadNPC(String personagem, String campanha,int experiencia,
            int atributos[],int dinheiro) throws FileNotFoundException, IOException, ArquivoInvalidoException{
        Ficha f = new Ficha(personagem,"jogado pelo mestre","NPC", campanha, experiencia, atributos, dinheiro);
        DAO_Ficha.gravarFicha(f);
    }
    public static void cadMonstro(String personagem,String campanha,
            int experiencia,int atributos[],int dinheiro)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        Ficha f = new Ficha(personagem,"jogado pelo mestre","Monstro", campanha, experiencia, atributos, dinheiro);
        DAO_Ficha.gravarFicha(f);
    }
    public static Ficha encontrarJogador(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
            return DAO_Ficha.carregarFicha(nome, "Jogador");
    }    
    public static Ficha encontrarNPC(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
            return DAO_Ficha.carregarFicha(nome, "NPC");
    } 
    public static Ficha encontrarMonstro(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
            return DAO_Ficha.carregarFicha(nome, "Monstro");
    } 
    public static boolean JogadorExiste(String personagem){
        return DAO_Ficha.fichaExiste(personagem,"Jogador");
    }
    public static boolean NPCExiste(String nome){
        return DAO_Ficha.fichaExiste(nome,"NPC");
    }
    public static boolean MonstroExiste(String nome){
        return DAO_Ficha.fichaExiste(nome,"Monstro");
    }
    
    public static boolean FichaExiste(String nome){
        boolean status = false;
        if(JogadorExiste(nome)||NPCExiste(nome)||MonstroExiste(nome)){
            status = true;
        }
        return status;
    }
    
    public static void removerJogador(String personagem) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerFicha(personagem, "Jogador");
    }
    public static void removerNPC(String personagem) throws ArquivoInvalidoException, DeletarInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerFicha(personagem, "NPC");
    }
    public static void removerMonstro(String personagem) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerFicha(personagem, "Monstro");
    }
    public static void removeTodasFichasJogador() throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Habilidade.removerTodasHabilidades("Jogador");
    }
    
    public static void removeTodasFichasNPC() throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Habilidade.removerTodasHabilidades("Monstro");
    }
    
    public static void removeTodasFichasMonstro() throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Habilidade.removerTodasHabilidades("Monstro");
    }   
    
    public static void removeTodasHabilidades() throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        removeTodasFichasJogador();
        removeTodasFichasNPC();
        removeTodasFichasMonstro();
    }
    
    public static String[] listarFichasJogador(){
       return DAO_Ficha.listarFichas("Jogador"); 
    }
    
    public static String[] listarFichasNPC(){
        return DAO_Ficha.listarFichas("NPC");
    }
    
    public static String[] listarFichasMonstro(){
        return DAO_Ficha.listarFichas("Monstro");
    }   
}
