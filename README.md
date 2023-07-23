# juc 并发编程包学习
7/23
+ 了解创建java线程三种基础方式
1.直接实现Runnable接口（可用lamda）
2.继承Runnable接口
3.实现Callable<Object>接口 然后将其放入FutureTask中形成一个新的类，然后再放入创建一个新的Thread，能够有返回值,用FutureTask可用获取,可用获得这个线程在各个阶段的情况