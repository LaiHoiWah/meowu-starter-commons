package com.meowu.starter.commons.utils;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    public void capitalize(){
        String compare = "Test";

        Assertions.assertEquals(compare, StringUtils.capitalize("test"));
        Assertions.assertEquals(compare, StringUtils.capitalize("Test"));
        Assertions.assertEquals(" Test", StringUtils.capitalize(" Test"));
        Assertions.assertNotEquals(" Test", StringUtils.capitalize(" test"));
    }

    @Test
    public void uncapitalize(){
        String compare = "test";

        Assertions.assertEquals(compare, StringUtils.uncapitalize("Test"));
        Assertions.assertEquals(compare, StringUtils.uncapitalize("test"));
        Assertions.assertEquals(" test", StringUtils.uncapitalize(" test"));
        Assertions.assertNotEquals(" Test", StringUtils.uncapitalize(" test"));
    }

    @Test
    public void join(){
        List<String> collection = Lists.newArrayList("a", "b", "c", "d");
        String compare = "a,b,c,d";

        Assertions.assertEquals(compare, StringUtils.join(collection, ","));
    }

    @Test
    public void equals(){
        Assertions.assertTrue(StringUtils.equals(null, null));
        Assertions.assertTrue(StringUtils.equals("abc", "abc"));
        Assertions.assertTrue(StringUtils.equals(" abc", " abc"));
        Assertions.assertTrue(StringUtils.equals(" abc ", " abc "));
        Assertions.assertFalse(StringUtils.equals("abc", "abcd"));
        Assertions.assertFalse(StringUtils.equals("abe", "abcd"));
        Assertions.assertFalse(StringUtils.equals("abcd", "abc"));
        Assertions.assertFalse(StringUtils.equals("abcd", "abe"));
        Assertions.assertFalse(StringUtils.equals(null, "abc"));
        Assertions.assertFalse(StringUtils.equals("abc", null));
    }
}
