package com.meowu.starter.commons.domain;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public interface TypeAdapter <T> extends JsonSerializer<T>, JsonDeserializer<T>{

    Class<T> getType();
}
