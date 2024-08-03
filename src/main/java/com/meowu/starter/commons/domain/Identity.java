package com.meowu.starter.commons.domain;

import java.io.Serializable;

public interface Identity<T> extends Serializable{

    T getId();

    void setId(T id);
}
