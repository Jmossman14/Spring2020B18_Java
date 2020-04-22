package Day09_NestedIf_Ternary;

public class WarmUp_MultiBranch {
    public static void main(String[] args) {
        //write a program that can define the age groups of a person
        //             age groups are:
        // can use String agegroups = " "; instead of SOUT
        int a=25;
        String ageGroup = " ";
        if(a < 3 && a > 0){
            ageGroup = "baby"; //   System.out.println("baby");
        }
        else if(a>=3 && a<=5){
            ageGroup = "toddler";  //     System.out.println("toddler");
        }
        else if(a>=6 && a<=9){
            ageGroup = "kid"; // System.out.println("kid");
        }
        else if(a>=10 && a<=12){
            ageGroup = "Pre-teen"; // System.out.println("Pre-teen");
        }
        else if(a>=13 && a<=17){
            ageGroup = "Teenager"; // System.out.println("Teenager: "+a);
        }
        else if(a>=18 && a<=20){
            ageGroup = "Young Adult"; // System.out.println("Young Adult");
        }
        else if(a>=21 && a<=39){
            ageGroup = "Adult";  // System.out.println("Adult");
        }
        else if(a>=40 && a<=49){
            ageGroup = "Young Middle-Aged Adult";
        }                       //System.out.println("Young Middle-Aged Adult")
        else if(a>=50 && a<=54){
            ageGroup = "Middle-Aged Adult"; // System.out.println("Middle-Aged Adult");
        }
        else if(a>=55 && a<=64) {
            ageGroup = "Very Young Senior Citizen";
        }// System.out.println("Very Young Senior Citizen");
        else if(a>=65 && a<=74) {
            ageGroup = "Young Senior Citizen"; //
        }// System.out.println("Young Senior Citizen");
        else if(a>=75 && a<=84) {
            ageGroup = "Senior Citizen"; //System.out.println("Senior Citizen")
        }
        else if(a>=85 && a<= 150){
            ageGroup = "Old senior Citizens"; // System.out.println("Old Senior Citizen");
        }
        else{
            ageGroup = "Invalid Entry"; // System.out.println("age invalid);
                 }
        System.out.println(ageGroup);

// using above variables to see who is eligable to buy alcohol by AGE GROUP
        boolean eligableToBuyAlcohol = ageGroup =="Adult" || ageGroup =="Young Middle-Aged Adult" ||
                ageGroup == "Middle-Aged Adult";
        if(eligableToBuyAlcohol){
            System.out.println("You are eligable");
        }
        else {
            System.out.println("You are not eligable");
        }


    }
}
