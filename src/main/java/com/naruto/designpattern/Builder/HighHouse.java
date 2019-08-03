package com.naruto.designpattern.Builder;

public class HighHouse extends AbstractHouseBuilder{

    private  House house=new House();

    @Override
    public void buildBasic() {

        house.setBaise("高楼打地基");
        System.out.println("高楼打地基");
    }

    public void buildWall() {
        house.setWall("高楼剔墙");
        System.out.println("高楼剔墙");
    }

    public void buildTop() {
        house.setTop("高楼封顶");
        System.out.println("高楼封顶");
    }

    public House buildHouse() {
        return house;
    }
}
