package com.meowu.starter.commons.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Suggest using this util instead of org.apache.commons.collections4.CollectionUtils
 */
public class CollectionUtils{

    public static final List<?> EMPTY_LIST = Collections.emptyList();

    private CollectionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean isEmpty(Collection<?> collection){
        return org.apache.commons.collections4.CollectionUtils.isEmpty(collection);
    }

    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    public static int size(Collection<?> collection){
        return isEmpty(collection) ? 0 : collection.size();
    }
}
