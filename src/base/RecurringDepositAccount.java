package base;

public class RecurringDepositAccount extends BankAccount{

    private  String closingDate;
    private  double duration;

    public RecurringDepositAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, double totalBalance,
                                   double avilableBalance, double rateOfIntrest, String closingDate, double duration) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, totalBalance, avilableBalance, rateOfIntrest);
        this.closingDate = closingDate;
        this.duration = duration;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    public void display(){

        System.out.println("            Details of Recurring Account");
        System.out.println("Avialble Balance = "+getAvilableBalance());
        System.out.println("Account Number = "+getAccountNumber());
        System.out.println("Account Opening Date = "+getAccountOpeningDate());
        System.out.println("Total Balance = "+getTotalBalance());
        System.out.println("Mode Of Operation = "+getModeOfOperation());
        System.out.println("Rate of Intrest = "+getRateOfIntrest());
        System.out.println("Closing Date = "+getClosingDate());
        System.out.println("Duration = "+getDuration());

    }
}
