package com.meowu.starter.commons.utils;

import com.google.common.base.CaseFormat;

import java.util.Iterator;
import java.util.StringJoiner;

public class StringUtils{

    public static final String EMPTY = "";
    public static final String SPACE = " ";

    private StringUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static boolean isBlank(final CharSequence cs){
        int length = length(cs);

        if(length == 0){
            return true;
        }

        for(int i = 0; i < length; i++){
            if(!Character.isWhitespace(cs.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(final CharSequence cs){
        return !isBlank(cs);
    }

    public static String strip(final String str){
        int length = length(str);

        if(length == 0){
            return str;
        }

        int start  = 0;
        while(start < length && Character.isWhitespace(str.charAt(start))){
            start++;
        }
        while(start < length && Character.isWhitespace(str.charAt(length - 1))){
            length--;
        }

        return str.substring(start, length);
    }

    public static String stripAnyWhitespace(final String str){
        int length = length(str);

        if(length == 0){
            return str;
        }

        // result
        StringBuilder builder = new StringBuilder();
        // loop
        for(int i = 0; i < length; i++){
            char c = str.charAt(i);
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
        int length = length(str);

        if(length == 0){
            return str;
        }

        char[] chars = str.toCharArray();
        chars[0] = Character.toTitleCase(chars[0]);

        return new String(chars);
    }

    public static String uncapitalize(final String str){
        int length = length(str);

        if(length == 0){
            return str;
        }

        char[] chars = str.toCharArray();
        chars[0] = Character.toLowerCase(chars[0]);

        return new String(chars);
    }

    public static String join(Iterable<?> iterable, String separator){
        if(iterable == null){
            return null;
        }

        Iterator<?> iterator = iterable.iterator();
        if(!iterator.hasNext()){
            return EMPTY;
        }

        StringJoiner stringJoiner = new StringJoiner(separator);
        stringJoiner.setEmptyValue(EMPTY);
        while(iterator.hasNext()){
            Object o = iterator.next();
            stringJoiner.add(toStringOrEmpty(o));
        }

        return stringJoiner.toString();
    }

    public static int length(final CharSequence cs){
        return cs == null ? 0 : cs.length();
    }

    public static String toStringOrEmpty(final Object o){
        return ObjectUtils.toString(o);
    }
}
