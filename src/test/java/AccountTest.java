import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {

    @Test
    public void 계좌를처음개설하면잔액은없어야한다(){
        Account account = new Account();

        int balance = account.getBalance();
        assertThat(balance, is(0));
    }

    @Test
    public void 돈을1000원입금하고잔액확인(){
        Account account = new Account();
        account.addBalance(1000);
        assertThat(account.getBalance(), is(1000));
    }
}
