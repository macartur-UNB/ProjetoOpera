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
public class DAO_JOGO {
    
    
    private final String ENDERECO = "C:\\Opera\\Jogos\\";
    private final DAO_Funcoes funcoes = DAO_Funcoes.getInstancia();
    private static String ENDERECO_JOGO_RODANDO;
    private static DAO_JOGO instancia ;

    public DAO_JOGO() {
    }

    public static DAO_JOGO getInstancia() {
        if(instancia == null){
            instancia = new DAO_JOGO();
        }
        return instancia;
    }
    
    
    
    public void criarDiretorioJogo(Jogo jogo){
         funcoes.criarDiretorio(ENDERECO+jogo.getNome());
    }    
    
    public void removerArquivosJogo(Jogo jogo){
        funcoes.deletarArquivos(ENDERECO+jogo.getNome());
    }
    public void removerDiretorioJogo(Jogo jogo){
        funcoes.removerDiretorio(ENDERECO+jogo.getNome());
    }
    
    public void criarDiretorioFichas(Jogo jogo ){
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Fichas");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\Jogador");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\NPC");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\Monstro");
    }

    public void removerArquivosFichas(Jogo jogo){
       funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Fichas\\Jogador");
       funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Fichas\\NPC");
       funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Fichas\\Monstro");
       funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Fichas");
    }

    public void removerDiretorioFichas(Jogo jogo){
       funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\Jogador");
       funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\NPC");
       funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Fichas\\Monstro");
       funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Fichas");
    }


    public void criarDiretorioHabilidades(Jogo jogo){
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Fisica");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Psiquica");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Belica");
    }
    public void removerArquivosHabilidades(Jogo jogo){
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Habilidades\\Fisica");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Habilidades\\Psiquica");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Habilidades\\Belica");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Habilidades");
    }

    public void removerDiretorioHabilidades(Jogo jogo){
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Fisica");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Psiquica");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades\\Belica");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Habilidades");
    }
    
    
    public void criarDiretorioCaracteristicas(Jogo jogo){
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Fisica");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Psiquica");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Racial");
    }
    
    public void removerArquivosCaracteristicas(Jogo jogo){
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Fisica");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Psiquica");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Racial");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Caracteristicas");
    }
    
    public void removerDiretorioCaracteristicas(Jogo jogo){
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Fisica");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Psiquica");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas\\Racial");  
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Caracteristicas");
    }
    
    public void criarDiretorioItens(Jogo jogo){
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Generico");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_A_Distancia");
        funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armaduras");
    }
    
    public void removerArquivosItens(Jogo jogo){
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Generico");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_A_Distancia");
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Itens\\Armaduras");
    }
    public void removerDiretoriosItens(Jogo jogo){
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Generico");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_Corpo_A_Corpo");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas\\Arma_A_Distancia");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armas");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens\\Armaduras");
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Itens");
    }
    
    
    public void criarDiretorioDados(Jogo jogo){
         funcoes.criarDiretorio(ENDERECO+jogo.getNome()+"\\Dados");
    }
   
    public void removerArquivosDados(Jogo jogo){
        funcoes.deletarArquivos(ENDERECO+jogo.getNome()+"\\Dados");
    }
    public void removerDiretorioDados(Jogo jogo){
        funcoes.removerDiretorio(ENDERECO+jogo.getNome()+"\\Dados");
    }
    
    public void criarDiretoriosJogo(Jogo jogo){ 
        if(!funcoes.diretorioExiste(ENDERECO+jogo.getNome())){
           criarDiretorioJogo(jogo);
           criarDiretorioCaracteristicas(jogo);
           criarDiretorioDados(jogo);
           criarDiretorioFichas(jogo);
           criarDiretorioHabilidades(jogo);          
           criarDiretorioItens(jogo);
        }        
    }
   
    
    
    public boolean deletarJogo(Jogo jogo){
        String endereco_jogo= ENDERECO+jogo.getNome();
        boolean status = false; 
        if(funcoes.diretorioExiste(endereco_jogo)){
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
  
    public void verificarDiretorioRaiz(){
        if(!funcoes.diretorioExiste(ENDERECO)){
            funcoes.criarDiretorio("C:\\Opera");
            funcoes.criarDiretorio(ENDERECO);
        }
    }
    
    public void gravarJogo(Jogo jogo) throws FileNotFoundException, IOException{
        funcoes.criarArquivo(ENDERECO+jogo.getNome(),jogo.getNome(), jogo);
    }
    public Jogo carregarJogo(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
        ENDERECO_JOGO_RODANDO = ENDERECO + nome;
        return  (Jogo) funcoes.carregarArquivo(ENDERECO+nome, nome);
    }    
    
    public String endereco_JogoRodando(){
        return ENDERECO_JOGO_RODANDO;
    }
    
     public String[] jogosExistentes(){
        return funcoes.listarDiretorios(ENDERECO);        
    }
     
    public boolean jogoExiste(String nome){
        return funcoes.diretorioExiste(ENDERECO+nome);
    }     
    
    
}
