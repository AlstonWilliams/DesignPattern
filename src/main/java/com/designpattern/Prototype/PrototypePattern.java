package com.designpattern.Prototype;

/**
 *
 * 原型模式，通过克隆产生一个新的对象。
 * 适用于如下几种场景：
 *   1. 初始化一个对象涉及到大量的初始化操作，对资源消耗较高
 *   2. 需要产生的对象和前面的对象没有太大区别
 *
 * 在Java中，可以通过对象自带的clone()方法来实现。
 * 但是需要注意浅克隆和深克隆的区别。
 *
 * 在Java中，clone()方法默认是浅克隆，也就是说，如果被克隆的对象有引用其它的对象，那么克隆出来的对象，引用的还是被克隆对象引用的那个对象，即都指向了同一个内存地址。
 * 举例来说，
 *     A引用了B标记为A -> B，则浅克隆出的A'引用的还是B,即A' -> B
 * 浅克隆有一个缺陷,就是我们修改了A'的B,会同时修改A的B,因为它们都是同一个对象
 *
 * 而深克隆，则指的是克隆出来的对象引用的是新的对象.
 * 举例来说,
 *     A引用了B标记为A -> B，则深克隆出的A'引用的是B',即A' -> B'
 * 此时我们来修改A'的B'就不会影响B.
 *
 * */
public class PrototypePattern implements Cloneable {

    public PrototypePattern() {
        System.out.println("Initialize new prototype");
    }

    public Object clone() {
        System.out.println("Clone prototype");
        return this.clone();
    }

}
