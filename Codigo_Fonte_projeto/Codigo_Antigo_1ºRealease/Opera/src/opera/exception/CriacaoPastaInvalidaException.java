/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.exception;

/**
 *
 * @author Luciano
 */
public class CriacaoPastaInvalidaException extends Exception{
    
    public CriacaoPastaInvalidaException(){
        
    }
    public CriacaoPastaInvalidaException(String mensagem){
        super(mensagem);
    }
    
}
