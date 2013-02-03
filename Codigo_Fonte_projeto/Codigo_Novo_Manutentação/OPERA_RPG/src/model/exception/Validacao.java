/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exception;

/**
 *
 * @author Macartur
 */
public class Validacao {
    
    
    
    /**
     * Metodo responsavel por Validar os Caracteres de um Nome
     * @param nome Nome a ser utilizado
     * @param numeros Define se Numeros sao Validos ou nao; se TRUE, 
     * Numeros sao validos; se FALSE - Numeros sao invalidos
     * @return TRUE se o Nome for Valido, ou FALSE se o Nome for Invalido
     */
    public static boolean validarCaracteresNome(String nome, boolean numeros){      
        if(nome.isEmpty()){
            return false;
        }
        
        boolean validado = false;
        String charValidos = "qwertyuiopasdfghjklzxcvbnm ";
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
    
    
    public static boolean validarNome(String nome){
        boolean validado = true;
        
        if( (nome.trim().equals("")) || (nome == null)){
            validado = false;
        }
        
        return validado;
    }
    
    public static boolean validarNome(String nome, String nomes[]){
        boolean validado;
        
        validado = validarNome(nome);
        
        for(int i = 0; i < nomes.length; i++){
            if(nome.toLowerCase().equals(nomes[i].toLowerCase())){
                validado = false;
            }
        }
        return validado;
    }  
    
    public static boolean validarNumeroPositivo(int numero){
        return (numero > 0)?true:false;
    }
    
    public static boolean validarNumeroNegativo(int numero){
        return !validarNumeroPositivo(numero);
    }

    
    public static boolean validarCusto(int Custo){
        return true;
    }
    
    public static boolean validarDescricao(String descricao){
        return true;
    }
    
    public static boolean validarAtributos(int atributos[]){
        return true;
    }
    
    public static boolean validarNivel(int nivel){
        return true;
    }
    
    public static boolean validarTeste(int teste){
        return true;
    }
    
    public static boolean validarPreco(int preco){
        return true;
    }
    
    public static boolean validarRegiao_Do_Corpo(char regiao){
        return true;
    }
    
    public static boolean validarPenalidade(int penalidade){
        return true;
    }
    public static boolean validarDado(int rolagem,int lados){
        return true;
    }
    
}
