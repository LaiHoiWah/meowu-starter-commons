package com.meowu.commons.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtils{

    private ArrayUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static <T> boolean isEmpty(T[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static <T> boolean isNotEmpty(T[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(char[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(char[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(byte[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(byte[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(short[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(short[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(int[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(int[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(long[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(long[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(float[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(float[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(double[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(double[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isEmpty(boolean[] array){
        return org.apache.commons.lang3.ArrayUtils.isEmpty(array);
    }

    public static boolean isNotEmpty(boolean[] array){
        return org.apache.commons.lang3.ArrayUtils.isNotEmpty(array);
    }

    public static boolean isArray(Object object){
        return object != null && object.getClass().isArray();
    }

    public static <T> List<T> toList(T[] array){
        if(array == null){
            return null;
        }

        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static <T> List<T> toListSafety(T[] array){
        return isEmpty(array) ? CollectionUtils.emptyList() : Arrays.stream(array).collect(Collectors.toList());
    }

    public static <T> int length(T[] array){
        return org.apache.commons.lang3.ArrayUtils.getLength(array);
    }

    public static <T> void reverse(T[] array){
        org.apache.commons.lang3.ArrayUtils.reverse(array);
    }
}
