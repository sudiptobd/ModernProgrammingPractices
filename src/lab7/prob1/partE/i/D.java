package lab7.prob1.partE.i;

public class D implements B,C{
    public static void main(String[] args) {
        D d = new D();
        d.method();
    }

    @Override
    public void method() {
        //B.super.method();
    }
}
