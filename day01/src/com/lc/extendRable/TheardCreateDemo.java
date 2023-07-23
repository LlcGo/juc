package com.lc.extendRable;

public class TheardCreateDemo {

    public static void main(String[] args) {
        SomeThread thread = new SomeThread();
        thread.start();
    }
}

class SomeThread extends Thread{
    @Override
    public void run() {
        System.out.println("通过继承Thread类来创建一个线程");
    }
}
