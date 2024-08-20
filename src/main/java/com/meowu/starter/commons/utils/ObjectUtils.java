package com.meowu.starter.commons.utils;

/**
 * Suggest using this util instead of org.apache.commons.lang3.ObjectUtils
 */
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

    @SuppressWarnings("unchecked")
    public static <T> T deepClone(T source){
        AssertionUtils.notNull(source, "Source object must not be null");
        // get class
        Class<?> classOf = source.getClass();
        // to json
        String json = GsonUtils.toJson(source);
        // to object
        return (T) GsonUtils.fromJson(json, classOf);
    }

    public static String toString(Object o){
        return o == null ? StringUtils.EMPTY : o.toString();
    }
}
