/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validacao;

import exception.InteiroInvalidoException;

/**
 *
 * @author Luciano
 */
public class ValidarInteiro {
    
    
    public static int validarInteiro(String numero) throws InteiroInvalidoException{
        int num;

        try{
            num = Integer.parseInt(numero);
            if(num <= 0){
                throw new InteiroInvalidoException("{" + numero + "}. Esta invalido, deve ser"
                    + " um Numero Inteiro e Natural.");
            }
        } catch(NumberFormatException e){
            throw new InteiroInvalidoException("{" + numero + "}. Esta invalido, deve ser"
                    + " um Numero Inteiro e Natural.");
        }
        return num;
    }
    
}
