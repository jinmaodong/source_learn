package com.mdjin.part8;

import static com.mdjin.util.Print.*;

/**
 * 协变返回类型
 *  子类的重写方法可以返回父类被重写方法的返回类型的子类型
 *  |所以在描述重写和重载的关系的时候注意协变返回类型的特例
 * @author jinmaodong
 * @date 2020/5/28
 * @since 1.0.0
 **/
public class ConvariantReturn {
    /**
     * main method
     */
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain g = mill.process();

        WheatMill wheatMill = new WheatMill();
        Wheat wheat = wheatMill.process();

        print(g);
        print(wheat);
    }

}


class Grain{
    @Override
    public String toString(){
        return "Grain.";
    }
}

class Wheat extends Grain{
    @Override
    public String toString(){
        return "Wheat.";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    @Override
    Wheat process(){
        return new Wheat();
    }
}
