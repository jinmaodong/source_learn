package com.mdjin.part5;

import static com.mdjin.util.Print.*;
import static java.lang.Math.abs;
/**
 * 演示finalize方法的使用
 * @author jinmaodong
 * @date 2020/5/24
 * @since 1.0.0
 **/
public class TerminationCondition {
    /**
     * main method
     */
    public static void main(String[] args) {
        Book book1 = new Book(true);
        book1.checkIn();
        new Book(true);
        System.gc();
    }
}


class Book{
    private boolean checkOut = false;

    Book(Boolean checkOut){
        this.checkOut = checkOut;
    }

    public void checkIn(){
        this.checkOut = false;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Error:check out");
        if(this.checkOut){
            //静态引用的方法打印不出来？
//            print("Error:check out");
            //未使用静态引用的调用方式
            System.out.println(Math.abs(-1));
            //使用静态引用的调用方式
//            System.out.println(abs(-1));
            System.out.println("我是静态引用方法之后的代码。");
        }
        super.finalize();
    }
}
