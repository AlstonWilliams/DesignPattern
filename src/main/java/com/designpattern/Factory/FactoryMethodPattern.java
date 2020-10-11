package com.designpattern.Factory;

/**
 *
 * 在此工厂方法模式中，对象的创建是由具体的工厂创建的．
 * 和简单工厂模式的区别在于，每个Animal都有生产它们的工厂，而这些具体工厂的背后，又有一个统一的抽象工厂．
 *
 * 所以，在新增一个Animal时，只需要为它新增一个对应的具体工厂就好．
 *
 * */
public class FactoryMethodPattern {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new BirdFactory();
        animalFactory.newInstance().eat();
    }

}

