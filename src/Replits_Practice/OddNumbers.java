package Replits_Practice;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt(); // 10
        System.out.print("#2: ");
        int num2 = s.nextInt(); // 20
        //start on line 11

        while(num1<=num2){
            if(num1 % 2 == 0){
                num1++;
                continue;
            }
            System.out.print(num1+" ");
            num1+=2;

    }
}
}
