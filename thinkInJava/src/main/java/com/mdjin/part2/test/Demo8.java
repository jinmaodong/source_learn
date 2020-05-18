//: part2/test/Demo8.java
package com.mdjin.part2.test;

/**
 * 第二章>练习8
 *  编写一个程序，展示无论你创建了某个特定类的多少各对象，这个类中的某个特定的static域只有一个实例。
 * @author jinmaodong
 * @date 2020/5/19
 * @since 1.0.0
 **/
public class Demo8 {

    static int integer = 1000;

    public static void main(String[] args){
        Demo8 d1 = new Demo8();
        Demo8 d2 = new Demo8();
        //不建议使用实例访问类变量
        System.out.println(d1.integer == d2.integer) ;
    }

}
/*
 Output:
 true
 *///:~
