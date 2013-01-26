/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Jogo;
import exception.DiretorioInvalidaException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Jogo;
import validacao.Validacoes;

/**
 *
 * @author Macartur
 */
public class Controle_Jogo {
    private Jogo jogo_rodando = null;
    private static Controle_Jogo instancia ;
    
    public Controle_Jogo() {
    }

    public static Controle_Jogo getInstancia() {
        if(instancia == null){
            instancia = new Controle_Jogo();
        }        
        
        return instancia;
    }
    
    public void criarJogo(String nome) throws DiretorioInvalidaException,
                                       FileNotFoundException, IOException {
       Validacoes.getInstance().validarCaracteresNome(nome, true);
       DAO_Jogo.verificarDiretorioRaiz();
       Jogo jogo = new Jogo(nome);
       DAO_Jogo.criarDiretoriosJogo(jogo);
       DAO_Jogo.gravarJogo(jogo);       
    }
 
   public void abrirJogo(String nome) throws FileNotFoundException,
    IOException, ClassNotFoundException{
        if(DAO_Jogo.jogoExiste(nome)){
            jogo_rodando = DAO_Jogo.carregarJogo(nome);
        }       
    }     
    
    public void apagarJogo(String nome){
        Jogo n = new Jogo(nome);
        DAO_Jogo.deletarJogo(n);
    }
   
 
}
