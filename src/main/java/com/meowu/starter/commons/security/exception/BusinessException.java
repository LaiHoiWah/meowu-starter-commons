package com.meowu.starter.commons.security.exception;

public class BusinessException extends RuntimeException{

    public BusinessException(){
        super();
    }

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(Throwable cause){
        super(cause);
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
    }

    public BusinessException(String message, Object... args){
        super(String.format(message, args));
    }
}
