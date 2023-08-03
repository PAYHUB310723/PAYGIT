package new_features_java8_to_java17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicatesEx {
    public static void main(String[] args) {
        //A seqence of elements from a collection.
        Stream<String> stream = Stream.of( "Singapore", "India","Japan", "Russia", "Netherlands", "Ukraine","France", "Italy");
        // Test conditions using predicates
        Predicate<String> predicate = Predicate.isEqual("Singapore");
        Predicate<String> predicate1 = Predicate.isEqual("India");

        List<String> selectedCountries = new ArrayList<>();

//        stream.peek(System.out::println)
//        :: method reference
        stream.filter(predicate1.or(predicate))
                .forEach(selectedCountries::add);
        System.out.println(selectedCountries);
    }
}
