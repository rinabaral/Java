import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
    String name = in.next();
        System.out.println("Enter your id:");
    String id = in.next();
    BankAccount myAccount = new BankAccount(name, id);
    myAccount.showMenu();
    }
}
class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid){
      customerName = cname;
      customerId = cid;
    }

    void deposit(int amount){
        if(amount !=  0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withDraw(int amount){
        if (amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction > 0 ){
            System.out.println("Deposited :" + previousTransaction);
        }
        else if (previousTransaction < 0 ){
            System.out.println("Withdrawn :" + Math.abs(previousTransaction));
        }
        else {
            System.out.println("No Transaction occured");
        }
    }

    void showMenu(){

        char options = '\0';

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome "+ customerName);
        System.out.println("Your ID is "+ customerId);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("=======================");
            System.out.println("Enter an option:");
            System.out.println("=======================");
            options = input.next().charAt(0);
            System.out.println("\n");

        switch (options){

            case 'A':
                System.out.println("---------------------");
                System.out.println("Balance = "+balance);
                System.out.println("----------------------");
                break;
            case 'G':
                System.out.println("---------------------");
                System.out.println("Enter an amount to deposit");
                System.out.println("----------------------");
                int amount  = input.nextInt();
                deposit(amount);
                System.out.println("\n");
                break;
            case 'C':
                System.out.println("---------------------");
                System.out.println("Enter an amount to withdraw = ");
                System.out.println("----------------------");
                int amount2 = input.nextInt();
                withDraw(amount2);
                System.out.println("\n");
                break;
            case 'D':
                System.out.println("---------------------");
                getPreviousTransaction();
                System.out.println("----------------------");
                System.out.println("\n");
                break;
            default:
                System.out.println("Invalid option!! Please enter again");
        }
        } while (options != 'E');

        System.out.println("Thank you for using our services");

        }
}