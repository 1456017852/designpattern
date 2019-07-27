package com.naruto.designpattern.prototype.shallowcope;

/**
 * 原型类
 */
public class StudentPrototype implements Cloneable {

    private int id;
    private String name;
    private String address;
    public StudentPrototype friend;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StudentPrototype getFriend() {
        return friend;
    }

    public void setFriend(StudentPrototype friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "StudentPrototype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", friend=" + friend +
                '}';
    }

    /**
     * 克隆该实例，使用默认的克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected StudentPrototype clone() throws CloneNotSupportedException {
        return (StudentPrototype)super.clone();
    }
}
