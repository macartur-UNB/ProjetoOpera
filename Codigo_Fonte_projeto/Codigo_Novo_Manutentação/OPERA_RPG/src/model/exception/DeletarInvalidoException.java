
package model.exception;


public class DeletarInvalidoException extends Exception{
    
    public DeletarInvalidoException(){
        
    }
    public DeletarInvalidoException(String mensagem){
        super(mensagem);
    }
    
}
