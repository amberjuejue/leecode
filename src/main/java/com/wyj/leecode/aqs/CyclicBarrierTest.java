package com.wyj.leecode.aqs;

import java.util.concurrent.*;

/**
 * @author wangyujue
 */
public class CyclicBarrierTest {
    // 总数
    private static int count = 500;
    // 信号量
    private static int limit = 5;

    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(limit, ()->{
        System.out.println("---------优先执行");
    });

    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < count; i++) {
            final int k = i;
            executor.execute(() -> {
                try {
                    test(k);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        ((ExecutorService) executor).shutdown();
        System.out.println("finish");
    }

    private static void test(int threadNum) throws BrokenBarrierException {
        try {
            System.out.println("threadNum:" + threadNum);
            cyclicBarrier.await();
            System.out.println("threadNum:" + threadNum + "finish");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
