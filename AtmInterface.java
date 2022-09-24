import java.util.Scanner;
public class AtmInterface {

    public static void login() {

        long userid = 123456789;
        int userpin = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your userid");
        int a = sc.nextInt();
        System.out.println("Enter your userpin");
        int b = sc.nextInt();
        if (a != userid || b != userpin) {
            System.out.println("You entered wrong information. Try again.");
            System.exit(0);
        } else {
            System.out.println("******** WELCOME TO SK ATM ********");
        }
    }

    public static void withdraw(){
        float balance = 10000f;
        System.out.println("Enter the amount ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if (amount<=balance){
            balance=balance-amount;
            System.out.println("Take your cash...");
            System.out.println("Your available balance is : "+ balance);

        }else {
            System.out.println("Insufficient balance ");
        }
    }
    public static void deposit(){
        float balance = 10000f;
        System.out.println("Enter amount to deposit");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Your available balance is : " + balance);
    }
    public static void transfer(){
        float balance = 10000f;
        System.out.println("Enter the receiver account number : ");
        Scanner sc = new Scanner(System.in);
        int accno = sc.nextInt();
        System.out.println("Enter the IFSC code : ");
        String ifsc =sc.next() ;
        System.out.println("Enter the amount : ");
        int amount = sc.nextInt();
        System.out.println("Enter recipient name : ");
        String name = sc.next();
        if (amount>balance){
            System.out.println("Insufficient balance....");

        } else {
            System.out.println("Money transferred successfully....");
        }

    }



    public static void main(String args[]){
        login();
        System.out.println("Enter your choice");
        System.out.println("1.Withdraw  2.Deposit  3.Transfer  4.Quit  ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice==1){
            withdraw();
        }
        else if (choice==2) {
            deposit();
        }
        else if (choice==3) {
            transfer();
        }
        else if(choice==4){
            System.out.println("Visit again...");
        }

    }
    }




