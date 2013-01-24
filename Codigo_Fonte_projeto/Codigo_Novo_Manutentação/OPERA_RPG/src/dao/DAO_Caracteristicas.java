/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import com.sun.corba.se.impl.orbutil.closure.Constant;
import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Caracteristica;
import model.Caracteristica_Especifica;
import model.Constantes;

/**
 *
 * @author Macartur
 */
public class DAO_Caracteristicas {
    
    
    public static void gravarCaracteristica(Caracteristica caracteristica)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.CARACTERISTICA +"\\"+caracteristica.getTipo()+"\\";
        if( DAO_Funcoes.diretorioExiste(diretorio) && !DAO_Funcoes.arquivoExiste(diretorio, caracteristica.getNome())){
            DAO_Funcoes.criarArquivoOpera(diretorio, caracteristica.getNome(), caracteristica);
        }
    }
    
    public static Caracteristica carregarCaracteristica(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.CARACTERISTICA +"\\"+tipo+"\\";
        Caracteristica c = null;
        if(DAO_Funcoes.arquivoExiste(diretorio, nome)){
            c = (Caracteristica) DAO_Funcoes.carregarArquivoOpera(diretorio, nome);
        }
        return c;
    }
    public static Caracteristica_Especifica carregarCaracteristica_Especifica(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException{
        return (Caracteristica_Especifica) carregarCaracteristica(nome, tipo);
    }   
    public static boolean CaracteristicaExiste(String nome,String tipo){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.CARACTERISTICA +"\\"+tipo+"\\";
        return DAO_Funcoes.arquivoExiste(diretorio, nome);
    }
    
     public static void removerCaracteristica(String nome,String tipo) throws DeletarInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.CARACTERISTICA +"\\"+tipo+"\\";
        DAO_Funcoes.removerArquivo(diretorio, nome);  
    }
    public static void removerTodasCaracteristicas(String tipo) throws DeletarInvalidoException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.CARACTERISTICA +"\\"+tipo+"\\";
         if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.deletarArquivos(diretorio);   
         }
    }
    public static String[] listarCaracteristicas(String tipo){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.CARACTERISTICA +"\\"+tipo+"\\"; 
        String s[] = null;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            s = DAO_Funcoes.listarArquivosOpera(diretorio);
        }
        return s;
    }
     
     
}
