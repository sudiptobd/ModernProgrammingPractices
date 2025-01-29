package lab9.prob12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MySingletonLazy singleton1 = MySingletonLazy.getInstance();
        MySingletonLazy singleton2 = MySingletonLazy.getInstance();

        singleton1.showMessage();
        singleton2.showMessage();

        // Verifying singleton property
        System.out.println("Are both instances same? " + (singleton1 == singleton2));
    }
}
