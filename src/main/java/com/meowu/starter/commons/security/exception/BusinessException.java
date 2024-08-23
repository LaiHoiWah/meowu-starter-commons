package com.meowu.starter.commons.security.exception;

import com.meowu.starter.commons.security.constants.ResponseCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessException extends RuntimeException{

    private Integer  code;
    private String   message;
    private Object[] args;

    public BusinessException(){
        super();
    }

    public BusinessException(String message){
        super(message);
        // set properties
        this.message = message;
        this.code    = ResponseCode.FAILURE;
    }

    public BusinessException(Throwable cause){
        super(cause);
        // set properties
        this.code = ResponseCode.FAILURE;
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
        // set properties
        this.message = message;
        this.code    = ResponseCode.FAILURE;
    }

    public BusinessException(Integer code, String message){
        super(message);
        // set properties
        this.code    = code;
        this.message = message;
    }

    public BusinessException(String message, Object... args){
        super(String.format(message, args));
        // set properties
        this.code    = ResponseCode.FAILURE;
        this.message = message;
        this.args    = args;
    }

    public BusinessException(Integer code, String message, Object... args){
        super(String.format(message, args));
        // set properties
        this.code    = code;
        this.message = message;
        this.args    = args;
    }
}
