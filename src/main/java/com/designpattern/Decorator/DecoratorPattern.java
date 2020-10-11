package com.designpattern.Decorator;

/**
 * 装饰器模式．
 *
 * 传入一个对象，获取到增强后的对象，就叫装饰器模式．
 * 要注意和代理模式的区别．
 *
 * 举一个例子．
 * 如果我们要创业，但是没有资金，我们此时有两种方法，
 * 第一种，是去找有钱的人帮我们筹集资金．这就叫做代理模式
 * 第二种，是我们自己挣够钱再去创业，这就叫做装饰器模式
 *
 * 可以看到，装饰器模式和代理模式的区别就是，装饰器模式首先需要传入一个对象，然后增强了这个对象．
 *
 * Java中的Collections类中的synchronizedSets等方法，就是应用了装饰器模式．
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}

//抽象构件角色
interface Component {
    public void operation();
}

//具体构件角色
class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    public void operation() {
        System.out.println("调用具体构件角色的方法operation()");
    }
}

//抽象装饰角色
class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}

//具体装饰角色
class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}