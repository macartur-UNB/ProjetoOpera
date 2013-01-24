/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Caracteristicas;
import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Caracteristica;
import model.Caracteristica_Especifica;


public class Controle_Caracteristica {

    
    public static void cadCaracteristica(
    String nome,String descricao,String tipo,int custo)
    throws FileNotFoundException, IOException, ArquivoInvalidoException{
       
        Caracteristica c = new Caracteristica(nome, descricao, tipo, custo);
        DAO_Caracteristicas.gravarCaracteristica(c);        
    }
    
    public static void cadCaracteristica(
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException, IOException, ArquivoInvalidoException{
    
        Caracteristica c = new Caracteristica(nome, descricao, tipo, modificador,custo);
        DAO_Caracteristicas.gravarCaracteristica(c);  
    }
    
    public static void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo) 
    throws FileNotFoundException, IOException, ArquivoInvalidoException{
    
        Caracteristica ce = new Caracteristica_Especifica(
        nome_Especifico,descricao_Especifica,nome, descricao, tipo,custo);
        DAO_Caracteristicas.gravarCaracteristica(ce);  
    }
    
    public static void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException,IOException, ArquivoInvalidoException{
        
        Caracteristica_Especifica ce;
        ce = new Caracteristica_Especifica(nome_Especifico, descricao_Especifica,
                                           nome, descricao, tipo, modificador,custo);
        DAO_Caracteristicas.gravarCaracteristica(ce);  
    }
    
    
    public static Caracteristica encontrarCaracteristica(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
            return DAO_Caracteristicas.carregarCaracteristica(nome, tipo);
    }   
    
    public static Caracteristica_Especifica encontrarCaracteristica_Especifica(
    String nome,String tipo)
    throws FileNotFoundException, FileNotFoundException, IOException,
    IOException, ClassNotFoundException{
        return DAO_Caracteristicas.carregarCaracteristica_Especifica(nome, tipo);
    }
    
    public static boolean CaracteristicaExiste(String nome,String tipo){
        return DAO_Caracteristicas.CaracteristicaExiste(nome, tipo);
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
       
    public static void removeCaracteristicaFisica(String nome) throws DeletarInvalidoException{
        DAO_Caracteristicas.removerCaracteristica(nome, "Fisica");
    }
    
    public static void removeCaracteristicaBelica(String nome) throws DeletarInvalidoException{
        DAO_Caracteristicas.removerCaracteristica(nome, "Belica");
    }
    
    public static void removeCaracteristicaPsiquica(String nome) throws DeletarInvalidoException{
        DAO_Caracteristicas.removerCaracteristica(nome, "Psiquica");
    }
    
    public static void removeTodasCaracteristicasFisicas() throws DeletarInvalidoException{
        DAO_Caracteristicas.removerTodasCaracteristicas("Fisica");
    }
    
    public static void removeTodasCaracteristicasPsiquicas() throws DeletarInvalidoException{
        DAO_Caracteristicas.removerTodasCaracteristicas("Psiquica");
    }
    
    public static void removeTodasCaracteristicasBelicas() throws DeletarInvalidoException{
        DAO_Caracteristicas.removerTodasCaracteristicas("Belica");
    }   
    
    public static void removeTodasCaracteristicas() throws DeletarInvalidoException{
        removeTodasCaracteristicasFisicas();
        removeTodasCaracteristicasBelicas();
        removeTodasCaracteristicasPsiquicas();
    }
    
    public static String[] listarCaracteristicasFisicas(){
       return DAO_Caracteristicas.listarCaracteristicas("Fisica"); 
    }
    
    public static String[] listarCaracteristicasPsiquicas(){
        return DAO_Caracteristicas.listarCaracteristicas("Psiquica");
    }
    
    public static String[] listarCaracteristicasBelicas(){
        return DAO_Caracteristicas.listarCaracteristicas("Belica");
    }    
    
    
}
