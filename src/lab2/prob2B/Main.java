package lab2.prob2B;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B("Item 1");
        B b2 = new B("Item 2");
        a.addB(b1);
        a.addB(b2);

        System.out.println("A has " + a.getBs().size() + " Bs.");
    }
}