/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.io.FileNotFoundException;
import java.io.IOException;
import model.Ficha;

/**
 *
 * @author Macartur
 */
public class DAO_Fichas {
    
    private static String diretorio;
    
    
    public static void gravarFicha(Ficha f) 
                                      throws FileNotFoundException, IOException{
        diretorio = DAO_Jogos.endereco_JogoRodando() + "\\Fichas\\"+f.getTipo()+"\\";
        if(DAO_Funcoes.diretorioExiste(diretorio) &&
          !DAO_Funcoes.arquivoExiste(diretorio, f.getPersonagem())){
            DAO_Funcoes.criarArquivo(diretorio, f.getPersonagem(), f);
        }
    }
   
    public static Ficha carregarFicha(String personagem,String tipo)
              throws FileNotFoundException, IOException, ClassNotFoundException{
        diretorio = DAO_Jogos.endereco_JogoRodando() + "\\Fichas\\"+tipo+"\\";
        Ficha f=null;
        if(DAO_Funcoes.arquivoExiste(diretorio, personagem)){
            f = (Ficha) DAO_Funcoes.carregarArquivo(diretorio, personagem);
        }
        return f;
    }
    
    public static boolean fichaExiste(String personagem,String tipo){
        diretorio = DAO_Jogos.endereco_JogoRodando() + "\\Fichas\\"+tipo+"\\";
        return  DAO_Funcoes.diretorioExiste(diretorio)?   
                DAO_Funcoes.arquivoExiste(diretorio, personagem):false;    
    }
    
    public static void removerFicha(String personagem,String tipo){
        diretorio = DAO_Jogos.endereco_JogoRodando() + "\\Fichas\\"+tipo+"\\";
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.removerArquivo(diretorio, personagem );  
        }
    }
    
    public static void removerTodasFichas(String tipo){
        diretorio = DAO_Jogos.endereco_JogoRodando() + "\\Fichas\\"+tipo+"\\";
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.deletarArquivos(diretorio);
        }
    }
    
    public static String[] listarFichas(String tipo){
        diretorio = DAO_Jogos.endereco_JogoRodando() + "\\Fichas\\"+tipo+"\\";
        String s[] = null;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            s = DAO_Funcoes.listarArquivos(diretorio);
        }
        return s;
    }
    
    
}
