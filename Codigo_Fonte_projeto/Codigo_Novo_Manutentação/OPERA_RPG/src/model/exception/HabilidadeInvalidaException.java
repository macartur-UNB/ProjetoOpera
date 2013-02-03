/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exception;

/**
 *
 * @author Luciano
 */
public class HabilidadeInvalidaException extends Exception{
    
    public HabilidadeInvalidaException(){
        
    }
    public HabilidadeInvalidaException(String mensagem){
        super(mensagem);
    }
    
}
