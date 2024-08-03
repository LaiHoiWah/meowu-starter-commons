package com.meowu.starter.commons.utils;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ObjectUtilsTest{

    @Test
    public void deepClone(){
        List<String> source = Lists.newArrayList("1", "2");
        List<String> target = ObjectUtils.deepClone(source);

        System.out.println(source);
        System.out.println(target);
    }
}
