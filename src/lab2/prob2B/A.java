package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class A {
    private List<B> bs;

    public A() {
        this.bs = new ArrayList<>();
    }

    public void addB(B b) {
        bs.add(b);
    }

    public List<B> getBs() {
        return bs;
    }
}