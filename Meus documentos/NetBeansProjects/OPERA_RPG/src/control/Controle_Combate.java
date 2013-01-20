/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


public class Controle_Combate {
        
    private static Controle_Combate instancia;
    private String endereco;
    public Controle_Combate() {
    }

    public static Controle_Combate getInstancia() {
        if(instancia == null){
            instancia = new Controle_Combate();
        }
        return instancia;
    }
    
    
    /**
     * Colocar metodos de combate
     * 
     * 
     */  
    
    
}
