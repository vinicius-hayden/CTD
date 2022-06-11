package entities.exception;

public class clientException extends Exception {

    public clientException() {
    }

    public clientException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
