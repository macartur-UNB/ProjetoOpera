/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Habilidade;
import exception.ArquivoInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Habilidade;

/**
 *
 * @author Macartur
 */
public class Controle_Habilidade {
    
    
    
    
    public static void cadHabilidade(
    int teste, int nivel, int custo, String nome,String tipo)
    throws FileNotFoundException, IOException{
       
        Habilidade h = new Habilidade(teste, nivel, custo, nome, tipo);
        DAO_Habilidade.gravarHabilidade(h);        
    }    
        
    public  static Habilidade encontrarHabilidade(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
            return DAO_Habilidade.carregarHabilidade(nome, tipo);
    }    
    
    public static  boolean HabilidadeExiste(String nome,String tipo){
        return DAO_Habilidade.HabilidadeExiste(nome, tipo);
    }
    
    public static  boolean HabilidadeExiste(String nome){
        boolean status = false;
        if(HabilidadeExiste(nome, "Fisica")  ||
           HabilidadeExiste(nome,"Psiquica") ||
           HabilidadeExiste(nome,"Belica")){
            status = true;
        }
        return status;      
    }
       
    public static  void removeHabilidadeFisica(String nome) throws ArquivoInvalidoException{
        DAO_Habilidade.removerHabilidade(nome, "Fisica");
    }
    
    public static  void removeHabilidadeBelica(String nome) throws ArquivoInvalidoException{
        DAO_Habilidade.removerHabilidade(nome, "Belica");
    }
    
    public static  void removeHabilidadePsiquica(String nome) throws ArquivoInvalidoException{
        DAO_Habilidade.removerHabilidade(nome, "Psiquica");
    }
    
    public static  void removeTodasHabilidadesFisicas() throws ArquivoInvalidoException{
        DAO_Habilidade.removerTodasHabilidades("Fisica");
    }
    
    public static  void removeTodasHabilidadesPsiquicas() throws ArquivoInvalidoException{
        DAO_Habilidade.removerTodasHabilidades("Psiquica");
    }
    
    public  static void removeTodasHabilidadesBelicas() throws ArquivoInvalidoException{
        DAO_Habilidade.removerTodasHabilidades("Belica");
    }   
    
    public  static void removeTodasHabilidades() throws ArquivoInvalidoException{
        removeTodasHabilidadesFisicas();
        removeTodasHabilidadesBelicas();
        removeTodasHabilidadesPsiquicas();
    }
    
    public  static String[] listarHabilidadeFisicas(){
       return DAO_Habilidade.listarHabilidades("Fisica"); 
    }
    
    public static  String[] listarHabilidadesPsiquicas(){
        return DAO_Habilidade.listarHabilidades("Psiquica");
    }
    
    public static  String[] listarHabilidadesBelicas(){
        return DAO_Habilidade.listarHabilidades("Belica");
    }    
    
}
