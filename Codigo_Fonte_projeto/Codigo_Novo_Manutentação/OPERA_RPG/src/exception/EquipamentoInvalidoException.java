/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Luciano
 */
public class EquipamentoInvalidoException extends Exception{
    
    public EquipamentoInvalidoException(){
        
    }
    public EquipamentoInvalidoException(String mensagem){
        super(mensagem);
    }
    
}
