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
public class DAO_Dados {
    
   
    private static String diretorio;
   
    
    public static void gravarDADO(Dado dado) throws FileNotFoundException, IOException{
       diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Dados";
       if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.criarArquivo(diretorio, dado.toString(), dado);
       }
    }
    
    public static Dado carregarDado(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Dados";
        Dado dado = null;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            dado = (Dado)DAO_Funcoes.carregarArquivo(diretorio, nome);
        }
        return dado;
    }
    
    public static void removerDado(String nome){
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Dados";
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.removerArquivo(diretorio, nome);
        }    
    }
    public static void removerTodosDados(){
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Dados";
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.deletarArquivos(diretorio);
        }
    }
    
    public static String[] listarTodosDados(){
        String s[]  = null;
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Dados";
        
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            s = DAO_Funcoes.listarArquivos(diretorio);
        }
        return s;
    }
    
    
}
