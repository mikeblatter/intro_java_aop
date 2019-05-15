package aspectj;

import java.util.concurrent.TimeUnit;

public class Account {
    int balance = 20;

    @Log @Timer
    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception exception) {
            return false;
        }

        balance = balance - amount;
        return true;
    }
}
