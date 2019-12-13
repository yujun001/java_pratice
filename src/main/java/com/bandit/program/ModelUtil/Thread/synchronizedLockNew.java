package com.bandit.program.ModelUtil.Thread;

import org.junit.Test;

public class synchronizedLockNew {

    public class Thread_new implements Runnable {
        private int num = 50;

        public void run() {
            for (int i = 0; i < 50; i++) {
                eat();
            }
        }

        synchronized private void eat() {
            if (num > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "  eat num : " + num-- + " apple");
            }
        }
    }

    @Test
    public void test(){
        Thread_new a = new Thread_new();
        new Thread(a, "A").run();
        new Thread(a, "B").run();
        new Thread(a, "C").run();
    }
}


