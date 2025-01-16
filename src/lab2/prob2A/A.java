package lab2.prob2A;

public class A {
    private B b;

    public A(B b) {
        this.b = b;
        b.setA(this);
    }

    public B getB() {
        return b;
    }
}