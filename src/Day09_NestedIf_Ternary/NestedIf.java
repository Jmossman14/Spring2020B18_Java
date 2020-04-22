package Day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        int age = 18;
        boolean Citizen = false; // Pre-condition, because you need this even if you were 18
        // IFs and ELSE need to be equal amount in code

                if(Citizen){
                    if(age > 17){
                        System.out.println("Eligible to vote");}
                        else{
                            System.out.println("You must be 18 or older to vote");}}
                        else{
                        System.out.println("Only US citizens can vote for Donald Trump");
                    }
        String grade = "";
        int score = 75;
                        if(score > 0 && score <= 100){
                            if(score >=90){
                                grade = "A";
                        }else if (score >=80){
                                grade = "B";}
                        else if(score >= 70){
                                grade = "C";
                        } else if (score >= 60){
                                grade = "D";
                        }else {
                            System.out.println("Invalid Score");}}
                             System.out.println(grade);
        System.out.println("======================================");
        int score2 = 75;
        String grade2 = "";

        if(score2 >= 0 && score2 <=100){
            grade2 = (score2 >= 90)? "A" : (score2 >= 80)? "B" : (score2 >= 70)? "C" :
                    (score2 >= 60)? "D" : "F";}
        else{
            System.out.println("Invalid");}
        System.out.println(grade2);



    }
}
