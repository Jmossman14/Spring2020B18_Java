package Day41_Inheritance;

public class BankOfAmericaObjects
{
    public static void main(String[] args) {
        //  must use the parameters from the constructor (firstName /lastName
        WarmUp_BankAccount acct1 = new WarmUp_BankAccount("Judy","Mossman");
        //to change private -> public use GETTER to getAccountHolder
        System.out.println(acct1.getAccountHolder());
        System.out.println(acct1.getAccountNumber());
        System.out.println(acct1.getBalance());

        acct1.getBalance();//checks original balance
        acct1.deopsiting(120);//adds $120
        acct1.withdraw(10);//subtracts $10
        acct1.getBalance();// checks current balance
        System.out.println(acct1);
    }
}
