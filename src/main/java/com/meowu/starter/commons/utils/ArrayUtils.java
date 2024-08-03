package com.meowu.starter.commons.utils;

/**
 * Suggest using this util instead of org.apache.commons.lang3.ArrayUtils
 */
public class ArrayUtils{

    private ArrayUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static <T> boolean isEmpty(T[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static <T> boolean isNotEmpty(T[] array){
        return !isEmpty(array);
    }
}
