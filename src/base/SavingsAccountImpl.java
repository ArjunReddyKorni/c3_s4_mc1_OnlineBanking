package base;

public class SavingsAccountImpl {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(674538,"12-12-2020","Self Operation",true,4500,
                1000,2.5,6.5);
        RecurringDepositAccount recurringDepositAccount = new RecurringDepositAccount(7845634,"23-12-2022","Joint account",false,5000,
                3000,5.5,"12-23-2022",3.5);





        savingsAccount.display();
        recurringDepositAccount.display();

        System.out.println("Cheack Balance");
        System.out.println(savingsAccount.showAccountBalance());
        System.out.println("Deposit Amount");
        System.out.println(savingsAccount.deposit(200));
        System.out.println("WithDraw Amount");
        System.out.println(savingsAccount.withdraw(500));
        savingsAccount.display();
    }
}
