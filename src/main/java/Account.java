public class Account {
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public void addBalance(int money) {
        this.balance += money;
    }

    public void withDraw(int money) {
        if(money > balance) {
            throw new IllegalArgumentException("미쳤냐? 돈도 잔액부터 확인해라!!");
        }
        this.balance -= money;
    }
}
