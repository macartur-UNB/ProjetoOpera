/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;


import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Caracteristica;
import model.classes.Caracteristica_Especifica;
import model.classes.Constante_Endereco;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;

/**
 *
 * @author Macartur
 */
public class DAO_Caracteristica {
    
    private static final String ENDERECO_CARACTERISTICA = Constante_Endereco.CARACTERISTICA;
    
    public static void gravarCaracteristica(Caracteristica caracteristica)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_CARACTERISTICA +"\\"+caracteristica.getTipo()+"\\";
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, caracteristica.getNome(), caracteristica);
        }
    }
    
    public static Caracteristica carregarCaracteristica(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_CARACTERISTICA +"\\"+tipo+"\\";
        Caracteristica c = null;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
            c = (Caracteristica) DAO_Funcao.carregarArquivoOpera(diretorio, nome);
            System.out.println(c);
        }
        return c;
    }
    public static Caracteristica_Especifica carregarCaracteristica_Especifica(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
        return (Caracteristica_Especifica) carregarCaracteristica(nome, tipo);
    }   
    public static boolean CaracteristicaExiste(String nome,String tipo){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_CARACTERISTICA +"\\"+tipo+"\\";
        return DAO_Funcao.arquivoOperaExiste(diretorio, nome);
    }
    
     public static void removerCaracteristica(String nome,String tipo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_CARACTERISTICA +"\\"+tipo+"\\";
        DAO_Funcao.removerArquivo(diretorio, nome);  
    }
    public static void removerTodasCaracteristicas(String tipo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_CARACTERISTICA +"\\"+tipo+"\\";
         if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.deletarArquivos(diretorio);   
         }
    }
    public static String[] listarCaracteristicas(String tipo){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_CARACTERISTICA +"\\"+tipo+"\\"; 
        String s[] = null;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            s = DAO_Funcao.listarArquivosOpera(diretorio);
        }
        return s;
    }
     
     
}
