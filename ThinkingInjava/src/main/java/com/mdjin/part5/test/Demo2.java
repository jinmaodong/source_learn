package com.mdjin.part5.test;

import static com.mdjin.util.Print.*;

/**
 * 创建一个类，它包含一个在定义时就被初始化了的String域，以及另一个通过构造器初始化的String域，这两种方式有何差异？
 *
 * @author jinmaodong
 * @date 2020/5/24
 * @since 1.0.0
 **/
public class Demo2 {

    private String s1 = "abcd";

    private String s2 = null;

    private String s3 = s2;

    /**
     * main method
     */
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        print("定义时被初始化的String:"+demo2.getS1());
        print("构造器初始化的String:"+demo2.getS2());
        print("调用构造器方法之前的String:"+demo2.getS3());
    }

    public Demo2(){
        this.setS2("1234");
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }
}
