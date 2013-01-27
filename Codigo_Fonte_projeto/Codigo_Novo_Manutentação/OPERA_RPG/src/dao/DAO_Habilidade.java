/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import exception.ArquivoInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Habilidade;

/**
 *
 * @author Administrador
 */
public class DAO_Habilidade {
    
   
    private static String diretorio;
  
    
    public static void gravarHabilidade(Habilidade habilidade)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Habilidades\\"+habilidade.getTipo()+"\\";
        DAO_Funcao.criarArquivo(diretorio, habilidade.getNome(), habilidade);
    }
    
    public static Habilidade carregarHabilidade(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        Habilidade h ;
        h = (Habilidade) DAO_Funcao.carregarArquivo(diretorio, nome);
        return h;
    }    
    
    public static boolean HabilidadeExiste(String nome,String tipo){
        diretorio= DAO_Jogo.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        return DAO_Funcao.arquivoExiste(diretorio, nome);
    }
    
    public static void removerHabilidade(String nome,String tipo) throws ArquivoInvalidoException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        DAO_Funcao.removerArquivo(diretorio, nome);  
    }
    public static void removerTodasHabilidades(String tipo) throws ArquivoInvalidoException{
         diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
         DAO_Funcao.deletarArquivos(diretorio);   
         
    }
    public static String[] listarHabilidades(String tipo){
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\"; 
        String s[];
        s = DAO_Funcao.listarArquivos(diretorio);
        
        return s;
    }     
     
}
