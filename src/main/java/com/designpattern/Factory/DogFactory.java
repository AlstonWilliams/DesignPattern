package com.designpattern.Factory;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal newInstance() {
        return new Dog();
    }
}
