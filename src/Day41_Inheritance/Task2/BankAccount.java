package Day41_Inheritance.Task2;

public class BankAccount {

    public long accountNum;
    public String accountHolder;
    public double Balance;

    public void deposit(int amount){
        Balance += amount;
    }

    public void showBalance(){
        System.out.println("Available Balance: "+Balance);
    }

    public String toString(){
        return "Name: "+accountHolder+", balance: "+Balance;
    }


}
