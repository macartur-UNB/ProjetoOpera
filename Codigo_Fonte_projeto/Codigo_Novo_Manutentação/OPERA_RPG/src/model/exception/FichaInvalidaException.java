package model.exception;

public class FichaInvalidaException extends Exception{
    
    public FichaInvalidaException(){
        
    }
    public FichaInvalidaException(String mensagem){
        super(mensagem);
    }
    
}
