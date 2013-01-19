/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.exception;

/**
 *
 * @author Luciano
 */
public class CaracteristicaInvalidaException extends Exception{
    
    public CaracteristicaInvalidaException(){
        
    }
    public CaracteristicaInvalidaException(String mensagem){
        super(mensagem);
    }
    
}
