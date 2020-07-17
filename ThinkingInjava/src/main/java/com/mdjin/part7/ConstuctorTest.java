package com.mdjin.part7;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class ConstuctorTest {
    /**
     * main method
     */
    public static void main(String[] args) {
        C c = new C();
    }

}

class A{
    public A(){
        print("constructor of class A.");
    }
}
class B{
    public B(){
        print("constructor of class B.");
    }
}
class C extends A{

    public C(){
        print("constructor of class C.");
    }

    static    B b = new B();
}
