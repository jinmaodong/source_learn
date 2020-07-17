package com.mdjin.part5.test;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class Demo17 {
    /**
     * main method
     */
    public static void main(String[] args) {
        TestArray[] testArrays = new TestArray[2];
    }

}

class TestArray{
    public TestArray(String a){
        print(a);
    }
    public TestArray(){
        print("default constractor");
    }
}
