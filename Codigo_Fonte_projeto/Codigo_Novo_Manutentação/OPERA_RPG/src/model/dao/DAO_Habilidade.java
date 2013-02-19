/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;


import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Constante_Endereco;
import model.classes.Habilidade;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;

/**
 *
 * @author Administrador
 */
public class DAO_Habilidade {
    
    private static String ENDERECO_HABILIDADE = Constante_Endereco.HABILIDADE;
  
    
    public static void gravarHabilidade(Habilidade habilidade)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_HABILIDADE+"\\"+habilidade.getTipo()+"\\";
        DAO_Funcao.criarArquivoOpera(diretorio, habilidade.getNome(), habilidade);
    }
    
    public static Habilidade carregarHabilidade(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_HABILIDADE+"\\"+tipo+"\\";
        Habilidade h ;
        h = (Habilidade) DAO_Funcao.carregarArquivoOpera(diretorio, nome);
        return h;
    }    
    
    public static boolean HabilidadeExiste(String nome,String tipo){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_HABILIDADE+"\\"+tipo+"\\";
        return DAO_Funcao.arquivoOperaExiste(diretorio, nome);
    }
    
    public static void removerHabilidade(String nome,String tipo) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_HABILIDADE+"\\"+tipo+"\\";
        DAO_Funcao.removerArquivo(diretorio, nome);  
    }
    public static void removerTodasHabilidades(String tipo) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_HABILIDADE+"\\"+tipo+"\\";
         DAO_Funcao.deletarArquivos(diretorio);   
         
    }
    public static String[] listarHabilidades(String tipo){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+ENDERECO_HABILIDADE+"\\"+tipo+"\\"; 
        String s[];
        s = DAO_Funcao.listarArquivosOpera(diretorio);
        
        return s;
    }     
     
}
