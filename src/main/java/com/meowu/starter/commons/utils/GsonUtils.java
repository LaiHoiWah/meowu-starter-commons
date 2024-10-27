package com.meowu.starter.commons.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import com.meowu.starter.commons.domain.TypeAdapter;

public class GsonUtils{

    private GsonUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static Gson createGson(boolean serializeNulls, boolean disableHtmlEscaping, TypeAdapter<?>... adapters){
        GsonBuilder builder = new GsonBuilder();
        builder.setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE);

        // setting
        if(serializeNulls){
            builder.serializeNulls();
        }
        if(disableHtmlEscaping){
            builder.disableHtmlEscaping();
        }
        if(ArrayUtils.isNotEmpty(adapters)){
            for(TypeAdapter<?> adapter : adapters){
                builder.registerTypeAdapter(adapter.getType(), adapter);
            }
        }

        return builder.create();
    }
}
