package com.meowu.commons.utils;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.List;

public class CollectionUtilsTest{

    @Test
    public void isCollection(){
        System.out.println(CollectionUtils.isCollection(null));
        System.out.println(CollectionUtils.isCollection((List) null));
        System.out.println(CollectionUtils.isCollection(Lists.newArrayList()));
        System.out.println(CollectionUtils.isCollection(Sets.newHashSet()));
    }
}
