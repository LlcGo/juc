package com.lc.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TheardCreateDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        
        FutureTask<Object> futureTask = new FutureTask<Object>(new SomeCallable<Object>());
        Thread oneThread = new Thread(futureTask);
        
        oneThread.start();
        // 这里可以在运行之后获得 返回值
        System.out.println(futureTask.get());
        System.out.println(futureTask.isDone());
//        System.out.println(futureTask.);
    }
}

class SomeCallable<Object> implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        System.out.println("通过实现Callable接口来创建Thread线程");
        // 这个是可以返回数据的 这里就随便返回个 1024 哈
        return (Object)" 这个是可以返回数据的 这里就随便返回个哈";
    }
}

