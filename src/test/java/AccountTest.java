import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AccountTest {

    @Test
    public void shouldBalanceIsZeroForNewAccount() throws Exception {
        Account account = new Account();
        if ( account == null ) {
            throw new Exception("계좌 생성  실패");
        }
        int balance = account.getBalance();
        System.out.println(balance);
        assertThat(account.getBalance(), is(0));
    }

    @Test
    public void shouldAddBalanceForDepositMoney(){
        Account account = new Account();
        account.deposit(1000);
        System.out.println(" 예금 : " + account.getBalance());
        assertThat(account.getBalance(), is(1000));
    }

    @Test
    public void shouldMinusBalanceForWithdrawMoney(){
        Account account = new Account(2000);
        account.withDraw(1000);
        System.out.println(" 예금 상태 " + account.getBalance());
        assertThat(account.getBalance(), is(1000));
    }

    @Test
    public void shouldCantWithdrawWhenLessThanHaveBalanceMoney(){
        Account account = new Account();
        account.deposit(1000);
        account.withDraw(1200);
        assertThat(account.getBalance(), is(1000));

    }
}
