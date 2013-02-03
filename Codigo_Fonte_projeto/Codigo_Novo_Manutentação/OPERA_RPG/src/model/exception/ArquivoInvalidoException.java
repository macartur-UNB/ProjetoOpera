/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.exception;

/**
 *
 * @author Luciano
 */
public class ArquivoInvalidoException extends Exception {

    /**
     * Creates a new instance of
     * <code>ArquivoInvalidoException</code> without detail message.
     */
    public ArquivoInvalidoException() {
    }

    /**
     * Constructs an instance of
     * <code>ArquivoInvalidoException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ArquivoInvalidoException(String msg) {
        super(msg);
    }
}
