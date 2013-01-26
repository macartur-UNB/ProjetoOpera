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
public class DAO_Itens {
    
    
    private static String diretorio;
    
    
    
    public static void gravarItem(Item item) throws FileNotFoundException,
                                              FileNotFoundException,IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Itens\\Generico";
        if(DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, item.getNome())){
            DAO_Funcoes.criarArquivo(diretorio, item.getNome(), item);
        }
    }
    
    public static void gravarArma_Corpo_A_Corpo(Arma_Corpo_A_Corpo arma)
                                      throws FileNotFoundException, IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+arma.getTipo()+"\\";
        if(DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, arma.getNome())){
            DAO_Funcoes.criarArquivo(diretorio, arma.getNome(), arma);
        }
    }
    
   public static void gravarArma_A_Distancia(Arma_A_Distancia arma)
                                      throws FileNotFoundException, IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
        if(DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, arma.getNome())){
            DAO_Funcoes.criarArquivo(diretorio, arma.getNome(), arma);
        }        
    }
    public static void gravarArmadura(Armadura armadura) 
                                      throws FileNotFoundException, IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Itens\\Armaduras";
        if(DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, armadura.getNome())){
            DAO_Funcoes.criarArquivo(diretorio, armadura.getNome(), armadura);
        }
    }
    
    public static void removerItemGenerico(String nome){
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Itens\\Generico";
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.removerArquivo(diretorio, nome);
        }
    }
    public static void removeArma_A_Distancia(String nome){
         diretorio = DAO_Jogos.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
         if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
               DAO_Funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public static void removeArma_Corpo_A_Corpo(String nome,String tipo){
         diretorio = DAO_Jogos.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+tipo+"\\";
         if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
               DAO_Funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public static void removeArmadura(String nome){
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Itens\\Armaduras";
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
               DAO_Funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public static Item encontrarItemGenerico(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException{
        Item i = null;   
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Itens\\Generico";
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
            i =(Item) DAO_Funcoes.carregarArquivo(diretorio, nome);
        }
        return i;
    }
    
    public static Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome,String tipo)
               throws FileNotFoundException,IOException, ClassNotFoundException{
            Arma_Corpo_A_Corpo acc = null;
            diretorio = DAO_Jogos.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+tipo+"\\";
            if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
                acc =(Arma_Corpo_A_Corpo) DAO_Funcoes.carregarArquivo(diretorio, nome);
            }
            return acc;
    }
    
    public static Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        Arma_A_Distancia aad = null;
        diretorio = DAO_Jogos.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
                aad =(Arma_A_Distancia) DAO_Funcoes.carregarArquivo(diretorio, nome);
        }
        return aad;
    }
    public static Armadura  encontrarArmadura(String nome) throws FileNotFoundException,
                                            ClassNotFoundException, IOException{
        Armadura a = null;
        diretorio = DAO_Jogos.endereco_JogoRodando()+
                   "\\Itens\\Armaduras";
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
                a =(Armadura) DAO_Funcoes.carregarArquivo(diretorio, nome);
        }
        return a;
    }
    
    
}
