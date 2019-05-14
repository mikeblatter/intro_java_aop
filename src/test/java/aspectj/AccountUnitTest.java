package aspectj;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountUnitTest {
    private Account account;

    @Before
    public void before() {
        account = new Account();
    }

    @Test
    public void withdraw() {
        assertTrue(account.withdraw(5));
    }
}
