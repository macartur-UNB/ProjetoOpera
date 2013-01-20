/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
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
        DAO.getInstancia().c_Habilidadess.gravarCaracteristica(c);        
    }
    
    public void cadCaracteristica(
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException, IOException{
    
        Caracteristica c = new Caracteristica(nome, descricao, tipo, modificador,custo);
        DAO.getInstancia().c_Habilidadess.gravarCaracteristica(c);  
    }
    
    public void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo) 
    throws FileNotFoundException, IOException{
    
        Caracteristica ce = new Caracteristica_Especifica(
        nome_Especifico,descricao_Especifica,nome, descricao, tipo,custo);
        DAO.getInstancia().c_Habilidadess.gravarCaracteristica(ce);  
    }
    
    public void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        
        Caracteristica_Especifica ce;
        ce = new Caracteristica_Especifica(nome_Especifico, descricao_Especifica,
                                           nome, descricao, tipo, modificador,custo);
        DAO.getInstancia().c_Habilidadess.gravarCaracteristica(ce);  
    }
    
    
    public Caracteristica encontrarCaracteristica(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
            return DAO.getInstancia().c_Habilidadess.carregarCaracteristica(nome, tipo);
    }   
    
    public Caracteristica_Especifica encontrarCaracteristica_Especifica(
    String nome,String tipo)
    throws FileNotFoundException, FileNotFoundException, IOException,
    IOException, ClassNotFoundException{
        return DAO.getInstancia().c_Habilidadess.carregarCaracteristica_Especifica(nome, tipo);
    }
    
    public boolean CaracteristicaExiste(String nome,String tipo){
        return DAO.getInstancia().c_Habilidadess.CaracteristicaExiste(nome, tipo);
    }
    
    public boolean CaracteristicaExiste(String nome){
        boolean status = false;
        if(CaracteristicaExiste(nome, "Fisica")  ||
           CaracteristicaExiste(nome,"Psiquica") ||
           CaracteristicaExiste(nome,"Belica")){
            status = true;
        }
        return status;      
    }
       
    public void removeCaracteristicaFisica(String nome){
        DAO.getInstancia().c_Habilidadess.removerCaracteristica(nome, "Fisica");
    }
    
    public void removeCaracteristicaBelica(String nome){
        DAO.getInstancia().c_Habilidadess.removerCaracteristica(nome, "Belica");
    }
    
    public void removeCaracteristicaPsiquica(String nome){
        DAO.getInstancia().c_Habilidadess.removerCaracteristica(nome, "Psiquica");
    }
    
    public void removeTodasCaracteristicasFisicas(){
        DAO.getInstancia().c_Habilidadess.removerTodasHabilidades("Fisica");
    }
    
    public void removeTodasCaracteristicasPsiquicas(){
        DAO.getInstancia().c_Habilidadess.removerTodasHabilidades("Psiquica");
    }
    
    public void removeTodasCaracteristicasBelicas(){
        DAO.getInstancia().c_Habilidadess.removerTodasHabilidades("Belica");
    }   
    
    public void removeTodasCaracteristicas(){
        removeTodasCaracteristicasFisicas();
        removeTodasCaracteristicasBelicas();
        removeTodasCaracteristicasPsiquicas();
    }
    
    public String[] listarCaracteristicasFisicas(){
       return DAO.getInstancia().c_Habilidadess.listarCaracteristicas("Fisica"); 
    }
    
    public String[] listarCaracteristicasPsiquicas(){
        return DAO.getInstancia().c_Habilidadess.listarCaracteristicas("Psiquica");
    }
    
    public String[] listarCaracteristicasBelicas(){
        return DAO.getInstancia().c_Habilidadess.listarCaracteristicas("Belica");
    }    
    
    
}
