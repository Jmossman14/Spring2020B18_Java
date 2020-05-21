package TeamMeetings;
/*
. Create a class called calculator, write a program that can calculate the taxt,
 and salary after tax based on the hourly rate & tax rates
   ex:
      if:
         rate = 55;
         stateTax = 0.04;
         federalTax =0.22;
         weeklyHours = 40;
         also let's find the hourly rate
      then output will be:
         your salary is: 105600 USD
         your total tax is: 27456 USD
         your income after tax is: 78144 USD
      if:
         rate = 45.25;
         stateTax =0.045;
         federalTax = 0.25;
         weeklyHours = 45;
      then output will be:
         your salary is: 91260 USD
         your total tax is: 26921.7
         your income after tax: 64338.3 USD
   2.      write a program that can calculate the salary after tax
              needed information:
              employee' salary
              state tax
              federal tax
   3.  Add a scanner to call for these variables: yearly salary, weekly hours,
       state and fed tax rate
               ask user:
                  enter salary
                  enter full name
                  enter company name
                  enter SSN
                  enter job title
                  In the printout -> show all the above + hourly rate
       4. write a program that can calculate the two numbers based on the user provided operators, the program will ask:
            1. enter first number
            2. enter the second number
            3. enter the math operators
                  (assume that only the +, -, *, /, and % will be entered)
            then the system will give the result based on the operator
            at the end it will ask if the user want's to calculate another numbers, if user
            entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
                  (you will need a lop that has true condition without the iterator)
5. nested loop calculator:
                After calculating the above ask user if he/she wants to continue
                    if yes, then repeat all the above steps
                    if no, then exit the program
                    if user enters something other than yes or no, then give an "invalid entry, try again" prompt
6. The LameCalculator class has instance methods that can do simple math operations on two numbers.
          the methods are: plus, minus, multiply and divide .
          all the methods get two ints then the method does the required math operation and returns the result as an int.
          for example:
          LameCalculator lc = new LameCalculator();
          lc.plus(1,1)
          returns:2
          lc.minus(1,1)
          returns:0
          lc.multiply(2,1)
          returns:2
          lc.divide(10,2)
          returns:5
7.   Write your code inside the method.
              Use the values given as method parameters.
              Assign final values.
              Then user should select service quality that will correspond to tip percent.
              Poor = 5%
              Fair = 10%
              Good = 15%
              Great = 20%
              Excellent = 25%
              The program should display the following information based on the user input:
              Split or No split
              Number of people entered: &&&&
              Service Quality:
              Total to pay:
              Total tip:
              Total per person:
              Tip per person:
              https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
      8.  Calculator method:
          write a method called Calculation, that can accepts 3 parameters:
          2 numbers and one operator, and prints out the calculation
          if operator is not between [-, +, *, /, %] output should be Invalid Operator
          Ex: calculate(10, 2, "*") ==> 20;
      9. Calculator and constructors
          Create class called SalaryCalculator
          instance variables:
              hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
          add a constructor can initialize those fields
          instance methods:
              salary(): returns the total salary as double (hourlyRate * weeklyHours * 48)
              salaryAftertax(): returns the salary after tax as double (salary - stateTax - federalTax)
              stateTax(): returns the total state tax as double (salary * stateTaxRate)
              federalTax(): returns the total federal tax as double (salary * federalTaxRate)
              toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
      10.  The LameCalculator class has instance methods that can do simple math operations on two numbers.
          the methods are: plus, minus, multiply and divide .
          all the methods get two ints then the method does the required math operation and returns the result as an int.
          for example:
          LameCalculator lc = new LameCalculator();
          lc.plus(1,1)
          returns:2
          lc.minus(1,1)
          returns:0
          lc.multiply(2,1)
          returns:2
          lc.divide(10,2)
          returns:5
      11. A pizza delivery men has a scooter an a lot of deliveries to make, he will have
          to refuel a few times.
          refuel_times gets an arraylist deliveries of the amount of fuel it will take to
          get to destinations like:
          [1,3,5], first place will take 1 fuel unit to get to second 3 fuel units etc...
          the max_fuel is the max fuel units in the vehicle fuel tank.
          you will need to returns how meany refuels it will take to do all deliveries
          (if the units are bigger then the tank he will refuel along the way in a gas station).
          for example:
          refuel_times([7,7,7],7)
          returns:3 (3 fuel stops 7 units each delivery)
          refuel_times([9,1],3)
          returns:4 (3 fuel stops for first delivery and +1 stop for second)
          refuel_times([100,200,10],10)
          returns:31
      12. This assignment is about another calculator class.
      this time we will calculate two attributes x and y and put the result in an attribute named result.
          x, y and results are all private attributes of int type.
          3 Instance variables:
            1) names: x, y, result
                type: int
                Visibility/Access modifier: private
          Instance Methods:
             - getResult() - getter method for private result
             - setY(int y) - setter method for private y
             - setX(int x) - setter method for private x
           -  void plus() - adds x and y (x+y) values and assigns to result
             - void minus() - subtracts x and y(x-y) values and assigns to result
          example:
            Calc a = new Calc();
            a.setX(10);
            a.setY(5);
            a.minus();
            System.out.println(a.getResult());
            prints: 5
            a.plus();
            System.out.println(a.getResult());
            prints: 15
 */
import java.util.Scanner; // imports scanner
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your annual salary");
        int annualSal = input.nextInt();

        System.out.println("Please enter your full name");
        String FullName = input.next();

        System.out.println("Please enter your company name");
        String companyName = input.nextLine();

        System.out.println("Please enter your SSN");
        long SSN = input.nextLong();

        System.out.println("Please enter your job title");
        String jobTitle = input.nextLine();

        System.out.println("Please enter your state tax rate in decimal format");
        double stateTax = input.nextDouble();

        System.out.println("Please enter your fed tax rate in decimal format");
        double fedTax = input.nextDouble();

       /* int HourlyRate = 55;
        double stateTax = 0.04;
        double fedTax = 0.22;
        int weeklyHours = 40;

        int annualSal = (HourlyRate * weeklyHours) * 48; // 48 hours per year
*/
        System.out.println(annualSal);

        /*double totalStateTax = annualSal * stateTax ;
        double totalFedTax = annualSal * FedTax;
        System.out.println((int)totalFedTax); // cast to (int) to change from a double to a whole #
        System.out.println((int)totalStateTax);// cast to (int) to change from a double to a whole #

        int incomeAfterTax = annualSal - (int)totalFedTax - (int)totalStateTax;
        System.out.println(incomeAfterTax);

        System.out.println("Your total annual salary: $"+annualSal+"\nTotal Federal tax: $"+totalFedTax+"\nYour Total State Tax: $"+totalStateTax+"\nTotal Salary after taxes: $"+incomeAfterTax);

*/








    }
}
