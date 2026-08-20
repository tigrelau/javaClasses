public class ParametroInvalidoException extends RuntimeException {

    public ParametroInvalidoException(String msg) {
        super(msg);
    }

    public ParametroInvalidoException(String msg, Throwable cause) {
        super(msg, cause);
    }
}