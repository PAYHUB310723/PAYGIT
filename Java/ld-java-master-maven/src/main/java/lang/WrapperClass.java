package lang;

import java.util.ArrayList;

public class WrapperClass {
	public static void main(String[] args) {
//		primitiveArray();
		wrapperList();
	}

	private static void primitiveArray() {
		int number1 = 200;
		int number2 = 300;

		int numbers[] = new int[2];
		numbers[0] = number1;
		numbers[1] = number2;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}
		System.out.println("************");
		numbers = new int[5];
		int number3 = 3;
		int number4 = 4;
		int number5 = 5;
		numbers[0] = number1;
		numbers[1] = number2;
		numbers[2] = number3;
		numbers[3] = number4;
		numbers[4] = number5;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

		}
	}

	private static void wrapperList() {
		int number1 = 200;
		int number2 = 300;

		ArrayList numbersList = new ArrayList();
//		Explicit Boxing : converting the primitive type to reference type
		Integer integer = number1;
		numbersList.add(integer);
//		Auto Boxing
		numbersList.add(number2);
//		numbersList.add((Integer)number2);

//		for (int i = 0; i < numbersList.size(); i++) {
//			System.out.println(numbersList.get(i));
//		}

		System.out.println("************");
		int number3 = 3;
		int number4 = 4;
		int number5 = 5;
		numbersList.add(number3);
		numbersList.add(number4);
		numbersList.add(number5);

//		for (int i = 0; i < numbersList.size(); i++) {
//			System.out.println(numbersList.get(i));
//		}
		
		String nameString = "Good day";
		numbersList.add(nameString);
		
		boolean goodDay = true;
//		Boolean boolean1 = new Boolean(goodDay);
		Boolean goodDay1 = goodDay;
//		System.out.println(goodDay1);
		numbersList.add(goodDay1);
		
		System.out.println(numbersList);
	}
}
