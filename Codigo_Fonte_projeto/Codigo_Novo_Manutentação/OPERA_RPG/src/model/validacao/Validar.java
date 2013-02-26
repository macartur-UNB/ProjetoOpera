package model.validacao;

import java.util.ArrayList;
import java.util.Iterator;
import model.classes.Armadura;
import model.exception.PalavraInvalidaException;

public class Validar {
    
    public static void validarPalavra(String palavra, boolean numeros) 
                                                throws PalavraInvalidaException{
        
        String caracteresValidos = "qwertyuioplkjhgfdsazxcvbnm ";
        String caracteresInvalidos = "";
        
        if(numeros){
            caracteresValidos += "1234567890";
        }
        
        if(palavra != null) {
	        if(palavra.length() == 0){
	            throw new PalavraInvalidaException("Nao pode ser Vazio(a).");
	        }
        }else{
        	throw new PalavraInvalidaException("Nao pode ser Vazio(a).");
        }
        
        String palavraLowerCase = palavra.toLowerCase();
        boolean caractereValido;
        for(int i = 0; i < palavra.length(); i++){
            caractereValido = false;
            for(int j = 0; j < caracteresValidos.length(); j++){
                if(palavraLowerCase.charAt(i) == caracteresValidos.charAt(j)){
                    caractereValido = true;
                    break;
                }
            }
            if(!caractereValido){
                caracteresInvalidos += palavra.charAt(i);
            }
        }
        
        if(caracteresInvalidos.length() > 0){
            throw new PalavraInvalidaException(
                      "{" + palavra + "} possui "
                    + "os seguintes caracteres Invalidos: {" 
                    + caracteresInvalidos+ "}.");
        }
    }
    
    public static void validarPalavra(String palavra, String palavrasValidas[],
                                      boolean caseSensitive) 
                                                throws PalavraInvalidaException{
        
    	if(palavra != null) {
	        if(palavra.length() == 0){
	            throw new PalavraInvalidaException(
                                             "A Palvra nao pode ser Vazio(a).");
	        }
        }else{
        	throw new PalavraInvalidaException(
                                              "A Palvra nao pode ser Nulo(a).");
        }
    	
    	
    	if(palavrasValidas == null){
    		throw new PalavraInvalidaException(
                               "O Conjunto de palavras nao pode ser Vazio(a).");
        }
        
        boolean palavraValida = false;
        for(int i = 0; (i < palavrasValidas.length) && (!palavraValida) ; i++){
            if(!caseSensitive){
                    if(palavrasValidas[i].toLowerCase().equals(palavra.toLowerCase())){
                            palavraValida = true;
                    }
            }else{
                if(palavrasValidas[i].equals(palavra)){
                    palavraValida = true;
                }
            }
        }
        
        if(!palavraValida){
            throw new PalavraInvalidaException(
                    "A Palavra {" + palavra + "} eh Invalida");
        }
    }
    
    public static void validarCaractere(char caractere, char[] caracteresValidos)
                                                throws PalavraInvalidaException{
        boolean caractereValido = false;
        for(int i = 0; (i < caracteresValidos.length) && (!caractereValido);i++){
            if(caractere == caracteresValidos[i]){
                caractereValido = true;
            }
        }
        
        if(!caractereValido){
            throw new PalavraInvalidaException("O Caractere {" + caractere
                    + "} eh Invalido");
        }
    }
    
    public static boolean RegiaoUtilizada(ArrayList armaduras, char regiao){
       Iterator i = armaduras.iterator();
       Armadura armadura;
       while(i.hasNext()){
           armadura = (Armadura) i.next();           
           if(armadura.isUsando() == true){
               if(armadura.getRegiao_Do_Corpo() == regiao){
                   return true;
               }
           }
       }
        return false;
    }  
    
}
