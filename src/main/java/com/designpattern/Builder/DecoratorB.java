package com.designpattern.Builder;

public class DecoratorB extends Decorator {
    @Override
    public Decorator buildWall() {
        parlour.setWall("Wall B");
        return this;
    }

    @Override
    public Decorator buildTv() {
        parlour.setTv("TV B");
        return this;
    }

    @Override
    public Decorator buildSofa() {
        parlour.setSofa("Sofa B");
        return this;
    }
}
