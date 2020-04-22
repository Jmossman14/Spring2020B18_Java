package Day12_JavaRecap;
import java.util.Scanner;
 /*
     Assignment_AscendingOrder_5Numbers:
        write a program that asks to enter 5 numbers and prints the numbers in ascending order
                Ex:
                    5, 4, 1, 2, 3
                 output:
                    1, 2, 3, 4, 5
         */

public class Assignment_AscendingOrder_5Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five numbers to organize in ascending order:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        boolean num1Max = num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5;
        boolean num1SecondGreatest = (num1 < num2 && num1 > num3 && num1 > num4 && num1 > num5)
                || (num1 < num3 && num1 > num2 && num1 > num4 && num1 > num5)
                || (num1 < num4 && num1 > num2 && num1 > num3 && num1 > num5)
                || (num1 < num5 && num1 > num2 && num1 > num3 && num1 > num4);
        boolean num1ThirdGreatest = (num1 < num2 && num1 < num3 && num1 > num4 && num1 > num5)
                || (num1 < num2 && num1 < num4 && num1 > num3 && num1 > num5)
                || (num1 < num2 && num1 < num5 && num1 > num3 && num1 > num4)
                || (num1 < num3 && num1 < num4 && num1 > num2 && num1 > num5)
                || (num1 < num3 && num1 < num5 && num1 > num2 && num1 > num4)
                || (num1 < num4 && num1 < num5 && num1 > num2 && num1 > num3);
        boolean num1FourthGreatest = (num1 < num2 && num1 < num3 && num1 < num4 && num1 > num5)
                || (num1 < num2 && num1 < num3 && num1 < num5 && num1 > num4)
                || (num1 < num2 && num1 < num4 && num1 < num5 && num1 > num3)
                || (num1 < num3 && num1 < num4 && num1 < num5 && num1 > num2);
        boolean num1Min = num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5;


        boolean num2Max = num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5;
        boolean num2SecondGreatest = (num2 < num1 && num2 > num3 && num2 > num4 && num2 > num5)
                || (num2 < num3 && num2 > num1 && num2 > num4 && num2 > num5)
                || (num2 < num4 && num2 > num1 && num2 > num3 && num2 > num5)
                || (num2 < num5 && num2 > num1 && num2 > num3 && num2 > num4);
        boolean num2ThirdGreatest = (num2 < num1 && num2 < num3 && num2 > num4 && num2 > num5)
                || (num2 < num1 && num2 < num4 && num2 > num3 && num2 > num5)
                || (num2 < num1 && num2 < num5 && num2 > num3 && num2 > num4)
                || (num2 < num3 && num2 < num4 && num2 > num1 && num2 > num5)
                || (num2 < num3 && num2 < num5 && num2 > num1 && num2 > num4)
                || (num2 < num4 && num2 < num5 && num2 > num1 && num2 > num3);
        boolean num2FourthGreatest = (num2 < num1 && num2 < num3 && num2 < num4 && num2 > num5)
                || (num2 < num1 && num2 < num3 && num2 < num5 && num2 > num4)
                || (num2 < num1 && num2 < num4 && num2 < num5 && num2 > num3)
                || (num2 < num3 && num2 < num4 && num2 < num5 && num2 > num1);
        boolean num2Min = num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5;


        boolean num3Max = num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5;
        boolean num3SecondGreatest = (num3 < num1 && num3 > num2 && num3 > num4 && num3 > num5)
                || (num3 < num2 && num3 > num1 && num3 > num4 && num3 > num5)
                || (num3 < num4 && num3 > num1 && num3 > num2 && num3 > num5)
                || (num3 < num5 && num3 > num1 && num3 > num2 && num3 > num4);
        boolean num3ThirdGreatest = (num3 < num1 && num3 < num2 && num3 > num4 && num3 > num5)
                || (num3 < num1 && num3 < num4 && num3 > num2 && num3 > num5)
                || (num3 < num1 && num3 < num5 && num3 > num2 && num3 > num4)
                || (num3 < num2 && num3 < num4 && num3 > num1 && num3 > num5)
                || (num3 < num2 && num3 < num5 && num3 > num1 && num3 > num4)
                || (num3 < num4 && num3 < num5 && num3 > num1 && num3 > num2);
        boolean num3FourthGreatest = (num3 < num1 && num3 < num2 && num3 < num4 && num3 > num5)
                || (num3 < num1 && num3 < num2 && num3 < num5 && num3 > num4)
                || (num3 < num1 && num3 < num4 && num3 < num5 && num3 > num2)
                || (num3 < num2 && num3 < num4 && num3 < num5 && num3 > num1);
        boolean num3Min = num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5;


        boolean num4Max = num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5;
        boolean num4SecondGreatest = (num4 < num1 && num4 > num2 && num4 > num3 && num4 > num5)
                || (num4 < num2 && num4 > num1 && num4 > num3 && num4 > num5)
                || (num4 < num3 && num4 > num1 && num4 > num2 && num4 > num5)
                || (num4 < num5 && num4 > num1 && num4 > num2 && num4 > num3);
        boolean num4ThirdGreatest = (num4 < num1 && num4 < num2 && num4 > num3 && num4 > num5)
                || (num4 < num1 && num4 < num3 && num4 > num2 && num4 > num5)
                || (num4 < num1 && num4 < num5 && num4 > num2 && num4 > num3)
                || (num4 < num2 && num4 < num3 && num4 > num1 && num4 > num5)
                || (num4 < num2 && num4 < num5 && num4 > num1 && num4 > num3)
                || (num4 < num3 && num4 < num5 && num4 > num1 && num4 > num2);
        boolean num4FourthGreatest = (num4 < num1 && num4 < num2 && num4 < num3 && num4 > num5)
                || (num4 < num1 && num4 < num2 && num4 < num5 && num4 > num3)
                || (num4 < num1 && num4 < num3 && num4 < num5 && num4 > num2)
                || (num4 < num2 && num4 < num3 && num4 < num5 && num4 > num1);
        boolean num4Min = num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5;


        boolean num5Max = num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4;
        boolean num5SecondGreatest = (num5 < num1 && num5 > num2 && num5 > num3 && num5 > num4)
                || (num5 < num2 && num5 > num1 && num5 > num3 && num5 > num4)
                || (num5 < num3 && num5 > num1 && num5 > num2 && num5 > num4)
                || (num5 < num4 && num5 > num1 && num5 > num2 && num5 > num3);
        boolean num5ThirdGreatest = (num5 < num1 && num5 < num2 && num5 > num3 && num5 > num4)
                || (num5 < num1 && num5 < num3 && num5 > num2 && num5 > num4)
                || (num5 < num1 && num5 < num4 && num5 > num2 && num5 > num3)
                || (num5 < num2 && num5 < num3 && num5 > num1 && num5 > num4)
                || (num5 < num2 && num5 < num4 && num5 > num1 && num5 > num3)
                || (num5 < num3 && num5 < num4 && num5 > num1 && num5 > num2);
        boolean num5FourthGreatest = (num5 < num1 && num5 < num2 && num5 < num3 && num5 > num4)
                || (num5 < num1 && num5 < num2 && num5 < num4 && num5 > num3)
                || (num5 < num1 && num5 < num3 && num5 < num4 && num5 > num2)
                || (num5 < num2 && num5 < num3 && num5 < num4 && num5 > num1);
        boolean num5Min = num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4;


        int resultMax = 0;
        int resultSecondGreatest = 0;
        int resultThirdGreatest = 0;
        int resultFourthGreatest = 0;
        int resultMin = 0;


        if (num1Max) {
            resultMax = num1;
        } else if (num2Max) {
            resultMax = num2;
        } else if (num3Max) {
            resultMax = num3;
        } else if (num4Max) {
            resultMax = num4;
        } else if (num5Max) {
            resultMax = num5;
        }


        if (num1SecondGreatest) {
            resultSecondGreatest = num1;
        } else if (num2SecondGreatest) {
            resultSecondGreatest = num2;
        } else if (num3SecondGreatest) {
            resultSecondGreatest = num3;
        } else if (num4SecondGreatest) {
            resultSecondGreatest = num4;
        } else if (num5SecondGreatest) {
            resultSecondGreatest = num5;
        }


        if (num1ThirdGreatest) {
            resultThirdGreatest = num1;
        } else if (num2ThirdGreatest) {
            resultThirdGreatest = num2;
        } else if (num3ThirdGreatest) {
            resultThirdGreatest = num3;
        } else if (num4ThirdGreatest) {
            resultThirdGreatest = num4;
        } else if (num5ThirdGreatest) {
            resultThirdGreatest = num5;
        }


        if (num1FourthGreatest) {
            resultFourthGreatest = num1;
        } else if (num2FourthGreatest) {
            resultFourthGreatest = num2;
        } else if (num3FourthGreatest) {
            resultFourthGreatest = num3;
        } else if (num4FourthGreatest) {
            resultFourthGreatest = num4;
        } else if (num5FourthGreatest) {
            resultFourthGreatest = num5;
        }


        if (num1Min) {
            resultMin = num1;
        } else if (num2Min) {
            resultMin = num2;
        } else if (num3Min) {
            resultMin = num3;
        } else if (num4Min) {
            resultMin = num4;
        } else if (num5Min) {
            resultMin = num5;
        }


        System.out.println(resultMin + " " + resultFourthGreatest + " " + resultThirdGreatest + " "
                + resultSecondGreatest + " " + resultMax);
    }
}