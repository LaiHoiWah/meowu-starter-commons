package com.meowu.commons.security.exception;

import java.text.MessageFormat;

public class MeowuException extends RuntimeException{

    public MeowuException(){
        super();
    }

    public MeowuException(String message){
        super(message);
    }

    public MeowuException(String message, Throwable cause){
        super(message, cause);
    }

    public MeowuException(String pattern, Object... arguments){
        super(MessageFormat.format(pattern, arguments));
    }

    public MeowuException(Throwable cause, String pattern, Object... arguments){
        super(MessageFormat.format(pattern, arguments), cause);
    }
}
