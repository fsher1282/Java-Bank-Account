
public class DMPProg6Main {
    public static void main(String[] args) {
        System.out.println("Daniel Fisher \nCSC 310 \nProject 5");
        System.out.println("Welcome to this totally legal bank!");

    // Testing Account functions

        DMPPBusiness dmppBusiness = new DMPPBusiness("AMDG Bake Sale", "1235 University Blvd", "Legit");
        DMPPPerson dmppPerson1 = new DMPPPerson("Dr. Kovach", "Steubenville", 54);
        DMPPPerson dmppPerson2 = new DMPPPerson("Daniel Fisher", "Grass Valley CA", 21);
        DMPPPerson dmppPerson3 = new DMPPPerson("Mariel Pugh", "Ohio", 19);
        DMPPPerson dmppPerson4 = new DMPPPerson("James Coffee", "1731 Washington St.", 22);

        // Create abstract array of accounts

        DMPPBaseAccount accts[] = new DMPPBaseAccount[5];
        accts[0] = new DMPPBusinessAccount(159621, 500.00, dmppBusiness, 2.50);
        accts[1] = new DMPPCheckingAccount(219348, 750000.00, dmppPerson1, 12);
        accts[2] = new DMPPSavingAccount(255912, 50.00, dmppPerson2, 0.03, 1);
        accts[3] = new DMPPTrustAccount(8675309,200, dmppPerson3, 0.05, 1);
        accts[4] = new DMPPTrustAccount(765432, 200, dmppPerson4, 0.05, 1);


        // Test loop
        for(DMPPBaseAccount acct : accts){

            System.out.println("--------------------------------------------------------------\n");

            // Testing Universal Functions
            // Note: I modified the toString function to Test Unique Methods of a class
            // I Did this purely out convenience

            // Display Owner information, Account Number and Balance
            System.out.println("Thank you " + acct.getOwner() + " for trusting us with your money");
            System.out.println("Your Account Number is "+ acct.getAccountNumber()   + " " + acct);
            System.out.println("Your current balance is $" + acct.getBalance());

            // Test Successful Deposit
            acct.deposit(20);
            System.out.println("Testing Successful Deposit");
            System.out.println("You deposited $20 your current balance is $" + acct.getBalance());
            System.out.println(" ");

            // Test Unsuccessful Deposit

            acct.withdraw(-1.25);
            System.out.println("Testing Unsuccessful Withdraw");
            System.out.println("ERROR: You can't put a negative number!!!");
            System.out.println("Your balance is still $" + acct.getBalance());
            System.out.println(" ");

            // Test Successful Withdraw (With exception of accts[3] withdraw under 21 from Trust Account
            System.out.println("Testing Successful Withdraw");
            System.out.println("You have withdrawn $15 " + acct.withdraw(15));
            System.out.println("Your current balance is $" + acct.getBalance());

            System.out.println(" ");


            // Test Unsuccessful Withdraw
            System.out.println("Testing Unsuccessful Withdraw");
            acct.withdraw(200000000.00);
            System.out.println("Error you can't withdraw $200000000.00");
            System.out.println("Your Balance is still $" + acct.getBalance());
            System.out.println("\n");

            // Test Close Function

            acct.close();
            System.out.println("Testing Close Function");
            System.out.println("Account is closed your balance is $" + acct.getBalance());
            System.out.println("Owner is equal to " + acct.getOwner());
            System.out.println("Account Number has been cleared\nAccount Number: " + acct.getAccountNumber());
            System.out.println("Have a nice day!!!");


        }

    System.out.println("\n" + "\n");
    System.out.println("Well that is my last assignment! \n I hope you enjoy the rest of the summer Dr. Kovach");

    

    }
}
