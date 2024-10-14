package com.meowu.starter.commons.security.exception;

public class NotFoundException extends BusinessException{

    public NotFoundException(String message){
        super(message);
    }

    public NotFoundException(Throwable cause){
        super(cause);
    }

    public NotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public NotFoundException(Integer code, String message){
        super(message);
    }

    public NotFoundException(String message, Object... args){
        super(String.format(message, args));
    }

    public NotFoundException(Integer code, String message, Object... args){
        super(String.format(message, args));
    }
}
