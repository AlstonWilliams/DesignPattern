package com.designpattern.Adapter;

/**
 *
 * 适配器模式，用于旧系统中的接口不符合新系统要求的场景
 *
 * 最著名的使用场景就是国外电源插口和国内不一样，所以需要一个适配器来解决．
 *
 * 相信基于老系统做新开发的朋友们都熟悉这种设计模式．
 *
 * */
public class AdapterPattern {

   public static void main(String[] args) {
       // 人在美国，刚下飞机
       ForeignPlug foreignPlug = new ForeignPlug();
       new PlugAdapter().foreign2Chinese(foreignPlug).insert();
   }

}

interface Plug {
    void insert();
}

class ChinesePlug implements Plug{
    @Override
    public void insert() {
        System.out.println("中国电源插口");
    }

}

class ForeignPlug implements Plug {

    @Override
    public void insert() {
        System.out.println("外国电源插口");
    }
}


class PlugAdapter {

    public ForeignPlug chinese2Foreign(ChinesePlug chinesePlug) {
        return new ForeignPlug();
    }

    public ChinesePlug foreign2Chinese(ForeignPlug foreignPlug) {
        return new ChinesePlug();
    }
}