/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


public class Controle_Ficha {
    
    private static Controle_Ficha instancia;
    private String endereco;

    public Controle_Ficha() {
    }

    public static Controle_Ficha getInstancia() {
        if(instancia == null){
            instancia = new Controle_Ficha();
        }        
        return instancia;
    }
    
    /**
     * colocar codigo para controle ficha
     * 
     */
    
}
