package annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class CustomAnnotationEx {
//Using the Reflection API
	public static void main(String[] args) {
		Class testClass = TestClass.class;
		// Getting the methods here
		for (Method method : testClass.getMethods()) {
			// Getting annotation for each method
			for (Annotation annotation : method.getDeclaredAnnotations()) {
				System.out.println("Method > " + method + "  >>> " + annotation);
			}
		}
	}
}

//Create a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodMetaDataAnnotation {
	// elements
	public String developer() default "Simon";
}

//applying the annotation

class TestClass {
	@MethodMetaDataAnnotation(developer = "Peter")
	public void newTestMethod() {
		System.out.println("My Test Method!");
	}

	@MethodMetaDataAnnotation()
	public void oldTestMethod() {
		System.out.println("My Test Method!");
	}
}

//@Retention is not applicable to type, which is a compilation error.
//@Retention(RetentionPolicy.RUNTIME)
//public class CustomType {}
