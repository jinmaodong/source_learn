package com.mdjin.part6;

import com.mdjin.part6.dessert.PackagedClass;

import static com.mdjin.util.Print.*;

/**
 * 如果一个类是无修饰符（默认包权限）则位于包之外的类无法调用
 *
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class Foreign {
    /**
     * main method
     */
    public static void main(String[] args) {
        PackagedClass packagedClass = new PackagedClass();
    }

}
