package Day03_VariablesContinue;
 // Salary, total tax, and salary after tax
public class SalaryCalculator {
    public static void main(String[] args) {
    double hourlyRate = 55;
    double StateTaxRate = 0.04; // salary * StateTax
    double FederalTaxRate = 0.22; // salary * FederalTax
    byte WeeklyHours = 40;
    byte WeeksIn1Year = 52;
    double Salary = hourlyRate*WeeklyHours*WeeksIn1Year; // Gross income
        // State tax
        double StateTax = StateTaxRate * Salary;
        // Federal Tax
        double FederalTax = FederalTaxRate * Salary;
        // Salary After Taxes
        double SalaryAfterTax = Salary - (StateTax + FederalTax);

        System.out.println("Your Salary is: " + Salary);
        System.out.println("Your state tax is: "+StateTax);
        System.out.println("Your Federal tax is: "+FederalTax);
        System.out.println("Total tax is: "+SalaryAfterTax);











    }
}
