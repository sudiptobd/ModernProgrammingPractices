package lab9.prob9;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        printSquares(4); // Output: 1, 4, 9, 16
    }

    public static void printSquares(int num) {
        IntStream.iterate(1, Main::squareGenerator)
                .limit(num)
                .forEach(System.out::println);
    }

    public static int squareGenerator(int n) {
        return n + (2 * (int) Math.sqrt(n) + 1);
    }
}
