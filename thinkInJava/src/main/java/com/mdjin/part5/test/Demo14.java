package com.mdjin.part5.test;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class Demo14 {
    /**
     * main method
     */
    public static void main(String[] args) {
        Emo14.printx();
    }

}

class Emo14{
    static String string1 = "string1";

    static String string2 ;

    static {
        string2 = "string2";
    }

    public static void printx(){
        print(string1);
        print(string2);
    }
}
