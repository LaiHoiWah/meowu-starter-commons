package com.meowu.commons.utils;

import com.google.common.base.CaseFormat;

import java.util.Objects;

/**
 *
 */
public class StringUtils{

    private StringUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static String emptyString(){
        return org.apache.commons.lang3.StringUtils.EMPTY;
    }

    public static String toUpperCase(String str){
        return org.apache.commons.lang3.StringUtils.upperCase(str);
    }

    public static String toUpperCaseSafety(String str){
        return isEmpty(str) ? org.apache.commons.lang3.StringUtils.EMPTY : str.toUpperCase();
    }

    public static String toLowerCase(String str){
        return org.apache.commons.lang3.StringUtils.lowerCase(str);
    }

    public static String toLowerCaseSafety(String str){
        return isEmpty(str) ? org.apache.commons.lang3.StringUtils.EMPTY : str.toLowerCase();
    }

    public static String toCamelCase(String str){
        return isEmpty(str) ? str : CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
    }

    public static String toCamelCaseSafety(String str){
        return isEmpty(str) ? org.apache.commons.lang3.StringUtils.EMPTY : CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
    }

    public static String toUnderscoreCase(String str){
        return isEmpty(str) ? str : CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, str);
    }

    public static String toUnderscoreCaseSafety(String str){
        return isEmpty(str) ? org.apache.commons.lang3.StringUtils.EMPTY : CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, str);
    }

    public static boolean equal(String first, String second){
        return Objects.equals(first, second);
    }

    public static boolean equalSafety(String first, String second){
        if(first == null || second == null){
            return first == null && second == null;
        }

        int firstLength  = first.length();
        int secondLength = second.length();

        int result = 0;
        result |= firstLength - secondLength;

        // time-constant comparison
        for(int i = 0; i < firstLength; i++){
            int index = ((i - secondLength) >>> 31) * i;
            result |= first.charAt(i) ^ second.charAt(index);
        }

        return (result == 0);
    }

    public static String strip(String str){
        return isEmpty(str) ? str : org.apache.commons.lang3.StringUtils.strip(str);
    }

    public static String stripSafety(String str){
        return isEmpty(str) ? emptyString() : org.apache.commons.lang3.StringUtils.strip(str);
    }

    public static String capitalize(String str){
        return org.apache.commons.lang3.StringUtils.capitalize(str);
    }

    public static String capitalizeSafety(String str){
        return isEmpty(str) ? org.apache.commons.lang3.StringUtils.EMPTY : org.apache.commons.lang3.StringUtils.capitalize(str);
    }

    public static String uncapitalize(String str){
        return org.apache.commons.lang3.StringUtils.uncapitalize(str);
    }

    public static String uncapitalizeSafety(String str){
        return isEmpty(str) ? org.apache.commons.lang3.StringUtils.EMPTY : org.apache.commons.lang3.StringUtils.uncapitalize(str);

    }

    public static String removeAllWhitespace(String str){
        if(isEmpty(str)){
            return str;
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            builder.append(Character.isWhitespace(c) ? "" : c);
        }
        return builder.toString();
    }

    public static String removeAllWhitespaceSafety(String str){
        return isEmpty(str) ? org.apache.commons.lang3.StringUtils.EMPTY : removeAllWhitespace(str);
    }

    public static String abbreviate(String str, String abbrevMarker, int maxWidth){
        return isEmpty(str) ? str : org.apache.commons.lang3.StringUtils.abbreviate(str, abbrevMarker, maxWidth);
    }

    public static String abbreviateSafety(String str, String abbrevMarker, int maxWidth){
        return isEmpty(str) ? org.apache.commons.lang3.StringUtils.EMPTY : org.apache.commons.lang3.StringUtils.abbreviate(str, abbrevMarker, maxWidth);
    }

    public static String isNotBlankOrDefault(String str, String defaultValue){
        return isNotBlank(str) ? str : defaultValue;
    }

    public static String isNotBlankOrDefaultSafety(String str, String defaultValue){
        return isNotBlankOrDefault(str, defaultValue != null ? defaultValue : emptyString());
    }

    public static boolean isBlank(String str){
        return org.apache.commons.lang3.StringUtils.isBlank(str);
    }

    public static boolean isNotBlank(String str){
        return org.apache.commons.lang3.StringUtils.isNotBlank(str);
    }

    public static boolean isEmpty(String str){
        return org.apache.commons.lang3.StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return org.apache.commons.lang3.StringUtils.isNotEmpty(str);
    }
}
