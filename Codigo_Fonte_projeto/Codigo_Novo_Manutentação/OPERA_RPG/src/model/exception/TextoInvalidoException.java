
package model.exception;


public class TextoInvalidoException extends Exception {

    /**
     * Creates a new instance of
     * <code>TextoInvalidoException</code> without detail message.
     */
    public TextoInvalidoException() {
    }

    /**
     * Constructs an instance of
     * <code>TextoInvalidoException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public TextoInvalidoException(String msg) {
        super(msg);
    }
}
