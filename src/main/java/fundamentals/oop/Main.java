package fundamentals.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("Type account: " + bankAccount.getAccountType());
        System.out.println("Currency: " + bankAccount.getCurrency());
        //case 1: give bank account to the client from outside (created outside)
        Client client1 = new Client("Larisa", "111111111", bankAccount);
        System.out.println(client1.tostring());

        client1.getBankAccount().addMoney(12);
        client1.getBankAccount().withdrawMoney(13);
        System.out.println(client1.tostring());
        client1.getBankAccount().setAccountType("SPENDING");
        client1.getBankAccount().addMoney(1);

        double x = BankAccount.convertMoneyToCurrency(10,"EUR","USD");
        System.out.println(BankAccount.convertMoneyToCurrency(10,"EUR","USD"));
        System.out.println(x);


        BankAccount bankAccount1 = new BankAccount("SAVING","USD");
        BankAccount bankAccount2 = new BankAccount("SPENDING","USD");
        BankAccount[] myArray = {bankAccount1,bankAccount2};
        client1.setBankAccounts(myArray);
        System.out.println(myArray[0]);

        System.out.println(client1.getBankAccounts()[0] + "Prima varianta - eficienta");   //citesc prima pozitie din arrayul de bankaccounts

        BankAccount[] clientBankAccounts = client1.getBankAccounts();
        System.out.println(clientBankAccounts[0] + " A doua varianta - mai putin eficienta");
        System.out.println(client1);

/*        System.out.println("input client's name: ");
        String name = scanner.next();
        System.out.println("input client's cnp: ");
        String cnp = scanner.next();
        //case 2: clinet has asigned by default a default bank account - crete the bank account inside th constructor
        Client client2 = new Client(name,cnp);
        System.out.println(client2.tostring());*/

    }
}
