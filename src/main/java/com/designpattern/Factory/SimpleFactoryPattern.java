package com.designpattern.Factory;

/**
 *
 * 简单工厂模式，即通过参数来创建对象．
 *
 * 此模式有一个缺陷，即如果新增了Animal，还需要修改工厂类．违背了开闭原则．
 * 在改动频繁的情况下，就很不优雅．
 *
 * 而工厂方法模式能解决此问题．
 *
 *
 * */
public class SimpleFactoryPattern {

    public static Animal newInstance(AnimalType animalType) {
        Animal result = null;
        switch (animalType) {
            case DOG:
                result = new Dog();
                break;
            case BIRD:
                result = new Bird();
                break;
        }
        return result;
    }

}

