package com.designpattern.Singleton;

/**
 *
 * 相对于懒汉式单实例模式，此实现没有同步引起的性能问题
 *
 * 为什么没有线程安全问题？
 *
 * 这是由类加载机制决定的。类加载的过程如下：
 *   (1) 装载：查找和导入Class文件；
 *
 *   (2) 链接：把类的二进制数据合并到JRE中；
 *     (a)校验：检查载入Class文件数据的正确性；
 *     (b)准备：给类的静态变量分配存储空间；
 *     (c)解析：将符号引用转成直接引用；
 *
 *   (3) 初始化：对类的静态变量，静态代码块执行初始化操作
 *
 * 在"初始化"这一步，就是对类的静态变量进行初始化，此过程是没有线程安全问题的
 *
 * */
public class HungrySingletonPattern {

    private HungrySingletonPattern() {}

    private static final HungrySingletonPattern instance = new HungrySingletonPattern();

    public static HungrySingletonPattern getInstance() {
        return instance;
    }
}
