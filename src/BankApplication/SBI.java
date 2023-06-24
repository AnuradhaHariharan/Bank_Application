package BankApplication;

import java.util.UUID;

public class SBI implements Bank{

    String accNo;
    String password;
    int balance;
    String name;
    float interestRAte= (float) 6.6;
    public SBI(int balance, String name,String password) {
        accNo= UUID.randomUUID().toString();
        this.password = password;
        this.balance=balance;
        this.name=name;
    }

    @Override
    public String checkBalance(String password) {
        if (this.password.equals(password)) {
            return "Remaining balance in your Account: "+balance;
        } else {
            return "Incorrect password:";
        }
    }

    @Override
    public String AddMoney(int amount, String passwordEntered) {
       if(this.password.equals(passwordEntered)){
           this.balance=this.balance+amount;
           return "Money Successfully added.Available Balance : "+balance;
       }
        String s = "password incorrect.Try again.";
        return s;
       }


    @Override
    public String withdrawMoney(int amount, String password) {
        if(this.password.equals(password)){
            if(this.balance>amount){
                balance=balance-amount;
                return "Amount has been debited.Availble balance: "+balance;
            }else{
                return "Insufficient balance";
            }
        }return "Incorrect password.please try again.";
    }

    @Override
    public void displayAccDetails() {
       System.out.println("Account Holder Name: "+name);
       System.out.println("Account No: "+accNo);
        System.out.println("Available Balance: "+balance);
    }

    @Override
    public double calculateInterest(int years) {
         double interest=balance*interestRAte*years/100;
         return interest;
    }
}
