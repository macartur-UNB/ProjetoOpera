/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Habilidade;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Habilidade;

/**
 *
 * @author Macartur
 */
public class Controle_Habilidade {
    
    private static Controle_Habilidade instancia;
    
    public Controle_Habilidade() {
    }

    public static Controle_Habilidade getInstancia() {
        if(instancia == null){
            instancia = new Controle_Habilidade();
        }
        return instancia;
    }
    
    
    public void cadHabilidade(
    int teste, int nivel, int custo, String nome,String tipo)
    throws FileNotFoundException, IOException{
       
        Habilidade h = new Habilidade(teste, nivel, custo, nome, tipo);
        DAO_Habilidade.gravarHabilidade(h);        
    }    
        
    public Habilidade encontrarHabilidade(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException{
            return DAO_Habilidade.carregarHabilidade(nome, tipo);
    }    
    
    public boolean HabilidadeExiste(String nome,String tipo){
        return DAO_Habilidade.HabilidadeExiste(nome, tipo);
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
        DAO_Habilidade.removerHabilidade(nome, "Fisica");
    }
    
    public void removeHabilidadeBelica(String nome){
        DAO_Habilidade.removerHabilidade(nome, "Belica");
    }
    
    public void removeHabilidadePsiquica(String nome){
        DAO_Habilidade.removerHabilidade(nome, "Psiquica");
    }
    
    public void removeTodasHabilidadesFisicas(){
        DAO_Habilidade.removerTodasHabilidades("Fisica");
    }
    
    public void removeTodasHabilidadesPsiquicas(){
        DAO_Habilidade.removerTodasHabilidades("Psiquica");
    }
    
    public void removeTodasHabilidadesBelicas(){
        DAO_Habilidade.removerTodasHabilidades("Belica");
    }   
    
    public void removeTodasHabilidades(){
        removeTodasHabilidadesFisicas();
        removeTodasHabilidadesBelicas();
        removeTodasHabilidadesPsiquicas();
    }
    
    public String[] listarHabilidadeFisicas(){
       return DAO_Habilidade.listarHabilidades("Fisica"); 
    }
    
    public String[] listarHabilidadesPsiquicas(){
        return DAO_Habilidade.listarHabilidades("Psiquica");
    }
    
    public String[] listarHabilidadesBelicas(){
        return DAO_Habilidade.listarHabilidades("Belica");
    }    
    
}
