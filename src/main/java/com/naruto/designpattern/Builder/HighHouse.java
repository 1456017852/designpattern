package com.naruto.designpattern.Builder;

public class HighHouse extends AbstractHouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    public void buildWall() {
        System.out.println("高楼剔墙");
    }

    public void buildTop() {
        System.out.println("高楼封顶");
    }
}
