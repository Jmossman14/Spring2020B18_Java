package Replits;

import java.util.Scanner;

public class Citizens_Scanner {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int seniorCitizens=0;
        int nonSeniorCitizens=0;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int Count= input.nextInt();
        int Count1= input.nextInt();
        System.out.println("What is new citizen's age?");
        int age=input.nextInt();
        if (age>=65) {
            Count+=1;
            System.out.println("Senior Citizen");
        }  if (age<65) {
            Count1+=1;
            System.out.println("Non-Senior Citizen");
        }
        System.out.println("New seniorCitizens count " + Count);
        System.out.println("New nonSeniorCitizens count " + Count1);
    }
}