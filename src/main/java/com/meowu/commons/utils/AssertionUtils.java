package com.meowu.commons.utils;

import java.util.Collection;
import java.util.Objects;

public class AssertionUtils{

    private AssertionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static void isNull(Object object, String message){
        if(!Objects.isNull(object)){
            throw new IllegalArgumentException(message);
        }
    }

    public static void isNotNull(Object object, String message){
        if(Objects.isNull(object)){
            throw new IllegalArgumentException(message);
        }
    }

    public static void isBlank(String str, String message){
        if(StringUtils.isNotBlank(str)){
            throw new IllegalArgumentException(message);
        }
    }

    public static void isNotBlank(String str, String message){
        if(StringUtils.isBlank(str)){
            throw new IllegalArgumentException(message);
        }
    }

    public static <T> void isEmpty(Collection<T> collection, String message){
        if(CollectionUtils.isNotEmpty(collection)){
            throw new IllegalArgumentException(message);
        }
    }

    public static <T> void isNotEmpty(Collection<T> collection, String message){
        if(CollectionUtils.isEmpty(collection)){
            throw new IllegalArgumentException(message);
        }
    }

    public static <T> void isEmpty(T[] array, String message){
        if(ArrayUtils.isNotEmpty(array)){
            throw new IllegalArgumentException(message);
        }
    }

    public static <T> void isNotEmpty(T[] array, String message){
        if(ArrayUtils.isEmpty(array)){
            throw new IllegalArgumentException(message);
        }
    }

    public static void isTrue(boolean expression, String message){
        if(!expression){
            throw new IllegalArgumentException(message);
        }
    }

    public static void isFalse(boolean expression, String message){
        if(expression){
            throw new IllegalArgumentException(message);
        }
    }
}
