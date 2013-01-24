/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Arma_A_Distancia;
import model.Arma_Corpo_A_Corpo;
import model.Armadura;
import model.Constantes;
import model.Item;

/**
 *
 * @author Macartur
 */
public class DAO_Item {   
       
    
    public static void gravarItem(Item item) throws FileNotFoundException,
                                              FileNotFoundException,IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.ITEM_GENERICO;
        if(DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, item.getNome())){
            DAO_Funcoes.criarArquivoOpera(diretorio, item.getNome(), item);
        }
    }
    
    public static void gravarArma_Corpo_A_Corpo(Arma_Corpo_A_Corpo arma)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                    Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO+"\\"+arma.getTipo()+"\\";
        if(DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, arma.getNome())){
            DAO_Funcoes.criarArquivoOpera(diretorio, arma.getNome(), arma);
        }
    }
   public static void gravarArma_A_Distancia(Arma_A_Distancia arma)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   Constantes.Endereco.ITEM_ARMA_A_DISTANCIA;
        if(DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, arma.getNome())){
            DAO_Funcoes.criarArquivoOpera(diretorio, arma.getNome(), arma);
        }
        
    }
    public static void gravarArmadura(Armadura armadura) 
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.ITEM_ARMADURA;
        if(DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, armadura.getNome())){
            DAO_Funcoes.criarArquivoOpera(diretorio, armadura.getNome(), armadura);
        }
    }
    
    public static void removerItemGenerico(String nome) throws DeletarInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.ITEM_GENERICO;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.removerArquivo(diretorio, nome);
        }
    }
    public static void removeArma_A_Distancia(String nome) throws DeletarInvalidoException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   Constantes.Endereco.ITEM_ARMA_A_DISTANCIA;
         if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
               DAO_Funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public static void removeArma_Corpo_A_Corpo(String nome,String tipo) throws DeletarInvalidoException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                    Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO+"\\"+tipo+"\\";
         if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
               DAO_Funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public static void removeArmadura(String nome) throws DeletarInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.ITEM_ARMADURA;
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
               DAO_Funcoes.removerArquivo(diretorio, nome);
         }
    }
    
    public static Item encontrarItemGenerico(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException{
        Item item = null;   
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.ITEM_GENERICO;
        System.out.println(diretorio);
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
            item =(Item) DAO_Funcoes.carregarArquivoOpera(diretorio, nome);
        }
        return item;
    }
    
    public static Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome,String tipo)
               throws FileNotFoundException,IOException, ClassNotFoundException{
            Arma_Corpo_A_Corpo acc = null;
            String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                    Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO+"\\"+tipo+"\\";
            if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
                acc =(Arma_Corpo_A_Corpo) DAO_Funcoes.carregarArquivoOpera(diretorio, nome);
            }
            return acc;
    }
    
    public static Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        Arma_A_Distancia aad = null;
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   Constantes.Endereco.ITEM_ARMA_A_DISTANCIA;
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
                aad =(Arma_A_Distancia) DAO_Funcoes.carregarArquivoOpera(diretorio, nome);
        }
        return aad;
    }
    public static Armadura encontrarArmadura(String nome) throws FileNotFoundException,
                                            ClassNotFoundException, IOException{
        Armadura a = null;
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   Constantes.Endereco.ITEM_ARMADURA;
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
                a =(Armadura) DAO_Funcoes.carregarArquivoOpera(diretorio, nome);
        }
        return a;
    }
    
    
}
