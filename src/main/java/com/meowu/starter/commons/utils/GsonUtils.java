package com.meowu.starter.commons.utils;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Date;

public class GsonUtils{

    public static final Gson DEFAULT = createGson(true, true, true);

    private GsonUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static String toJson(Object o){
        return DEFAULT.toJson(o);
    }

    public static <T> T fromJson(String json, Class<T> classOf){
        return DEFAULT.fromJson(json, classOf);
    }

    public static <T> T fromJson(String json, Type typeOf){
        return DEFAULT.fromJson(json, typeOf);
    }

    public static Gson createGson(boolean serializeNulls, boolean disableHtmlEscaping, boolean timestamp){
        GsonBuilder builder = new GsonBuilder();
        builder.setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE);
        // setting
        if(serializeNulls){
            builder.serializeNulls();
        }
        if(disableHtmlEscaping){
            builder.disableHtmlEscaping();
        }
        if(timestamp){
            builder.registerTypeAdapter(Date.class, new DateTypeAdapter());
        }

        return builder.create();
    }

    private static class DateTypeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date>{

        @Override
        public JsonElement serialize(Date date, Type type, JsonSerializationContext jsonSerializationContext){
            return date == null ? null : new JsonPrimitive(date.getTime());
        }

        @Override
        public Date deserialize(JsonElement element, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException{
            return new Date(element.getAsJsonPrimitive().getAsLong());
        }
    }
}
