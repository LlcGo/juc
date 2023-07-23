package com.lc.runableImp;

/**
 * @Author Lc
 * @Date 2023/7/23
 * @PackageName: PACKAGE_NAME
 * @ClassName: com.lc.runableImp.RunnableImpl
 * @Description: 通过实现Runnable来实现
 */

public class RunnableImpl{
    public static void main(String[] args) {
        Runnable runnable = new SomeRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        //lamda表达式方式
        Thread thread2 = new Thread(() -> {
            System.out.println("使用lamda表达式方式");
        });
        thread2.start();
    }
}
