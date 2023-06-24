package BankApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome   to   State   Bank   of   India");
        SBI user1 = new SBI(10000,"Adil","123");
        boolean exit=true;
        while(exit!=false){
           // SBI user1 = new SBI(10000,"Adil","123");
            System.out.println();
                System.out.println("Please   Select  An  option");
                System.out.println("3. View Balance");
                System.out.println("4. Add money to bank account");
                System.out.println("5. Withdraw money from to Bank Account");
                System.out.println("6.Calculate Fixed Deposit Interest");
                System.out.println("7.View Account Details");
                System.out.println("8.Exit");
                //Scanner sc=new Scanner(System.in);
                int n = sc.nextInt();
               // System.out.println("Please enter your Account password");
                switch(n){
            //SBI user1 = new SBI(balancee,namee,passs);
            case 3:
                System.out.println("Please enter your Account password");
                String password=sc.next();
                 String ans= user1.checkBalance(password);
                System.out.println(ans);
            break;
            case 4:
                System.out.println("Please enter your Account password");
               String passcode=sc.next();
               String ans1=user1.AddMoney(5000,passcode);
               System.out.println(ans1);
               break;
            case 5://withdraw money
                System.out.println("Please enter your Account password");
                String pass=sc.next();
                String ans2=user1.withdrawMoney(5000,pass);
                System.out.println(ans2);
                break;
            case 6: //interest
                System.out.println(user1.calculateInterest(5));
                break;
           case 7: //account details
                user1.displayAccDetails();
                break;
            case 8://exit
                exit=false;
                System.out.println("Thank you for choosing SBI");
                System.out.println("Have a great day!!!");
                break;
        }
    }}
}