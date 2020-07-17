package com.mdjin.part3.test;
import static com.mdjin.util.Print.*;


/**
 * @author jinmaodong
 * @date 2020/5/22
 * @since 1.0.0
 **/
public class Demo9 {
    /**
     * main method
     */
    public static void main(String[] args) {
        String a = "abc";
        String b = "456";
//        fun(a,b);

        boolean c = false;
        boolean d = true;
//        fun(c,d);
        fun2();
    }



    static void fun(String a,String b){
        print(a = b);
        print(a == b);
//        print(a && b);
//        print(a || b);
//        print(!b);
        print(a.equals(b));
//        print(a ^ b);
//        print(a | b);
//        print(a & b);
    }
    static void fun(boolean a,boolean b){
        print("boolean test");
        print(a = b);
        print(a == b);
        print(a && b);
        print(a || b);
        print(!b);
//        print(a.equals(b));
        print(a ^ b);
        print(a | b);
        print(a & b);
    }

    static void fun2(){
        print("boolean test");
        boolean a = false;
        boolean b = true;
        print(a = b);
        print(a == b);

        if(a == b){
            print("a == b");
        }

        print(a && b);
        print(a || b);
        print(!b);
//        print(a.equals(b));
        print(a ^ b);
        print(a | b);
        print(a & b);
    }
}
