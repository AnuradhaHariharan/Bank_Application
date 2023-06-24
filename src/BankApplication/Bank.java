package BankApplication;

public interface Bank {
    public String checkBalance(String password);
    public String AddMoney(int amount,String password);
    public String withdrawMoney(int amount,String password);
    public void displayAccDetails();
    public double calculateInterest(int years);

}
