package com.meowu.starter.commons.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest{

    @Test
    public void isBlank(){
        Assertions.assertTrue(StringUtils.isBlank(""));
        Assertions.assertTrue(StringUtils.isBlank(" "));
        Assertions.assertTrue(StringUtils.isBlank(null));
        Assertions.assertFalse(StringUtils.isBlank("Test"));
        Assertions.assertFalse(StringUtils.isBlank(" Test "));
    }

    @Test
    public void isNotBlank(){
        Assertions.assertFalse(StringUtils.isNotBlank(""));
        Assertions.assertFalse(StringUtils.isNotBlank(" "));
        Assertions.assertFalse(StringUtils.isNotBlank(null));
        Assertions.assertTrue(StringUtils.isNotBlank("Test"));
        Assertions.assertTrue(StringUtils.isNotBlank(" Test "));
    }

    @Test
    public void trim(){
        String compare = "Test";

        Assertions.assertEquals(compare, StringUtils.trim(" Test"));
        Assertions.assertEquals(compare, StringUtils.trim("Test "));
        Assertions.assertEquals(compare, StringUtils.trim(" Test "));
    }
}
