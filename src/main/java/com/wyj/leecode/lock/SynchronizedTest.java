package com.wyj.leecode.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wangyujue
 */
public class SynchronizedTest {
    public void test1() {
        synchronized(this) {
            System.out.println(this);
            System.out.println(11111111);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public synchronized void test2() {
        System.out.println(this);
        System.out.println(22222222);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        SynchronizedTest s = new SynchronizedTest();
        SynchronizedTest s1 = new SynchronizedTest();

        executorService.execute(s::test1);
        executorService.execute(s::test2);
    }

}
