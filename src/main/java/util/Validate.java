package util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.springframework.util.ObjectUtils;

public class Validate{
    public static boolean IsNnull(Object object)throws Exception{
        /** 为空返回true*/
        boolean flag = true;
        try {
            if(object == null){
                return flag;
            }
            flag = elementIsNnull(flag,object);
        }catch (IllegalAccessException e){
            throw e;
        }
        return flag;
    }

    public static boolean elementIsNnull(boolean flag,Object object)throws Exception{
        for(Field field:object.getClass().getDeclaredFields()){
            /** 去除静态属性(serialVersionUID)*/
            boolean isStatic = Modifier.isStatic(field.getModifiers());
            if(isStatic){
                continue;
            }
            field.setAccessible(true);
            Object o = field.get(object);
            if(o instanceof  CharSequence){
                if(!ObjectUtils.isEmpty(o)){
                    flag = false;
                    break;
                }
            }else {
                if(o != null){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}

