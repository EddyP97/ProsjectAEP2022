package bank;

public class creditAccount {
    private final int balance;
    private int creditLimit;

    public creditAccount(int creditLimit) {
        this.creditLimit = creditLimit;
        this.balance = 0;
    }

    public int balance() {
        return balance + creditLimit;
    }
}
