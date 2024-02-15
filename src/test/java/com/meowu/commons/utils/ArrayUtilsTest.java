package com.meowu.commons.utils;

import org.junit.Test;

public class ArrayUtilsTest{

    @Test
    public void isArray(){
        System.out.println(ArrayUtils.isArray(null));
        System.out.println(ArrayUtils.isArray((String[]) null));
        System.out.println(ArrayUtils.isArray(new String[2]));
        System.out.println(ArrayUtils.isArray(new char[2]));
    }
}
