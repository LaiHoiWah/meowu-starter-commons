package com.meowu.commons.security.exception;

import java.text.MessageFormat;

public class ReflectionException extends MeowuException{

    public ReflectionException(){
        super();
    }

    public ReflectionException(String message){
        super(message);
    }

    public ReflectionException(String message, Throwable cause){
        super(message, cause);
    }

    public ReflectionException(String pattern, Object... arguments){
        super(MessageFormat.format(pattern, arguments));
    }

    public ReflectionException(Throwable cause, String pattern, Object... arguments){
        super(MessageFormat.format(pattern, arguments), cause);
    }
}
