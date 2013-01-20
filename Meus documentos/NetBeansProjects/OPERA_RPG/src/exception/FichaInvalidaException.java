/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.exception;

/**
 *
 * @author Luciano
 */
public class FichaInvalidaException extends Exception{
    
    public FichaInvalidaException(){
        
    }
    public FichaInvalidaException(String mensagem){
        super(mensagem);
    }
    
}
