package com.designpattern.Builder;

public abstract class Decorator {

    protected Parlour parlour = new Parlour();

    public abstract Decorator buildWall();
    public abstract Decorator buildTv();
    public abstract Decorator buildSofa();

    public Parlour build() {
        return parlour;
    }

}
