class BankAccount {
    private String accountHolder;
    private double balance;
    
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Day4Q2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountHolder("Satya Prakash ");
        account.setBalance(1000.0);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}
