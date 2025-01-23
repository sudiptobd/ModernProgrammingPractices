package lab7.prob1.partE.ii;

public interface C  extends A {
    default void method() {
        System.out.println("C.method");
    }
}
