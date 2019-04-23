public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(8, 5.77, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Bank account constructor with parameters was called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName ;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void depositFunds(double incrementValue){
        this.balance += incrementValue;
        System.out.println("Deposit of " + incrementValue + " made. New balance is " + this.balance);
    }

    public void withdrawFunds(double deductValue){
        if(deductValue > this.balance){
            System.out.println("Only " + this.balance + " available. Withdrawal refused.");
        } else {
            this.balance -= deductValue;
            System.out.println("Withdrawal of " + deductValue + " processed. Remaining balance = " + this.balance);
        }
    }

}
