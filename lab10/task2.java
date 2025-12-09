
public class ATMInterfaceTask {
    public static void main(String[] args) {
        DBBL atm = new DBBL(5000); 

        atm.checkBalance();
        atm.deposit(2000);
        atm.withdraw(1500);
        atm.withdraw(8000); 
        atm.checkBalance();
    }
}
interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}


class DBBL implements ATMService {
    private double balance;

    DBBL(double initialBalance) {
        if (initialBalance < 0) balance = 0;
        else balance = initialBalance;
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void checkBalance() {
        System.out.printf("Current Balance: %.2f%n", balance);
    }
}
