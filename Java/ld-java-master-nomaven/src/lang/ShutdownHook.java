package lang;

public class ShutdownHook {
   public static void main(String[] args) {
      System.out.println(Thread.currentThread().getName());
      Runtime runtime = Runtime.getRuntime();
      ShutdownTask shutdownTask = new ShutdownTask("hook1");
      runtime.addShutdownHook(shutdownTask);
      // runtime.removeShutdownHook(shutdownTask);
      System.out.println("Performing a task .....");
      // System.exit(0);
      try {
         System.out.println("Going to sleep for 10 seconds....");
         Thread.sleep(10000);
         System.out.println("Resuming operation back...");
      } catch (InterruptedException e) {
      }
   }
}

class ShutdownTask extends Thread {
   String message;

   ShutdownTask() {

   }

   ShutdownTask(String message) {
      this.message = message;
   }

   @Override
   public void run() {
      System.out.println("PERFORMING CLEAN UP OPERATIONS (Logging in shutdown time......." + message);
   }
}
