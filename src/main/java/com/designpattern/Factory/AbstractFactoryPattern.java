package com.designpattern.Factory;

/**
 *
 * 抽象工厂模式．
 * 和工厂方法模式很类似，但是也有区别．
 *
 * 在工厂方法模式中，可以看到，每个Animal都有它自己的具体工厂类，这是从Animal的角度出发的．
 * 但是，从工厂的角度出发，一个工厂即可以产生Animal，又可以产生Fruit．
 * 现实生活中这种场景很多，比如盒马上面除了卖肉，还可以卖蔬菜，水果，甚至可以卖家政服务．
 *
 * 对这种场景，我们要怎么处理呢?
 * 从产品的角度出发，可以肉是一个工厂类，蔬菜是一个工厂类，水果是一个工厂类，家政服务是一个工厂类．
 * 对于调用者来说，如果我要关注的是肉这个纵向品类，那确实可以采用工厂方法模式．
 * 但是对于另外一些调用者，我要关注的就是盒马这个工厂下面，横向的品类，在这种情况下，如果还采用工厂方法模式，就很傻了．
 * 在这种情况下，就需要使用抽象工厂模式．
 *
 * 我们把盒马抽象成一个工厂，然后内部实现了好多产生具体的产品的方法，这就是抽象工厂模式．
 *
 * 可以看到，抽象工厂模式和工厂方法模式的区别在于，
 * 前者是工厂内横向生产产品，而后者是产品内纵向
 *
 *
 * */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new HeMaFactory();
        Animal animal = abstractFactory.newAnimal();
        Fruit fruit = abstractFactory.newFruit();
        animal.eat();
        fruit.printName();
    }

}
