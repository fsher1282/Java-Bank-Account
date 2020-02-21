public class DMPPSavingAccount extends DMPPBaseAccount  {

    protected double interestRate;
    protected DMPPPerson Person;
    protected int years;
    protected double startingBal;


    DMPPSavingAccount(int newAccountNumber,double newBalance, DMPPPerson Person,double rate, int years){
        super(newAccountNumber);
        this.interestRate = rate;
        this.balance = newBalance;
        this.Person = Person;
        this.years = years;
        this.startingBal = newBalance;


        open = true;

    }


    // Returns Object Person
    @Override
    public DMPPInformation getOwner() {
        return Person;
    }

    // Returns Interest Rate
    public final double getInterestRate(){

    return interestRate;
    }

    // Calculates Interest Rate
    public double calcBalanceInterestRate(){
        for (int i = 0; i < years; i++ ) {

            balance += balance * interestRate;
        }
        return balance;
    }

    // toString displays data
    @Override
    public String toString() {
        String string1 ="for Savings Account"
                +"\nYour Interest rate is " + getInterestRate() + "%" + "\n"
                +"Your starting balance is $"+ startingBal +"\n"
                +"\n"
                + "Testing Calculating interest Rate" + "\n"
                +" Your balance after "+ years +" years with interest is $"
                + calcBalanceInterestRate();
        return string1;
    }

    /*
    Function Close
        1) Sets removes info within Object Person
        2) Sets balance to Zero
        3) Closes Account Balance
        4) Clears Account Number

     */
    @Override
    public void close(){
        Person = null;
        balance = 0.0;
        open = false;
        accountNumber = 0;
        interestRate = 0.0;
    }
}
