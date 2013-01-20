/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Luciano
 */
public class JogoInvalidoException extends Exception{
    
    public JogoInvalidoException(){
        
    }
    public JogoInvalidoException(String mensagem){
        super(mensagem);
    }
    
}
