package com.meowu.starter.commons.utils;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class GsonUtilsTest{

    @Test
    public void toJson(){
        System.out.println(GsonUtils.toJson(new Date()));
        System.out.println(GsonUtils.fromJson("1722611415088", Date.class));
        System.out.println(GsonUtils.fromJson("", Date.class));
        System.out.println(GsonUtils.fromJson(null, Date.class));
    }
}
