package base;

public class SavingsAccountImpl {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(123,"ds","asa",true,343,1000,34,34);
        System.out.println(savingsAccount.showAccountBalance());
        System.out.println(savingsAccount.deposit(200));
        System.out.println(savingsAccount.withdraw(500));
        System.out.println(savingsAccount.showAccountBalance());
    }
}
