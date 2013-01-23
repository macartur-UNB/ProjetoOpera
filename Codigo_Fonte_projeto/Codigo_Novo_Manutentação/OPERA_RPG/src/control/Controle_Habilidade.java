/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import dao.DAO_Habilidades;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Habilidade;


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
       
        Habilidade habilidade = new Habilidade(teste, nivel, custo, nome, tipo);
        if(habilidade!=null){
            DAO_Habilidades.gravarHabilidade(habilidade);
        }
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
       
    public void removerHabilidadeFisica(String nome){
        DAO_Habilidades.removerHabilidade(nome, "Fisica");
    }
    
    public void removerHabilidadeBelica(String nome){
        DAO_Habilidades.removerHabilidade(nome, "Belica");
    }
    
    public void removerHabilidadePsiquica(String nome){
        DAO_Habilidades.removerHabilidade(nome, "Psiquica");
    }
    
    public void removerTodasHabilidadesFisicas(){
        DAO_Habilidades.removerTodasHabilidades("Fisica");
    }
    
    public void removerTodasHabilidadesPsiquicas(){
        DAO_Habilidades.removerTodasHabilidades("Psiquica");
    }
    
    public void removerTodasHabilidadesBelicas(){
        DAO_Habilidades.removerTodasHabilidades("Belica");
    }   
    
    public void removerTodasHabilidades(){
        removerTodasHabilidadesFisicas();
        removerTodasHabilidadesBelicas();
        removerTodasHabilidadesPsiquicas();
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
