package com.meowu.starter.commons.utils;

import java.util.Collection;

public class AssertionUtils{

    private AssertionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static void notNull(Object o, String message){
        if(ObjectUtils.isNull(o)){
            throw new IllegalArgumentException(message);
        }
    }

    public static void notBlank(String s, String message){
        if(StringUtils.isBlank(s)){
            throw new IllegalArgumentException(message);
        }
    }

    public static void notEmpty(Collection<?> collection, String message){
        if(CollectionUtils.isEmpty(collection)){
            throw new IllegalArgumentException(message);
        }
    }

    public static <T> void notEmpty(T[] array, String message){
        if(ArrayUtils.isEmpty(array)){
            throw new IllegalArgumentException(message);
        }
    }

    public static void isTrue(boolean expression, String message){
        if(!expression){
            throw new IllegalArgumentException(message);
        }
    }
}
