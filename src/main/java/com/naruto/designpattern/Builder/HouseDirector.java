package com.naruto.designpattern.Builder;

/**
 * 指挥者
 */
public class HouseDirector {

    AbstractHouseBuilder abstractHouseBuilder=null;

    public HouseDirector(AbstractHouseBuilder abstractHouseBuilder){
        this.abstractHouseBuilder=abstractHouseBuilder;
    }

    //如何建造房子交给指挥者
    public House builderHouse(){
        abstractHouseBuilder.buildBasic();
        abstractHouseBuilder.buildWall();
        abstractHouseBuilder.buildTop();
        return abstractHouseBuilder.buildHouse();
    }

}
