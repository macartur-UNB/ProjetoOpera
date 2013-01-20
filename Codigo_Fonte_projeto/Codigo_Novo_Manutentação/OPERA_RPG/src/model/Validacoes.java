/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luciano
 */
public class Validacoes {
    
    private static Validacoes instancia;
    
    /**
     * Retorna uma Instancia da Classe
     * @return instancia
     */
    public static Validacoes getInstance(){
        if(instancia == null){
            instancia = new Validacoes();
        }
        return instancia;
    }
    
    private Validacoes(){
        
    }
    
    /**
     * Metodo responsavel por Validar os Caracteres de um Nome
     * @param nome Nome a ser utilizado
     * @param numeros Define se Numeros sao Validos ou nao; se TRUE, 
     * Numeros sao validos; se FALSE - Numeros sao invalidos
     * @return TRUE se o Nome for Valido, ou FALSE se o Nome for Invalido
     */
    public boolean validarCaracteresNome(String nome, boolean numeros){      
        if(nome.isEmpty()){
            return false;
        }
        
        boolean validado = false;
        String charValidos = "qwertyuiopasdfghjklzxcvbnm";
        int numCharValidos = 0;
        
        if(numeros){
            charValidos += "1234567890";
        }
        
        for(int i = 0; i < nome.length(); i++){
            for(int j = 0; j < charValidos.length(); j++){
                if(nome.toLowerCase().charAt(i) == charValidos.charAt(i)){
                    numCharValidos++;
                    continue;
                }
            }
        }
        
        if(numCharValidos == nome.length()){
            validado = true;
        }
        return validado;
    }
}
