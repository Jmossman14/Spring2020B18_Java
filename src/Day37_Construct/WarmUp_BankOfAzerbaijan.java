package Day37_Construct;

import java.util.ArrayList;

/*
3. create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info3. create class called BankOfAzerbaijan
		in the main method:
				1. create a List of Employees
				2. add random two employees from HumanResources to the List
				3. use for each loop to print out the employee info
 */
public class WarmUp_BankOfAzerbaijan {
    public static void main(String[] args) {
        // creates an arrayList to hold the employee information
        ArrayList<WarmUp_Employee> list = new ArrayList<>();
        // list.add will add each employee created on HumanResources to arrayList
        list.add(WarmUp_HumanResources.employee1);

    }


}
