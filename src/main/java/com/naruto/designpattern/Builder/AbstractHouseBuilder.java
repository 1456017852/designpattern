package com.naruto.designpattern.Builder;

/**
 * 抽象层建造者
 */
public abstract class AbstractHouseBuilder {

    //将构造的流程写好
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildTop();

    public House buildHouse(){
        return new House();
    }

}
