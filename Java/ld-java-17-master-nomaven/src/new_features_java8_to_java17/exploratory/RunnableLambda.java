package new_features_java8_to_java17.exploratory;

public class RunnableLambda {
	public static void main(String[] args) {
 anonymousInstance();

//		Runnable runnable = () -> System.out.println("Welcome");

		Runnable runnable = () -> {
			for (int i = 1; i < 10; i += 2) {
				try {

					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(i);
			}
		};

		new Thread(runnable).start();
		
		// the utlitmate code
		new Thread(() -> System.out.println("Welcome")).start();

	}

	private static void anonymousInstance() {
		// anonymous class
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i < 10; i += 2) {
					System.out.println(i);
				}
			}
		};
		new Thread(runnable).start();
	}

}

class ChildThreadRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("Welcome");
//		for (int i = 1; i < 10; i += 2) {
//			try {
//
//				Thread.currentThread().sleep(2000);
//			} catch (InterruptedException e) {
//
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
	}
}
// FUNCTIONAL PROGRAMMING ( lambda expression )
// Functional Interface have only one abstract method.

@FunctionalInterface
interface Test {
	void m();
//	void m1();
}