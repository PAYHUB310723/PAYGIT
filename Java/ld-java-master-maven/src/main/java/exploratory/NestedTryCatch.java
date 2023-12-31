package exploratory;

public class NestedTryCatch {
	public static void main(String[] args) {
//		innerCatchHandlingException();
		outerTryHandlingInnerTryException();
	}

	private static void innerCatchHandlingException() {
		try {
			int num[] = { 10, 20 };
			System.out.println(num[0]);
			System.out.println(num[1]);
			// System.out.println(num[2]);
			try {
				int i = 200;
				// ArithmeticException
				int result = i / 0;
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic problem");
			}
			Test test = null;
			// NullPointerException
			System.out.println(test.value);
		} catch (Exception e) {
			System.out.println("OOPS, SOME OTHER EXCEPTIONS " + e);
			// } catch (NullPointerException e) {
			// System.out.println("Test instance not created");
			// System.out.println(e.getMessage());
			// } catch (ArithmeticException e) {
			// System.out.println("Arithmetic problem");
			// }
			System.out.println("COMPLETE");
		}
	}
	private static void outerTryHandlingInnerTryException() {
		try {
	         int num[] = { 10, 20 };
	         System.out.println(num[0]);
	         System.out.println(num[1]);
	         // System.out.println(num[2]);
	         try {
	        	 Test test = null;
		         // NullPointerException
		         System.out.println(test.value);
	            int i = 200;
	            // ArithmeticException
	            int result = i / 0;
	            System.out.println(result);
	         } catch (ArithmeticException e) {
	            System.out.println("Arithmetic problem");
	         }
	         finally {
	        	 System.out.println("Inner finally");
	         }
	         Test test = null;
	         // NullPointerException
	         System.out.println(test.value);
	      } catch (Exception e) {
	         System.out.println("OOPS, SOME OTHER EXCEPTIONS " + e);
	         // } catch (NullPointerException e) {
	         // System.out.println("Test instance not created");
	         // System.out.println(e.getMessage());
	         // } catch (ArithmeticException e) {
	         // System.out.println("Arithmetic problem");
	         // }
	         System.out.println("COMPLETE");
	      }
		System.err.println("COMPLETE1");
	}

}

class Test {
	String value;
}