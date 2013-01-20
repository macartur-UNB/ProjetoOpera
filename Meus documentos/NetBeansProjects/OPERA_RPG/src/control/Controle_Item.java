/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


public class Controle_Item {
    
    private static Controle_Item instancia;
    private String endereco;

    public Controle_Item() {
    }

    public static Controle_Item getInstancia() {
        if(instancia == null){
            instancia = new Controle_Item();
        }
        return instancia;
    }
    
    /**
     * colocar codigo de controle item aqui
     */
    
    
    
}
