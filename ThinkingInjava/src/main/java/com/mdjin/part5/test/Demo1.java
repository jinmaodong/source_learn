package com.mdjin.part5.test;

import static com.mdjin.util.Print.*;

/**
 * 题目：创建一个类，包含一个未初始化的String引用，验证该引用被JAVA初始化成了null
 * @author jinmaodong
 * @date 2020/5/24
 * @since 1.0.0
 **/
public class Demo1 {

    String pa;

    /**
     * main method
     */
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        print(d.getPa());
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }
}
