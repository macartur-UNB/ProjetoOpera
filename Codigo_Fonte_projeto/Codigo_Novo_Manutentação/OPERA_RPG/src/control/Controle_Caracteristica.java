/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Caracteristica;
import exception.ArquivoInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Caracteristica;
import model.Caracteristica_Especifica;

/**
 *
 * @author Macartur
 */
public class Controle_Caracteristica {
     
   
    
    public static void cadCaracteristica(
    String nome,String descricao,String tipo,int custo)
    throws FileNotFoundException, IOException{
       
        Caracteristica c = new Caracteristica(nome, descricao, tipo, custo);
        DAO_Caracteristica.gravarCaracteristica(c);        
    }
    
    public static void cadCaracteristica(
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException, IOException{
    
        Caracteristica c = new Caracteristica(nome, descricao, tipo, modificador,custo);
        DAO_Caracteristica.gravarCaracteristica(c); 
       
    }
    
    public static void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo) 
    throws FileNotFoundException, IOException{
    
        Caracteristica ce = new Caracteristica_Especifica(
        nome_Especifico,descricao_Especifica,nome, descricao, tipo,custo);
        DAO_Caracteristica.gravarCaracteristica(ce);  
    }
    
    public static void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        
        Caracteristica_Especifica ce;
        ce = new Caracteristica_Especifica(nome_Especifico, descricao_Especifica,
                                           nome, descricao, tipo, modificador,custo);
        DAO_Caracteristica.gravarCaracteristica(ce);  
    }
    
    
    public static Caracteristica encontrarCaracteristica(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
            return DAO_Caracteristica.carregarCaracteristica(nome, tipo);
    }   
    
    public static Caracteristica_Especifica encontrarCaracteristica_Especifica(
    String nome,String tipo)
    throws FileNotFoundException, FileNotFoundException, IOException,
    IOException, ClassNotFoundException{
        return DAO_Caracteristica.carregarCaracteristica_Especifica(nome, tipo);
    }
    
    public static boolean CaracteristicaExiste(String nome,String tipo){
        return DAO_Caracteristica.CaracteristicaExiste(nome, tipo);
    }
    
    public static boolean CaracteristicaExiste(String nome){
        boolean status = false;
        if(CaracteristicaExiste(nome, "Fisica")  ||
           CaracteristicaExiste(nome,"Psiquica") ||
           CaracteristicaExiste(nome,"Racial")){
            
            status = true;
        }
        return status;      
    }
       
    public static void removeCaracteristicaFisica(String nome) throws ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Fisica");
    }
    
    public static void removeCaracteristicaRacial(String nome) throws ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Racial");
    }
    
    public static void removeCaracteristicaPsiquica(String nome) throws ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Psiquica");
    }
    
    public static void removeTodasCaracteristicasFisicas() throws ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasHabilidades("Fisica");
    }
    
    public static void removeTodasCaracteristicasPsiquicas() throws ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasHabilidades("Psiquica");
    }
    
    public static void removeTodasCaracteristicasRaciais() throws ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasHabilidades("Racial");
    }   
    
    public static void removeTodasCaracteristicas() throws ArquivoInvalidoException{
        removeTodasCaracteristicasFisicas();
        removeTodasCaracteristicasRaciais();
        removeTodasCaracteristicasPsiquicas();
    }
    
    public static String[] listarCaracteristicasFisicas(){
       return DAO_Caracteristica.listarCaracteristicas("Fisica"); 
    }
    
    public static String[] listarCaracteristicasPsiquicas(){
        return DAO_Caracteristica.listarCaracteristicas("Psiquica");
    }
    
    public static String[] listarCaracteristicasRaciais(){
        return DAO_Caracteristica.listarCaracteristicas("Racial");
    }    
    
}
