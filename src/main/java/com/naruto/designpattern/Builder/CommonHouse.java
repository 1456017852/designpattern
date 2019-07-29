package com.naruto.designpattern.Builder;

public class CommonHouse extends AbstractHouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    public void buildWall() {
            System.out.println("普通房子剔墙");
    }

    public void buildTop() {
        System.out.println("普通房子封顶");
    }

}
