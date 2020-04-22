package Day06_Shorthnd_LogisticsOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! OPPOSITE
        boolean result1 = true;
        System.out.println(!result1);

        boolean result2 = !(10 + 15 > 15); // reads 25 > 15 is true but adding (!) makes it false
        System.out.println(result2);

        boolean result3 = !true == !false; // reads as False = True, output false
        System.out.println(result3);
    // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& AND
        /* FALSE ALWAYS TRUMPS TRUE
           True + True = True, 3 == 3 && 2 == 2 = TRUE
           False + True = False, 10 == 11 + 10 == 10 = FALSE
           False + False = False, 5 == 6 + 6 == 7 = FALSE */
        boolean R1 = "Corona Virus" != "End of the world"  && "Toilet Paper" == "Cure";
                                        // TRUE            +             FASLE = FALSE
        System.out.println(R1);
        boolean R2 = 10 > 15 && 15 < 13;
                    // FALSE + FALSE = FALSE
        System.out.println(R2);
        boolean R3 = 'a' == 'b'-1 && 'b'+1 == 'c';
        // 97 = 98-1 = true && 98 + 1 = 99 = True
        System.out.println(R3);
    // ||||||||||||||||||||||||||||||||||||||||| OR
        // True || False == TRUE, since it can be either option
            // 9 > 8 || 10 > 12
        // False || True == TRUE
            // 10 != 10 || 10 > 9
        // True || True == True
            // 8 > 5 || 8 > 6
        // False || False == False, only time it will return false
            // 8 > 20 || 8 < 5
        boolean R4 = true != false || false == !true;
                // true + true
        System.out.println(R4);

        boolean R5 = true == false || false == true;
            // false + false = false
        System.out.println(R5);

        // COMBINED
        boolean R6 = !!!!!!!false; // output true, TFTFTFT
        System.out.println(R6);

























    }
}
