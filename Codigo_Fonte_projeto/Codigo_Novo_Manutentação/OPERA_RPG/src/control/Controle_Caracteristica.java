/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.dao.DAO_Caracteristica;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Caracteristica;
import model.classes.Caracteristica_Especifica;


public class Controle_Caracteristica {

    
    public static void cadCaracteristica(
    String nome,String descricao,String tipo,int custo)
    throws FileNotFoundException, IOException, ArquivoInvalidoException{
       
        Caracteristica c = new Caracteristica(nome, descricao, tipo, custo);
        DAO_Caracteristica.gravarCaracteristica(c);        
    }
    
    public static void cadCaracteristica(
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException, IOException, ArquivoInvalidoException{
    
        Caracteristica c = new Caracteristica(nome, descricao, tipo, modificador,custo);
        DAO_Caracteristica.gravarCaracteristica(c);  
    }
    
    public static void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo) 
    throws FileNotFoundException, IOException, ArquivoInvalidoException{
    
        Caracteristica ce = new Caracteristica_Especifica(
        nome_Especifico,descricao_Especifica,nome, descricao, tipo,custo);
        DAO_Caracteristica.gravarCaracteristica(ce);  
    }
    
    public static void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException,IOException, ArquivoInvalidoException{
        
        Caracteristica_Especifica ce;
        ce = new Caracteristica_Especifica(nome_Especifico, descricao_Especifica,
                                           nome, descricao, tipo, modificador,custo);
        DAO_Caracteristica.gravarCaracteristica(ce);  
    }
    
    
    public static Caracteristica encontrarCaracteristica(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
            return DAO_Caracteristica.carregarCaracteristica(nome, tipo);
    }   
    
    public static Caracteristica_Especifica encontrarCaracteristica_Especifica(
    String nome,String tipo)
    throws FileNotFoundException, FileNotFoundException, IOException,
    IOException, ClassNotFoundException,
    ArquivoInvalidoException{
        return DAO_Caracteristica.carregarCaracteristica_Especifica(nome, tipo);
    }
    
    public static boolean CaracteristicaExiste(String nome,String tipo){
        return DAO_Caracteristica.CaracteristicaExiste(nome, tipo);
    }
    
    public static boolean CaracteristicaExiste(String nome){
        boolean status = false;
        if(CaracteristicaExiste(nome, "Fisica")  ||
           CaracteristicaExiste(nome,"Psiquica") ||
           CaracteristicaExiste(nome,"Belica")){
            status = true;
        }
        return status;      
    }
       
    public static void removeCaracteristicaFisica(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Fisica");
    }
    
    public static void removeCaracteristicaBelica(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Belica");
    }
    
    public static void removeCaracteristicaPsiquica(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Psiquica");
    }
    
    public static void removeTodasCaracteristicasFisicas() throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasCaracteristicas("Fisica");
    }
    
    public static void removeTodasCaracteristicasPsiquicas() throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasCaracteristicas("Psiquica");
    }
    
    public static void removeTodasCaracteristicasBelicas() throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasCaracteristicas("Belica");
    }   
    
    public static void removeTodasCaracteristicas() throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        removeTodasCaracteristicasFisicas();
        removeTodasCaracteristicasBelicas();
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
