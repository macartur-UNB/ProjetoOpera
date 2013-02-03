/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Constantes;
import model.classes.Item;

/**
 *
 * @author Macartur
 */
public class DAO_Item {   
    
    private static final String ENDERECO_ITEM_GENERICO = Constantes.Endereco.ITEM_GENERICO;
    private static final String ENDERECO_ITEM_ARMA_CORPO_A_CORPO = Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO;
    private static final String ENDERECO_ITEM_ARMA_A_DISTANCIA = Constantes.Endereco.ITEM_ARMA_A_DISTANCIA;
    private static final String ENDERECO_ITEM_ARMADURA = Constantes.Endereco.ITEM_ARMADURA;
    
    public static void gravarItem(Item item) throws FileNotFoundException,
                                              FileNotFoundException,IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_ITEM_GENERICO;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, item.getNome(), item);
        }
    }
    
    public static void gravarArma_Corpo_A_Corpo(Arma_Corpo_A_Corpo arma)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   ENDERECO_ITEM_ARMA_CORPO_A_CORPO+"\\Branca";
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, arma.getNome(), arma);
        }
    }
   public static void gravarArma_A_Distancia(Arma_A_Distancia arma)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                  ENDERECO_ITEM_ARMA_A_DISTANCIA;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, arma.getNome(), arma);
        }
        
    }
    public static void gravarArmadura(Armadura armadura) 
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.ITEM_ARMADURA;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, armadura.getNome(), armadura);
        }
    }
    
    public static void removerItemGenerico(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_ITEM_GENERICO;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
            DAO_Funcao.removerArquivo(diretorio, nome);
        }
    }
    public static void removeArma_A_Distancia(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                  ENDERECO_ITEM_ARMA_A_DISTANCIA;
         if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
               DAO_Funcao.removerArquivo(diretorio, nome);
         }
    }
    
    public static void removeArma_Corpo_A_Corpo(String nome,String tipo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   ENDERECO_ITEM_ARMA_CORPO_A_CORPO+"\\"+tipo+"\\";
         if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
               DAO_Funcao.removerArquivo(diretorio, nome);
         }
    }
    
    public static void removeArmadura(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.ITEM_ARMADURA;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
               DAO_Funcao.removerArquivo(diretorio, nome);
         }
    }
    
    public static Item encontrarItemGenerico(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
        Item item = null;   
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_ITEM_GENERICO;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
            item =(Item) DAO_Funcao.carregarArquivoOpera(diretorio, nome);
        }
        return item;
    }
    
    public static Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome,String tipo)
               throws FileNotFoundException,IOException, ClassNotFoundException, ArquivoInvalidoException{
            Arma_Corpo_A_Corpo acc = null;
            String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   ENDERECO_ITEM_ARMA_CORPO_A_CORPO+"\\"+tipo+"\\";
            if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
                acc =(Arma_Corpo_A_Corpo) DAO_Funcao.carregarArquivoOpera(diretorio, nome);
            }
            return acc;
    }
    
    public static Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
              throws FileNotFoundException, IOException, ClassNotFoundException, ArquivoInvalidoException{
        Arma_A_Distancia aad = null;
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                  ENDERECO_ITEM_ARMA_A_DISTANCIA;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
                aad =(Arma_A_Distancia) DAO_Funcao.carregarArquivoOpera(diretorio, nome);
        }
        return aad;
    }
    public static Armadura encontrarArmadura(String nome) throws FileNotFoundException,
                                            ClassNotFoundException, IOException,
                                            ArquivoInvalidoException{
        Armadura a = null;
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                  ENDERECO_ITEM_ARMADURA;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
                a =(Armadura) DAO_Funcao.carregarArquivoOpera(diretorio, nome);
        }
        return a;
    }
    
    
}
