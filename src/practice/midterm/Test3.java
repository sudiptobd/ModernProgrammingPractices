package practice.midterm;

public class Test3 {
    public static void main(String[] args) {
        A o1 = new A();
        A o2 = new B();
        A o3 = o1;
        o3.setValue(5);
        o1.print();
        o2.print();
        o3.print();
    }
}
