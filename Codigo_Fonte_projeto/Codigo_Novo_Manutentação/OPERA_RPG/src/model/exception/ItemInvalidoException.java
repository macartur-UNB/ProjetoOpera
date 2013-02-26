package model.exception;


public class ItemInvalidoException extends Exception {

    /**
     * Creates a new instance of
     * <code>ItemInvalidoException</code> without detail message.
     */
    public ItemInvalidoException() {
    }

    /**
     * Constructs an instance of
     * <code>ItemInvalidoException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ItemInvalidoException(String msg) {
        super(msg);
    }
}
