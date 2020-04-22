package Day09_NestedIf_Ternary;

public class Ternary_Practice2 {
    public static void main(String[] args) {
        // check if num1 or num2 is the smaller #
       int num1 = 300;
       int num2 = 200;
       int min = (num1 < num2) ? num1 : num2;
        System.out.println(min);
            // output
        int hour = 14;
        String result = (hour < 12) ? "Good Morning" : (hour > 12 && hour < 18) ? "Good Afternoon" :
                "Good Evening";
        System.out.println(result);
        // if # is divisible by 5 & 3 at the same time = true
        int num = 12000;
        boolean divisibleBy3and5 = (num % 3 == 0 && num % 5 == 0) ? true : false;
        System.out.println(divisibleBy3and5);
    }


}
