package com.meowu.starter.commons.domain;

public interface Version<T> extends Comparable<T>{

    T getVersion();

    void setVersion(T version);
}
