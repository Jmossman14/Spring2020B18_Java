package Day02_Variables;

public class EmployeeInfo_Variables {
    public static void main(String[] args) {

        /* DATA TYPE / VARIABLE NAME = DATE */

        String CompanyName = "ABC CO";
        String EmployeeName = "Judy Mossman";
        int EmployeeID = 123456;
        String JobTitle = "SDET";
        double Salary = 150000.55;
        long SSN = 123456789;

        //BELOW SHOWS EXAMPLE OF THE USE OF MULTIPLE SOUT//
        System.out.println("Employee Name:"+EmployeeName);
        System.out.println("Company Name:"+CompanyName);
        System.out.println("Employer ID:"+EmployeeID);
        System.out.println("Job Title:"+JobTitle);
        System.out.println("Salary:"+Salary);
        System.out.println("Social Security #:" + SSN);

        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("=======================================");

        /*BELOW IS USING ESCAPE SEQUENCE (\n) IN ORDER TO DO THE SAME AS ABOVE
        WITHOUT HAVING TO DO MULTIPLE SOUT*/
        System.out.println("Employer Name:"+EmployeeName+"\nCompany Name:"+CompanyName+"\nEmployer ID:"+ EmployeeID+"" +
                "\nJob Title:"+JobTitle+"\nSalary:"+ Salary+"\nSocial Security #:"+ SSN);

        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("=======================================");
        System.out.println("=======================================");


    }


}
