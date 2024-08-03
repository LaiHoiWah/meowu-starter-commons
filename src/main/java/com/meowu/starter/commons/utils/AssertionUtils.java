package com.meowu.starter.commons.utils;

public class AssertionUtils{

    private AssertionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static void notNull(Object o, String message){
        if(ObjectUtils.isNull(o)){
            throw new IllegalArgumentException(message);
        }
    }
}
