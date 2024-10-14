package com.meowu.starter.commons.security.exception;

public class DuplicateException extends BusinessException{

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

    public DuplicateException(Integer code, String message){
        super(message);
    }

    public DuplicateException(String message, Object... args){
        super(String.format(message, args));
    }

    public DuplicateException(Integer code, String message, Object... args){
        super(String.format(message, args));
    }
}
