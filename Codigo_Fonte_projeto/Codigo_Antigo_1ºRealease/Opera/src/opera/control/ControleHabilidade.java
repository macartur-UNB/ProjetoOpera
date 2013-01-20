/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.control;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import opera.exception.HabilidadeInvalidaException;
import opera.model.Habilidade;
import opera.model.Jogo;

/**
 *
 * @author Macartur
 */
public class ControleHabilidade {
    private static ControleHabilidade instancia;
    
    private ControleHabilidade() {

    }
    
    public static ControleHabilidade getInstance(){
        if(instancia == null){
            instancia = new ControleHabilidade();
        }      
        return instancia;
    }
    
    public void cadastrarHabilidade(Jogo jogo, String nome, int teste, 
            int nivel, int custo) throws HabilidadeInvalidaException, IOException{
        
        Habilidade habilidade = new Habilidade(nome, teste, nivel, custo);
        
        serializarHabilidade(jogo, habilidade);
        
    }
    
    public void alterarHabilidade(Jogo jogo, Habilidade habilidade, String nome, 
            int teste, int nivel, int custo) throws HabilidadeInvalidaException, IOException{
        
        deletarHabilidade(jogo, habilidade);
        
        cadastrarHabilidade(jogo, nome, teste, nivel, custo);
    }
    
    public void deletarHabilidade(Jogo jogo, Habilidade habilidade) throws HabilidadeInvalidaException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Habilidades\\");
        File arquivo = new File(diretorio, habilidade.getNome()+".txt");
       
        if(arquivo.exists()){
            System.out.println(arquivo.getName());
           
            boolean delete = arquivo.delete();
                      
            System.out.println("Deletado: " + delete);
        }else{
            throw new HabilidadeInvalidaException("Habilidade invalida, essa habilidade nao existe para ser deletada");
        }
    }
    
    private void serializarHabilidade(Jogo jogo, Habilidade habilidade) throws IOException, HabilidadeInvalidaException{
        
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Habilidades\\");
        File arquivo = new File(diretorio, habilidade.getNome()+".txt");
       
        if(!arquivo.exists()){
            arquivo.createNewFile();

            //System.out.println(arquivo.getName());

            FileOutputStream fos = new FileOutputStream(arquivo);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(habilidade);
            }
        }else{
            throw new HabilidadeInvalidaException("Habilidade invalida, ja existe uma habilidade com esse nome");
        }
    }
}
