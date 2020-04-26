package com.springrest.BooksByAgatha.exception;

public class TitleNotFoundException extends RuntimeException {

    public TitleNotFoundException(int id) {
        super("Could not find Title with id : " + id);
    }
}
