/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.validacao;

import exception.NumeroInteiroInvalidoException;

/**
 *
 * @author Luciano
 */
public class ValidarNumero {
    
    
    public static int validarNumeroInteiro(String numero) throws NumeroInteiroInvalidoException{
        int num;

        try{
            num = Integer.parseInt(numero);
            if(num <= 0){
                throw new NumeroInteiroInvalidoException("{" + numero + "}. Esta invalido, deve ser"
                    + " um Numero Inteiro e Natural.");
            }
        } catch(NumberFormatException e){
            throw new NumeroInteiroInvalidoException("{" + numero + "}. Esta invalido, deve ser"
                    + " um Numero Inteiro e Natural.");
        }
        return num;
    }
    
}
