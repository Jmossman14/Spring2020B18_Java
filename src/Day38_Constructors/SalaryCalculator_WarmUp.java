package Day38_Constructors;
/*
Task03:
    step 1:Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            step2: add a constructor can initialize those fields

            step3: instance methods:
                - salary(): returns the total salary as double

                - stateTax(): retuns the total state tax as double

                - federalTax(): retuns the total federal tax as double

                - salaryAftertax(): retuns the salary after tax as double

                - info as calculated by salary()

           step4:
            - toString(): returns the hourlyRate, weeklyHours and salary
 */
public class SalaryCalculator_WarmUp {
    // create instance variables:
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;


    // add a constructor that will hold 4 parameters based on the 4 instance variables:
    // use this. to call the instance variable through the parameter
    // use the class Name (SalaryCalculator_WarmUp) as the constructorName:
    public SalaryCalculator_WarmUp(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate){
    this.hourlyRate = hourlyRate;
    this.weeklyHours = weeklyHours;
    this.stateTaxRate = stateTaxRate;
    this.federalTaxRate = federalTaxRate;
    }

    //create an instance method that will calculate  salary(): returns the total salary as double :
    // use RETURN to get the method to calculate the salary
    public double salary(){
        return hourlyRate * weeklyHours * 48; // 48 is the amount of WORKING weeks per year
    }

    //create an instance method that will calculate stateTax(): retuns the total state tax as double:
    // use RETURN to get the method to calculate stateTax
    public double stateTax(){
        return salary() * stateTaxRate; // takes salary METHOD * the stateTaxRate INSTANCE
    }

    //create an instance method that will calculate federalTax(): retuns the total federal tax as double
    // use RETURN to get the method to calculate federalTax
    public double FederalTax(){
        return salary() * federalTaxRate;// takes salary METHOD * the FederalTaxRate INSTANCE
    }

    //create an instance method that will calculate salaryAftertax(): retuns the salary after tax as double
    // use RETURN to get the method to calculate salaryAftertax
    public double salaryAfterTax(){
        return salary() - ( stateTax() - FederalTax() ); //takes salary METHOD - state METHOD -  federal METHOD
    }

    //create a toString method to print out objects:
    public String toString(){
       return "Hourly rate is: "+hourlyRate+
               "\nWeekly Hours: "+weeklyHours+
               "\nGross Salary: "+salary()+
               "\nState Tax: "+stateTaxRate+
               "\nFederal Tax: "+federalTaxRate+
               "Net Salary: $"+salaryAfterTax();

    }

}
