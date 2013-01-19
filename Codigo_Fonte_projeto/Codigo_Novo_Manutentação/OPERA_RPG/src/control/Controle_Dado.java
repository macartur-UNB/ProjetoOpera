/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.Dado;


public class Controle_Dado {
    
    private static Controle_Dado instancia;
    private String endereco;
    public Controle_Dado() {
    }

    public static Controle_Dado getInstancia() {
        if(instancia == null){
            instancia = new Controle_Dado();
        }
        return instancia;
    }
    
    public void cadDado(int rolagem, int lados) throws FileNotFoundException, 
    IOException, IOException,ClassNotFoundException{
        
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Dados";
        Dado dado = new Dado(rolagem, lados);
        Controle_Diretorios.getInstancia().gravarArquivo(endereco, rolagem+"d"+lados, dado);
    
    }
    
    public Dado encontrarDado(String nome_dado) throws FileNotFoundException,
    FileNotFoundException, IOException, IOException, ClassNotFoundException{
    
        Dado dado = null;
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Dados";
        if(Controle_Diretorios.getInstancia().arquivoExiste(endereco, nome_dado)){
            dado = (Dado)Controle_Diretorios.getInstancia().carregarArquivo(endereco, nome_dado);
        }
        return dado;
    
    }
    
    public void removerDado(String nome_dado){
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Dados";
        if(Controle_Diretorios.getInstancia().arquivoExiste(endereco, nome_dado)){
            Controle_Diretorios.getInstancia().removeArquivo(endereco,nome_dado);
        }
    }
    
    
    
}
