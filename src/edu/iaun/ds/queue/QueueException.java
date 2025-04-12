package edu.iaun.ds.queue;

public class QueueException extends RuntimeException {
    public QueueException() {
        super();
    }

    public QueueException(String message) {
        super(message);
    }

    public QueueException(String message, Throwable cause) {
        super(message, cause);
    }

    public QueueException(Throwable cause) {
        super(cause);
    }

    protected QueueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
