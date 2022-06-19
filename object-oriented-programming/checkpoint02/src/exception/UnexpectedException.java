package exception;

public class UnexpectedException extends RuntimeException {

    public UnexpectedException() {
    }

    public UnexpectedException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }

}
