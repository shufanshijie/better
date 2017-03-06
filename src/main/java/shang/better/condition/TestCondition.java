package shang.better.condition;

import java.util.PriorityQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by shangj on 2017/2/28.
 */

/**
 * 三个现成共同输出123456789
 */
public class TestCondition {
    private int queueSize = 10;
    private PriorityQueue<Integer> queue = new PriorityQueue<Integer>(queueSize);
    private Lock lock = new ReentrantLock();
    private Condition condition456 = lock.newCondition();
    private Condition condition123 = lock.newCondition();
    private Condition condition789 = lock.newCondition();

    public static void main(String[] args)  {
        TestCondition test = new TestCondition();
        Print456 print456 = test.new Print456();
        Print123 print123 = test.new Print123();
        Print789 print789 = test.new Print789();

        print456.start();
        print123.start();
        print789.start();
    }

    class Print123 extends Thread{

        @Override
        public void run() {
            consume();
        }

        private void consume() {
            while(true){
                lock.lock();
                try {
                    System.out.print("123");
                    condition456.signal();
                    condition123.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally{
                    lock.unlock();
                }
            }
        }
    }

    class Print456 extends Thread{

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            while(true){
                lock.lock();
                try {
                    System.out.print("456");
                    condition789.signal();
                    condition456.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally{
                    lock.unlock();
                }
            }
        }
    }

    class Print789 extends Thread{

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            while(true){
                lock.lock();
                try {
                    System.out.println("789");
                    condition123.signal();
                    condition789.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally{
                    lock.unlock();
                }
            }
        }
    }
}

