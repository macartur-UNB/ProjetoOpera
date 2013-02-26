
package view.validacao;

import model.exception.CaractereInvalidoException;
import model.exception.NomeInvalidoException;
import model.exception.TextoInvalidoException;


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
    public static String validarNome(String nome, boolean numeros,
                                     String maisCaracteresValidos) 
                                                   throws NomeInvalidoException{
        
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
                
        if( (nome.length() != numCaracteresValidos) || 
                                           (nome.isEmpty()) || (!possuiLetra) ){
            if( (nome.isEmpty()) || (!possuiLetra) ){
                throw new NomeInvalidoException("O Campo nao pode ser vazio");
            }
            throw new NomeInvalidoException("{" 
                                 + nome + "}. Possui caracteres invalidos: {" + 
                    caracteresInvalidos.substring(0, 
                                         caracteresInvalidos.length()-2) + "}");
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
    public static String validarTexto(String texto, String maisCaracteresValidos)
                                                  throws TextoInvalidoException{
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
            throw new TextoInvalidoException(
                                    "O Texto. Possui caracteres invalidos: {" + 
                    caracteresInvalidos.substring(0,
                                         caracteresInvalidos.length()-2) + "}");
        }
        
        return texto;
    }
    
    
    
    
    public static char validarCaractere(char caractere, boolean numeros,
                                        String maisCaracteresValidos) 
                                              throws CaractereInvalidoException{
        
        String caracteresValidos = "qwertyuiopasdfghjklzxcvbnm";
        boolean caractereValido = false;
        
        caracteresValidos += maisCaracteresValidos;
        
        if(numeros){
            caracteresValidos += "1234567890";
        }
        
        
        for(int i = 0; i < caracteresValidos.length(); i++){
            if( (caractere == caracteresValidos.charAt(i)) || 
                     (caractere == caracteresValidos.toUpperCase().charAt(i)) ){
                caractereValido = true;
                break;
            }
        }
        
        if(!caractereValido){
            throw new CaractereInvalidoException(
                               "O Caractere: " + caractere + ", nao eh valido");
        }
        
        return caractere;
    }
    
    
    public static char validarCaractere(char caractere, boolean numeros) 
                                              throws CaractereInvalidoException{
        
        validarCaractere(caractere, numeros, null);
        
        return caractere;
    }
    
    public static char validarCaractere(char caractere, String maisCaracteresValidos) 
                                              throws CaractereInvalidoException{
        
        validarCaractere(caractere, false, maisCaracteresValidos);
        
        return caractere;
    }
    
    public static char validarCaractere(char caractere)
                                              throws CaractereInvalidoException{
        
        validarCaractere(caractere, false, null);
        
        return caractere;
    }
}
