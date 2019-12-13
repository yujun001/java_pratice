package com.bandit.program.ModelUtil.Thread;

/**
 * Runnable实现多线程
 * 模拟网络延迟, 资源争夺, 线程不安全
 *
 * 使用了synchroized, 解决了资源争夺,但是 单线程.....
 *
 * 使用synchronized修饰的方法就叫做同步方法，保证A线程执行该方法的时候，其他线程只能在方法外等
 *
 */
class Thread_Apple implements Runnable {
    private int num = 50;//苹果总数

    public void run() {
        for (int i = 0; i < 50; i++) {
            synchronized (this) {
                if (num > 0) {
                    //模拟网络延迟
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "谁吃了编号为"
                            + num-- + "的苹果");
                }
            }
        }
    }
}

//方式2：可以使用实现Runnable方式来实现3个人共吃50个苹果
public class synchronizedLock {
    public static void main(String[] args) {
        //创建三个线程（同学），吃苹果
        Thread_Apple a = new Thread_Apple();

        Thread a_test = new Thread(a, "A");
        a_test.start();

        Thread b_test = new Thread(a, "B");
        b_test.start();

        Thread c_test = new Thread(a, "C");
        c_test.start();

    }
}
