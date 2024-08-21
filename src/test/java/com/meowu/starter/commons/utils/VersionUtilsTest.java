package com.meowu.starter.commons.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VersionUtilsTest{

    @Test
    public void compare(){
        // int
        Assertions.assertEquals(0, VersionUtils.compare((Integer) null, (Integer) null));
        Assertions.assertEquals(0, VersionUtils.compare(1, 1));
        Assertions.assertEquals(-1, VersionUtils.compare((Integer) null, 1));
        Assertions.assertEquals(-1, VersionUtils.compare(0, 1));
        Assertions.assertEquals(1, VersionUtils.compare(1, (Integer) null));
        Assertions.assertEquals(1, VersionUtils.compare(1, 0));

        // long
        Assertions.assertEquals(0, VersionUtils.compare((Long) null, (Long) null));
        Assertions.assertEquals(0, VersionUtils.compare(1L, 1L));
        Assertions.assertEquals(-1, VersionUtils.compare((Long) null, 1L));
        Assertions.assertEquals(-1, VersionUtils.compare(0L, 1L));
        Assertions.assertEquals(1, VersionUtils.compare(1L, (Long) null));
        Assertions.assertEquals(1, VersionUtils.compare(1L, 0L));

        // float
        Assertions.assertEquals(0, VersionUtils.compare((Float) null, (Float) null));
        Assertions.assertEquals(0, VersionUtils.compare(1F, 1F));
        Assertions.assertEquals(0, VersionUtils.compare(1.0F, 1.00F));
        Assertions.assertEquals(-1, VersionUtils.compare((Float) null, 1F));
        Assertions.assertEquals(-1, VersionUtils.compare(0F, 1F));
        Assertions.assertEquals(-1, VersionUtils.compare(0.0F, 1.00F));
        Assertions.assertEquals(1, VersionUtils.compare(1F, (Float) null));
        Assertions.assertEquals(1, VersionUtils.compare(1F, 0F));
        Assertions.assertEquals(1, VersionUtils.compare(1.0F, 0.00F));

        // double
        Assertions.assertEquals(0, VersionUtils.compare((Double) null, (Double) null));
        Assertions.assertEquals(0, VersionUtils.compare(1D, 1D));
        Assertions.assertEquals(0, VersionUtils.compare(1.0D, 1.00D));
        Assertions.assertEquals(-1, VersionUtils.compare((Double) null, 1D));
        Assertions.assertEquals(-1, VersionUtils.compare(0D, 1D));
        Assertions.assertEquals(-1, VersionUtils.compare(0.0D, 1.00D));
        Assertions.assertEquals(1, VersionUtils.compare(1D, (Double) null));
        Assertions.assertEquals(1, VersionUtils.compare(1D, 0D));
        Assertions.assertEquals(1, VersionUtils.compare(1.0D, 0.00D));

        // String
        Assertions.assertEquals(0, VersionUtils.compare((String) null, (String) null));
        Assertions.assertEquals(0, VersionUtils.compare("", ""));
        Assertions.assertEquals(-1, VersionUtils.compare("", "abc"));
        Assertions.assertEquals(-1, VersionUtils.compare("abc", "cba"));
        Assertions.assertEquals(-1, VersionUtils.compare("0.0.1", "0.0.10"));
        Assertions.assertEquals(-1, VersionUtils.compare("0.1.1", "0.2.1"));
        Assertions.assertEquals(-1, VersionUtils.compare("0.1", "0.1.0"));
        Assertions.assertEquals(-1, VersionUtils.compare("0.1.10", "0.2"));
        Assertions.assertEquals(-1, VersionUtils.compare("0.1.alpha", "0.1.beta"));
        Assertions.assertEquals(1, VersionUtils.compare("abc", ""));
        Assertions.assertEquals(1, VersionUtils.compare("cba", "abc"));
        Assertions.assertEquals(1, VersionUtils.compare("0.0.10", "0.0.1"));
        Assertions.assertEquals(1, VersionUtils.compare("0.2.1", "0.1.1"));
        Assertions.assertEquals(1, VersionUtils.compare("0.1.0", "0.1"));
        Assertions.assertEquals(1, VersionUtils.compare("0.2", "0.1.10"));
        Assertions.assertEquals(1, VersionUtils.compare("0.1.beta", "0.1.alpha"));
    }
}
