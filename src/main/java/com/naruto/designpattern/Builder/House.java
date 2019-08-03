package com.naruto.designpattern.Builder;

public class House {

    private String baise;
    private String wall;
    private String top;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    @Override
    public String toString() {
        return "House{" +
                "baise='" + baise + '\'' +
                ", wall='" + wall + '\'' +
                ", top='" + top + '\'' +
                '}';
    }
}
