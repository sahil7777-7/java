package app;
import java.util.*;


public class Main {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("\nWelcome the console bank\n");
            System.out.println("1) open bank account");
            System.out.println("2) Deposit money");
            System.out.println("3) Withdraw money");
            System.out.println("4) Transfer money");
            System.out.println("5) Account statement");
            System.out.println("6) List accounts");
            System.out.println("7) Search account by customer name");
            System.out.println("8) Exit");


            Scanner scanner = new Scanner(System.in);
            System.out.print("\n\nChoice: ");
            int a = scanner.nextInt();
            scanner.nextLine();
            if(a==8){
                run=false;
            }
            if(a==1){
                System.out.print("What is your name: ");
                String name=scanner.nextLine();
                System.out.print("your age: ");
                int age=scanner.nextInt();
                scanner.nextLine();
                System.out.print("Your email: ");
                String email=scanner.nextLine();
                System.out.print("Your phone number: ");
                int number=scanner.nextInt();
                scanner.nextLine();
                Account a1=new Account(name,age,email,number);
                accounts.add(a1);
                System.out.println("\n\n");
                System.out.println("Hey "+name+" Welcome to java bank your Account number is "+a1.accNo);
                System.out.println("\n1) Menu\n2) Exit");
                System.out.print("Choice: ");
                int op=scanner.nextInt();
                scanner.nextLine();
                if(op==2){
                    return;
                }


            }
            if(a==6){
                if (accounts.isEmpty()) {
                    System.out.println("\nNo accounts found.");
                    return;
                }

                for (Account b : accounts) {
                    b.printifo();
                    System.out.println();
                }
            }
            if(a==2){
                System.out.print("What is your account no: ");
                long acc_no=scanner.nextInt();
                scanner.nextLine();

            }


        }
    }
}