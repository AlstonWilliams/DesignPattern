package com.designpattern.Builder;

public class Parlour {

    private String wall;
    private String tv;
    private String sofa;

    public Parlour() {
    }

    public Parlour(String wall, String tv, String sofa) {
        this.wall = wall;
        this.tv = tv;
        this.sofa = sofa;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    @Override
    public String toString() {
        return "Parlour{" +
                "wall='" + wall + '\'' +
                ", tv='" + tv + '\'' +
                ", sofa='" + sofa + '\'' +
                '}';
    }
}
