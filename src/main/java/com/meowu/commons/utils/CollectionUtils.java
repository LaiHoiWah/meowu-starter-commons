package com.meowu.commons.utils;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionUtils{

    private CollectionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean isEmpty(Collection<?> collection){
        return org.apache.commons.collections4.CollectionUtils.isEmpty(collection);
    }

    public static boolean isNotEmpty(Collection<?> collection){
        return org.apache.commons.collections4.CollectionUtils.isNotEmpty(collection);
    }

    public static <T> List<T> emptyList(){
        return Lists.newArrayList();
    }

    public static <T> Set<T> emptySet(){
        return Sets.newHashSet();
    }

    public static int size(Collection<?> collection){
        return isEmpty(collection) ? 0 : collection.size();
    }

    public static <T> void reverse(List<T> list){
        if(list == null){
            return;
        }
        Collections.reverse(list);
    }
}
