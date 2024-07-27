package com.meowu.starter.commons.utils;

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
        return org.apache.commons.lang3.StringUtils.isNotBlank(cs);
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
}
