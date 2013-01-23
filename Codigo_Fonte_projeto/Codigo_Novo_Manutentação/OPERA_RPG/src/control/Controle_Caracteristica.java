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


public class Controle_Caracteristica {
    
    private static Controle_Caracteristica instancia;
    
    public Controle_Caracteristica() {
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
        if(c != null){
            DAO_Caracteristicas.gravarCaracteristica(c);        
        }
    }
    
    public void cadCaracteristica(
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException, IOException{
    
        Caracteristica c = new Caracteristica(nome, descricao, tipo, modificador,custo);
        if(c != null){
            DAO_Caracteristicas.gravarCaracteristica(c);        
        }
    }
    
    public void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo) 
    throws FileNotFoundException, IOException{
    
        Caracteristica ce = new Caracteristica_Especifica(
        nome_Especifico,descricao_Especifica,nome, descricao, tipo,custo);
       if(ce != null){
            DAO_Caracteristicas.gravarCaracteristica(ce);        
        }
    }
    
    public void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        
        Caracteristica_Especifica ce;
        ce = new Caracteristica_Especifica(nome_Especifico, descricao_Especifica,
                                           nome, descricao, tipo, modificador,custo);
       if(ce != null){
            DAO_Caracteristicas.gravarCaracteristicaEspecifica(ce);        
        }
    }
    
    
    public Caracteristica encontrarCaracteristica(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
        
        return  DAO_Caracteristicas.CaracteristicaExiste(nome, tipo)?
                DAO_Caracteristicas.carregarCaracteristica(nome, tipo):null;
    }   
    
    public Caracteristica_Especifica encontrarCaracteristica_Especifica(
    String nome,String tipo)
               throws FileNotFoundException, FileNotFoundException, IOException,
                                            IOException, ClassNotFoundException{
        
        return DAO_Caracteristicas.CaracteristicaExiste(nome, tipo)?
               DAO_Caracteristicas.carregarCaracteristica_Especifica(nome, tipo)
               :null;
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
       
    public void removerCaracteristicaFisica(String nome){
        DAO_Caracteristicas.removerCaracteristica(nome, "Fisica");
    }
    
    public void removerCaracteristicaRacial(String nome){
        DAO_Caracteristicas.removerCaracteristica(nome, "Racial");
    }
    
    public void removerCaracteristicaPsiquica(String nome){
        DAO_Caracteristicas.removerCaracteristica(nome, "Psiquica");
    }
    
    public void removerTodasCaracteristicasFisicas(){
        DAO_Caracteristicas.removerTodasHabilidades("Fisica");
    }
    
    public void removerTodasCaracteristicasPsiquicas(){
        DAO_Caracteristicas.removerTodasHabilidades("Psiquica");
    }
    
    public void removerTodasCaracteristicasRaciais(){
        DAO_Caracteristicas.removerTodasHabilidades("Racial");
    }   
    
    public void removerTodasCaracteristicas(){
        removerTodasCaracteristicasFisicas();
        removerTodasCaracteristicasRaciais();
        removerTodasCaracteristicasPsiquicas();
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
