package new_features_java8_to_java17;

import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        AgeCheck ageCheck = new AgeCheck();
        ageCheck.age = 100;
//        check(p1, p -> {p.age < 5});

        check(ageCheck, p -> p.age < 5);
    }
    private static void check(AgeCheck ageCheck,
                              Predicate<AgeCheck> pred) {
        String result = pred.test(ageCheck)
                ? "age matching" : "age not matching";
        System.out.print(result);
    }
}

class AgeCheck {
    int age;
}

