import org.junit.Test;

public class AccountTest {

    @Test
    public void 계좌를처음개설하면잔액은없어야한다(){
        Account account = new Account();

        int balance = account.getBalance();

    }
}
