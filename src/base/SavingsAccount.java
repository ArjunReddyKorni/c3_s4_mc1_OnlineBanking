package base;

public class SavingsAccount extends BankAccount {

    private double rateOfInterst;

    public SavingsAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking, double totalBalance,
                          double avilableBalance, double rateOfIntrest, double rateOfInterst) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, totalBalance, avilableBalance, rateOfIntrest);
        this.rateOfInterst = rateOfInterst;
    }

    public double getRateOfInterst() {
        return rateOfInterst;
    }

    public void setRateOfInterst(double rateOfInterst) {
        this.rateOfInterst = rateOfInterst;
    }

    public double deposit(int depositAmount){
        double response =0;
        response = getAvilableBalance()+depositAmount;
        setAvilableBalance(response);
        return getAvilableBalance();
    }

    public double withdraw(double withdrawAmount){

        if(getAvilableBalance() > withdrawAmount){
           double response = getAvilableBalance()-withdrawAmount;
           setAvilableBalance(response);
        }
        return getAvilableBalance();
    }
    public void display(){
        System.out.println("             Details of Savings Account ");
        System.out.println("Avialble Balance = "+getAvilableBalance());
        System.out.println("Account Number = "+getAccountNumber());
        System.out.println("Account Opening Date = "+getAccountOpeningDate());
        System.out.println("Total Balance = "+getTotalBalance());
        System.out.println("Mode Of Operation = "+getModeOfOperation());
        System.out.println("Rate of Intrest = "+getRateOfInterst());
        System.out.println("isInternetBanking = " + isInternetBanking());

    }

}
