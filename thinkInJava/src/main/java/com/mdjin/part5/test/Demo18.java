package com.mdjin.part5.test;

import static com.mdjin.util.Print.print;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class Demo18 {
    /**
     * main method
     */
    public static void main(String[] args) {
        TestArray2[] testArrays = new TestArray2[]{new TestArray2(),new TestArray2()};
    }

}

class TestArray2 {
    public TestArray2(String a) {
        print(a);
    }

    public TestArray2() {
        print("default constractor");
    }
}
