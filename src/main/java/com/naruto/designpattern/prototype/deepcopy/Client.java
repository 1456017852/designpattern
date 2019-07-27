package com.naruto.designpattern.prototype.deepcopy;

import org.junit.Test;

public class Client {
    @Test
    public void test() throws CloneNotSupportedException {
        StudentPrototype studentPrototype=new StudentPrototype();
        studentPrototype.setId(1);
        studentPrototype.setName("naruto1");
        studentPrototype.setAddress("xian1");

        Teacher teacher=new Teacher();
        teacher.setId(1);
        teacher.setName("李四");
        teacher.setStudentPrototype(studentPrototype);



        //原型模式克隆
        Teacher teacher1 = teacher.clone();
        Teacher teacher2 = teacher.clone();

        System.out.println("teacher1======:"+teacher1);
        System.out.println("teacher2======:"+teacher2);

        System.out.println("teacher1.studentPrototype=====:"+teacher1.studentPrototype);
        System.out.println("teacher2.studentPrototype=====:"+teacher2.studentPrototype);

        System.out.println(teacher1.studentPrototype==teacher2.studentPrototype);

    }


    @Test
    public void test2(){
        StudentPrototype studentPrototype=new StudentPrototype();
        studentPrototype.setId(2);
        studentPrototype.setName("naruto2");
        studentPrototype.setAddress("xian2");

        Teacher teacher=new Teacher();
        teacher.setId(2);
        teacher.setName("李四2");
        teacher.setStudentPrototype(studentPrototype);

        //原型模式克隆
        Teacher teacher3 = teacher.serializableDeepCopy();
        Teacher teacher4 = teacher.serializableDeepCopy();

        System.out.println("teacher3======:"+teacher3);
        System.out.println("teacher4======:"+teacher4);

        System.out.println("teacher3.studentPrototype=====:"+teacher3.studentPrototype);
        System.out.println("teacher4.studentPrototype=====:"+teacher4.studentPrototype);

        System.out.println(teacher3.studentPrototype==teacher4.studentPrototype);



    }
}
