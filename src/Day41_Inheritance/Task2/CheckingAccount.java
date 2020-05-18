package Day41_Inheritance.Task2;
/*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
 */

public class CheckingAccount extends BankAccount {

    /*
    accountNumber (Inherited)
    accountHolder (Inherited)
    balance (Inherited)
    deposit (Inherited)
    withDraw (declared)
    showBalance (Inherited)
    ToString (Inherited)
     */

    public void withdraw(int amount){
        Balance -= amount;
    }


}