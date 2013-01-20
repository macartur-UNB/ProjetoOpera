/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.DiretorioInvalidaException;
import exception.ValidarException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Jogo;
import opera.exception.JogoInvalidoException;

 
public class Controle_Jogo {
    private Jogo jogo_rodando;
    private static Controle_Jogo instancia ;
    private final String ENDERECO = "C:\\Opera\\Jogos\\";
    private Controle_Diretorios diretorio;
    public Controle_Jogo() {
        diretorio = Controle_Diretorios.getInstancia();
    }

    public static Controle_Jogo getInstancia() {
        if(instancia == null){
            instancia = new Controle_Jogo();
        }        
        return instancia;
    }
    
    public void criarJogo(String nome) throws DiretorioInvalidaException,
                                       FileNotFoundException, IOException {
       ValidarException.validarNome(nome);
       verificarDiretorioRaiz();
       Jogo jogo = new Jogo(nome);
       criarPastaJogo(jogo);
       
       diretorio.gravarArquivo(ENDERECO+jogo.getNome(),jogo.getNome(), jogo);
    }
 
    private void verificarDiretorioRaiz() throws DiretorioInvalidaException{
        boolean status = true;
        if(!diretorio.diretorioExiste(ENDERECO)){
            diretorio.criarDiretorio("C:\\Opera");
            status = diretorio.criarDiretorio(ENDERECO);
        }
        if(!status){
            throw  new DiretorioInvalidaException("Não foi possivel criar Diretorio do jogo");
        }
    }
    
