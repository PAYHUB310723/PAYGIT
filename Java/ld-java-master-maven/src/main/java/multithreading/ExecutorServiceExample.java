package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
//    The Executor services
//    1. is an interface for executing async tasks.
//    2. in the java.util.concurrent package
//    3. provides methods to manage termination of async tasks

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        RunnableCounter runnableCounter = new RunnableCounter();
        Thread counterThread = new Thread(runnableCounter);
        Thread counterThread1 = new Thread(runnableCounter);
        Thread counterThread2 = new Thread(runnableCounter);
        Thread counterThread3 = new Thread(runnableCounter);
        executorService.execute(counterThread);
        executorService.execute(counterThread1);
        executorService.execute(counterThread2);
        executorService.execute(counterThread3);
//        executorService.execute(new Runnable() {
//
//            @Override
//            public void run() {
//                for (int i = 10; i < 20; i++) {
//                    try {
//                        Thread.sleep(500);
//                        System.out.println(Thread.currentThread().getName() + ":" + i);
//                    } catch (InterruptedException e) {
//                        System.out.println("Exception : " + e);
//                    }
//                }
//
//            }
//        });
        executorService.shutdown();
    }
}
   class RunnableCounter implements Runnable {


           @Override
           public void run() {
               for(int i =0;i<10;i++) {
                   try {
                       Thread.sleep(1000);
                       System.out.println(Thread.currentThread().getName() + ":" + i);
                   } catch (InterruptedException e) {
                       System.out.println("Exception : " + e);
                   }
               }
           }
       }

