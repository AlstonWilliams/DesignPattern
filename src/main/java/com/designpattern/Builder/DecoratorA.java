package com.designpattern.Builder;

public class DecoratorA extends Decorator {
    @Override
    public Decorator buildWall() {
        parlour.setWall("Wall A");
        return this;
    }

    @Override
    public Decorator buildTv() {
        parlour.setTv("TV A");
        return this;
    }

    @Override
    public Decorator buildSofa() {
        parlour.setSofa("Sofa A");
        return this;
    }
}
