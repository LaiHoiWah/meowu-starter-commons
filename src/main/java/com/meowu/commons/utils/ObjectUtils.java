package com.meowu.commons.utils;

import java.util.Objects;

public class ObjectUtils{

    private ObjectUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean equals(Object first, Object second){
        return Objects.equals(first, second);
    }

    public static boolean isNull(Object object){
        return Objects.isNull(object);
    }

    public static boolean isNotNull(Object object){
        return Objects.nonNull(object);
    }
}
