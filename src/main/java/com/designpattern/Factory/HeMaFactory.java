package com.designpattern.Factory;

public class HeMaFactory  implements AbstractFactory {


    @Override
    public Animal newAnimal() {
        return new Dog();
    }

    @Override
    public Fruit newFruit() {
        return new Apple();
    }
}
