/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Dado;


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
            DAO.getInstancia().c_Dado.gravarDADO(dado);
        }
    }
    
    
    public Dado encontrarDado(String nome_dado) throws FileNotFoundException,
            IOException,ClassNotFoundException{
    
        Dado dado = DAO.getInstancia().c_Dado.carregarDado(nome_dado);
        
        return dado;
    
    }
    public String[] listarTodosDados(){
       return DAO.getInstancia().c_Dado.listarTodosDados();
    }
    public void removerDado(String nome_dado){
         DAO.getInstancia().c_Dado.removerDado(nome_dado);
    }
    public void removerTodosDados(){
        DAO.getInstancia().c_Dado.removerTodosDados();
    }
    
    
}
