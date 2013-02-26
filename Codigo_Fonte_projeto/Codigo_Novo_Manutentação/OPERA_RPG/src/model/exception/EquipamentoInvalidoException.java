package model.exception;


public class EquipamentoInvalidoException extends Exception{
    
    public EquipamentoInvalidoException(){
        
    }
    public EquipamentoInvalidoException(String mensagem){
        super(mensagem);
    }
    
}
