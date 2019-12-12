package com.bandit.program.ModelUtil.Thread;

/**
 * 每个person 代表1个线程任务
 * 继承Thread实现 3个person 同时并行任务
 */
//每一个同学好比一个线程对象
class Person extends Thread {
    private int num = 50;//苹果总数

    public Person(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            if (num > 0) {
                System.out.println(super.getName() + "谁吃了编号为" + num-- + "的苹果");
            }
        }
    }
}

//方式1：可以使用继承Thread方式来实现3个同学各吃50个苹果
public class extendThread {
    public static void main(String[] args) {
        //创建三个线程（同学），吃苹果
        Person ps = new Person("小A");
        ps.start();

        Person ps_B = new Person("小B");
        ps_B.start();

        Person ps_C = new Person("小C");
        ps_C.start();

//        new Person("小A").start();
//        new Person("小B").start();
//        new Person("小C").start();
    }
}