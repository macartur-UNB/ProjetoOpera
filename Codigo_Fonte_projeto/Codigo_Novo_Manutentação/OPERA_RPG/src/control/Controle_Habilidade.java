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
import model.Habilidade;


public class Controle_Habilidade {
    
    private static Controle_Caracteristica instancia;
    
    public Controle_Habilidade() {
    }

    public static Controle_Caracteristica getInstancia() {
        if(instancia == null){
            instancia = new Controle_Caracteristica();
        }
        return instancia;
    }
    
    
    public void cadHabilidade(
    String nome,String descricao,String tipo,int custo)
    throws FileNotFoundException, IOException{
       
        Caracteristica c = new Caracteristica(nome, descricao, tipo, custo);
        DAO.getInstancia().c_Caracteristicas.gravarCaracteristica(c);        
    }    
        
    public Caracteristica encontrarHabilidade(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
            return DAO.getInstancia().c_Caracteristicas.carregarCaracteristica(nome, tipo);
    }    
    
    public boolean HabilidadeExiste(String nome,String tipo){
        return DAO.getInstancia().c_Caracteristicas.CaracteristicaExiste(nome, tipo);
    }
    
    public boolean CaracteristicaExiste(String nome){
        boolean status = false;
        if(HabilidadeExiste(nome, "Fisica")  ||
           HabilidadeExiste(nome,"Psiquica") ||
           HabilidadeExiste(nome,"Belica")){
            status = true;
        }
        return status;      
    }
       
    public void removeCaracteristicaFisica(String nome){
        DAO.getInstancia().c_Caracteristicas.removerCaracteristica(nome, "Fisica");
    }
    
    public void removeCaracteristicaBelica(String nome){
        DAO.getInstancia().c_Caracteristicas.removerCaracteristica(nome, "Belica");
    }
    
    public void removeCaracteristicaPsiquica(String nome){
        DAO.getInstancia().c_Caracteristicas.removerCaracteristica(nome, "Psiquica");
    }
    
    public void removeTodasCaracteristicasFisicas(){
        DAO.getInstancia().c_Caracteristicas.removerTodasCaracteristicas("Fisica");
    }
    
    public void removeTodasCaracteristicasPsiquicas(){
        DAO.getInstancia().c_Caracteristicas.removerTodasCaracteristicas("Psiquica");
    }
    
    public void removeTodasCaracteristicasBelicas(){
        DAO.getInstancia().c_Caracteristicas.removerTodasCaracteristicas("Belica");
    }   
    
    public void removeTodasCaracteristicas(){
        removeTodasCaracteristicasFisicas();
        removeTodasCaracteristicasBelicas();
        removeTodasCaracteristicasPsiquicas();
    }
    
    public String[] listarCaracteristicasFisicas(){
       return DAO.getInstancia().c_Caracteristicas.listarCaracteristicas("Fisica"); 
    }
    
    public String[] listarCaracteristicasPsiquicas(){
        return DAO.getInstancia().c_Caracteristicas.listarCaracteristicas("Psiquica");
    }
    
    public String[] listarCaracteristicasBelicas(){
        return DAO.getInstancia().c_Caracteristicas.listarCaracteristicas("Belica");
    }    
    
    
}
