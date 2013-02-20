/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Ficha;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;

/**
 *
 * @author Macartur
 */
public class DAO_Ficha {
    
    public static void gravarFicha(Ficha f)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+"\\Fichas\\"+f.getTipo()+"\\";
        DAO_Funcao.criarArquivoOpera(diretorio, f.getPersonagem(), f);
    }
    public static Ficha carregarFicha(String personagem,String tipo) 
              throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+"\\Fichas\\"+tipo+"\\";
       return (Ficha) DAO_Funcao.carregarArquivoOpera(diretorio, personagem);
    }
    
    public static boolean atualizarFicha(Ficha f ) throws FileNotFoundException, IOException, ArquivoInvalidoException{
            if(f==null){
                return false;
            }        
            String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+"\\Fichas\\"+f.getTipo()+"\\";
            DAO_Funcao.sobrescreverArquivoOpera(diretorio, f.getPersonagem(), f);
            return true;
    }
    
    
    public static boolean fichaExiste(String personagem,String tipo){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+"\\Fichas\\"+tipo+"\\";
        return DAO_Funcao.arquivoOperaExiste(diretorio, personagem);
    }
    public static void removerFicha(String personagem,String tipo) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+"\\Fichas\\"+tipo+"\\";
        DAO_Funcao.removerArquivo(diretorio, personagem);  
    }
    public static void removerTodasFichas(String tipo) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+"\\Fichas\\"+tipo+"\\";
         DAO_Funcao.deletarArquivos(diretorio);   
    }
    public static String[] listarFichas(String tipo){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+"\\Fichas\\"+tipo+"\\"; 
        String s[];
        s = DAO_Funcao.listarArquivosOpera(diretorio);
        return s;
    }  
}
