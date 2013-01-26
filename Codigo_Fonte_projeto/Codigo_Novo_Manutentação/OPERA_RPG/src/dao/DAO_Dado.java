/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


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
       if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivo(diretorio, dado.toString(), dado);
       }
    }
    
    public static Dado carregarDado(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
        Dado dado = null;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            dado = (Dado)DAO_Funcao.carregarArquivo(diretorio, nome);
        }
        return dado;
    }
    
    public static void removerDado(String nome){
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.removerArquivo(diretorio, nome);
        }    
    }
    public static void removerTodosDados(){
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.deletarArquivos(diretorio);
        }
    }
    
    public static String[] listarTodosDados(){
        String s[]  = null;
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Dados";
        
        if(DAO_Funcao.diretorioExiste(diretorio)){
            s = DAO_Funcao.listarArquivos(diretorio);
        }
        return s;
    }
    
    
}
