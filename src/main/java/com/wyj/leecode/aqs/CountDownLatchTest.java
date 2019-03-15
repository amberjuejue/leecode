package com.wyj.leecode.aqs;

import java.util.concurrent.*;

/**
 * @author wangyujue
 */
public class CountDownLatchTest {
    // 总数
    private static int count = 500;
    // 信号量
    private static int limit = 20;

    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(300);

        CountDownLatch countDownLatch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            final int k = i;
            executor.execute(() -> {
                try {
                    test(k);
                    countDownLatch.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
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
