
public class DMPPCheckingAccount extends DMPPBaseAccount {
    protected   DMPPPerson Person;
    private double checkFee;


    DMPPCheckingAccount(int newAccountNumber, double newBalance, DMPPPerson Person, double checkFee) {
        super(newAccountNumber);
        this.balance = newBalance;
        this.Person = Person;
        this.checkFee = checkFee;
        this.open = true;
    }


    // Returns Individual Personal Info
    @Override
    public DMPPInformation getOwner() {
        return Person;
    }


    // Returns Check Fee amount
    public double getCheckFee() {

        return checkFee;

    }

    // Modified Withdraw Function
    @Override
    public boolean withdraw(double amount) {
        if(amount > balance || amount < 0){
            return false;
        }
        balance = balance - (amount + checkFee);  // Subtracts Check Fee from withdraw
        return true;
    }

    // Modified Deposit Function
    @Override
    public boolean deposit(double amount) {
        if(amount < 0){
            return false;
        }
        balance = balance + amount - checkFee;   // Subtracts Check Fee from Deposit
        return true;
    }


    // Modified toString
    @Override
    public String toString() {

        String String1 = "Your Checking Account number is "+ getAccountNumber() + " and your checkfee is $" + getCheckFee();
        return String1;
    }

    // Modified Close
    @Override
    public void close() {
        balance = 0.0;
        open = false;
        Person = null;
        checkFee = 0.0;
    }
}



