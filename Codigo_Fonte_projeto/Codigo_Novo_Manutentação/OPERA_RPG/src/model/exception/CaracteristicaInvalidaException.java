/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exception;

/**
 *
 * @author Luciano
 */
public class CaracteristicaInvalidaException extends Exception {

    /**
     * Creates a new instance of
     * <code>CaracteristicaInvalidaException</code> without detail message.
     */
    public CaracteristicaInvalidaException() {
    }

    /**
     * Constructs an instance of
     * <code>CaracteristicaInvalidaException</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public CaracteristicaInvalidaException(String msg) {
        super(msg);
    }
}
