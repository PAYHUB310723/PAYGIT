package new_features_java8_to_java17.exploratory;

import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.stream.Stream;

public class LongFunctionEx {
    public static void main(String[] args) {
        long value = 0;
        var stream = Stream.iterate(value, i -> i <= 5, i -> i + 2);
//        stream.forEach(System.out::println);
        LongFunction<LongUnaryOperator> func = m -> n -> n / m;
        stream.mapToLong(i -> i).map(func.apply(2)).forEach(System.out::println);
    }
}