/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.io.FileNotFoundException;
import java.io.IOException;
import model.Caracteristica;
import model.Caracteristica_Especifica;

/**
 *
 * @author Macartur
 */
public class DAO_Caracteristicas {
    
    private static String diretorio;
   
    
    public static void gravarCaracteristica(Caracteristica caracteristica)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Caracteristicas\\"+caracteristica.getTipo()+"\\";
        if( DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, caracteristica.getNome())){
            DAO_Funcoes.criarArquivo(diretorio, caracteristica.getNome(), caracteristica);
        }
    }
    
    public static Caracteristica carregarCaracteristica(String nome,String tipo)
              throws FileNotFoundException, ClassNotFoundException, IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        Caracteristica c = null;
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
            c = (Caracteristica) DAO_Funcoes.carregarArquivo(diretorio, nome);
        }
        return c;
    }
    public static Caracteristica_Especifica carregarCaracteristica_Especifica(
                                                         String nome,String tipo)
               throws FileNotFoundException, ClassNotFoundException, IOException{
        
        return (Caracteristica_Especifica) carregarCaracteristica(nome, tipo);
    }   
    public static boolean CaracteristicaExiste(String nome,String tipo){
        diretorio= DAO_Jogos.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        return DAO_Funcoes.arquivoExiste(diretorio, nome);
    }
    
     public static void removerCaracteristica(String nome,String tipo){
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        DAO_Funcoes.removerArquivo(diretorio, nome);  
    }
    public static void removerTodasHabilidades(String tipo){
         diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
         if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.deletarArquivos(diretorio);   
         }
    }
    public static String[] listarCaracteristicas(String tipo){
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\"; 
        String s[] = null;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            s = DAO_Funcoes.listarArquivos(diretorio);
        }
        return s;
    }
     
     
}
