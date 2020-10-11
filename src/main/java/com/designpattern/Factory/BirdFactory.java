package com.designpattern.Factory;

public class BirdFactory implements AnimalFactory {
    @Override
    public Animal newInstance() {
        return new Bird();
    }
}
