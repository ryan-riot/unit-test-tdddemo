import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTest {

    @Test
    public void 계좌를_처음개설하면_잔액은_없어야한다(){
        Account account = new Account();

        int balance = account.getBalance();
        assertThat(balance, is(0));
    }

    @Test
    public void 돈을_1000원_입금하고_잔액확인(){
        Account account = new Account();
        account.deposit(1000);
        assertThat(account.getBalance(), is(1000));
    }

    @Test
    public void 돈을_1000원예금_500원출금한후_잔액확인(){
        Account account = new Account();
        account.deposit(1000);
        account.withDraw(500);
        assertThat(account.getBalance(), is(500));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 만약잔액보다_많은금액을_출금하면_Exception발생(){
        Account account = new Account();
        account.deposit(3000);
        account.withDraw(4000);

        assertThat(account.getBalance(), is(-1000));
    }
}
