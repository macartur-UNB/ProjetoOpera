/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exception;

/**
 *
 * @author Luciano
 */
public class DeletarInvalidoException extends Exception{
    
    public DeletarInvalidoException(){
        
    }
    public DeletarInvalidoException(String mensagem){
        super(mensagem);
    }
    
}
