package com.mdjin.part6;

import static com.mdjin.util.Print.*;

/**
 * @author jinmaodong
 * @date 2020/5/25
 * @since 1.0.0
 **/
public class Soup {
    /**
     * main method
     */
    public static void main(String[] args) {
        Soup2 soup2 = Soup2.getInstance();
    }

}

class Soup2{
    private Soup2(){

    }

    private static Soup2 soup2 = new Soup2();

    public static Soup2 getInstance(){
        return soup2;
    }

}
