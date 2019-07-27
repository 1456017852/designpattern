package com.naruto.designpattern.prototype.shallowcope;

import org.junit.Test;

public class Client {

    /**
     * 浅拷贝 测试类
     */
    @Test
    public void test(){
        StudentPrototype studentPrototype=new StudentPrototype();
        studentPrototype.setId(1);
        studentPrototype.setName("naruto1");
        studentPrototype.setAddress("xian1");

        StudentPrototype student=new StudentPrototype();
        student.setId(2);
        student.setName("naruto2");
        student.setAddress("xian2");
        studentPrototype.setFriend(student);

        try {
            //原型模式克隆
            StudentPrototype studentPrototype1=studentPrototype.clone();
            StudentPrototype studentPrototype2=studentPrototype.clone();

            System.out.println("studentPrototype1=====:"+studentPrototype1);
            System.out.println("studentPrototype2=====:"+studentPrototype2);

            System.out.println("studentPrototype1.friend=====:"+studentPrototype1.friend);
            System.out.println("studentPrototype2.friend=====:"+studentPrototype2.friend);

            /**
             * 浅拷贝：引用类型的属性指向同一个对象(即应用类型的对象没有拷贝)
             */
            System.out.println(studentPrototype1.friend==studentPrototype2.friend);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
