package com.mdjin.part8;

import static com.mdjin.util.Print.*;

/**
 * 初始化的实际过程：
 * 1.在其他任何事物发生之前，将分配给对象的存款空间初始化成二进制的零
 * 2.调用基类构造器
 * 3.按照声明的顺序调用成员的初始化方法
 * 4.调用导出类的构造器主体
 *
 * @author jinmaodong
 * @date 2020/5/28
 * @since 1.0.0
 **/
public class PolyConstructors {
    /**
     * main method
     */
    public static void main(String[] args) {
        RoundGlyph roundGlyph = new RoundGlyph(3);
    }

}


class Glyph{
     void draw(){
        print("Glyph.draw()");
    }

    Glyph(){
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends  Glyph{
    //如果是static结果是不一样的，因为静态数据的初始化在构造器（含基类）之前
    private /*static*/ int radius = 1;

    RoundGlyph(int r){
        radius = r;
        print("RoundGlyph.RoundGlyph() ,radius = "+radius);
    }

    @Override
    void draw(){
        print("RoundGlyph.draw() ,radius = "+radius);
    }
}

/**
 output:
 Glyph() before draw()
 RoundGlyph.draw() ,radius = 0
 Glyph() after draw()
 RoundGlyph.RoundGlyph() ,radius = 3
**/
