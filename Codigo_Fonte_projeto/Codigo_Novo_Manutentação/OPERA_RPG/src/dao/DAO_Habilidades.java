/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.io.FileNotFoundException;
import java.io.IOException;
import model.Habilidade;

/**
 *
 * @author Administrador
 */
public class DAO_Habilidades {
    
   
    private static String diretorio;
  
    
    public static void gravarHabilidade(Habilidade habilidade)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Habilidades\\"+habilidade.getTipo()+"\\";
        if( DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, habilidade.getNome())){
            DAO_Funcoes.criarArquivo(diretorio, habilidade.getNome(), habilidade);
        }
    }
    
    public static Habilidade carregarHabilidade(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        Habilidade h = null;
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
            h = (Habilidade) DAO_Funcoes.carregarArquivo(diretorio, nome);
        }
        return h;
    }    
    
    public static boolean HabilidadeExiste(String nome,String tipo){
        diretorio= DAO_Jogos.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        return DAO_Funcoes.arquivoExiste(diretorio, nome);
    }
    
     public static void removerHabilidade(String nome,String tipo){
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        DAO_Funcoes.removerArquivo(diretorio, nome);  
    }
    public static void removerTodasHabilidades(String tipo){
         diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
         if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.deletarArquivos(diretorio);   
         }
    }
    public static String[] listarHabilidades(String tipo){
        diretorio = DAO_Jogos.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\"; 
        String s[] = null;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            s = DAO_Funcoes.listarArquivos(diretorio);
        }
        return s;
    }
     
     
}
