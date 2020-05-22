package com.mdjin.part3;
import  static com.mdjin.util.Print.*;
/**
 * @author jinmaodong
 * @date 2020/5/21
 * @since 1.0.0
 **/
public class TestBool {
    /**
     * main method
     */
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int c = 99;
        print(a=b);
        print(b=a);
        print(Boolean.valueOf("true"));
    }

}