    private void criarPastaJogo(Jogo jogo){ 
        String endereco_jogo = ENDERECO+jogo.getNome();
        if(!diretorio.diretorioExiste(endereco_jogo)){
            diretorio.criarDiretorio(endereco_jogo);
            diretorio.criarDiretorio(endereco_jogo+"\\Fichas");
            diretorio.criarDiretorio(endereco_jogo+"\\Fichas\\Jogador");
            diretorio.criarDiretorio(endereco_jogo+"\\Fichas\\NPC");
            diretorio.criarDiretorio(endereco_jogo+"\\Fichas\\Monstro");
            diretorio.criarDiretorio(endereco_jogo+"\\Habilidades");
            diretorio.criarDiretorio(endereco_jogo+"\\Habilidades\\Fisicas");
            diretorio.criarDiretorio(endereco_jogo+"\\Habilidades\\Psiquicas");
            diretorio.criarDiretorio(endereco_jogo+"\\Habilidades\\Belica");
            diretorio.criarDiretorio(endereco_jogo+"\\Caracteristicas");
            diretorio.criarDiretorio(endereco_jogo+"\\Caracteristicas\\Fisicas");
            diretorio.criarDiretorio(endereco_jogo+"\\Caracteristicas\\Psiquicas");
            diretorio.criarDiretorio(endereco_jogo+"\\Caracteristicas\\Belicas");            
            diretorio.criarDiretorio(endereco_jogo+"\\Itens");
            diretorio.criarDiretorio(endereco_jogo+"\\Itens\\Generico");
            diretorio.criarDiretorio(endereco_jogo+"\\Itens\\Armas");
            diretorio.criarDiretorio(endereco_jogo+"\\Itens\\Armas\\Arma_Corpo_A_Corpo");
            diretorio.criarDiretorio(endereco_jogo+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
            diretorio.criarDiretorio(endereco_jogo+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
            diretorio.criarDiretorio(endereco_jogo+"\\Itens\\Armas\\Arma_A_Distancia");
            diretorio.criarDiretorio(endereco_jogo+"\\Itens\\Armaduras");
            diretorio.criarDiretorio(endereco_jogo+"\\Dados");
        }        
    }
   
    public void abrirJogo(String nome) throws FileNotFoundException,
    IOException, ClassNotFoundException{
        
        if(diretorio.diretorioExiste(ENDERECO+nome)){
            jogo_rodando = (Jogo) diretorio.carregarArquivo(ENDERECO+nome,nome);
        }       
    }   
    
    public boolean deletarJogo(String nome) throws JogoInvalidoException{
        String endereco_jogo= ENDERECO+nome;
        boolean status = false; 
        if(diretorio.diretorioExiste(endereco_jogo)  && jogo_rodando.getNome() != nome){
            //remover arquivos dos diretorios
            
            diretorio.deletarArquivos(endereco_jogo+"\\Fichas\\Jogador");
            diretorio.deletarArquivos(endereco_jogo+"\\Fichas\\NPC");
            diretorio.deletarArquivos(endereco_jogo+"\\Fichas\\Monstro");
            diretorio.deletarArquivos(endereco_jogo+"\\Fichas");
            diretorio.deletarArquivos(endereco_jogo+"\\Habilidades\\Fisicas");
            diretorio.deletarArquivos(endereco_jogo+"\\Habilidades\\Psiquicas");
            diretorio.deletarArquivos(endereco_jogo+"\\Habilidades\\Belica");
            diretorio.deletarArquivos(endereco_jogo+"\\Habilidades");
            diretorio.deletarArquivos(endereco_jogo+"\\Caracteristicas\\Fisicas");
            diretorio.deletarArquivos(endereco_jogo+"\\Caracteristicas\\Psiquicas");
            diretorio.deletarArquivos(endereco_jogo+"\\Caracteristicas\\Belicas");
            diretorio.deletarArquivos(endereco_jogo+"\\Caracteristicas");
            diretorio.deletarArquivos(endereco_jogo+"\\Itens");
            diretorio.deletarArquivos(endereco_jogo+"\\Itens\\Generico");
            diretorio.deletarArquivos(endereco_jogo+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
            diretorio.deletarArquivos(endereco_jogo+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
            diretorio.deletarArquivos(endereco_jogo+"\\Itens\\Armas\\Arma_A_Distancia");
            diretorio.deletarArquivos(endereco_jogo+"\\Itens\\Armaduras");
            diretorio.deletarArquivos(endereco_jogo+"\\Dados");    
            diretorio.deletarArquivos(endereco_jogo);
            //remover diretorios
            diretorio.removeDiretorio(endereco_jogo+"\\Fichas\\Jogador");
            diretorio.removeDiretorio(endereco_jogo+"\\Fichas\\NPC");
            diretorio.removeDiretorio(endereco_jogo+"\\Fichas\\Monstro");
            diretorio.removeDiretorio(endereco_jogo+"\\Fichas");
            diretorio.removeDiretorio(endereco_jogo+"\\Habilidades\\Fisicas");
            diretorio.removeDiretorio(endereco_jogo+"\\Habilidades\\Psiquicas");
            diretorio.removeDiretorio(endereco_jogo+"\\Habilidades\\Belicas");
            diretorio.removeDiretorio(endereco_jogo+"\\Habilidades");
            diretorio.removeDiretorio(endereco_jogo+"\\Caracteristicas\\Fisicas");
            diretorio.removeDiretorio(endereco_jogo+"\\Caracteristicas\\Psiquicas");
            diretorio.removeDiretorio(endereco_jogo+"\\Caracteristicas\\Belicas");  
            diretorio.removeDiretorio(endereco_jogo+"\\Caracteristicas");
            diretorio.removeDiretorio(endereco_jogo+"\\Itens\\Generico");
            diretorio.removeDiretorio(endereco_jogo+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\Branca");
            diretorio.removeDiretorio(endereco_jogo+"\\Itens\\Armas\\Arma_Corpo_A_Corpo\\De_Fogo");
            diretorio.removeDiretorio(endereco_jogo+"\\Itens\\Armas\\Arma_Corpo_A_Corpo");
            diretorio.removeDiretorio(endereco_jogo+"\\Itens\\Armas\\Arma_A_Distancia");
            diretorio.removeDiretorio(endereco_jogo+"\\Itens\\Armas");
            diretorio.removeDiretorio(endereco_jogo+"\\Itens\\Armaduras");
            diretorio.removeDiretorio(endereco_jogo+"\\Itens");
            diretorio.removeDiretorio(endereco_jogo+"\\Dados");
            status = diretorio.removeDiretorio(endereco_jogo);   
        }
        else{
            throw  new JogoInvalidoException("Jogo com o nome:"+nome+"esta aberto");
        }
            
        return status;
    }
  
    
    public String enderecoJogoRodando(){
        return ENDERECO+jogo_rodando.getNome();
    }
    
    public String[] jogosExistentes(){
        return Controle_Diretorios.getInstancia().listarArquivos(ENDERECO);        
    }
    
    
    
}
