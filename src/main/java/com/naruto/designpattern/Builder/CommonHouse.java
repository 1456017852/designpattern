package com.naruto.designpattern.Builder;

public class CommonHouse extends AbstractHouseBuilder {

    private  House house=new House();

    @Override
    public void buildBasic() {
        house.setBaise("普通房子打地基");
        System.out.println("普通房子打地基");
    }

    public void buildWall() {
        house.setWall("普通房子剔墙");
        System.out.println("普通房子剔墙");
    }

    public void buildTop() {
        house.setTop("普通房子封顶");
        System.out.println("普通房子封顶");
    }

    public House buildHouse() {
        return house;
    }

}
