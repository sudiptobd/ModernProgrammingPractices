package lab9.prob12;

import java.util.Optional;

public class MySingletonLazy {
    private static Optional<MySingletonLazy> instance = Optional.empty();
    private MySingletonLazy() {}
    static MySingletonLazy getInstance() {
        if (instance.isEmpty()) {
            instance = Optional.of(new MySingletonLazy());
        }
        return instance.get();
    }
    public void showMessage() {
        System.out.println("Singleton Instance: " + this);
    }
}
