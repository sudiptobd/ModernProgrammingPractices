package lab11.prob5;

import java.util.List;
import java.util.Collections;

public class GenericSecondSmallest {
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements.");
        }

        T smallest = null;
        T secondSmallest = null;

        for (T element : list) {
            if (smallest == null || element.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = element;
            } else if (secondSmallest == null || element.compareTo(secondSmallest) < 0) {
                if (!element.equals(smallest)) {
                    secondSmallest = element;
                }
            }
        }

        if (secondSmallest == null) {
            throw new IllegalArgumentException("List must contain at least two distinct elements.");
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 5, 20, 8, 5);
        List<String> strings = List.of("apple", "banana", "cherry", "date");

        System.out.println("Second smallest in integers: " + secondSmallest(integers)); // Output: 8
        System.out.println("Second smallest in strings: " + secondSmallest(strings));  // Output: "banana"
    }
}

