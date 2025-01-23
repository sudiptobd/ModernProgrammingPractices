package practice;

import java.util.ArrayList;
import java.util.List;

public class Sub  extends  Super {
    static void print() {
        System.out.println("Sub");
    }
    public static void main(String[] args) {
        Supreme s4 = new Supreme();
        Supreme s1 = new Sub();
        Super s2 = new Sub();
        Sub s3 = new Sub();
        s4.print();
        s1.print();
        s2.print();
        s3.print();

        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        list.forEach(System.out::println);

    }
}