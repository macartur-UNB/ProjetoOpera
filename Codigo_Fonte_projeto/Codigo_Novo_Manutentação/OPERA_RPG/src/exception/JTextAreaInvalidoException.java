/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Luciano
 */
public class JTextAreaInvalidoException extends Exception {

    /**
     * Creates a new instance of
     * <code>JTextAreaInvalidoException</code> without detail message.
     */
    public JTextAreaInvalidoException() {
    }

    /**
     * Constructs an instance of
     * <code>JTextAreaInvalidoException</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public JTextAreaInvalidoException(String msg) {
        super(msg);
    }
}
