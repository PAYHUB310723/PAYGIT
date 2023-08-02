package generics;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class WithGenericsTyped {
	public static void main(String[] args) {
//	List in < jdk 1.5
//	List<E> in jdk 1.5 and above
//	List is a raw type. References to generic type List<E> should be parameterized
//	Upto Jdk 1.6
//		List<String> list = new ArrayList<String>();
//		JDK 1.7 Type Inference using the diamond operator <>
//		List of String List<String>  (Generic Type T) and value (Generic Type Value is String)

		List <String> list = new ArrayList<>();
//		list.add(1);
		list.add(String.valueOf(1));
		list.add("Raw Types");
		list.add(new Product(1, "Start With Why?").toString());
		Integer number = 100;
//		list.add(number);
		System.out.println(list);

//		for (Object item : list) {
//			String stringRepresentation = (String) item;
//			System.out.println(stringRepresentation);
//		}

		for (String item : list) {
			System.out.println(item);
		}

		System.out.println("**********");
//		list.forEach(item -> System.out.println(item));
// Method reference for instance method.
//		list.forEach(System.out::println);
			
	}
	public static void processList(List<String> stringList){
		for (String item : stringList) {
			System.out.println(item);
		}
	}
}
