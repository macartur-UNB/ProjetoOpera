/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.validacao;

import exception.NomeInvalidoException;
import exception.TextoInvalidoException;

/**
 *
 * @author Luciano
 */
public class ValidarNome {
    
    /**
     * Validar Nome
     * @param nome Nome a ser Validado
     * @param numeros Define se numeros sao valido. TRUE, numeros sao validos;
     * FALSE, numeros nao sao validos
     * @return retorna o proprio nome
     * @throws NomeInvalidoException 
     */
    public static String validarNome(String nome, boolean numeros) throws NomeInvalidoException{
        
        validarNome(nome, numeros, "");
        
        return nome;
    }
    
    
    /**
     * Validar Nome
     * @param nome Nome a ser Validado
     * @param numeros Define se numeros sao valido. TRUE, numeros sao validos;
     * @param maisCaracteresValidos Adiciona mais caracteres validos
     * FALSE, numeros nao sao validos
     * @return retorna o proprio nome
     * @throws NomeInvalidoException 
     */
    public static String validarNome(String nome, boolean numeros, String maisCaracteresValidos) throws NomeInvalidoException{
        
        String caracteresValidos = "qwertyuiopasdfghjklzxcvbnm ";
        int numCaracteresValidos = 0;
        boolean caractereValido;
        String caracteresInvalidos = "";
        boolean possuiLetra = false;
        
        if(numeros){
            caracteresValidos += "1234567890";
        }
        
        caracteresValidos += maisCaracteresValidos;
        
        for(int i = 0; i < nome.length(); i++){
            caractereValido = false;
            for(int j = 0; j < caracteresValidos.length(); j++){
                if(nome.toLowerCase().charAt(i) == caracteresValidos.charAt(j)){
                    numCaracteresValidos++;
                    caractereValido = true;
                    if(nome.charAt(i) != ' '){
                        possuiLetra = true;
                    }
                }
            }
            if(!caractereValido){
                caracteresInvalidos += nome.charAt(i) + ", ";
            }
        }
                
        if( (nome.length() != numCaracteresValidos) || (nome.isEmpty()) || (!possuiLetra) ){
            if( (nome.isEmpty()) || (!possuiLetra) ){
                throw new NomeInvalidoException("O Nome nao pode ser vazio");
            }
            throw new NomeInvalidoException("{" + nome + "}. Possui caracteres invalidos: {" + 
                    caracteresInvalidos.substring(0, caracteresInvalidos.length()-2) + "}");
        }
        
        return nome;
    }
    
    
    /**
     * Validar Texto
     * @param texto Texto a ser validado
     * @param maisCaracteresValidos Mais caracteres para serem validos
     * @return o Proprio Texto
     * @throws TextoInvalidoException 
     */
    public static String validarTexto(String texto, String maisCaracteresValidos) throws TextoInvalidoException{
        String caracteresValidos = "qwertyuiopasdfghjklzxcvbnm  ";
        int numCaracteresValidos = 0;
        boolean caractereValido;
        String caracteresInvalidos = "";
        boolean possuiLetra = false;
        
        caracteresValidos += "1234567890";
        caracteresValidos += maisCaracteresValidos;
        
        for(int i = 0; i < texto.length(); i++){
            caractereValido = false;
            for(int j = 0; j < caracteresValidos.length(); j++){
                if(texto.toLowerCase().charAt(i) == caracteresValidos.charAt(j)){
                    numCaracteresValidos++;
                    caractereValido = true;
                    if(texto.charAt(i) != ' '){
                        possuiLetra = true;
                    }
                }
            }
            if(!caractereValido){
                caracteresInvalidos += texto.charAt(i) + ", ";
            }
        }
        
        if( (texto.isEmpty()) || (!possuiLetra) ){
            if( (texto.isEmpty()) || (!possuiLetra) ){
                throw new TextoInvalidoException("O Texto nao pode ser vazio");
            }
            throw new TextoInvalidoException("O Texto. Possui caracteres invalidos: {" + 
                    caracteresInvalidos.substring(0, caracteresInvalidos.length()-2) + "}");
        }
        
        return texto;
    }
}
