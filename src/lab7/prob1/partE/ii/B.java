package lab7.prob1.partE.ii;


public interface B extends A {
    default void method() {
        System.out.println("B.method");
    }
}
