package com.mdjin.part7;

import java.util.Random;

import static com.mdjin.util.Print.*;

/**
 * final关键字
 * 1.无法改变得内容
 * 2.数据、方法和类
 * 3.final对象引用，是说引用不可重新指向另一个对象；但是引用指向得对象得属性是可以改变得
 *
 * @author jinmaodong
 * @date 2020/5/26
 * @since 1.0.0
 **/
public class FinalData {

    private static Random random = new Random(47);

    private String id;

    public FinalData(String id){
        this.id = id;
    }

    private final int valueOne = 9;

    public static final int VALUE_TWO = 99;

    public static final int VALUE_THREE = 39;

    private final int i4 = random.nextInt(20);

    static final int INT_5 = random.nextInt(20);

    private Value v1 = new Value(11);

    private final Value v2 = new Value(22);

    private static final Value VAL_3 = new Value(33);

    private final int[] a = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return id + ": " + "i4 = " + i4 +", INT_5 = " + INT_5;
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        FinalData fd2 = new FinalData("fd2");
//        fd1.valueOne++;//
        fd1.v1 = new Value(9);
        //引用指向得对象得内容可以修改
        fd1.v2.i++;
//引用指向得对象得内容可以修改
        for(int i = 0; i < fd1.a.length; i++){
            fd1.a[i]++;
        }
        //引用得指向不可修改
//        fd1.v2 = new Value(3);
            //引用得指向不可修改
//        fd1.VAL_3 = new Value(3);
            //引用得指向不可修改
//        fd1.a = new int[3];
        print(fd1);
        print(fd2);
    }



}

class Value{
    int i ;
    public  Value(int i ){
        this.i = i;
    }
}
