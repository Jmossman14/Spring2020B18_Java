package Day16_;
/*
CALCULATE SUM OF EVEN AND OFF NUMBERS BETWEEN 1- 100

 */
public class CalculateSum_100 {
    public static void main(String[] args) {
        int sum1 = 0; // will output the sum of all EVEN #s
        int sum2 = 0; // will output the sum of all ODD #s


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {  // if (EVEN number)
                sum1 += i; // will output SUM of all EVEN #s
            } else {  // if(ODD number)
                sum2 += i;// will output SUM of all ODD #s
            }
        }

        System.out.println("sum of all even numbers: " + sum1);
        System.out.println("sum of all odd numbers: " + sum2);
    }
}


