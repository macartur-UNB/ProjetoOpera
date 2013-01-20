/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Luciano
 */
public class DadoInvalidoException extends Exception{
    
    public DadoInvalidoException(){
        
    }
    public DadoInvalidoException(String mensagem){
        super(mensagem);
    }
    
}
