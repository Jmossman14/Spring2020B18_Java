package Day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass_SalaryCalculator_Practice {
    /* Task:
        Write a program that can calculate salary per hour based on yearly salary:

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Salary:");
        int Salary = input.nextInt();

        System.out.println("Enter your hours worked per week:");
        byte HoursPerWeek = input.nextByte();

        System.out.println("How many weeks do you work in a year:");
        byte WeeksPerYear = input.nextByte();

        int hourlyRate = ( Salary / WeeksPerYear ) / HoursPerWeek;
        // formula to get hourly rate

        System.out.println("Your hourly rate is: $" + hourlyRate);




    }
}
