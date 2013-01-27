/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Jogo;
import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import exception.DiretorioInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Jogo;

/**
 *
 * @author Macartur
 */
public class Controle_Jogo {
    private static  Jogo jogo_rodando = null;
   
    
    public static  void criarJogo(String nome) throws DiretorioInvalidoException,
                                       FileNotFoundException, IOException {
       DAO_Jogo.verificarDiretorioRaiz();
       Jogo jogo = new Jogo(nome);
       DAO_Jogo.criarDiretoriosJogo(jogo);
       DAO_Jogo.gravarJogo(jogo);       
    }
 
   public static  void abrirJogo(String nome) throws FileNotFoundException,
    IOException, ClassNotFoundException{
        if(DAO_Jogo.jogoExiste(nome)){
            jogo_rodando = DAO_Jogo.carregarJogo(nome);
        }       
    }     
    
    public static  void apagarJogo(String nome) 
            throws ArquivoInvalidoException, DeletarInvalidoException,IOException,
            DiretorioInvalidoException{
        Jogo jogo = new Jogo(nome);
        DAO_Jogo.deletarJogo(jogo);
    }
   public String[] listarJogos(){
       return DAO_Jogo.jogosExistentes();
   }
 
}
