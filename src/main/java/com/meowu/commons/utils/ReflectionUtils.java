package com.meowu.commons.utils;

import com.meowu.commons.security.exception.ReflectionException;

import java.beans.Introspector;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Function;

public class ReflectionUtils{

    private ReflectionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static <T, R> String getFieldName(Function<T, R> function){
        return getField(function).getName();
    }

    public static <T, R>Field getField(Function<T, R> function){
        AssertionUtils.isNotNull(function, "Function must not be null");

        try{
            String fieldName = null;

            // get method
            Method method = function.getClass().getDeclaredMethod("writeReplace");
            method.setAccessible(true);

            // get serialized lambda
            SerializedLambda lambda = (SerializedLambda) method.invoke(function);

            // if getter method
            String methodName = lambda.getImplMethodName();
            if(methodName.startsWith("get") && methodName.length() > 3){
                fieldName = Introspector.decapitalize(methodName.substring(3));
            }else if(methodName.startsWith("is") && methodName.length() > 2){
                fieldName = Introspector.decapitalize(methodName.substring(2));
            }else if(methodName.startsWith("lambda$")){
                throw new IllegalArgumentException("Function cannot be a lambda");
            }else{
                throw new IllegalArgumentException("[" + methodName + "] is not a getter function");
            }

            // get class
            String   declaredClass = lambda.getImplClass().replaceAll("/", ".");
            Class<?> classOf       = Class.forName(declaredClass);

            if(StringUtils.isBlank(fieldName)){
                throw new NoSuchFieldException("No field can be found by method[" + methodName + "]");
            }

            // get field
            return classOf.getField(fieldName);

        }catch(IllegalArgumentException
                | NoSuchMethodException
                | IllegalAccessException
                | InvocationTargetException
                | ClassNotFoundException
                | NoSuchFieldException e){
            throw new ReflectionException(e.getMessage(), e);
        }
    }
}
