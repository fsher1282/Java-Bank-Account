public abstract class DMPPBaseAccount implements DMPPAccountInterface{


    protected int accountNumber;
    protected double balance;
    protected DMPPInformation Owner;  //Object composition
    protected boolean open;

    // Constructor
    DMPPBaseAccount(int newAccountNumber){
        this.accountNumber = newAccountNumber;
        this.balance = 0.0;
        open = true;
    }

    // Default getOwner Function
    @Override
    public Object getOwner() {
        return Owner;
    }


    // Return balance of account
    @Override
    public double getBalance() {

        return balance;
    }

    // Return Individual Account
    @Override
    public int getAccountNumber() {

        return accountNumber;

    }

    // Default Deposit
    @Override
    public boolean deposit(double amount) {
        if(amount < 0 ){     //If amount is less than Zero then return false
            return false;
        }
        balance = balance + amount;
        return true;
    }

    // Default Withdraw
    public boolean withdraw(double amount){
        if(amount > balance || amount < 0){     //If amount is less than Zero or more than balance then return false
            return false;
        }
        balance = balance - amount;
        return true;
    }


    // Default toString Function
    public String toString(){
        String String1 = "Your balance in account "+ getAccountNumber() + " is $ "+ getBalance();
        return String1;
    }


    // Default Close
    public void close(){
        accountNumber = 0;
        balance = 0.0;
        open = false;
    }
}
