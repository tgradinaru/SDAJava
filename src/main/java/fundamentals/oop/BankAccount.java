package fundamentals.oop;

/**
 * BankAccount which is consists of:
 * constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized
 * with 0 in the constructor)
 * fields: type of the account (SAVING or SPENDING),  balance ( the amount of money), currency ( USD, EUR),
 * methods:
 * addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs
 * to be bigger than 10% of balance otherwise print a suggestive  error message)
 * withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance can not
 * be < 0 otherwise print a suggestive  error message ),
 * covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and returns
 * the result = the money in the input currency)
 */
public class BankAccount {   /// ALT+Insert construieste automat Setter si Getter
    /**
     * Type of the account SAVING or SPENDING
     */
    private String accountType;
    /**
     * Balance of the account
     */
    private double balance;
    /**
     * Currency USD or EUR
     */
    private String currency;        // USD / EUR
    public final static double USD_TO_EUR = 0.85;
    public final static double EUR_TO_USD = 1.25;

    public BankAccount(String type, String currency) {           // 1st Constructor
        this.accountType = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {                                       // 2nd Constructor
        this.accountType = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    //addMoney ( adds money to the balance, -
    // if the account is of type SPENDING the amount of money that is added needs
    //to be bigger than 10% of balance otherwise print a suggestive  error message)
    public void addMoney(double newMoney) {
        if (this.accountType == "SPENDING" && newMoney <= this.balance / 10) {
            System.out.println("Please add at least 10% of actual balance, more than " + this.balance / 10 + " "
                    + this.currency);
            return;
        }
        this.balance += newMoney;
        System.out.println("Your new balance is: " + this.balance + " " + this.currency);
    }

    /**
     * withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance
     * can not be < 0 otherwise print a suggestive  error message )
     */
    public void withdrawMoney(double newMoney) {
        if (this.accountType == "SAVING" && this.balance - newMoney < 0) {
            System.out.println("Your balance can't be negative!");
            return;
        }
        this.balance -= newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    /**
     * convertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert
     * to and returns the result = the money in the input currency)
     */
    public static double convertMoneyToCurrency(double amountOfMoney, String inputCurrency, String outputCurrency) {
        if (inputCurrency.equals("EUR") && outputCurrency.equals("USD")) {
            return amountOfMoney * EUR_TO_USD;
        }
        return amountOfMoney * USD_TO_EUR;
    }

    /**
     * @return
     */

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }


    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * Get the balance of the account
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }


    public String getCurrency() { //CTRL-Click ne duce direct la metoda
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
