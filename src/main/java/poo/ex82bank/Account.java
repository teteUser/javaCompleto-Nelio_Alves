package poo.ex82bank;

public class Account {
    private int number;
    private String holder;
    private Double balance = 0d;

    public Account(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double quantia){
        this.balance += quantia;
    }

    public void withdraw(Double quantia){
        this.balance -= (quantia + 5.0);

    }

    public void toStringVoid() {
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", this.getNumber(), this.getHolder(), this.getBalance());
    }
}
