package com.kitaplik.libraryservice.exception;

public class LibraryNoFoundException extends RuntimeException{
    public LibraryNoFoundException(String message){
        super(message);
    }
}
