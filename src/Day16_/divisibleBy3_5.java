package Day16_;
/*
PROGRAM THAT CAN PRINT OFF & EVEN #S BETWEEN 1 - 100 EVENLY DIVISIBLE BY 3 & 5
 */
public class divisibleBy3_5 {

    public static void main(String[] args) {
    // ODD #s divisible by 3 & 5
        for (int num = 1; num <= 100; num++) {
            if (num % 2 != 0) { // 1st condition
                if (num % 3 == 0 && num % 5 == 0) // 2nd condition
                    System.out.print(num + " "); // will output #s if TRUE
            }        }

        System.out.println("                ");
        // EVEN #s divisible by 3 & 5
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) { // 1st condition
                if (num % 3 == 0 && num % 5 == 0) // 2nd condition
                    System.out.print(num + " "); // will output #s if TRUE
            }

        }

    }
    
}
