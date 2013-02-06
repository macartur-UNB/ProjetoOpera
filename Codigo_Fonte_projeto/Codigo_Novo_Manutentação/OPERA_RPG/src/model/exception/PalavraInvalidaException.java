/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exception;

/**
 *
 * @author Luciano
 */
public class PalavraInvalidaException extends Exception {

    /**
     * Creates a new instance of
     * <code>PalavraInvalidaException</code> without detail message.
     */
    public PalavraInvalidaException() {
    }

    /**
     * Constructs an instance of
     * <code>PalavraInvalidaException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public PalavraInvalidaException(String msg) {
        super(msg);
    }
}
