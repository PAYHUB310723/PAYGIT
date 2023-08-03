package new_features_java8_to_java17;

public class LambdaEx {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        Thread childThread = new Thread(runnableThread);
        childThread.start();

//        var reference = function () {
//            console.log ("this is cool")
//        }
        //Lambda expressions
//        Runnable runnableThreadLambda = () -> {System.out.println("Child!");};
        Runnable runnableThreadLambda = () -> System.out.println("Thread with lambda!");
        Thread childThread1 = new Thread(runnableThreadLambda);
        childThread1.start();

        Thread childThread3 = new Thread(() -> System.out.println("Thread with lambda expression!"));
        childThread3.start();

        new Thread(()-> System.out.println("Lambda's are amazing!!!")).start();
        new Thread(()-> {
            for(int i =0; i<5; i++)
            System.out.println("Lambda's are amazing!!!......");
        }).start();
    }
}



class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Child!");
    }
}