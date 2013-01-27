/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exception.ArquivoInvalidoException;
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
public class DAO_Item {
     
    
    private static String diretorio;
    
    
    
    public static void gravarItem(Item item) throws FileNotFoundException,
                                              FileNotFoundException,IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Itens\\Generico";
        DAO_Funcao.criarArquivo(diretorio, item.getNome(), item);
        
    }
    
    public static void gravarArma_Corpo_A_Corpo(Arma_Corpo_A_Corpo arma)
                                      throws FileNotFoundException, IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+arma.getTipo()+"\\";
        DAO_Funcao.criarArquivo(diretorio, arma.getNome(), arma);
        
    }
    
   public static void gravarArma_A_Distancia(Arma_A_Distancia arma)
                                      throws FileNotFoundException, IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
        if(DAO_Funcao.diretorioExiste(diretorio) && !DAO_Funcao.arquivoExiste(diretorio, arma.getNome())){
            DAO_Funcao.criarArquivo(diretorio, arma.getNome(), arma);
        }        
    }
    public static void gravarArmadura(Armadura armadura) 
                                      throws FileNotFoundException, IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Itens\\Armaduras";
        DAO_Funcao.criarArquivo(diretorio, armadura.getNome(), armadura);
        
    }
    
    public static void removerItemGenerico(String nome) throws ArquivoInvalidoException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Itens\\Generico";
        DAO_Funcao.removerArquivo(diretorio, nome);
        
    }
    public static void removeArma_A_Distancia(String nome) throws ArquivoInvalidoException{
         diretorio = DAO_Jogo.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
         DAO_Funcao.removerArquivo(diretorio, nome);
         
    }
    
    public static void removeArma_Corpo_A_Corpo(String nome,String tipo) throws ArquivoInvalidoException{
         diretorio = DAO_Jogo.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+tipo+"\\";
         DAO_Funcao.removerArquivo(diretorio, nome);
         
    }
    
    public static void removeArmadura(String nome) throws ArquivoInvalidoException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Itens\\Armaduras";
        DAO_Funcao.removerArquivo(diretorio, nome);
        
    }
    
    public static Item encontrarItemGenerico(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException{
        Item i;   
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Itens\\Generico";
        i =(Item) DAO_Funcao.carregarArquivo(diretorio, nome);
        
        return i;
    }
    
    public static Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome,String tipo)
               throws FileNotFoundException,IOException, ClassNotFoundException{
            Arma_Corpo_A_Corpo acc;
            diretorio = DAO_Jogo.endereco_JogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+tipo+"\\";
            acc =(Arma_Corpo_A_Corpo) DAO_Funcao.carregarArquivo(diretorio, nome);
            
            return acc;
    }
    
    public static Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        Arma_A_Distancia aad;
        diretorio = DAO_Jogo.endereco_JogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
        aad =(Arma_A_Distancia) DAO_Funcao.carregarArquivo(diretorio, nome);
        
        return aad;
    }
    public static Armadura  encontrarArmadura(String nome) throws FileNotFoundException,
                                            ClassNotFoundException, IOException{
        Armadura a;
        diretorio = DAO_Jogo.endereco_JogoRodando()+
                   "\\Itens\\Armaduras";
       
        a =(Armadura) DAO_Funcao.carregarArquivo(diretorio, nome);
        
        return a;
    }
    
    
}
