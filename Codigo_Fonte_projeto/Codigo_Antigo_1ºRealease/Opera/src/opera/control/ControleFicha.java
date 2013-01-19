/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.control;

import opera.exception.FichaInvalidaException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import opera.model.Ficha;
import opera.model.Jogo;

/**
 *
 * @author Macartur
 */
public class ControleFicha {
    
    private static ControleFicha instancia;
    
    private ControleFicha() {
        
    }
    
    public static ControleFicha getInstance(){
        if(instancia == null){
            instancia = new ControleFicha();
        }
        return instancia;
    } 
    

    public void cadastrarFicha(Jogo jogo, String personagem, int experiencia, String tipo, int[] atributos) throws FichaInvalidaException, IOException{
        Ficha ficha = new Ficha(personagem, experiencia, tipo, atributos);
        serializarFicha(jogo, ficha);
    }
    
   public void cadastrarFicha(Jogo jogo, String personagem, 
           String jogador, String campanha, int experiencia, String tipo, 
           int[] atributos) throws FichaInvalidaException,
           FileNotFoundException, IOException, FichaInvalidaException{
       
       Ficha ficha = new Ficha(personagem, jogador, campanha, experiencia, tipo, atributos);
       serializarFicha(jogo, ficha);
       
   }
   
   
   public void alterarFicha(Jogo jogo, Ficha ficha, String personagem, int experiencia, String tipo, int[] atributos) throws FichaInvalidaException, IOException{
       
       deletarFicha(jogo, ficha);
       
       cadastrarFicha(jogo, personagem, experiencia, tipo, atributos);
   }
   
   public void alterarFicha(Jogo jogo, Ficha ficha, String personagem, 
           String jogador, String campanha, int experiencia, String tipo, 
           int[] atributos) throws FichaInvalidaException, IOException{
       
       deletarFicha(jogo, ficha);
       
       cadastrarFicha(jogo, personagem, jogador, campanha, experiencia, tipo, atributos);
   }
   
   
   public void deletarFicha(Jogo jogo, Ficha ficha) throws FichaInvalidaException, IOException{
       
       String acrecimoDiretorio = null;
       
       if(ficha.getTipo().toLowerCase().equals("jogador")){
           acrecimoDiretorio = "Jogador\\";
       }
       if(ficha.getTipo().toLowerCase().equals("monstro")){
           acrecimoDiretorio = "Monstro\\";
       }
       if(ficha.getTipo().toLowerCase().equals("npc")){
           acrecimoDiretorio = "NPC\\";
       }
       
       File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\" + acrecimoDiretorio);
       File arquivo = new File(diretorio, ficha.getPersonagem()+".txt");
       
       if(arquivo.exists()){
           
           Path delArquivo = Paths.get(arquivo.getAbsolutePath());
           
           Files.delete(delArquivo);
           
       }else{
           throw new FichaInvalidaException("Ficha invalida, essa ficha nao existe para ser deletada");
       }       
   }
   
   private void serializarFicha(Jogo jogo, Ficha ficha) throws IOException, FichaInvalidaException{
       
       String acrecimoDiretorio = null;
       
       if(ficha.getTipo().toLowerCase().equals("jogador")){
           acrecimoDiretorio = "Jogador\\";
       }
       if(ficha.getTipo().toLowerCase().equals("monstro")){
           acrecimoDiretorio = "Monstro\\";
       }
       if(ficha.getTipo().toLowerCase().equals("npc")){
           acrecimoDiretorio = "NPC\\";
       }
       
       File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Fichas\\" + acrecimoDiretorio);
       File arquivo = new File(diretorio, ficha.getPersonagem()+".txt");
       
       if(!arquivo.exists()){
            arquivo.createNewFile();

            //System.out.println(arquivo.getName());
            
            FileOutputStream fos = new FileOutputStream(arquivo);
           try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
               oos.writeObject(ficha);
           }
       }else{
           throw new FichaInvalidaException("Ficha invalida, ja existe um personagem com esse nome");
       }
       
       
   }
}
