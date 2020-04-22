package Day09_NestedIf_Ternary;

public class NestedIf_Practice2 {
     /*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */

    public static void main(String[] args) {
        int age = 5;
        String ageGroup = "";
        if(age > 0 && age < 150) {
            if(age < 21){
                ageGroup = "Teenager";
            }
            else if(age < 55){
                ageGroup = "Adult";
            }
            else {
                ageGroup = "Senior";
        }}else{
            System.out.println("Invalid age");
        }
        System.out.println(ageGroup);

        // NESTED IF W/ TERNARY
        int age2 = 45;
        String ageGroup2 = "";
        if(age > 0 && age < 150) // 1) STARTS OUT WITH PRE-CONDITION
        {                          // 2) TERNARY
            ageGroup2 = (age2 < 21) ? "Teenager" : (age2 < 55)? "Adult" : "Senior";

        }else{ // 3) OTHERWISE STATEMENT
            ageGroup2 = "Invalid Entry";
        }     // 4) SOUT
        System.out.println(ageGroup2);


    }


}
