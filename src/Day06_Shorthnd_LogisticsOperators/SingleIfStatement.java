package Day06_Shorthnd_LogisticsOperators;

public class SingleIfStatement {
    public static void main(String[] args) {
        boolean ColdWeather = true; // ONLY WORKS FOR TRUE STATEMENTS
        if(ColdWeather) {
            // true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        } // Above SOUTs will only output if variable is TRUE

        boolean coronaDetected = false; // will output below if changed to TRUE
        if (coronaDetected) {
            System.out.println("Wash your hands");
            System.out.println("Stay home");
        }

        System.out.println("===================================");
        int a = 101;
        boolean EvenNum = a % 2==0;//if # can be devided by 2 w/out remainder
        boolean OddNum = a % 2 !=0; // if remainder does not equal 0, it is odd
                if(EvenNum) // can add ! in front of EvenNum to see if # is odd
                            // instead of creating a new boolean OddNum
                {
                System.out.println(a+" is an even number");
            }
                if (OddNum)
                {
                System.out.println(a+ " is an odd number");
                // ONLY output the TRUE result
                    }


    }
}
