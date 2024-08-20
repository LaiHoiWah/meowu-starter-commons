package com.meowu.starter.commons.utils;

import java.lang.reflect.Array;

public class ArrayUtils{

    private ArrayUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static <T> boolean isEmpty(T[] array){
        return length(array) == 0;
    }

    public static <T> boolean isNotEmpty(T[] array){
        return !isEmpty(array);
    }

    public static int length(final Object array){
        return array == null ? 0 : Array.getLength(array);
    }
}
