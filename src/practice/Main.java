package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface A {
    double getLocation();
}
interface B {
    double getLocation();
}
public class Main implements A,B {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Citrus");
        words.add("Apple Juice");
        words.add("Banana Juice");
        words.add("Citrus Juice");
        words.stream().findAny().ifPresent(System.out::println);
//        System.out.println(
//                words.stream()
//                .filter(value -> value.contains("A"))
//                .collect(Collectors.toList())
//        );
//
//        System.out.println(words.stream()
//                .filter(value -> value.contains("A"))
//                .findFirst());
//        Optional<String> value = Optional.ofNullable("non null value");
//        System.out.println(value.orElse("default value"));
//        if(value.equals(Optional.ofNullable("non null value"))) {
//            System.out.println("Got non null value");
//        }
    }

    @Override
    public double getLocation() {
        return 0;
    }
}


