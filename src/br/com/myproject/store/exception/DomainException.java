package br.com.myproject.store.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
