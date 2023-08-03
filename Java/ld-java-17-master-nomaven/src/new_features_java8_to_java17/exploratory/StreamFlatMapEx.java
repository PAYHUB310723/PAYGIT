package new_features_java8_to_java17.exploratory;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Stream;

public class StreamFlatMapEx {
    public static void main(String[] args) {
//        HashSet hashSet = new HashSet();
//        hashSet.add("One");
//        hashSet.add("Two");
//        hashSet.add("Three");
//        LinkedList list = new LinkedList();
//        list.add("Four");
//        list.add("Five");
//
//        Stream.of(hashSet,list)
//                .flatMap(value -> value.stream())
//                .forEach(System.out::println);

      Stream.of(new HashSet<String>(), new LinkedList<String>())
              .flatMap(value -> value.stream())
              .forEach(System.out::print);
    }
}