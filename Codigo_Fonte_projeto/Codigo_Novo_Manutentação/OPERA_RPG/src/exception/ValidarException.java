/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Macartur
 */
public class ValidarException {
    
   
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
