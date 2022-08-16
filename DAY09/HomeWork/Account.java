public class Account implements IAccount {
    private String name;
    private int accountNumber;
    private String email;
    private int accountBalance;

   
    public Account(String name, int accountNumber, String email, int accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public void changeEmail(String email) {
        // TODO Auto-generated method stub
        this.email = email;

    }
    public String getEmail() {
        return this.email;
    }

    @Override
    public void displayInfo(Account account) {
        // TODO Auto-generated method stub
        System.out.println(account.toString());
    }

    @Override
    public void recharge(double amount) {
        // TODO Auto-generated method stub
        this.accountBalance += amount;
    }

    public String toString() {
        String text = "Account name: " + this.name + " | Account Number: " + this.accountNumber + " | email: " + this.email
                + " | Account Balance " + this.accountBalance;
                return text;
    }

  

}
