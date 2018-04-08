package com.ctvit.test;

/**
 *
 */
public class Test {

    public static void main(String[] args) {
       /* System.out.println("Hello World! 测试中文啊啊啊啊啊啊啊啊啊啊啊打扫打扫打扫打扫打扫啊个啊更多vdafgd");
        System.out.println("Hello World! 测试中文啊啊啊啊啊啊啊啊啊啊啊打扫打扫打扫打扫打扫啊个啊更多vdafgd");
        System.out.println("Hello World! 测试中文啊啊啊啊啊啊啊啊啊啊啊打扫打扫打扫打扫打扫啊个啊更多vdafgd");
        System.out.println("Hello World! 测试中文啊啊啊啊啊啊啊啊啊啊啊打扫打扫打扫打扫打扫啊个啊更多vdafgd");
        System.out.println("Hello World! 测试中文啊啊啊啊啊啊啊啊啊啊啊打扫打扫打扫打扫打扫啊个啊更多vdafgd");
        System.out.println("Hello World! 测试中文啊啊啊啊啊啊啊啊啊啊啊打扫打扫打扫打扫打扫啊个啊更多vdafgd");*/
        TestStream ts1 = TestSingleton.getInstance();
        ts1.setName("jason");
        TestStream ts2 = TestSingleton.getInstance();
        ts2.setName("0539");

        ts1.printInfo();
        ts2.printInfo();

        if(ts1 == ts2){
            System.out.println("创建的是同一个实例");
        }else {
            System.out.println("创建的不是同一个实例");
        }
    }


}
