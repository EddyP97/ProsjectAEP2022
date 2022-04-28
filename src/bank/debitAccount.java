package bank;

//Understands a bank with a customers balance sheet
public class debitAccount {


    private int balance;

    public debitAccount() {
        this.balance=0;
    }

    public int balance() {
        return balance;
    }

    public void deposit(int value) {
        balance +=value;
    }
}
