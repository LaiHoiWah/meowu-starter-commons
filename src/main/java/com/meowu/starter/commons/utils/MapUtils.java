package com.meowu.starter.commons.utils;

import java.util.Map;

public class MapUtils{

    private MapUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean isEmpty(Map<?, ?> map){
        return map == null || map.isEmpty();
    }

    public static boolean isNotEmpty(Map<?, ?> map){
        return !isEmpty(map);
    }
}
