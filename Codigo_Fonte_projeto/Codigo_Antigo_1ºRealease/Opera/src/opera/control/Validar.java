/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.control;

/**
 *
 * @author Luciano
 */
public class Validar {
    
    public static boolean validarNome(String nome){
        boolean validado = true;
        
        if( ("".equals(nome)) || (nome == null) || (" ".equals(nome)) ){
            validado = false;
        }
        
        return validado;
    }
    public static boolean validarNome(String nome, String nomes[]){
        boolean validado;
        
        validado = validarNome(nome);
        
        for(int i = 0; i < nomes.length; i++){
            if(nome.toLowerCase().equals(nomes[i].toLowerCase())){
                validado = false;
            }
        }
        return validado;
    }
    
}
