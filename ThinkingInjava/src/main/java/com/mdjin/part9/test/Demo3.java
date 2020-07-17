package com.mdjin.part9.test;

import static com.mdjin.util.Print.*;

/**
 * 练习3：创建一个基类，让它包含抽象方法print()，并在导出类中覆盖该方法。覆盖后的方法版本可以打印导出类中定义的某个整型变量的值。在定义该变量之处，赋予它非零值。在基类的构造器中调用这个方法。现在，在main()方法中，创建一个导出类对象，然后调用它的print()
 * 方法。请解释发生的情形
 *
 * @author jinmaodong
 * @date 2020/7/12
 * @since 1.0.0
 **/
public class Demo3 {
    /**
     * main method
     */
    public static void main(String[] args) {
        Child cls = new Child();
        Base cls2 = new Child();
    }

}

//基类初始化方法中直接调用print2方法，此时变量a因是静态变量，在调用Base类时已初始化，而变量b未初始化，值为0
abstract class Base {

    public abstract void print2();

    public Base() {
        print2();
    }

}

class Child extends Base {

    static int a = 123;

    int b = 321;

    @Override
    public void print2() {
        print(a);
        print(b);
    }
}
