package Day41_Inheritance.Task2;
/*
create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
 */

public class SavingsAccount extends BankAccount{
    /*
    accountNumber (Inherited)
    accountHolder (Inherited)
    balance (Inherited)
    interestRate
    deposit (Inherited)
    showBalance (Inherited)
    toString (Inherited)
     */

    public static double interestRate;

    static{
        interestRate = 0.02;
    }






}