package oops;

public class StaticBlockEx {
public static void main(String[] args) {
	System.err.println(StaticBlockTest.var);
}
}

class StaticBlockTest {
	static String var = "Testing";
	static {
		System.out.println("1 This block gets executed when the class is loaded in the memory.");
	}
	static {
		System.out.println("2 This block gets executed when the class is loaded in the memory.");

	}
	static {
		System.out.println("3 This block gets executed when the class is loaded in the memory.");

	}
}