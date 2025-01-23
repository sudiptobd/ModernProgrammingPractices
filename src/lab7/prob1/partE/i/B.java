package lab7.prob1.partE.i;

public interface B extends A {
    default void method() {
        System.out.println("B.method");
    }
}
