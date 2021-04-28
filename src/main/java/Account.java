public class Account {
    private int balance = 0;

    public Account() {}
    public Account(int money) {
        this.balance = money;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withDraw(int money) {
        if(this.balance > money) {
            this.balance -= money;
        }
    }
}
