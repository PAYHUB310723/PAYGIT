package generics;

import java.util.ArrayList;
import java.util.List;


public class WithoutGenericsRawTypes {
	public static void main(String[] args) {
//	List in < jdk 1.5
//	List<E> in jdk 1.5 and above
//	List is a raw type. References to generic type List<E> should be parameterized
		List list = new ArrayList();
//		list.add(1); //Integer
//		list.add("Raw Types Element"); // String
//		upcasting : storing a derived class instance in a base class reference
		Object productObject = new Product(1, "Start With Why?");
		list.add(productObject); // Custom Object
		list.add(new Product(2, "Can't hurt me!")); // Custom Object

//		list.add('a');
		int number = 100;
		Integer integerObject = number;
		list.add(integerObject);
//		list.add(new Throwable());
//		list.add(new ArrayList());
		System.out.println(list);

//		for (Object item : list) {
//			String stringRepresentation = (String) item;
//			System.out.println(stringRepresentation);
//		}

		for (Object item : list) {
//			downcasting : getting the derived type from the base reference
			Product product = (Product) item;
			String stringRepresentation = product.toString();
			System.out.println(stringRepresentation);
		}
	}
}
