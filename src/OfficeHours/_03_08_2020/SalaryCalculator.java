package OfficeHours._03_08_2020;
/*Task 08:
        Create a class called salary calculator,
        write a program that can calculate the tax,
        and salary after tax based on the hourly rate & tax rates
*/
public class SalaryCalculator {
    public static void main(String[] args) {
        //hourly Rate = 55 @ 40 hours a week, yearly salary is 114,400//
        float StateTax = 0.04f;
        double FederalTax = 0.22;
        int Salary = 114400;
        System.out.println("Your total Salary is: "+Salary+" USD");
        // Add Federal taxes and State taxes to get total
        // and subtract sum of taxes from salary
        double SumofTaxes = StateTax + FederalTax;
        double TotalAfterTax = Salary * (1- SumofTaxes);
        System.out.println("Your income after tax is: "+TotalAfterTax+" USD");
        // total salary * total taxes to get how much taxes will be taken out
        double TotalTax = Salary *SumofTaxes;
        System.out.println("Your total tax is: "+TotalTax+" USD");

    }
}
