package com.mdjin.part4;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/22
 * @since 1.0.0
 **/
public class TestFor {
    /**
     * main method
     */
    public static void main(String[] args) {
        int i = 0;
        for(;;){
            print("for 循环可以不填写初始化表达式、布尔表达式、步进运算");
            if(i++ > 99){
                print("执行："+i +"次，我要break了.");
                break;
            }
        }
        //for循环的初始化和步进部分可以使用逗号表达式
        for(int a=0,b=0; a+b < 100;a++,b++){
            print("a:"+a+",b:"+b);
        }
    }

}
