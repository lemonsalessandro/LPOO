package exception;

public class EstoqueInsuficienteException extends Exception{
    public EstoqueInsuficienteException() {
        super("Erro, estoque insuficiente.");
    }

    public EstoqueInsuficienteException(String message) {
        super(message);
    }

    public EstoqueInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }

    public EstoqueInsuficienteException(Throwable cause) {
        super(cause);
    }

    public EstoqueInsuficienteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}