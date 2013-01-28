/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.validacao;

/**
 *
 * @author Luciano
 */
class CaractereInvalidoException extends Exception {

    public CaractereInvalidoException(String string) {
        super(string);
    }
    
    public CaractereInvalidoException() {
    }
    
}
