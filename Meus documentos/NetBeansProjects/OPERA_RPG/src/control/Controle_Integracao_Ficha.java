/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


public class Controle_Integracao_Ficha {
    
    private static Controle_Integracao_Ficha instancia;
    private String endereco;

    public Controle_Integracao_Ficha() {
    }

    public static Controle_Integracao_Ficha getInstancia() {
        if(instancia == null){
            instancia = new Controle_Integracao_Ficha();
        }
        return instancia;
    }
    
      
    /**
     * colocar codigo de controle integracao aqui
     */
    
    
}
