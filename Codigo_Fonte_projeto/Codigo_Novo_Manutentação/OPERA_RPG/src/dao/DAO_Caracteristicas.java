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
    
    private DAO_Funcoes funcoes = DAO_Funcoes.getInstancia();
    private DAO_JOGO    jogo_rodando = DAO_JOGO.getInstancia();
    private String diretorio;
    private static DAO_Caracteristicas instancia;

    public DAO_Caracteristicas() {
    }

    public static DAO_Caracteristicas getInstancia() {
        if(instancia == null){
            instancia = new DAO_Caracteristicas();
        }
        return instancia;
    }
    
    public void gravarCaracteristica(Caracteristica caracteristica)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Caracteristicas\\"+caracteristica.getTipo()+"\\";
        if( funcoes.diretorioExiste(diretorio) && !funcoes.arquivoExiste(diretorio, caracteristica.getNome())){
            funcoes.criarArquivo(diretorio, caracteristica.getNome(), caracteristica);
        }
    }
    
    public Caracteristica carregarCaracteristica(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException{
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        Caracteristica c = null;
        if(funcoes.arquivoExiste(diretorio, nome)){
            c = (Caracteristica) funcoes.carregarArquivo(diretorio, nome);
        }
        return c;
    }
    public Caracteristica_Especifica carregarCaracteristica_Especifica(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException{
        return (Caracteristica_Especifica) carregarCaracteristica(nome, tipo);
    }   
    public boolean CaracteristicaExiste(String nome,String tipo){
        diretorio= jogo_rodando.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        return funcoes.arquivoExiste(diretorio, nome);
    }
    
     public void removerCaracteristica(String nome,String tipo){
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
        funcoes.removerArquivo(diretorio, nome);  
    }
    public void removerTodasHabilidades(String tipo){
         diretorio = jogo_rodando.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\";
         if(funcoes.diretorioExiste(diretorio)){
            funcoes.deletarArquivos(diretorio);   
         }
    }
    public String[] listarCaracteristicas(String tipo){
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Caracteristicas\\"+tipo+"\\"; 
        String s[] = null;
        if(funcoes.diretorioExiste(diretorio)){
            s = funcoes.listarArquivos(diretorio);
        }
        return s;
    }
     
     
}
