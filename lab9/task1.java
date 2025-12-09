
public class Experiment9 {
    public static void main(String[] args) {
  
        Student student = new Student();
        student.setName("Rahat Ahmed");
        student.setId("CSE2025-01");
        student.setCgpa(3.75);

        System.out.println("---- Student Information ----");
        System.out.println("Name : " + student.getName());
        System.out.println("ID   : " + student.getId());
        System.out.printf("CGPA : %.2f%n", student.getCgpa());


        BankAccount acc1 = new BankAccount();
        acc1.setAccountHolder("Khalid Al Mahmud");
        acc1.setAccountNumber("123456789012");
        acc1.setBalance(15000.50);

        BankAccount acc2 = new BankAccount();
        acc2.setAccountHolder("Rahat Ahmed");
        acc2.setAccountNumber("987654321098");
        acc2.setBalance(27500.00);

        System.out.println("\n---- Bank Account 1 (secure display) ----");
        acc1.showAccountInfo();

        System.out.println("\n---- Bank Account 2 (secure display) ----");
        acc2.showAccountInfo();
    }
}


class Student {
    private String name;
    private String id;
    private double cgpa;


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name.trim();
        }
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            this.id = "N/A";
        } else {
            this.id = id.trim();
        }
    }

    public void setCgpa(double cgpa) {

        if (cgpa < 0.0) this.cgpa = 0.0;
        else if (cgpa > 4.0) this.cgpa = 4.0;
        else this.cgpa = cgpa;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public double getCgpa() {
        return this.cgpa;
    }
}


class BankAccount {
    private String accountHolder;
    private String accountNumber; 
    private double balance;

    // Setters
    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            this.accountHolder = "Unknown";
        } else {
            this.accountHolder = accountHolder.trim();
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null) {
            this.accountNumber = "0000";
        } else {
            this.accountNumber = accountNumber.trim();
        }
    }

    public void setBalance(double balance) {
      
        if (balance < 0) this.balance = 0.0;
        else this.balance = balance;
    }

 
    public String getAccountHolder() {
        return this.accountHolder;
    }

 
    private String getMaskedAccountNumber() {
        if (accountNumber == null) return "N/A";
        int len = accountNumber.length();
        if (len <= 4) return accountNumber; // nothing to mask
        String last4 = accountNumber.substring(len - 4);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len - 4; i++) sb.append('*');
        sb.append(last4);
        return sb.toString();
    }
    public void showAccountInfo() {
        System.out.println("Account Holder : " + getAccountHolder());
        System.out.println("Account Number : " + getMaskedAccountNumber());
        System.out.printf("Balance        : %.2f%n", this.balance);
    }
}
