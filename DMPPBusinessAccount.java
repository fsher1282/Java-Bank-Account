public class DMPPBusinessAccount extends DMPPBaseAccount{

    protected DMPPBusiness businessInfo;
    private double balance;
    private boolean open;
    private double transactionFee;

    DMPPBusinessAccount(int newAccountNumber, double newBalance, DMPPBusiness businessInfo, double newTransactionFee){
        super(newAccountNumber);
        this.balance = newBalance;
        this.businessInfo = businessInfo;
        this.transactionFee = newTransactionFee;
        open = true;

    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    // Business Withdraw Account
    @Override
    public boolean deposit(double amount) {
        if(amount < 0){
            return false;
        }
        balance = balance + amount - transactionFee; // Subtracts transaction fee per transaction
        return true;
    }

    @Override
    public boolean withdraw(double amount){
        if(amount > balance || amount < 0){
            return false;
        }
        balance = balance - (amount + transactionFee); // Adds transaction fee with amount withdrawn from balance
        return true;
    }

    // I modified toString to include the methods unique to a particular class
    @Override
    public String toString() {
        String string1 = "for " + businessInfo + " " + businessInfo.getAddress()+" and is a type "
                +businessInfo.getBusinessType()
                + "\n Your transaction fee is $" + getTransactionFee();
        return string1;

    }

    // Returns Business Info
    @Override
    public Object getOwner() {
        return businessInfo;
    }

    // Modified Close function
    @Override
    public void close(){
        accountNumber = 0;
        balance = 0.0;
        open = false;
        businessInfo = null;
        transactionFee = 0.0;
    }
}
