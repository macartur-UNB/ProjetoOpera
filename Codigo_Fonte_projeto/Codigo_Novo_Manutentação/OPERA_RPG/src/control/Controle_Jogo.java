/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import exception.DiretorioInvalidaException;
import java.io.FileNotFoundException;
import java.io.IOException;
import validacao.Validacoes;
import model.Jogo;
 
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
       DAO.getInstancia().c_Jogo.verificarDiretorioRaiz();
       Jogo jogo = new Jogo(nome);
       DAO.getInstancia().c_Jogo.criarDiretoriosJogo(jogo);
       DAO.getInstancia().c_Jogo.gravarJogo(jogo);       
    }
 
   public void abrirJogo(String nome) throws FileNotFoundException,
    IOException, ClassNotFoundException{
        if(DAO.getInstancia().c_Jogo.jogoExiste(nome)){
            jogo_rodando = DAO.getInstancia().c_Jogo.carregarJogo(nome);
        }       
    }     
    
    public void apagarJogo(String nome){
        Jogo n = new Jogo(nome);
        DAO.getInstancia().c_Jogo.deletarJogo(n);
    }
   
   
}
