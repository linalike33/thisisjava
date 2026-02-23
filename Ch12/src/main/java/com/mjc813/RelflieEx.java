package com.mjc813;

import java.lang.constant.Constable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RelflieEx {
    public static void main(String[] args)throws Exception{
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[]constructors = clazz.getConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor.getName()+"(");
            Class[] par = constructor.getParameterTypes();
            printpar(par);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getType().getName()+""+field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getMethods();
        for(Method method : methods){
            System.out.println(method.getName()+"(");
            Class[] par = method.getParameterTypes();
            printpar(par);
            System.out.println(")");
        }
    }
    private static void printpar(Class[]par){
        for(int i = 0; i<par.length; i++){
            System.out.println(par[i].getName());
            if(i<(par.length-1)){
                System.out.println(", ............ ...... .      .                              0");
            }
        }
    }
}
