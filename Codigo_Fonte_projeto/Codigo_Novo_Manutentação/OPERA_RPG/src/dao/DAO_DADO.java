/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Dado;
import dao.DAO_JOGO;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author Macartur
 */
public class DAO_DADO {
    
    private DAO_Funcoes funcoes =  DAO_Funcoes.getInstancia();
    private DAO_JOGO jogo_Rodando = DAO_JOGO.getInstancia();
    private String diretorio;
    private static DAO_DADO instancia;

    public DAO_DADO() {
    }

    public static DAO_DADO getInstancia() {
        if(instancia == null){
            instancia = new DAO_DADO();
        }
        return instancia;
    }
    
    
    public void gravarDADO(Dado dado) throws FileNotFoundException, IOException{
       diretorio = jogo_Rodando.endereco_JogoRodando()+"\\Dados";
       if(funcoes.diretorioExiste(diretorio)){
            funcoes.criarArquivo(diretorio, dado.toString(), dado);
       }
    }
    
    public Dado carregarDado(String nome) throws FileNotFoundException, IOException, ClassNotFoundException{
        diretorio = jogo_Rodando.endereco_JogoRodando()+"\\Dados";
        Dado dado = null;
        if(funcoes.diretorioExiste(diretorio)){
            dado = (Dado)funcoes.carregarArquivo(diretorio, nome);
        }
        return dado;
    }
    
    public void removerDado(String nome){
        diretorio = jogo_Rodando.endereco_JogoRodando()+"\\Dados";
        if(funcoes.diretorioExiste(diretorio)){
            funcoes.removerArquivo(diretorio, nome);
        }    
    }
    public void removerTodosDados(){
        diretorio = jogo_Rodando.endereco_JogoRodando()+"\\Dados";
        if(funcoes.diretorioExiste(diretorio)){
            funcoes.deletarArquivos(diretorio);
        }
    }
    
    public String[] listarTodosDados(){
        String s[]  = null;
        diretorio = jogo_Rodando.endereco_JogoRodando()+"\\Dados";
        
        if(funcoes.diretorioExiste(diretorio)){
            s = funcoes.listarArquivos(diretorio);
        }
        return s;
    }
    
    
}
