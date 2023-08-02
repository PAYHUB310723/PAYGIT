package lang;

public class ShutdownHook {
   public static void main(String[] args) {
      Runtime runtime = Runtime.getRuntime();
      ShutdownTask shutdownTask = new ShutdownTask("hook1");
      runtime.addShutdownHook(shutdownTask);
      // runtime.removeShutdownHook(shutdownTask);
      System.out.println("Performing a task .....");
      // System.exit(0);
      try {
         Thread.sleep(10000);
      } catch (Exception e) {
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

   public void run() {
      System.out.println("PERFORMING CLEAN UP OPERATIONS...." + message);
   }
}
