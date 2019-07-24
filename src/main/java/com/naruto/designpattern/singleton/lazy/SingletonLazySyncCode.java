package com.naruto.designpattern.singleton.lazy;

/**
 * 【单例模式：懒汉式(线程不安全，同步代码块)】
 *
 * 1) 这种方式，本意是想对第四种实现方式的改进，因为前面同步方法效率太低， 改为同步产生实例化的的代码块
 * 2) 但是这种同步并不能起到线程同步的作用。跟第3种实现方式遇到的情形一 致，假如一个线程进入了
 * if (singleton == null)判断语句块，还未来得及往下执行， 另一个线程也通过了这个判断语句，这时便会产生多个实例
 * 3) 结论：在实际开发中，不能使用这种方式
 */
public class SingletonLazySyncCode {

    private SingletonLazySyncCode(){}

    private static SingletonLazySyncCode instance;

    public static SingletonLazySyncCode  getInstance(){
        if(null==instance){
            synchronized (SingletonLazySyncCode.class){
                instance=new SingletonLazySyncCode();
            }
        }
        return instance;
    }

}
