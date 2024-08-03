package com.meowu.starter.commons.security.exception;

public class ReflectionException extends RuntimeException{

    public ReflectionException(){
        super();
    }

    public ReflectionException(String message){
        super(message);
    }

    public ReflectionException(Throwable cause){
        super(cause);
    }

    public ReflectionException(String message, Throwable cause){
        super(message, cause);
    }

    public ReflectionException(String message, Object... args){
        super(String.format(message, args));
    }
}
