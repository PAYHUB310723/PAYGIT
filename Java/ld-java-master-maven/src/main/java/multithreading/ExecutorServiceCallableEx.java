package multithreading;

import java.util.concurrent.*;

public class ExecutorServiceCallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CallableCounter counterTask = new CallableCounter();
        Future<Integer> message = executorService.submit(counterTask);
        System.out.println("The returned Result is : " + message.get().toString());
    }

}

class CallableCounter implements Callable<Integer> {
    public Integer call() throws Exception{
        int total=0;
        for(int i =0;i<5;i++) {
            try {
                Thread.sleep(1000);
                total+=i;
                System.out.println(Thread.currentThread().getName() + ":" + total);

            } catch (InterruptedException e) {
                System.out.println("Exception : " + e);
            }
        }
        return total;
    }
}