package com.wyj.leecode.thread;

/**
 * @author wangyujue
 */
public class JoinThread {
    public static void main(String[] args) {
        Thread previousThread = Thread.currentThread();
        for (int i = 1; i <= 10; i++) {
            Thread curThread = new JoinThread1(previousThread);
            curThread.start();
            previousThread = curThread;
        }
    }

    public static class JoinThread1 extends Thread {
        private Thread thread;

        public JoinThread1(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                thread.join();
                System.out.println(thread.getName() + " terminated.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}