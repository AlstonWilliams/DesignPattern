package com.designpattern.Template;

/**
 *
 * 模板模式．
 * 使用场景为知道了流程但不知具体实现．
 *
 * 该模式对笔者而言主要用在开发的流程中．
 * 当做完开发设计之后，会先在主类中用注释的方法注明每一步要做什么，然后再进行具体代码编写
 *
 * */
public class TemplatePattern {
    public static void main(String[] args) {
        new Day1().spend();
    }
}

abstract class Day {
    public void spend() {
        goToWork();
        work();
        goToHome();
    }

    abstract void goToWork();
    abstract void work();
    abstract void goToHome();
}

class Day1 extends Day {

    @Override
    void goToWork() {
        System.out.println("乘坐地铁上班");
    }

    @Override
    void work() {
        System.out.println("写代码");
    }

    @Override
    void goToHome() {
        System.out.println("乘坐地铁下班");
    }
}

class Day2 extends Day {

    @Override
    void goToWork() {
        System.out.println("打车去客户公司");
    }

    @Override
    void work() {
        System.out.println("开会");
    }

    @Override
    void goToHome() {
        System.out.println("打车回家");
    }
}