/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Dados;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Dado;

/**
 *
 * @author Macartur
 */
public class Controle_Dado {
    
    private static Controle_Dado instancia;
    public Controle_Dado() {
    }

    public static Controle_Dado getInstancia() {
        if(instancia == null){
            instancia = new Controle_Dado();
        }
        return instancia;
    }
    
    public void cadDado(int rolagem, int lados) throws FileNotFoundException, 
    IOException,ClassNotFoundException{
        
        Dado dado = new Dado(rolagem, lados);
        if(dado != null){
            DAO_Dados.gravarDADO(dado);
        }
    }
    
    
    public Dado encontrarDado(String nome_dado) throws FileNotFoundException,
            IOException,ClassNotFoundException{
    
        Dado dado = DAO_Dados.carregarDado(nome_dado);
        
        return dado;
    
    }
    public String[] listarTodosDados(){
       return DAO_Dados.listarTodosDados();
    }
    public void removerDado(String nome_dado){
         DAO_Dados.removerDado(nome_dado);
    }
    public void removerTodosDados(){
        DAO_Dados.removerTodosDados();
    }
}
