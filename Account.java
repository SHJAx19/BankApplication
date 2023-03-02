import java.util.Scanner;

public class Account {

    double balance;
    double prevTrans;
    String customerName;
    String customerId;

    Account(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerId = customerID;

    }

    void deopsit(double amount) {
        if (amount != 0) {
            balance += amount;
            prevTrans = amount;
        }
    }

    void withDraw(double amt) {
        if (amt != 0 && balance >= amt) {
            balance -= amt;
            prevTrans = -amt;
        } else if (balance < amt) {

            System.out.println("Bank balance insufficient");

        }

    }

    void getPreviousTrans() {
        if (prevTrans > 0) {
            System.out.println("Deposited :" + prevTrans);
        } else if (balance < 0) {
            System.out.println("Deposited:" + Math.abs(prevTrans));
        } else {
            System.out.println("No transaction Occured");
        }
    }

    void menu() {
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID: " + customerId);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit amount ");
        System.out.println("c) Withdraw amount");
        System.out.println("d) Previous transaction");
        System.out.println("e) Exit");

        do {
            System.out.println("-----------------------------------");
            System.out.println("Choose an option");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'a':
                    System.out.println("..........................");
                    System.out.println("Balance = " + balance);
                    System.out.println("..........................");
                    System.out.println("\n");
                    break;

                case 'b':
                    System.out.println("..........................");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("..........................");
                    double amt = sc.nextDouble();
                    deopsit(amt);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("..........................");
                    System.out.println("Enter the amount to withdraw: ");
                    System.out.println("..........................");
                    double amtW = sc.nextDouble();
                    withDraw(amtW);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("..........................");
                    System.out.println("Previous Transaction:");
                    getPreviousTrans();
                    System.out.println("..........................");
                    System.out.println("\n");
                    break;
                case 'e':
                    System.out.println("..........................");
                    break;
                default:
                    System.out.println("Choose a correct Option to proceed");
                    break;

            }

        } while (option != 'e');
        System.out.println("Thank you for using our services.");
        System.out.println("SHJA AZIMI");

    }

}
