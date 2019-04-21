public class Account {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void addBalance(int money) {
        this.balance += money;
    }
}
