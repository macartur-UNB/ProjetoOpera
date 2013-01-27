/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import exception.ArquivoInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Dado;
/**
 *
 * @author Macartur
 */
public class DAO_Dado {
    
   
    private static String diretorio;
  
    public static void gravarDADO(Dado dado) throws FileNotFoundException, IOException{
       diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
       DAO_Funcao.criarArquivo(diretorio, dado.toString(), dado);
       
    }
    
    public static Dado carregarDado(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
        Dado dado;
        dado = (Dado)DAO_Funcao.carregarArquivo(diretorio, nome);
        
        return dado;
    }
    
    public static void removerDado(String nome) throws ArquivoInvalidoException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
        DAO_Funcao.removerArquivo(diretorio, nome);   
    }
    public static void removerTodosDados() throws ArquivoInvalidoException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
        DAO_Funcao.deletarArquivos(diretorio);
        
    }
    
    public static String[] listarTodosDados(){
        String s[];
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
        s = DAO_Funcao.listarArquivos(diretorio);
        
        return s;
    }
    
    
}
