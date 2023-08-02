package multithreading;

public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " running ");
		System.out.println(Thread.currentThread().getPriority());
		Thread thread = new ChildThread();
		thread.setPriority(10);
//		thread.run();
		ChildThreadRunnable runnable = new ChildThreadRunnable();
		Thread thread2 = new Thread(runnable);
		thread.start();	
		thread2. start();
//		three threads are running
		thread.join();
		System.out.println("thread.join");
		thread2.join();
		System.out.println("thread2.join");
		System.out.println(Thread.currentThread().getName() + " done ");
	}
}

class Test {

}

class ChildThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i< 10; i+=2) {
			try {
				Thread.currentThread().sleep(3000);
				if(i ==6) {
					return;
				}
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i);
		}
//		System.out.println(Thread.currentThread().getName() + " > running ");
//		System.out.println(getName());
//		System.out.println(getPriority());
//		System.out.println(Thread.currentThread().getName() + " > done ");
	}
}

class ChildThreadRunnable extends Test implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i< 10; i+=2) {
			try {

				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i);
		}
//		System.out.println(Thread.currentThread().getName() + " > running ");
//		System.out.println(Thread.currentThread().getName() + " > done ");
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.currentThread().getName() + " > done ");
	}

}

