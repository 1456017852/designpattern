package com.naruto.designpattern.singleton.lazy.staticfinal;

/**
 *  【单例模式:懒汉式(静态常量)】
 *
 * 1、优点：类装载时完成对象的实例化(类的准备阶段),避免线程同步问题
 * 2、缺点：没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例,则会造成内存的浪费
 *
 * 3、总结：这种方式基于classloder机制避免了多线程的同步问题,
 * 不过,instance在类装载 时就实例化，在单例模式中大多数都是调用getInstance方法,
 * 但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化instance就没有达到lazy loading的效果.这种单例模式可用，可能造成内存浪费
 *
 */
public class Singleton {

    //1、构造器私有化
    private Singleton(){}

    //2、静态常量实例对象
    public final static Singleton instance=new Singleton();

    //3、公共的静态方法返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
