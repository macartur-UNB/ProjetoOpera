/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Luciano
 */
public class InteiroInvalidoException extends Exception {

    /**
     * Creates a new instance of
     * <code>InteiroInvalidoException</code> without detail message.
     */
    public InteiroInvalidoException() {
    }

    /**
     * Constructs an instance of
     * <code>InteiroInvalidoException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public InteiroInvalidoException(String msg) {
        super(msg);
    }
}
