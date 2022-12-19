package com.zl.concurrency.atomic;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantTest {
    @Test
    public void test() throws InterruptedException {
        ReentrantLock lock =new ReentrantLock();
        for (int i = 0; i < 5; i++) {
           Thread thread =new Thread(() -> {
                lock.lock();
               for (int j = 0; j <100000000 ; j++) {
                   System.out.println(j);
               lock.lock();
            });
            thread.setName("queue"+i);
            thread.start();
        }
        Thread.sleep(1000000000);
    }
}
