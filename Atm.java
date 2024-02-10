import java.util.Scanner;

public class Atm {
    public static void main(String args[]) {
        int balance = 500000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to ICICI Bank ATM");
            System.out.println("Press 1 to Withdraw money!");
            System.out.println("Press 2 to Deposit money!");
            System.out.println("Press 3 to know your balance!");
            System.out.println("Press 4 to close the session!");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to be withdrawn:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash!");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Amount Successfully Deposited!");
                    break;
                case 3:
                    System.out.println("Current Balance:" + balance);
                    break;
                case 4:
                    System.exit(0);
                    sc.close();
            }
        }
    }
}
