
package model.exception;


public class DadoInvalidoException extends Exception{
    
    public DadoInvalidoException(){
        
    }
    public DadoInvalidoException(String mensagem){
        super(mensagem);
    }
    
}
