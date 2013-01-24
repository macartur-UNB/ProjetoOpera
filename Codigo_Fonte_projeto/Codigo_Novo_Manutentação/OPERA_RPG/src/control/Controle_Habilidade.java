/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

public class Controle_Habilidade {
    private static Controle_Habilidade instancia;
    private String endereco;

    public Controle_Habilidade() {
    }

    public static Controle_Habilidade getInstancia() {
        if(instancia == null){
            instancia = new Controle_Habilidade();
        }
        return instancia;
    }
    
    /**
     * 
     * colocar controle Habilidade aqui
     */
    
}
