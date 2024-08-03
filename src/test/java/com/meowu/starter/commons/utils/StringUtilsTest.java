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

    @Test
    public void strip(){
        String compare = "Test";

        Assertions.assertEquals(compare, StringUtils.strip(" Test"));
        Assertions.assertEquals(compare, StringUtils.strip("Test "));
        Assertions.assertEquals(compare, StringUtils.strip(" Test "));
    }

    @Test
    public void stripAnyWhitespace(){
        String compare = "Test";

        Assertions.assertEquals(compare, StringUtils.stripAnyWhitespace(" Test"));
        Assertions.assertEquals(compare, StringUtils.stripAnyWhitespace("Test "));
        Assertions.assertEquals(compare, StringUtils.stripAnyWhitespace(" Test "));
        Assertions.assertEquals(compare, StringUtils.stripAnyWhitespace(" T e s t "));
    }

    @Test
    public void underscoreToCamelCase(){
       String compare = "camelCase";

       Assertions.assertEquals(compare, StringUtils.underscoreToCamelCase("camel_case"));
       Assertions.assertEquals(compare, StringUtils.underscoreToCamelCase("Camel_Case"));
       Assertions.assertEquals("camelACase", StringUtils.underscoreToCamelCase("Camel_A_Case"));
    }

    @Test
    public void camelToUnderscoreCase(){
        String compare = "camel_case";

        Assertions.assertEquals(compare, StringUtils.camelToUnderscoreCase("camelCase"));
        Assertions.assertEquals(compare, StringUtils.camelToUnderscoreCase("CamelCase"));
        Assertions.assertEquals("camel_a_case", StringUtils.camelToUnderscoreCase("CamelACase"));
    }
}
