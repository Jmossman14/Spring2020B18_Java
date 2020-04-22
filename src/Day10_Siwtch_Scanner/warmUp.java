package Day10_Siwtch_Scanner;

public class warmUp {
/*
Warm up task:
	1. Wash your hand
	2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
	3. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
	4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF
 */
    public static void main(String[] args) {
/*
2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF
 */
        byte days = 6;
        String DaysOfWeek = "";
        if (days <= 7 && days >= 1) {
            if (days == 1) {
                DaysOfWeek = "Monday";
            } else if (days == 2) {
                DaysOfWeek = "Tuesday";
            } else if (days == 3) {
                DaysOfWeek = "Wednesday";
            } else if (days == 4) {
                DaysOfWeek = "Thursday";
            } else if (days == 5) {
                DaysOfWeek = "Friday";
            } else if (days == 6) {
                DaysOfWeek = "Saturday";
            } else if (days == 7) {
                DaysOfWeek = "Sunday";
            } else {
                DaysOfWeek = "Invalid";
            }

            System.out.println(DaysOfWeek);
        }

        System.out.println("==============================");
/*
3. write a java program that can convert numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".
				DO NOT USE IF STATEMENTS
 */

        int num = 2;
        String result = (num == 0) ? "zero" : (num == 1) ?
                "one" : (num == 2) ? "two" : (num == 3) ? "three" :
                (num == 4) ? "four" : (num == 5) ? "five" : (num == 6) ?
                        "six" : (num == 7) ? "seven" : (num == 8) ? "eight" : (num == 9) ?
                        "nine" : "Invalid Entry";
        System.out.println(result);

        System.out.println("==============================");

        /*
        	4. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
		 		28 days: 2
		 		30 days: 4,6, 9, 11
		 		31 days: 1,3,5,7,8,10,12
	 		MUST USE NESTED IF
         */
        int months = 1;
        String result1 = "";
        if (months <= 12 && months >= 1) {
            result1 = (months == 1) ? "January has 31 days" : (months == 2) ? "February has 28 days" :
                    (months == 3) ? "March has 31 days" : (months == 4) ? "April has 30 days" :
                            (months == 5) ? "May has 31 days" : (months == 6) ? "June has 30 days" :
                                    (months == 7) ? "July has 31 days" :
                                            (months == 8) ? "August has 31 days" :
                                                    (months == 9) ? "September has 30 days" :
                                                            (months == 10) ? "October has 31 days" :
                                                                    (months == 11) ? "November has 30 days" :
                                                                            (months == 12) ? "December has 31 days" :
                                                                                    "Invalid";
            System.out.println(result1);
        }

        int num2 = 6; // months
        boolean days28 = num == 2;
        boolean days30 = num == 4 || num == 6 || num == 9 || num == 11;
        String result3 = "";
        /*boolean days31 = num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12;
                        ^^^ use ELSE instead of typing all of this out */
        if(num > 0 && num < 13) {// PRE CONDITION

            result3 = (days28)? "Has 28 days" : (days30)? "Has 30 days" : "Has 31 days";

    }       else {
                result3 = "Invalid";}
        System.out.println(result3);


    }



    }
