package Day38_Constructors;
/*
test the functions of SalaryCalculator_WarmUp
 */
public class SalaryObject_WarmUp {
    public static void main(String[] args) {
        //create 1st object using the constructor name:
        SalaryCalculator_WarmUp salary1 = new SalaryCalculator_WarmUp(60,40,8.25/100,16/100);

        System.out.println(salary1.salary() ); // will print out the salary before taxes taken out
        System.out.println(salary1); // outputs all information from the object

        // create 2nd object using the constructor name:
        SalaryCalculator_WarmUp salary2 = new SalaryCalculator_WarmUp(55,40,6.5/100,18/100);

        System.out.println(salary2.salary() ); // will print out the salary before taxes taken out
        System.out.println(salary2); // outputs all information from the object

    }
}
