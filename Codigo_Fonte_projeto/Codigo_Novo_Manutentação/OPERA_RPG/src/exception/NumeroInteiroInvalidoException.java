/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Luciano
 */
public class NumeroInteiroInvalidoException extends Exception {

    /**
     * Creates a new instance of
     * <code>NumeroInteiroInvalidoException</code> without detail message.
     */
    public NumeroInteiroInvalidoException() {
    }

    /**
     * Constructs an instance of
     * <code>NumeroInteiroInvalidoException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public NumeroInteiroInvalidoException(String msg) {
        super(msg);
    }
}
