/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Constante_Endereco;
import model.classes.Dado;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
/**
 *
 * @author Macartur
 */
public class DAO_Dado {
    
    private static final String ENDERECO_DADO = Constante_Endereco.DADO;
    
    public static void gravarDADO(Dado dado) throws FileNotFoundException, IOException, ArquivoInvalidoException{
       String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_DADO;
       if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, dado.toString(), dado);
       }
    }
    
    public static Dado carregarDado(String nome) throws FileNotFoundException, IOException, ClassNotFoundException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_DADO;
        Dado dado = null;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            dado = (Dado)DAO_Funcao.carregarArquivoOpera(diretorio, nome);
        }
        return dado;
    }
    
    public static void removerDado(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_DADO;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.removerArquivo(diretorio, nome);
        }    
    }
    public static void removerTodosDados() throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_DADO;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.deletarArquivos(diretorio);
        }
    }
    
    public static String[] listarTodosDados(){
        String s[]  = null;
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_DADO;
        
        if(DAO_Funcao.diretorioExiste(diretorio)){
            s = DAO_Funcao.listarArquivosOpera(diretorio);
        }
        return s;
    }
    
    
}
