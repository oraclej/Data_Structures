package edu.iaun.ds.linkedList;

public class LinkedListException extends RuntimeException{
    public LinkedListException() {
    }

    public LinkedListException(String message) {
        super(message);
    }

    public LinkedListException(String message, Throwable cause) {
        super(message, cause);
    }

    public LinkedListException(Throwable cause) {
        super(cause);
    }

    public LinkedListException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
