package day11_ScannerContinue;

import java.util.Scanner;
/*
warmup task:
        1. Wash Your hands
        3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
 */
public class WarmUpScanner {
    public static void main(String[] args) {

       /* 2. write a program that can calculate the salary after tax
        needed informations:
        employee' salaray
        state tax
        federal tax */
       Scanner input = new Scanner(System.in); // scanner OBJECT

        System.out.println("Enter your Salary: "); //What you want user to input
        int Salary = input.nextInt();

        System.out.println("Enter the state tax rate: ");
        int StateTax = input.nextInt();
        double stateTaxPercentage = StateTax / 100.0;

        System.out.println("Enter the federal tax rate: ");
        int FedTax = input.nextInt();
        double fedTaxPercentage = FedTax / 100.0;

        double TotalTax = (fedTaxPercentage + stateTaxPercentage) * Salary;
        double SalaryAfterTax = (Salary - TotalTax);

        System.out.println("Your Salary after Tax is: "+SalaryAfterTax);



    }
}
