package com.mdjin.part7;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/28
 * @since 1.0.0
 **/
public class FinalOverridingIllusion {
    /**
     * main method
     */
    public static void main(String[] args) {
        OverridingPrivate2 overridingPrivate2 = new OverridingPrivate2();
        overridingPrivate2.f();
        overridingPrivate2.g();

        OverridingPrivate overridingPrivate = overridingPrivate2;
//        overridingPrivate.f();
//        overridingPrivate.g();

        WithFinal withFinal = overridingPrivate2;
//        withFinal.f();
//        withFinal.g();
    }


}

class WithFinal{
    private final void f(){
        print("this is function f() of class WithFinal");
    }

    private void g(){
        print("this is function g() of class WithFinal");
    }
}

class OverridingPrivate extends WithFinal{
    //method dose not override method form its superclass
//    @Override
    private final void f(){
        print("this is function f() of class OverridingPrivate");
    }

    private void g(){
        print("this is function g() of class OverridingPrivate");
    }
}
class OverridingPrivate2 extends OverridingPrivate{
    //method dose not override method form its superclass
//    @Override
    public final void f(){
        print("this is function f() of class OverridingPrivate2");
    }

    public void g(){
        print("this is function g() of class OverridingPrivate2");
    }
}
