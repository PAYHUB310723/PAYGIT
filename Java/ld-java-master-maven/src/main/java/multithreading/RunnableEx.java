package multithreading;

public class RunnableEx {
    public static void main(String[] args) {
        //To start a new thread you should create an instance of Thread class.
        Thread thread = new Thread(new ThreadRunnable());
        thread.start();
//        ThreadRunnable threadRunnable = new ThreadRunnable();
//        threadRunnable.run();
    }
}

class Dummy {

}
class ThreadRunnable extends  Dummy implements Runnable {
    public void run() {
        System.out.println("Child Thread!");
    }
}