/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.control;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import opera.exception.DadoInvalidoException;
import opera.exception.FichaInvalidaException;
import opera.model.Dado;
import opera.model.Jogo;

/**
 *
 * @author Luciano
 */
public class ControleDado {
    
    private static ControleDado instancia;
    
    public static ControleDado getInstance(){
        if(instancia == null){
            instancia = new ControleDado();
        }
        return instancia;
    }
    
    private ControleDado(){
        
    }
    
    public void cadastrarDado(Jogo jogo, int lados) throws IOException, DadoInvalidoException{
        Dado dado = new Dado(lados);
        serializarDado(jogo, dado);
    }
    
    
    public void deletarDado(Jogo jogo, Dado dado) throws DadoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Dados\\");
        File arquivo = new File(diretorio, dado.getLados()+".txt");
       
        if(arquivo.exists()){
            arquivo.delete();
        }else{
            throw new DadoInvalidoException("Dado invalido, esse dado nao existe para ser deletado");
        }
    }
    
    private void serializarDado(Jogo jogo, Dado dado) throws IOException, DadoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Dados\\");
        File arquivo = new File(diretorio, dado.getLados()+".txt");
       
        if(!arquivo.exists()){
            arquivo.createNewFile();

            //System.out.println(arquivo.getName());
            
            FileOutputStream fos = new FileOutputStream(arquivo);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(dado);
            }
            
        }else{
           throw new DadoInvalidoException("Dado invalido, ja existe um Dado com esse numero de lados");
        }
    }
    
}
