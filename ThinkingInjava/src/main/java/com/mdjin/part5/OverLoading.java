package com.mdjin.part5;

import static com.mdjin.util.Print.*;

/**
 * 方法重载的理解
 *  1.方法重载比较重要的出发点来自于构造器；因为构造器方法必须是类名，而且必然存在多个构造器，所以导致对重载的需求
 *  2.重载的唯一性区别是：每一个重载的方法都必须有一个独一无二的参数类型列表
 *  3.如果两个方法是重载方法，则方法名肯定相同，参数类型列表肯定不同；与返回值无关，与修饰符无关
 *  4.根据方法的返回值来区分重载是不可行的，部分方法调用的时候是不考虑返回值的
 * @author jinmaodong
 * @date 2020/5/24
 * @since 1.0.0
 **/
public class OverLoading {
    /**
     * main method
     */
    public static void main(String[] args) {

    }

    public String writeLog(){
        return null;
    }

    //writeLog() is alreaday defined in "com.mdjin.part5.OverLoading"
//    public void writeLog(){
//
//    }

    private void writeLog(String log){
        print(log);
    }

    private String writeLog(String log1,String log2){
        print(log1);
        print(log2);
        return "";
    }

    public static String writeLog(String log1,String log2,String log3){
        print(log1);
        print(log2);
        print(log3);
        return "";
    }

}
