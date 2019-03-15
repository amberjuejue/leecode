package com.wyj.leecode.aqs;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author wangyujue
 */
public class SemaphoreTest {

    // 总数
    private static int count = 500;
    // 信号量
    private static int limit = 20;

    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(300);

        // 公平模式
//        Semaphore semaphore = new Semaphore(limit, true);
        // 非公平模式
        Semaphore semaphore = new Semaphore(limit);

        for (int i = 0; i < count; i++) {
            final int k = i;
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    test(k);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        ((ExecutorService) executor).shutdown();
        System.out.println("finish");
    }

    private static void test(int threadNum) {
        try {
            Thread.sleep(500);
            System.out.println("threadNum:" + threadNum);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
