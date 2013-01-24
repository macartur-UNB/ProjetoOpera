/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Habilidades;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Habilidade;

/**
 *
 * @author Macartur
 */
public class Controle_Habilidade {
    
    private static Control_Habilidade instancia;
    
    public Controle_Habilidade() {
    }

    public static Control_Habilidade getInstancia() {
        if(instancia == null){
            instancia = new Control_Habilidade();
        }
        return instancia;
    }
    
    
    public void cadHabilidade(
    int teste, int nivel, int custo, String nome,String tipo)
    throws FileNotFoundException, IOException{
       
        Habilidade h = new Habilidade(teste, nivel, custo, nome, tipo);
        DAO_Habilidades.gravarHabilidade(h);        
    }    
        
    public Habilidade encontrarHabilidade(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
            return DAO_Habilidades.carregarHabilidade(nome, tipo);
    }    
    
    public boolean HabilidadeExiste(String nome,String tipo){
        return DAO_Habilidades.HabilidadeExiste(nome, tipo);
    }
    
    public boolean HabilidadeExiste(String nome){
        boolean status = false;
        if(HabilidadeExiste(nome, "Fisica")  ||
           HabilidadeExiste(nome,"Psiquica") ||
           HabilidadeExiste(nome,"Belica")){
            status = true;
        }
        return status;      
    }
       
    public void removeHabilidadeFisica(String nome){
        DAO_Habilidades.removerHabilidade(nome, "Fisica");
    }
    
    public void removeHabilidadeBelica(String nome){
        DAO_Habilidades.removerHabilidade(nome, "Belica");
    }
    
    public void removeHabilidadePsiquica(String nome){
        DAO_Habilidades.removerHabilidade(nome, "Psiquica");
    }
    
    public void removeTodasHabilidadesFisicas(){
        DAO_Habilidades.removerTodasHabilidades("Fisica");
    }
    
    public void removeTodasHabilidadesPsiquicas(){
        DAO_Habilidades.removerTodasHabilidades("Psiquica");
    }
    
    public void removeTodasHabilidadesBelicas(){
        DAO_Habilidades.removerTodasHabilidades("Belica");
    }   
    
    public void removeTodasHabilidades(){
        removeTodasHabilidadesFisicas();
        removeTodasHabilidadesBelicas();
        removeTodasHabilidadesPsiquicas();
    }
    
    public String[] listarHabilidadeFisicas(){
       return DAO_Habilidades.listarHabilidades("Fisica"); 
    }
    
    public String[] listarHabilidadesPsiquicas(){
        return DAO_Habilidades.listarHabilidades("Psiquica");
    }
    
    public String[] listarHabilidadesBelicas(){
        return DAO_Habilidades.listarHabilidades("Belica");
    }    
    
}
