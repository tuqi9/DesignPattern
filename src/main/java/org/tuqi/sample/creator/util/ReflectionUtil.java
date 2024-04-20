package org.tuqi.sample.creator.util;

public class ReflectionUtil {

    public static Object instance(String className){
        try {
            Class<?> clazz = Class.forName(className);
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
