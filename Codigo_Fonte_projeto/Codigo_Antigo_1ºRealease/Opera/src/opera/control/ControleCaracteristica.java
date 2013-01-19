/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.control;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import opera.exception.CaracteristicaInvalidaException;
import opera.model.Caracteristica;
import opera.model.Jogo;

/**
 *
 * @author Macartur
 */
public class ControleCaracteristica {
    private static ControleCaracteristica instancia;
    
    private ControleCaracteristica() {
        
    }
    public static ControleCaracteristica getInstance(){
        if(instancia == null){
            instancia = new ControleCaracteristica();
        }
        return instancia;
    }
    
    public void cadastrarCaracteristica(Jogo jogo, String nome, String descricao, int custo) throws CaracteristicaInvalidaException, IOException{
        
        Caracteristica caracteristica = new Caracteristica(nome, descricao, custo);
        serializarCaracteristica(jogo, caracteristica);
        
    }
    
    public void cadastrarCaracteristica(Jogo jogo, String nome, String descricao, int custo, int[] modificador) throws CaracteristicaInvalidaException, IOException{
        
        Caracteristica caracteristica = new Caracteristica(nome, descricao, custo, modificador);
        serializarCaracteristica(jogo, caracteristica);
    }
    
    public void alterarCaracteristica(Jogo jogo, Caracteristica caracteristica, String nome, String descricao, int custo) throws CaracteristicaInvalidaException, IOException{
        deletarCaracteristica(jogo, caracteristica);
        cadastrarCaracteristica(jogo, nome, descricao, custo);
    }
    public void alterarCaracteristica(Jogo jogo, Caracteristica caracteristica, String nome, String descricao, int custo, int[] modificador) throws CaracteristicaInvalidaException, IOException{
        deletarCaracteristica(jogo, caracteristica);
        cadastrarCaracteristica(jogo, nome, descricao, custo, modificador);
    }
    
    public void deletarCaracteristica(Jogo jogo, Caracteristica caracteristica) throws CaracteristicaInvalidaException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Caracteristicas\\");
        File arquivo = new File(diretorio, caracteristica.getNome()+".txt");
       
        if(arquivo.exists()){
            //System.out.println(arquivo.getName());
           
            arquivo.delete();
                      
            //System.out.println("Deletado: " + delete);
        }else{
            throw new CaracteristicaInvalidaException("Caracteristica invalida, essa habilidade nao existe para ser deletada");
        }
    }
    
    private void serializarCaracteristica(Jogo jogo, Caracteristica caracteristica) throws IOException, CaracteristicaInvalidaException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Caracteristicas\\");
        File arquivo = new File(diretorio, caracteristica.getNome()+".txt");
       
        if(!arquivo.exists()){
            arquivo.createNewFile();

            //System.out.println(arquivo.getName());
            
            FileOutputStream fos = new FileOutputStream(arquivo);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(caracteristica);
            }
        }else{
            throw new CaracteristicaInvalidaException("Caracteristica invalida, ja existe uma caracteristica com esse nome");
        }
    }
}
