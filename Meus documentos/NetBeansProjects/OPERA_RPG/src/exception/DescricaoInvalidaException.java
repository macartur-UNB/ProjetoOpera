/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Macartur
 */
public class DescricaoInvalidaException  extends Exception{

    public DescricaoInvalidaException() {
    }

    public DescricaoInvalidaException(String message) {
        super(message);
    }
    
}
