public interface DMPPAccountInterface {

     boolean withdraw(double amount);

     int getAccountNumber();

     double getBalance();

     boolean deposit(double amount);

     String toString();

     Object getOwner();

     void close();

}

