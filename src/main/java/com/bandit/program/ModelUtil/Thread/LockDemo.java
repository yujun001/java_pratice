package com.bandit.program.ModelUtil.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable {
    private int num = 50;//苹果总数

    private final Lock lock = new ReentrantLock();//创建一个锁对象

    public void run() {
        for (int i = 0; i < 50; i++) {
            eat();
        }
    }
    //加锁保证安全
    private void eat() {
        //进入方法，立马加锁
        lock.lock();//获取锁
        try {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "吃了编号为"
                        + num + "的苹果");
                Thread.sleep(10);//模拟网络延迟
                num--;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //开门走人
            lock.unlock();//释放锁
        }
    }
}

public class LockDemo {
    public static void main(String[] args) {
        //创建三个线程（同学），吃苹果
        Apple3 a = new Apple3();
        new Thread(a, "A").start();
        new Thread(a, "B").start();
        new Thread(a, "C").start();
    }
}

