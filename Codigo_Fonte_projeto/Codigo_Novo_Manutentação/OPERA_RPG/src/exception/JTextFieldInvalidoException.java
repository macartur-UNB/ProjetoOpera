/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Luciano
 */
public class JTextFieldInvalidoException extends Exception {

    /**
     * Creates a new instance of
     * <code>JTextFieldInvalidoException</code> without detail message.
     */
    public JTextFieldInvalidoException() {
    }

    /**
     * Constructs an instance of
     * <code>JTextFieldInvalidoException</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public JTextFieldInvalidoException(String msg) {
        super(msg);
    }
}
