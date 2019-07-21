package com.naruto.designpattern.day01.principle.srp;

import org.junit.Test;

public class SingleResponsibilityPrincipleSuccess {

    @Test
    public void test(){
        VehicleRoad vehicleRoad=new VehicleRoad();
        vehicleRoad.run("汽车");
        VehicleAir vehicleAir=new VehicleAir();
        vehicleAir.run("飞机");
        VehicleWater vehicleWater=new VehicleWater();
        vehicleWater.run("轮船");

        System.out.println("=============================================");
        VehicleAll vehicleAll=new VehicleAll();
        vehicleAll.runRoad("汽车");
        vehicleAll.runAir("飞机");
        vehicleAll.runWater("轮船");

    }

}

/**
 * 类层次准守单一职责原则
 */
class VehicleRoad{
    public void run(String vehicleName){
        System.out.println(vehicleName+"在公路上运行...");
    }
}

class VehicleAir{
    public void run(String vehicleName){
        System.out.println(vehicleName+"在天上上运行...");
    }
}

class VehicleWater{
    public void run(String vehicleName){
        System.out.println(vehicleName+"在水里运行...");
    }
}

/**
 * 方法层次准守单一职责原则
 */
class VehicleAll{
    public void runRoad(String vehicleName){
        System.out.println(vehicleName+"在公路上运行...");
    }
    public void runAir(String vehicleName){
        System.out.println(vehicleName+"在天上上运行...");
    }
    public void runWater(String vehicleName){
        System.out.println(vehicleName+"在水里运行...");
    }
}
