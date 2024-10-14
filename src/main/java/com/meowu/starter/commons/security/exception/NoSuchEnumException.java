package com.meowu.starter.commons.security.exception;

public class NoSuchEnumException extends BusinessException{

    public NoSuchEnumException(){
        super();
    }

    public NoSuchEnumException(String message){
        super(message);
    }

    public NoSuchEnumException(Throwable cause){
        super(cause);
    }

    public NoSuchEnumException(String message, Throwable cause){
        super(message, cause);
    }

    public NoSuchEnumException(Integer code, String message){
        super(message);
    }

    public NoSuchEnumException(String message, Object... args){
        super(String.format(message, args));
    }

    public NoSuchEnumException(Integer code, String message, Object... args){
        super(String.format(message, args));
    }
}
