package com.frankie.demo.multithreads;

/**
 * @author: Yao Frankie
 * @date: 2020/8/3 10:28
 */
public class PrintAlternately {

    private static Object o = new Object();

    public static void main(String[] args) throws InterruptedException {

        new Thread(PrintAlternately::printOdd, "thread1").start();
        new Thread(PrintAlternately::printEven, "thread2").start();

    }

    private static void printEven(){
        synchronized (o){
            for (int i = 2; i <= 10; i += 2){
                o.notifyAll();
                System.out.println(i);
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void printOdd(){
        synchronized (o){
            for (int i = 1; i < 10; i += 2){
                o.notifyAll();
                System.out.println(i);
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
