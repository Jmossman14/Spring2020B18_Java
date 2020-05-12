package Day37_Construct;
/*
2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:
						1. initialize those static variables
						2. set all the info of the Employees

 */
public class WarmUp_HumanResources {
    // uses Static to call employee info from WarmUp_Employee where instance variables are created
    static WarmUp_Employee employee1 = new WarmUp_Employee();
    static WarmUp_Employee employee2 = new WarmUp_Employee();
    static WarmUp_Employee employee3 = new WarmUp_Employee();
    static WarmUp_Employee employee4 = new WarmUp_Employee();
    static WarmUp_Employee employee5 = new WarmUp_Employee();

    public static void main(String[] args) {
        // in order for methods to run in another class
        // initialize the information for employee 1 - 5 by using setEmployee() [ that was declared on WarmUp_Employee as the method ]
        employee1.setEmployee("Zuleyha",1254,45874641,"QA",110000,'F');
        employee2.setEmployee("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        employee3.setEmployee("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        employee4.setEmployee("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
        employee5.setEmployee("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');


        // prints the employee information, can also use loops to print
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

    }

    // must initialize the above variables in a STATIC block in order for it to run/use in another class
    // allows you to retrieve data and al the info will be stored in Static Block
    static{
        employee1.setEmployee("Zuleyha",1254,45874641,"QA",110000,'F');
        employee2.setEmployee("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        employee3.setEmployee("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        employee4.setEmployee("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
        employee5.setEmployee("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');


    }
}
