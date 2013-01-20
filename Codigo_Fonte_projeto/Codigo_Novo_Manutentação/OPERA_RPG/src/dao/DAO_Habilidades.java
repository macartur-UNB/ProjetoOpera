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
    
    private DAO_Funcoes funcoes = DAO_Funcoes.getInstancia();
    private DAO_JOGO jogo_rodando = DAO_JOGO.getInstancia();
    private String diretorio;
    private static DAO_Habilidades instancia;

    public DAO_Habilidades() {
    }

    public static DAO_Habilidades getInstancia() {
        if(instancia == null){
            instancia = new DAO_Habilidades();
        }
        return instancia;
    }
    
    public void gravarHabilidade(Habilidade habilidade)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Habilidades\\"+habilidade.getTipo()+"\\";
        if( funcoes.diretorioExiste(diretorio) && !funcoes.arquivoExiste(diretorio, habilidade.getNome())){
            funcoes.criarArquivo(diretorio, habilidade.getNome(), habilidade);
        }
    }
    
    public Habilidade carregarHabilidade(String nome,String tipo) throws FileNotFoundException, ClassNotFoundException, IOException{
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        Habilidade h = null;
        if(funcoes.arquivoExiste(diretorio, nome)){
            h = (Habilidade) funcoes.carregarArquivo(diretorio, nome);
        }
        return h;
    }    
    
    public boolean HabilidadeExiste(String nome,String tipo){
        diretorio= jogo_rodando.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        return funcoes.arquivoExiste(diretorio, nome);
    }
    
     public void removerHabilidade(String nome,String tipo){
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
        funcoes.removerArquivo(diretorio, nome);  
    }
    public void removerTodasHabilidades(String tipo){
         diretorio = jogo_rodando.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\";
         if(funcoes.diretorioExiste(diretorio)){
            funcoes.deletarArquivos(diretorio);   
         }
    }
    public String[] listarHabilidades(String tipo){
        diretorio = jogo_rodando.endereco_JogoRodando()+"\\Habilidades\\"+tipo+"\\"; 
        String s[] = null;
        if(funcoes.diretorioExiste(diretorio)){
            s = funcoes.listarArquivos(diretorio);
        }
        return s;
    }
     
     
}
