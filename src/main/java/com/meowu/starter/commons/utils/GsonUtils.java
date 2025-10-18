package com.meowu.starter.commons.utils;

import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import com.meowu.starter.entity.adapter.gson.DateAdapter;
import com.meowu.starter.entity.adapter.gson.RecordStatusAdapter;
import com.meowu.starter.entity.adapter.gson.TypeAdapter;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Objects;
import java.util.stream.Stream;

public class GsonUtils{

    private GsonUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static GsonBuilder getBuilder(){
        TypeAdapter<?>[] adapters = new TypeAdapter<?>[]{
            new DateAdapter(), new RecordStatusAdapter()
        };

        return getBuilder(true, true, adapters);
    }

    public static GsonBuilder getBuilder(boolean serializeNulls, boolean disableHtmlEscaping, TypeAdapter<?>... adapters){
        GsonBuilder builder = new GsonBuilder();
        // for integer and double
        builder.setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE);
        // setting
        if(serializeNulls){
            builder.serializeNulls();
        }
        if(disableHtmlEscaping){
            builder.disableHtmlEscaping();
        }
        if(ArrayUtils.isNotEmpty(adapters)){
            Stream.of(adapters)
                  .filter(Objects::nonNull)
                  .forEach(adapter -> builder.registerTypeAdapter(adapter.getType(), adapter));
        }

        return builder;
    }
}
