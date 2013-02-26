
package view.validacao;

import model.exception.NumeroInteiroInvalidoException;


public class ValidarNumero {
    
    
    public static int validarNumeroInteiro(String numero) 
                                          throws NumeroInteiroInvalidoException{
        int num;

        try{
            num = Integer.parseInt(numero);
            if(num <= 0){
                throw new NumeroInteiroInvalidoException(
                      "{" + numero + "}. Esta invalido, deve ser"
                    + " um Numero Inteiro e Natural.");
            }
        } catch(NumberFormatException e){
            throw new NumeroInteiroInvalidoException(
                      "{" + numero + "}. Esta invalido, deve ser"
                    + " um Numero Inteiro e Natural.");
        }
        return num;
    }
    
}
