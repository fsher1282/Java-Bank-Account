public class DMPPTrustAccount extends DMPPSavingAccount{

    DMPPTrustAccount(int newAccountNumber, double newBalance, DMPPPerson Person, double rate, int years) {
        super(newAccountNumber, newBalance, Person, rate, years);

        open = true;

    }

    // Modified Saving Account withdraw function
    @Override
    public boolean withdraw(double amount){
        if(amount > balance || amount < 0 || Person.getAge() < 21){  // If age is less than 21 you can't withdraw
            return false;
        }
        balance = balance - amount;
        return true;
    }

    @Override
    public String toString() {
        String string1 ="for Trust Account. \n"
                + "\n"
                + "Testing Calculating Trust Account Interest Rate \n"
                + "Your rate is " + getInterestRate() + "%"
                + "\nYour starting balance is $" + startingBal
                + "\n" + "\n"
                + "After " + years +" years you have $"+calcBalanceInterestRate()
                + "\nIf your age is less then 21 you can't withdraw. "
                + "\nYour current age is " + Person.getAge() +"\n";
        return string1;
    }
}
