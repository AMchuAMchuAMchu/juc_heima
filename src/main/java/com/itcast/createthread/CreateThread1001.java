package com.itcast.createthread;

import java.util.concurrent.*;

/**
 * Description ==> TODO
 * BelongsProject ==> juc_heima
 * BelongsPackage ==> com.itcast.createthread
 * Version ==> 1.0
 * CreateTime ==> 2023-03-02 19:46:50
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class CreateThread1001 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        new T1().start();
//
//        new Thread(new T2()).start();

//        T3 t3 = new T3();
//
//        FutureTask<Object> futureTask = new FutureTask<Object>(t3);
//
//        new Thread(futureTask).start();
//
//        System.out.println(futureTask.get());

//        new Thread(new FutureTask<Object>(new T3())).start();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(()->{
            System.out.println("T41...");
        });

        executorService.submit(()->{
            System.out.println("T42...");
        });

        executorService.submit(()->{
            System.out.println("T43...");
        });

        executorService.shutdown();
    }
}


class T3 implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("T3...");
        return "雪之下雪乃";
    }
}

class T2 implements Runnable{
    @Override
    public void run() {
        System.out.println("T2...");
    }
}

class T1 extends Thread{
    @Override
    public void run() {
        System.out.println("T1...");
    }
}

