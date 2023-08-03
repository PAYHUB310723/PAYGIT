package new_features_java8_to_java17;

public class FunctionalInterfaceEx {
    @FunctionalInterface
    interface Test {
     abstract   void m();
	  static  void m1() {}
        default void m2() {}
    }
}
