package com.meowu.starter.commons.utils;

import java.util.Map;

public class MapUtils{

    private MapUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean isEmpty(Map<?, ?> map){
        return size(map) == 0;
    }

    public static boolean isNotEmpty(Map<?, ?> map){
        return !isEmpty(map);
    }

    public static int size(Map<?, ?> map){
        return map == null ? 0 : map.size();
    }
}
