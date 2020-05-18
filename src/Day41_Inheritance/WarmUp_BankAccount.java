package Day41_Inheritance;

public class WarmUp_BankAccount {
    /*
    create costum
     class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				available balance
	 				toString: returns the full name and balance
     */

    //public variables:
    static String bankName = "BOA"; // static so this information doesnt change
    public String firstName;
    public String lastName;


    //private variables:
    private String accountHolder;
    private long accountNumber;
    private long balance;

    //create a constructor that can initialize firstName and fullName
    public WarmUp_BankAccount(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName = lastName;
        this.accountHolder = firstName+" "+lastName; // does not need to be SET since it was initialized here

    }

    // encapsulate all the private data
    // getter: Can getter be static? NO, must be DATA TYPE and use return in statmenet
    // setter: use VOID and add parameters
    public String getAccountHolder(){ // use both parameters since accountHolder will
        return accountHolder;
    }
    public void setAccountHolder(String firstName, String lastName){
        this.accountHolder = firstName+" "+lastName; // does not need to be SET since it was initialized here
    }

    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(){
        this.accountNumber = accountNumber;
    }


    public long getBalance(){
        return balance;
    }
    public void setBalance( long balance){
        this.balance = balance;
    }

    /*action: - create an instance method
            depositing
            withdrawing
            available balance*/

    //deposit: increase the balance
    public void  deopsiting(long deposit){
        setBalance(balance+deposit);
    }

    public void  withdraw(long withdraw){
       setBalance(balance-withdraw);
    }

    public void  availableBalance(double availableBalance){
        System.out.println("Available Balance: "+getBalance());
    }


    //toString
    public String toString(){
        return "Name: "+accountHolder+"\nBalance: "+balance;
    }

}
