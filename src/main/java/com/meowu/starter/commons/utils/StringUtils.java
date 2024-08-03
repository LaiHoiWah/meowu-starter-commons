package com.meowu.starter.commons.utils;

import com.google.common.base.CaseFormat;

import java.util.Arrays;
import java.util.Collection;

/**
 * Suggest using this util instead of org.apache.commons.lang3.StringUtils
 */
public class StringUtils{

    public static final String EMPTY = org.apache.commons.lang3.StringUtils.EMPTY;
    public static final String SPACE = org.apache.commons.lang3.StringUtils.SPACE;

    private StringUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean isBlank(final CharSequence cs){
        return org.apache.commons.lang3.StringUtils.isBlank(cs);
    }

    public static boolean isNotBlank(final CharSequence cs){
        return !isBlank(cs);
    }

    public static String trim(final String str){
        if(str == null){
            return null;
        }

        if(isBlank(str)){
            return EMPTY;
        }

        int length = str.length();
        int start  = 0;

        while(start < length && Character.isWhitespace(str.charAt(start))){
            start++;
        }
        while(start < length && Character.isWhitespace(str.charAt(length - 1))){
            length--;
        }

        return str.substring(start, length);
    }

    public static String strip(final String str){
        return org.apache.commons.lang3.StringUtils.strip(str);
    }

    public static String stripAnyWhitespace(final String str){
        if(str == null){
            return null;
        }

        // result
        StringBuilder builder = new StringBuilder();

        // loop
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(!Character.isWhitespace(c)){
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static String upperCase(final String str){
        return isBlank(str) ? str : str.toUpperCase();
    }

    public static String lowerCase(final String str){
        return isBlank(str) ? str : str.toLowerCase();
    }

    public static String underscoreToCamelCase(final String str){
        return isBlank(str) ? str : CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
    }

    public static String camelToUnderscoreCase(final String str){
        return isBlank(str) ? str : CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str);
    }

    public static String capitalize(final String str){
        return org.apache.commons.lang3.StringUtils.capitalize(str);
    }

    public static String uncapitalize(final String str){
        return org.apache.commons.lang3.StringUtils.uncapitalize(str);
    }

    public static String join(Iterable<?> iterable, String separator){
        return org.apache.commons.lang3.StringUtils.join(iterable, separator);
    }
}
