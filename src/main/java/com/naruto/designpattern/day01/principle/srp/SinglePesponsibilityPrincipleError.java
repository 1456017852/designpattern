package com.naruto.designpattern.day01.principle.srp;

import org.junit.Test;

/**
 * 单一职责原则注意事项和细节
 *
 *  1、降低类的复杂度，一个类只负责一项职责。
 *  2、提高类的可读性，可维护性
 *  3、 降低变更引起的风险
 *  4、通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违 反单一职责原则；
 *      只有类中方法数量足够少，可以在方法级别保持单一职责原则
 */
public class SinglePesponsibilityPrincipleError {

    @Test
    public void testVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("船");
        vehicle.run("飞机");

    }

}

/**
 *交通工具类
 * 违反了单一职责原则
 */
class Vehicle{
    public void run(String vehicleName){
        System.out.println(vehicleName+"在公路上运行...");
    }
}
