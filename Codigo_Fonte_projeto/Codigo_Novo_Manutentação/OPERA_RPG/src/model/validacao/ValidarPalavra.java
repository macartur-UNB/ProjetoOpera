/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import model.exception.PalavraInvalidaException;

/**
 *
 * @author Luciano
 */
public class ValidarPalavra {
    
    public static void validarPalavra(String palavra, boolean numeros) throws PalavraInvalidaException{
        
        String caracteresValidos = "qwertyuioplkjhgfdsazxcvbnm ";
        String caracteresInvalidos = "";
        
        if(numeros){
            caracteresValidos += "1234567890";
        }
        
        if(palavra.length() == 0){
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
            throw new PalavraInvalidaException("{" + palavra + "} possui "
                    + "os seguintes caracteres Invalidos: {" + caracteresInvalidos
                    + "}.");
        }
    }
    
    public static void validarPalavra(String palavra, String palavrasValidas[], boolean caseSensitive) throws PalavraInvalidaException{
        
        if(palavra.length() == 0){
            throw new PalavraInvalidaException("A Palavra Nao pode ser Vazia.");
        }
        
        String backupPalavra = palavra;
        
        if(!caseSensitive){
            palavra = palavra.toLowerCase();
            
            for(int i = 0; i < palavrasValidas.length; i++){
                palavrasValidas[i] = palavrasValidas[i].toLowerCase();
            }
        }
        
        if(palavrasValidas != null){
            if(palavrasValidas.length > 0){
                boolean palavraValida = false;
                for(int i = 0; (i < palavrasValidas.length) && (!palavraValida) ; i++){
                    if(palavrasValidas[i].equals(palavra)){
                        palavraValida = true;
                    }
                }
                
                if(!palavraValida){
                    throw new PalavraInvalidaException("A Palavra {" + backupPalavra
                            + "} eh Invalida");
                }
            }
        }
    }
}
