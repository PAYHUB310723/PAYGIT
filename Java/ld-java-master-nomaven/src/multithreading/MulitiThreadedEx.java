package multithreading;

public class MulitiThreadedEx {
    public static void main(String[] args) throws InterruptedException {
//        PROCESS / ONE THREAD
        Thread.currentThread().setName("RJ");
        System.out.println(Thread.currentThread().getName() + " started the competition!");
        ArlanThread arlanThread = new ArlanThread();
        JanThread janThread = new JanThread();
        arlanThread.start();
        janThread.start();
        arlanThread.join();
        janThread.join();
        System.out.println(Thread.currentThread().getName() + " announces the winner!");
    }
}

class Compute1 {
    public void odd() {
        for(int i = 1; i<= 500; i+=2) {
            System.out.println("Jan : " + i);
        }
    }
    public void even() {
        for(int i = 2; i<= 500; i+=2) {
            System.out.println("Aralan : " + i);
        }
    }
}

class JanThread  extends Thread{
    @Override
    public void run() {
       Compute1 compute1 = new Compute1();
       compute1.odd();
    }
}
class ArlanThread  extends Thread{
    @Override
    public void run() {
        Compute1 compute1 = new Compute1();
        compute1.even();
    }
}