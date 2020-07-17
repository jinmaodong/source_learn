package com.mdjin.part5;

import static com.mdjin.util.Print.*;

/**
 * 方法的成员变量如果没有初始值则会报错
 * 类的成员变量如果没有初始值则会给默认值
 *
 * @author jinmaodong
 * @date 2020/5/24
 * @since 1.0.0
 **/
public class InitialValues {
    /**
     * 默认值0
     */
    int anInt;
    /**
     * 默认值0
     */
    short aShort;

    /**
     * 默认值false
     */
    boolean aBoolean;

    /**
     * 默认值0
     */
    char aChar;

    /**
     * 默认值0
     */
    long aLong;

    /**
     * 默认值0
     */
    float aFloat;

    /**
     * 默认值0
     */
    double aDouble;

    /**
     * 默认值0
     */
    byte aByte;

    /**
     * 方法内部变量不做初始化，使用的时候会报错：not have been initialized
     */
    public void test(){
        int anInt = 0;
        short aShort = 0;
        boolean aBoolean = true;
        char aChar = '1';
        long aLong = 123L;
        float aFloat = 0f;
        double aDouble = 0d;
        byte aByte = -128;
        print(anInt);
        print(aShort);
        print(aBoolean);
        print(aChar);
        print(aLong);
        print(aFloat);
        print(aDouble);
        print(aByte);
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        print(initialValues.getaByte());
        //使用int强转，可以看到char的值为0
        print((int)initialValues.getaChar()+"");
        print(initialValues.getaDouble());
        print(initialValues.isaBoolean());
        print(initialValues.getaFloat());
        print(initialValues.getaLong());
        print(initialValues.getaShort());
        print(initialValues.getAnInt());
        print("next print by test method");
        initialValues.test();
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public short getaShort() {
        return aShort;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public byte getaByte() {
        return aByte;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }
}
