/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import exception.ArquivoInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Caracteristica;
import model.Caracteristica_Especifica;

/**
 *
 * @author Macartur
 */
public class DAO_Caracteristica {
    
    private static String diretorio;
   
    
    public static void gravarCaracteristica(Caracteristica caracteristica)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Caracteristicas\\"+caracteristica.getTipo()+"\\";
       DAO_Funcao.criarArquivo(diretorio, caracteristica.getNome(), caracteristica);
    }
    
    public static Caracteristica carregarCaracteristica(String nome,String tipo)
              throws FileNotFoundException, ClassNotFoundException, IOException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        Caracteristica c;
        c = (Caracteristica) DAO_Funcao.carregarArquivo(diretorio, nome);
        return c;
    }
    
    public static Caracteristica_Especifica carregarCaracteristica_Especifica(
                                                         String nome,String tipo)
               throws FileNotFoundException, ClassNotFoundException, IOException{
        
        return (Caracteristica_Especifica) carregarCaracteristica(nome, tipo);
    }   
    
    public static boolean CaracteristicaExiste(String nome,String tipo){
        diretorio= DAO_Jogo.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        return DAO_Funcao.arquivoExiste(diretorio, nome);
    }
    
     public static void removerCaracteristica(String nome,String tipo) throws ArquivoInvalidoException{
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        DAO_Funcao.removerArquivo(diretorio, nome);  
    }
    public static void removerTodasHabilidades(String tipo) throws ArquivoInvalidoException{
         diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
         DAO_Funcao.deletarArquivos(diretorio);
    }
    public static String[] listarCaracteristicas(String tipo){
        diretorio = DAO_Jogo.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\"; 
        String s[];
        s = DAO_Funcao.listarArquivos(diretorio);
        return s;
    }
     
     
}
