package com.meowu.starter.commons.security.domain;

import com.meowu.starter.commons.security.constants.ResponseCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T>{

    private T data;
    private Integer code;
    private String message;

    public Response(){

    }

    public Response(Integer code){
        this.code = code;
    }

    public Response(Integer code, String message){
        this.code    = code;
        this.message = message;
    }

    public Response(T data){
        this.data = data;
        this.code = ResponseCode.SUCCESS;
    }

    public Response(T data, String message){
        this.data    = data;
        this.code    = ResponseCode.SUCCESS;
        this.message = message;
    }

    public Response(T data, Integer code, String message){
        this.data    = data;
        this.code    = code;
        this.message = message;
    }
}
