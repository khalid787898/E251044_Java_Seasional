public class BankAccountTask {
   public static void main(String[] args) {


      BankAccount acc1 = new BankAccount("A1001", "Khalid Al Mahmud", 15000.50);
      BankAccount acc2 = new BankAccount("A1002", "Rahat Ahmed", 27500.00);


      BankAccount.showBankName();


      System.out.println("\nAccount 1:");
      acc1.displayAccount();


      System.out.println("\nAccount 2:");
      acc2.displayAccount();
   }
}


class BankAccount {
String accountNumber;
String accountHolderName;
double balance;


static String bankName = "Sonali Bank";




   public BankAccount(String accountNumber, String accountHolderName, double balance) {
   this.accountNumber = accountNumber;
   this.accountHolderName = accountHolderName;
   this.balance = balance;
}


public static void showBankName() {
   System.out.println("Bank Name: " + bankName);
}


public void displayAccount() {
   System.out.println("Account Number     : " + accountNumber);
   System.out.println("Account Holder Name: " + accountHolderName);
   System.out.printf("Balance : %.2f%n", balance);
}
}
