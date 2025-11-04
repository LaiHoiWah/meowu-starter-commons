package com.meowu.starter.commons.utils;

public class DecimalUtils{

    private DecimalUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    // to octal string
    public static String toOctal(long decimal){
        return Long.toOctalString(decimal);
    }

    // to hex string
    public static String toHex(long decimal){
        return Long.toHexString(decimal);
    }

    // to base-26
    public static String toBase26(long decimal){
        return Long.toString(decimal, 26);
    }

    // to base-32
    public static String toBase32(long decimal){
        return Long.toString(decimal, 32);
    }

    // to base-36
    public static String toBase36(long decimal){
        return Long.toString(decimal, 36);
    }
}
