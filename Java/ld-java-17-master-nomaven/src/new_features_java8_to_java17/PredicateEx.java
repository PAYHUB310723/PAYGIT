package new_features_java8_to_java17;

import java.util.function.Predicate;

public class PredicateEx {
    int age;
    public static void main(String[] args) {
        PredicateEx p1 = new PredicateEx();
        p1.age = 100;
//        check(p1, p -> {p.age < 5});
        check(p1, p -> p.age < 5);
    }
    private static void check(PredicateEx test,
                              Predicate<PredicateEx> pred) {
        String result = pred.test(test)
                ? "age matching" : "age not matching";
        System.out.print(result);
    }
}

