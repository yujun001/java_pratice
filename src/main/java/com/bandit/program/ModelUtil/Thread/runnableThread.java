package com.bandit.program.ModelUtil.Thread;

/**
 * Runnable实现多线程
 */
class Apple implements Runnable {
    private int num = 50;//苹果总数

    public void run() {
        for (int i = 0; i < 50; i++) {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName()
                        // static Thread.currentThread(), 返回当前正在执行的线程对象的引用
                        + "谁吃了编号为"
                        + num--
                        + "的苹果");
            }
        }
    }
}

//方式2：可以使用实现Runnable方式来实现3个人共吃50个苹果
public class runnableThread {
    public static void main(String[] args) {
        //创建三个线程（同学），吃苹果
        Apple a = new Apple();
        Thread a_test = new Thread(a, "A");
        a_test.start();

        Thread b_test = new Thread(a, "B");
        b_test.start();

        Thread c_test = new Thread(a, "C");
        c_test.start();

//        new Thread(a, "A").start();
//        new Thread(a, "B").start();
//        new Thread(a, "C").start();
    }
}
