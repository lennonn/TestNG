package test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantCondition {
    public void threadTest() throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Condition conditiona = lock.newCondition();
        Condition conditionb = lock.newCondition();
        Condition conditionc = lock.newCondition();
        AtomicInteger num = new AtomicInteger(4);
        Thread A = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                lock.lock();
                if(num.get() % 3!= 0) {
                    try {
                        conditiona.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                num.getAndIncrement();
                conditionb.signal();
                lock.unlock();
            }
        });
        Thread B = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                lock.lock();
                if (num.get() %3 !=1) {
                    try {
                        conditionb.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                num.getAndIncrement();
                conditionc.signal();
                lock.unlock();
            }
        });
        Thread C = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                lock.lock();
                if (num.get() % 3 != 2) {
                    try {
                        conditionc.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num.getAndIncrement();
                System.out.println("C");
                conditiona.signal();
                lock.unlock();
            }
        });

        B.start();
        A.start();
        C.start();
    }

    public void stringTest(){
        List<String> lists =new ArrayList<>();
        lists.add("abc123cc");
        lists.add("ab123cd");
        for (int i = 0; i <lists.size() ; i++) {
            byte[] first = lists.get(i).getBytes(StandardCharsets.UTF_8);
            byte[] second = lists.get(i).getBytes(StandardCharsets.UTF_8);
            for(int j=0;j<first.length;j++){
                if(first[j]==second[j]){

                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantCondition test =new ReentrantCondition();
        test.threadTest();
    }
}
