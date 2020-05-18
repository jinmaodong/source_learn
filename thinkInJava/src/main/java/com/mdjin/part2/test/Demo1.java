package com.mdjin.part2.test;

/**
 * 第二章>练习1
 * 主要验证java对内置类型得初始化
 *
 * @author jinmaodong
 * @date 2020/5/19
 * @since 1.0.0
 **/
public class Demo1 {

    /**
     * intValue
     */
    static int intValue;

    /**
     * charValue
     */
    static char charValue;
    /**
     * byteValue
     */
    static byte byteValue;
    /**
     * shortalue
     */
    static short shortalue;
    /**
     * longValue
     */
    static long longValue;
    /**
     * booleanValue
     */
    static boolean booleanValue;
    /**
     * floatValue
     */
    static float floatValue;
    /**
     * doubleValue
     */
    static double doubleValue;

    /**
     * 入口方法
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("java 对 int 类型得默认初始化数据：" + intValue);
        System.out.println("java 对 char 类型得默认初始化数据：" + charValue);
        System.out.println("java 对 byte 类型得默认初始化数据：" + byteValue);
        System.out.println("java 对 short 类型得默认初始化数据：" + shortalue);
        System.out.println("java 对 long 类型得默认初始化数据：" + longValue);
        System.out.println("java 对 boolean 类型得默认初始化数据：" + booleanValue);
        System.out.println("java 对 float 类型得默认初始化数据：" + floatValue);
        System.out.println("java 对 double 类型得默认初始化数据：" + doubleValue);
    }

}
/**
 * Output:
 * java 对 int 类型得默认初始化数据：0
 * java 对 char 类型得默认初始化数据：
 * java 对 byte 类型得默认初始化数据：0
 * java 对 short 类型得默认初始化数据：0
 * java 对 long 类型得默认初始化数据：0
 * java 对 boolean 类型得默认初始化数据：false
 * java 对 float 类型得默认初始化数据：0.0
 * java 对 double 类型得默认初始化数据：0.0
 *///:~
