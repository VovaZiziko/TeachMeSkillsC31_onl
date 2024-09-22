package Homework13;

public class WrongLoginException extends Exception{
    private String message;

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}