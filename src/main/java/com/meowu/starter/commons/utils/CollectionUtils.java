package com.meowu.starter.commons.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionUtils{

    public static final List<?> EMPTY_LIST = Collections.emptyList();

    private CollectionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean isEmpty(Collection<?> collection){
        return size(collection) == 0;
    }

    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    public static int size(Collection<?> collection){
        return collection == null ? 0 : collection.size();
    }
}
