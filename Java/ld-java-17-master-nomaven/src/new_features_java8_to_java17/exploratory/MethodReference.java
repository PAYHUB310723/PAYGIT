package new_features_java8_to_java17.exploratory;


// declared
@FunctionalInterface
interface Counter {
	int count(Object[] objArray);

//	int count(Object[] objArray) {
//		int count = Utils.countElement(objArray);
//		return count;
//	}
}

public class MethodReference {

	private static void staticMethodReference() {
		// use a lambda expression to call a static method of a class.
		Integer[] intArray = { 5, 6, 7, 8 };	
		// associate or link
		Counter counter = array -> Utils.countElements(array);
		// executing the expression
		System.out.println(counter.count(intArray));

		// using a static method reference ::
		Counter counter2 = Utils::countElements;
		System.out.println(counter2.count(intArray));
	}
	
	private static void objectInstanceMethodReference1() {
		// using instance method reference
		Integer[] intArray = { 5, 6, 7, 8 };

//		Utils utils = new Utils();
//		Counter counter2 = utils::countElementsInstance;

		Counter counter2 = new Utils()::countElementsInstance;
		System.out.println(counter2.count(intArray));

	}
}
class Utils {
	public static int countElements(Object[] array) {
		return array.length;
	}

	public int countElementsInstance(Object[] array) {
		return array.length;
	}
}