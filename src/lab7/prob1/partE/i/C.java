package lab7.prob1.partE.i;

public interface C  extends A {
    default void method() {
        System.out.println("C.method");
    }
}
