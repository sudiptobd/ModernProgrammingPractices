package practice.register;

import java.util.ArrayList;
import java.util.List;

public class RegisterController {
    private List<Account> accounts = new ArrayList<>();
    public void register(String name, int age) {
        Account account = new Account();
        account.setId(1);
        account.setName(name);
        account.setAge(age);
        accounts.add(account);
    }
}
