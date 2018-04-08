package com.ctvit.test;

/**
 * Created with IntelliJ IDEA
 * User: mengxiangxiang
 * Date: 2018-03-30
 * Time: 上午 10:53
 * Description:
 */
public class TestSingleton {
    String name = null;

    public TestSingleton() {
    }

    private static volatile  TestSingleton instance = null;

    public static TestSingleton getInstance() {
        if (instance == null) {
            synchronized (TestSingleton.class) {
                if (instance == null) {
                    instance = new TestSingleton();
                }
            }
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printInfo() {
        System.out.println("the name is " + name);
    }
    public static void main(String[] args){

    }
}

