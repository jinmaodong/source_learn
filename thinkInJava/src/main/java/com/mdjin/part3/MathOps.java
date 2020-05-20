package com.mdjin.part3;

import java.util.Random;
import static com.mdjin.util.Print.*;

/**
 * JAVA基础运算符
 * @author jinmaodong
 * @date 2020/5/20
 * @since 1.0.0
 **/
public class MathOps {
    /**
     * main method
     */
    public static void main(String[] args) {

        Random random = new Random(47);

        int a,b,c;
        float a1,b1,c1;
        double a2,b2,c2;

        a = random.nextInt(100) + 1;
        b = random.nextInt(100) + 1;
        calcInt(a,b);
        print("-------------------------------------calcInt over-------------------------------------------");
        a1 = random.nextFloat();
        b1 = random.nextFloat();
        calcFloat(a1,b1);
        print("-------------------------------------calcFloat over-------------------------------------------");
        a2 = random.nextDouble();
        b2 = random.nextDouble();
        calcDouble(a2,b2);
        print("-------------------------------------calcDouble over-------------------------------------------");
    }

    static void calcInt(int a,int b){
        int result ;
        print("a: " + a);
        print("b: " + b);
        result = a + b;
        print("a + b = " + result);
        result = a - b;
        print("a - b = " + result);
        result = a * b;
        print("a * b = " + result);
        result = a / b;
        print("a / b = " + result);
        result = a % b;
        print("a % b = " + result);
        result %= b;
        print("result %= b：" + result);
    }
    static void calcFloat(float a,float b){
        float result ;
        print("a: " + a);
        print("b: " + b);
        result = a + b;
        print("a + b = " + result);
        result = a - b;
        print("a - b = " + result);
        result = a * b;
        print("a * b = " + result);
        result = a / b;
        print("a / b = " + result);
        result = a % b;
        print("a % b = " + result);
    }
    static void calcDouble(double a,double b){
        double result ;
        print("a: " + a);
        print("b: " + b);
        result = a + b;
        print("a + b = " + result);
        result = a - b;
        print("a - b = " + result);
        result = a * b;
        print("a * b = " + result);
        result = a / b;
        print("a / b = " + result);
        result = a % b;
        print("a % b = " + result);
    }
//    static void calcByte(byte a,byte b){
//        byte result ;
//        print("a: " + a);
//        print("b: " + b);
//        result = a + b;
//        print("a + b = " + result);
//        result = a - b;
//        print("a - b = " + result);
//        result = a * b;
//        print("a * b = " + result);
//        result = a / b;
//        print("a / b = " + result);
//        result = a % b;
//        print("a % b = " + result);
//    }
}
