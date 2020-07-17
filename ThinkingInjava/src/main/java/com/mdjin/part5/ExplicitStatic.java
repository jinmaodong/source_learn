package com.mdjin.part5;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class ExplicitStatic {
    /**
     * main method
     */
    public static void main(String[] args) {
        print("Inside main()");
        Cups.cup1.f(99);
        print("Inside main() end");
        Cups cups1 = new Cups();
    }

}


class Cup{
    Cup(int marker){
        print("Cup("+marker+")");
    }
    void f(int marker){
        print("f("+marker+")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        print("Cups()");
    }
}
