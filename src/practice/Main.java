package practice;

interface A {
    double getLocation();
}
interface B {
    double getLocation();
}
public class Main implements A,B {
    public static void main(String[] args) {

    }

    @Override
    public double getLocation() {
        return 0;
    }
}


