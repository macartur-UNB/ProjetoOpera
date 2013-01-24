/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Caracteristicas;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Caracteristica;
import model.Caracteristica_Especifica;

/**
 *
 * @author Macartur
 */
public class Controle_Caracteristicas {
     
    private static Controle_Caracteristica instancia;
    
    public Controle_Caracteristicas() {
    }

    public static Controle_Caracteristica getInstancia() {
        if(instancia == null){
            instancia = new Controle_Caracteristica();
        }
        return instancia;
    }
    
    
    public void cadCaracteristica(
    String nome,String descricao,String tipo,int custo)
    throws FileNotFoundException, IOException{
       
        Caracteristica c = new Caracteristica(nome, descricao, tipo, custo);
        DAO_Caracteristicas.gravarCaracteristica(c);        
    }
    
    public void cadCaracteristica(
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException, IOException{
    
        Caracteristica c = new Caracteristica(nome, descricao, tipo, modificador,custo);
        DAO_Caracteristicas.gravarCaracteristica(c); 
       
    }
    
    public void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo) 
    throws FileNotFoundException, IOException{
    
        Caracteristica ce = new Caracteristica_Especifica(
        nome_Especifico,descricao_Especifica,nome, descricao, tipo,custo);
        DAO_Caracteristicas.gravarCaracteristica(ce);  
    }
    
    public void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        
        Caracteristica_Especifica ce;
        ce = new Caracteristica_Especifica(nome_Especifico, descricao_Especifica,
                                           nome, descricao, tipo, modificador,custo);
        DAO_Caracteristicas.gravarCaracteristica(ce);  
    }
    
    
    public Caracteristica encontrarCaracteristica(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
            return DAO_Caracteristicas.carregarCaracteristica(nome, tipo);
    }   
    
    public Caracteristica_Especifica encontrarCaracteristica_Especifica(
    String nome,String tipo)
    throws FileNotFoundException, FileNotFoundException, IOException,
    IOException, ClassNotFoundException{
        return DAO_Caracteristicas.carregarCaracteristica_Especifica(nome, tipo);
    }
    
    public boolean CaracteristicaExiste(String nome,String tipo){
        return DAO_Caracteristicas.CaracteristicaExiste(nome, tipo);
    }
    
    public boolean CaracteristicaExiste(String nome){
        boolean status = false;
        if(CaracteristicaExiste(nome, "Fisica")  ||
           CaracteristicaExiste(nome,"Psiquica") ||
           CaracteristicaExiste(nome,"Racial")){
            
            status = true;
        }
        return status;      
    }
       
    public void removeCaracteristicaFisica(String nome){
        DAO_Caracteristicas.removerCaracteristica(nome, "Fisica");
    }
    
    public void removeCaracteristicaRacial(String nome){
        DAO_Caracteristicas.removerCaracteristica(nome, "Racial");
    }
    
    public void removeCaracteristicaPsiquica(String nome){
        DAO_Caracteristicas.removerCaracteristica(nome, "Psiquica");
    }
    
    public void removeTodasCaracteristicasFisicas(){
        DAO_Caracteristicas.removerTodasHabilidades("Fisica");
    }
    
    public void removeTodasCaracteristicasPsiquicas(){
        DAO_Caracteristicas.removerTodasHabilidades("Psiquica");
    }
    
    public void removeTodasCaracteristicasRaciais(){
        DAO_Caracteristicas.removerTodasHabilidades("Racial");
    }   
    
    public void removeTodasCaracteristicas(){
        removeTodasCaracteristicasFisicas();
        removeTodasCaracteristicasRaciais();
        removeTodasCaracteristicasPsiquicas();
    }
    
    public String[] listarCaracteristicasFisicas(){
       return DAO_Caracteristicas.listarCaracteristicas("Fisica"); 
    }
    
    public String[] listarCaracteristicasPsiquicas(){
        return DAO_Caracteristicas.listarCaracteristicas("Psiquica");
    }
    
    public String[] listarCaracteristicasRaciais(){
        return DAO_Caracteristicas.listarCaracteristicas("Racial");
    }    
    
}
