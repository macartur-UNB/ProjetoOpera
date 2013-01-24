/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Dado;
import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Dado;


public class Controle_Dado {

    
    public static void cadDado(int rolagem, int lados) throws FileNotFoundException, 
    IOException,ClassNotFoundException, ArquivoInvalidoException{
        
        Dado dado = new Dado(rolagem, lados);
        if(dado != null){
            DAO_Dado.gravarDADO(dado);
        }
    }
    
    
    public static Dado encontrarDado(String nome_dado) throws FileNotFoundException,
            IOException,ClassNotFoundException{
    
        Dado dado = DAO_Dado.carregarDado(nome_dado);
        
        return dado;
    
    }
    public static String[] listarTodosDados(){
       return DAO_Dado.listarTodosDados();
    }
    public static void removerDado(String nome_dado) throws DeletarInvalidoException{
         DAO_Dado.removerDado(nome_dado);
    }
    public static void removerTodosDados() throws DeletarInvalidoException{
        DAO_Dado.removerTodosDados();
    }
    
    
}
