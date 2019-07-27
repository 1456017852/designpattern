package com.naruto.designpattern.prototype.deepcopy;

import java.io.*;

public class Teacher implements Serializable,Cloneable {

    private int id;
    private String name;
    public StudentPrototype studentPrototype;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentPrototype getStudentPrototype() {
        return studentPrototype;
    }

    public void setStudentPrototype(StudentPrototype studentPrototype) {
        this.studentPrototype = studentPrototype;
    }

    /**
     * 深拷贝方式1
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        //处理基本类型
        Teacher teacher=(Teacher) super.clone();
        //处理引用类型
        teacher.studentPrototype=(StudentPrototype)studentPrototype.clone();

        return teacher;
    }

    /**
     * 深拷贝方式2:通过对象的序列化和反序列化实现
     * @return
     */
    public Teacher serializableDeepCopy(){

        Teacher teacher=null;
        ByteArrayOutputStream byteArrayOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        ByteArrayInputStream byteArrayInputStream=null;
        ObjectInputStream objectInputStream=null;
        try{

            //序列化
            byteArrayOutputStream=new ByteArrayOutputStream();
            objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            //反序列化
            byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream=new ObjectInputStream(byteArrayInputStream);
            teacher= (Teacher) objectInputStream.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                byteArrayOutputStream.close();
                objectOutputStream.close();
                byteArrayInputStream.close();
                objectInputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return teacher;
    }
}
