/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Constantes;
import model.Dado;
/**
 *
 * @author Macartur
 */
public class DAO_Dado {
    
    public static void gravarDADO(Dado dado) throws FileNotFoundException, IOException, ArquivoInvalidoException{
       String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.DADO;
       if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.criarArquivoOpera(diretorio, dado.toString(), dado);
       }
    }
    
    public static Dado carregarDado(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.DADO;
        Dado dado = null;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            dado = (Dado)DAO_Funcoes.carregarArquivoOpera(diretorio, nome);
        }
        return dado;
    }
    
    public static void removerDado(String nome) throws DeletarInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.DADO;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.removerArquivo(diretorio, nome);
        }    
    }
    public static void removerTodosDados() throws DeletarInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.DADO;
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            DAO_Funcoes.deletarArquivos(diretorio);
        }
    }
    
    public static String[] listarTodosDados(){
        String s[]  = null;
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.DADO;
        
        if(DAO_Funcoes.diretorioExiste(diretorio)){
            s = DAO_Funcoes.listarArquivosOpera(diretorio);
        }
        return s;
    }
    
    
}
