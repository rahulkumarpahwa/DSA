package OOPS;

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pass) {
        password = pass;
    }

    public String getPassword() {
        return password;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setPassword("Apple");
        System.out.println(b.getPassword());
    }
}
