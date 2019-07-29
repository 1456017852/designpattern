package com.naruto.designpattern.Builder;

import org.junit.Test;

/**
 * 建造者
 * 1、基本介绍
 *  1) 建造者模式（Builder Pattern） 又叫生成器模式，是一种对象构建模式。它可以
 *  将复杂对象的建造过程抽象出来（抽象类别），使这个抽象过程的不同实现方
 *  法可以构造出不同表现（属性）的对象。
 *  2) 建造者模式 是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象
 *  的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。
 *
 * 2、建造者模式的四个角色
 *  1) Product（产品角色）： 一个具体的产品对象。
 *  2) Builder（抽象建造者）： 创建一个Product对象的各个部件指定的 接口/抽象类。
 *  3) ConcreteBuilder（具体建造者）： 实现接口，构建和装配各个部件。
 *  4) Director（指挥者）： 构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象。它主要有两个作用，
 *      一是：隔离了客户与对象的生产过程，二是： 负责控制产品对象的生产过程
 *
 * 3、建造者模式的注意事项和细节
 *
 * 1) 客户端(使用程序)不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，
 *    使得相同的创建过程可以创建不同的产品对象
 * 2) 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者，
 *    用户使用不同的具体建造者即可得到不同的产品对象
 * 3) 可以更加精细地控制产品的创建过程 。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，
 *    也更方便使用程序来控制创建过程
 * 4) 增加新的具体建造者无须修改原有类库的代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合 “开闭原则”
 * 5) 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，
 *    则不适合使用建造者模式，因此其使用范围受到一定的限制。
 * 6) 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大，
 *    因此在这种情况下，要考虑是否选择建造者模式.
 * 7) 抽象工厂模式VS建造者模式
 *    抽象工厂模式实现对产品家族的创建，一个产品家族是这样的一系列产品：具有不同分类维度的产品组合，
 *    采用抽象工厂模式不需要关心构建过程，只关心什么产品由什么工厂生产即可。而建造者模式则是要求按照指定的蓝图建造产品，
 *    它的主要目的是通过组装零配件而产生一个新产品
 *
 *
 */
public class Client {

    @Test
    public void test(){

        HouseDirector houseDirector=new HouseDirector(new CommonHouse());

        HouseDirector houseDirector1=new HouseDirector(new HighHouse());

        House commonHouse=houseDirector.createHouse();
        System.out.println(commonHouse.getBaise());
        System.out.println(commonHouse.getTop());
        System.out.println(commonHouse.getWall());

        House highHouse=houseDirector1.createHouse();

    }

}
