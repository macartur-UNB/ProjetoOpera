 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import opera.exception.CriacaoPastaInvalidaException;
import opera.exception.JogoInvalidoException;
import opera.model.Jogo;

/**
 *
 * @author Luciano
 */
public class ControleJogo {
    
    private static ControleJogo instancia;
    
    private String nome[];
    
    public static ControleJogo getInstance(){
        if(instancia == null){
            instancia = new ControleJogo();
        }
        return instancia;
    }
    
    private ControleJogo(){
        
    }
    
    public void criarNovoJogo(String nome) throws CriacaoPastaInvalidaException, FileNotFoundException, IOException, JogoInvalidoException{
        verificarPastaOpera();
        verificarPastaJogos();

        Jogo jogo = new Jogo(nome);
        if(!existe(jogo)){
            criarPastaDoJogo(jogo);
        }else{
            throw new JogoInvalidoException("O jogo " + nome + " ja existe.");
        }
    }
    
    public String abrirJogo(String nome) throws CriacaoPastaInvalidaException, JogoInvalidoException{
        verificarPastaOpera();
        verificarPastaJogos();
        if( ("".equals(nome)) || (nome == null) || (" ".equals(nome)) ){
            throw new JogoInvalidoException("Nome de Jogo esta invalido.");
        }
        return nome;
    }
    
    public void deletarJogo(Jogo jogo) throws JogoInvalidoException, IOException{
        
        //System.out.println("public void deletarJogo(Jogo jogo)");
        
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome());
        
        //System.out.println(diretorio);
        
        if(diretorio.exists()){
            
            //System.out.println("Diretorio Existe!");
            
            File arquivos[] = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\Jogador").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\Jogador").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\Monstro").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\Monstro").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\NPC").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\NPC").delete();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Habilidades").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Habilidades").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Caracteristicas").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Caracteristicas").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma Branca").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma Branca").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma de Fogo").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma de Fogo").delete();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Armadura").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Armadura").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Item").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Item").delete();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos").delete();
            
            arquivos = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Dados").listFiles();
            for(int i = 0; i < arquivos.length; i++){
                arquivos[i].delete();
            }
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Dados").delete();
            
            
            
            if(!diretorio.delete()){
                throw new JogoInvalidoException("Erro ao Deletar o Jogo");
            }
            
            
            
            //Path delDiretorio = Paths.get(diretorio.getAbsolutePath());
            //Files..delete(delDiretorio);
            
            //System.out.println("Deletado: " + deletado);
            
        }else{
            throw new JogoInvalidoException("Jogo invalido, esse jogo nao existe para ser deletado");
        }
    }
    
    private void verificarPastaOpera() throws CriacaoPastaInvalidaException{
        File diretorio = new File("C:\\Opera");
        boolean statusDiretorio = true;
        if(!diretorio.exists()){
            statusDiretorio = diretorio.mkdir();
        }
        if(!statusDiretorio){
            throw new CriacaoPastaInvalidaException("Nao foi possivel enontrar ou criar pasta 'Opera'");
        }   
    }
    private void verificarPastaJogos() throws CriacaoPastaInvalidaException{
        File diretorio = new File("C:\\Opera\\Jogos");
        boolean statusDiretorio = true;
        if(!diretorio.exists()){
            statusDiretorio = diretorio.mkdir();
        }
        if(!statusDiretorio){
            throw new CriacaoPastaInvalidaException("Nao foi possivel enontrar ou criar pasta 'Jogos'");
        }   
    }
    
    private void criarPastaDoJogo(Jogo jogo) throws CriacaoPastaInvalidaException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome());
        boolean statusDiretorio = true;
        if(!diretorio.exists()){
            statusDiretorio = diretorio.mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\Jogador").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\Monstro").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\NPC").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Habilidades").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Caracteristicas").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Item").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma Branca").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma de Fogo").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Armadura").mkdir();
            new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Dados").mkdir();
        }else{
            throw new CriacaoPastaInvalidaException("Nome invalido ou já existente.");
        }
        if(!statusDiretorio){
            throw new CriacaoPastaInvalidaException("Nao foi possivel enontrar ou criar pasta '" + jogo.getNome() + "'");
        }   
    }

    private boolean existe(Jogo jogo) throws JogoInvalidoException{
        boolean existe = false;
        if( (jogo.getNome() != null) && (!"".equals(jogo.getNome())) && (!" ".equals(jogo.getNome())) ){
            File diretorio = new File("C:\\Opera\\Jogos");

            String arquivos[] = diretorio.list();

            for(int i = 0; i < arquivos.length; i++){
                if(jogo.getNome().equals(arquivos[i])){
                    existe = true;
                }
            }
        }else{
            throw new JogoInvalidoException("Nome do jogo esta invalido");
        }
        
        return existe;
    }
    
    public String[] nomePersonagemFichas(Jogo jogo){
       
       File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas");

       return diretorio.list();
   }
    
}
