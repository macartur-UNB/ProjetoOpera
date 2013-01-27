/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exception.ArquivoInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Ficha;

/**
 *
 * @author Macartur
 */
public class DAO_Ficha {
    
    private static String diretorio;
    
    public static void gravarFicha(Ficha f)
                                      throws FileNotFoundException, IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Fichas"+f.getTipo()+"\\";
        DAO_Funcao.criarArquivo(diretorio, f.getPersonagem(), f);
    }
    public static Ficha carregarFicha(String personagem,String tipo) 
              throws FileNotFoundException, ClassNotFoundException, IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Fichas"+tipo+"\\";
       return (Ficha) DAO_Funcao.carregarArquivo(diretorio, personagem);
    }
    
    public static boolean fichaExiste(String personagem,String tipo){
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Fichas"+tipo+"\\";
        return DAO_Funcao.arquivoExiste(diretorio, personagem);
    }
    public static void removerFicha(String personagem,String tipo) throws ArquivoInvalidoException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Fichas\\"+tipo+"\\";
        DAO_Funcao.removerArquivo(diretorio, personagem);  
    }
    public static void removerTodasFichas(String tipo) throws ArquivoInvalidoException{
         diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Fichas\\"+tipo+"\\";
         DAO_Funcao.deletarArquivos(diretorio);   
    }
    public static String[] listarFichas(String tipo){
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Fichas\\"+tipo+"\\"; 
        String s[];
        s = DAO_Funcao.listarArquivos(diretorio);
        return s;
    }  
}
