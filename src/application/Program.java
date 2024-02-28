package application;

import entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter account number: ");
            int number = sc.nextInt();

            System.out.print("Enter account holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Is there an initial deposit (y/n)? ");
            char isThereAnInitialDeposit = sc.next().charAt(0);

            Account account;

            if (isThereAnInitialDeposit == 'y') {

                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                account = new Account(number, holder, initialDeposit);

            } else {

                account = new Account(number, holder);

            }

            System.out.println();

            System.out.println("Account data:");
            System.out.println(account);

            System.out.println();

            System.out.print("Enter a deposit value: ");
            account.Deposit(sc.nextDouble());

            System.out.println("Updated account data:");
            System.out.println(account);

            System.out.println();

            System.out.print("Enter a withdraw value: ");
            account.Withdraw(sc.nextDouble());

            System.out.println("Updated account data:");
            System.out.println(account);
        }
    }
}