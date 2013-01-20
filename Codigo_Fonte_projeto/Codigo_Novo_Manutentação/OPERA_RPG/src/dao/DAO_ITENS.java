/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.Arma_A_Distancia;
import model.Arma_Corpo_A_Corpo;
import model.Armadura;
import model.Item;

/**
 *
 * @author Macartur
 */
public class DAO_ITENS {
    
    private DAO_Funcoes funcoes = DAO_Funcoes.getInstancia();
    private static DAO_JOGO    jogo_rodando = DAO_JOGO.getInstancia();
    private String diretorio;
    private static DAO_ITENS instancia;

    public DAO_ITENS() {
    }

    public static DAO_ITENS getInstancia() {
        if(instancia == null){
            instancia = new DAO_ITENS();
        }
        return instancia;
    }
    
       
    
    public void gravarItem(Item item) throws FileNotFoundException,
                                              FileNotFoundException,IOException{
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Itens\\Generico";
        if(funcoes.diretorioExiste(diretorio) && !funcoes.arquivoExiste(diretorio, item.getNome())){
            funcoes.criarArquivo(diretorio, item.getNome(), item);
        }
    }
    
    public void gravarArma_Corpo_A_Corpo(Arma_Corpo_A_Corpo arma)
                                      throws FileNotFoundException, IOException{
        diretorio = jogo_rodando.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+arma.getTipo()+"\\";
        if(funcoes.diretorioExiste(diretorio) && !funcoes.arquivoExiste(diretorio, arma.getNome())){
            funcoes.criarArquivo(diretorio, arma.getNome(), arma);
        }
    }
   public void gravarArma_A_Distancia(Arma_A_Distancia arma)
                                      throws FileNotFoundException, IOException{
        diretorio = jogo_rodando.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
        if(funcoes.diretorioExiste(diretorio) && !funcoes.arquivoExiste(diretorio, arma.getNome())){
            funcoes.criarArquivo(diretorio, arma.getNome(), arma);
        }
        
    }
    public void gravarArmadura(Armadura armadura) 
                                      throws FileNotFoundException, IOException{
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Itens\\Armaduras";
        if(funcoes.diretorioExiste(diretorio) && !funcoes.arquivoExiste(diretorio, armadura.getNome())){
            funcoes.criarArquivo(diretorio, armadura.getNome(), armadura);
        }
    }
    
    public void removerItemGenerico(String nome){
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Itens\\Generico";
        if(funcoes.diretorioExiste(diretorio)){
            funcoes.removerArquivo(diretorio, nome);
        }
    }
    public void removeArma_A_Distancia(String nome){
         diretorio = jogo_rodando.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
         if(funcoes.arquivoExiste(diretorio, nome)){
               funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public void removeArma_Corpo_A_Corpo(String nome,String tipo){
         diretorio = jogo_rodando.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+tipo+"\\";
         if(funcoes.arquivoExiste(diretorio, nome)){
               funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public void removeArmadura(String nome){
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Itens\\Armaduras";
        if(funcoes.arquivoExiste(diretorio, nome)){
               funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public Item encontrarItemGenerico(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException{
        Item i = null;   
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Itens\\Generico";
        if(funcoes.arquivoExiste(diretorio, nome)){
            i =(Item) funcoes.carregarArquivo(diretorio, nome);
        }
        return i;
    }
    
    public Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome,String tipo)
               throws FileNotFoundException,IOException, ClassNotFoundException{
            Arma_Corpo_A_Corpo acc = null;
            diretorio = jogo_rodando.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+tipo+"\\";
            if(funcoes.arquivoExiste(diretorio, nome)){
                acc =(Arma_Corpo_A_Corpo) funcoes.carregarArquivo(diretorio, nome);
            }
            return acc;
    }
    
    public Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        Arma_A_Distancia aad = null;
        diretorio = jogo_rodando.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
        if(funcoes.arquivoExiste(diretorio, nome)){
                aad =(Arma_A_Distancia) funcoes.carregarArquivo(diretorio, nome);
        }
        return aad;
    }
    public Armadura  encontrarArmadura(String nome) throws FileNotFoundException,
                                            ClassNotFoundException, IOException{
        Armadura a = null;
        diretorio = jogo_rodando.endereco_JogoRodando()+
                   "\\Itens\\Armaduras";
        if(funcoes.arquivoExiste(diretorio, nome)){
                a =(Armadura) funcoes.carregarArquivo(diretorio, nome);
        }
        return a;
    }
    
    
}
