package com.meowu.starter.commons.utils;

import com.meowu.starter.commons.security.exception.ReflectionException;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Function;

public class ReflectionUtils{

    private static final String GET_PREFIX    = "get";
    private static final String IS_PREFIX     = "is";
    private static final String LAMBDA_PREFIX = "lambda$";

    private ReflectionUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static <T, R> Field getField(Function<T, R> function){
        AssertionUtils.notNull(function, "Getter method must not be null");

        try{
            String fieldName = StringUtils.EMPTY;

            // get method
            Method method = function.getClass().getDeclaredMethod("writeReplace");
            // set access
            method.setAccessible(true);

            // get serialized lambda
            SerializedLambda lambda = (SerializedLambda) method.invoke(function);

            // getter or not
            String methodName = lambda.getImplMethodName();
            if(methodName.startsWith(GET_PREFIX) && methodName.length() > 3){
                fieldName = StringUtils.uncapitalize(methodName.substring(3));
            }else if(methodName.startsWith(IS_PREFIX) && methodName.length() > 2){
                fieldName = StringUtils.upperCase(methodName.substring(2));
            }else if(methodName.startsWith(LAMBDA_PREFIX)){
                throw new IllegalArgumentException("Function cannot be a lambda");
            }else{
                throw new IllegalArgumentException("[" + methodName + "] is a invalid function");
            }

            // cannot find the field name
            if(StringUtils.isBlank(fieldName)){
                throw new NoSuchFieldException("No field can be found by method[" + methodName + "]");
            }

            // get class
            String   className = lambda.getImplClass().replaceAll("/", ".");
            Class<?> classOf   = Class.forName(className);

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
