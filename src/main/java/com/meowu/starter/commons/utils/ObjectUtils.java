package com.meowu.starter.commons.utils;

public class ObjectUtils{

    private ObjectUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean isNull(Object o){
        return o == null;
    }

    public static boolean isNotNull(Object o){
        return !isNull(o);
    }

    public static String toString(Object o){
        return o == null ? StringUtils.EMPTY : o.toString();
    }
}
