package com.meowu.starter.commons.security.exception;

public class DuplicateException extends RuntimeException{

    public DuplicateException(){
        super();
    }

    public DuplicateException(String message){
        super(message);
    }

    public DuplicateException(Throwable cause){
        super(cause);
    }

    public DuplicateException(String message, Throwable cause){
        super(message, cause);
    }
}
