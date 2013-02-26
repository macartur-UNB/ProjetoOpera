package model.exception;


public class JogoInvalidoException extends Exception{
    
    public JogoInvalidoException(){
        
    }
    public JogoInvalidoException(String mensagem){
        super(mensagem);
    }
    
}
