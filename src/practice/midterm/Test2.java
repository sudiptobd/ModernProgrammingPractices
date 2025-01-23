package practice.midterm;

public class Test2 {
    public static void main(String[] args) {
        A o2 = new B();
        o2.print();
        Rectangle.shared.print();

    }
}

class Rectangle {
   static Rectangle shared = new Rectangle();
   private Rectangle() {}
    public void print() {
       System.out.println("shared");
    }
}