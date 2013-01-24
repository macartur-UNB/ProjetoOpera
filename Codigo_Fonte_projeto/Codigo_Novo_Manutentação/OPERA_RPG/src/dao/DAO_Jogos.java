/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.Jogo;

/**
 *
 * @author Macartur
 */
public class DAO_Jogos {
    
    
    private static final String ENDERECO = "C:\\Opera\\Jogos\\";
    
    private static String ENDERECO_JOGO_RODANDO;   
    
    
    public static void criarDiretorioJogo(Jogo jogo){
         DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome());
    }    
    
    public static void removerArquivosJogo(Jogo jogo){
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome());
    }
    public static void removerDiretorioJogo(Jogo jogo){
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome());
    }
    
    public static void criarDiretorioFichas(Jogo jogo ){
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Fichas");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\Jogador");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\NPC");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\Monstro");
    }

    public static void removerArquivosFichas(Jogo jogo){
       DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Fichas\\Jogador");
       DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Fichas\\NPC");
       DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Fichas\\Monstro");
       DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Fichas");
    }

    public static void removerDiretorioFichas(Jogo jogo){
       DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\Jogador");
       DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\NPC");
       DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\Monstro");
       DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Fichas");
    }


    public static void criarDiretorioHabilidades(Jogo jogo){
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Fisica");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Psiquica");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Belica");
    }
    public static void removerArquivosHabilidades(Jogo jogo){
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Habilidades\\Fisica");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Habilidades\\Psiquica");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Habilidades\\Belica");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Habilidades");
    }

    public static void removerDiretorioHabilidades(Jogo jogo){
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Fisica");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Psiquica");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Belica");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades");
    }
    
    
    public static void criarDiretorioCaracteristicas(Jogo jogo){
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Fisica");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Psiquica");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Racial");
    }
    
    public static void removerArquivosCaracteristicas(Jogo jogo){
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Fisica");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Psiquica");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Racial");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Caracteristicas");
    }
    
    public static void removerDiretorioCaracteristicas(Jogo jogo){
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Fisica");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Psiquica");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Racial");  
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas");
    }
    
    public static void criarDiretorioItens(Jogo jogo){
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Generico");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_A_Distancia");
        DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armaduras");
    }
    
    public static void removerArquivosItens(Jogo jogo){
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Generico");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_A_Distancia");
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Armaduras");
    }
    public static void removerDiretoriosItens(Jogo jogo){
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Generico");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_A_Distancia");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armaduras");
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens");
    }
    
    
    public static void criarDiretorioDados(Jogo jogo){
         DAO_Funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Dados");
    }
   
    public static void removerArquivosDados(Jogo jogo){
        DAO_Funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Dados");
    }
    public static void removerDiretorioDados(Jogo jogo){
        DAO_Funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Dados");
    }
    
    public static void criarDiretoriosJogo(Jogo jogo){ 
        if(!DAO_Funcoes.diretorioExiste(ENDERECO+jogo.getNome())){
           criarDiretorioJogo(jogo);
           criarDiretorioCaracteristicas(jogo);
           criarDiretorioDados(jogo);
           criarDiretorioFichas(jogo);
           criarDiretorioHabilidades(jogo);          
           criarDiretorioItens(jogo);
        }        
    }
   
    
    
    public static boolean deletarJogo(Jogo jogo){
        String endereco_jogo= ENDERECO+jogo.getNome();
        boolean status = false; 
        if(DAO_Funcoes.diretorioExiste(endereco_jogo)){
            status  = true;
            removerArquivosItens(jogo);
            removerDiretoriosItens(jogo);
            removerArquivosCaracteristicas(jogo);
            removerDiretorioCaracteristicas(jogo);
            removerArquivosDados(jogo);
            removerDiretorioDados(jogo);
            removerArquivosFichas(jogo);
            removerDiretorioFichas(jogo);
            removerArquivosHabilidades(jogo);
            removerDiretorioHabilidades(jogo);
            removerArquivosJogo(jogo);
            removerDiretorioJogo(jogo);
        }            
        return status;
    }
  
    public static void verificarDiretorioRaiz(){
        if(!DAO_Funcoes.diretorioExiste(ENDERECO)){
            DAO_Funcoes.criarDiretorio("C:\\Opera");
            DAO_Funcoes.criarDiretorio(ENDERECO);
        }
    }
    
    public static void gravarJogo(Jogo jogo) throws FileNotFoundException, IOException{
        DAO_Funcoes.criarArquivo(ENDERECO+jogo.getNome(),jogo.getNome(), jogo);
    }
    public static Jogo carregarJogo(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
        ENDERECO_JOGO_RODANDO = ENDERECO + nome;
        return  (Jogo) DAO_Funcoes.carregarArquivo(ENDERECO+nome, nome);
    }    
    
    public static String endereco_JogoRodando(){
        return ENDERECO_JOGO_RODANDO;
    }
    
     public static String[] jogosExistentes(){
        return DAO_Funcoes.listarDiretorios(ENDERECO);        
    }
     
    public static boolean jogoExiste(String nome){
        return DAO_Funcoes.diretorioExiste(ENDERECO+nome);
    }     
    
    
}
