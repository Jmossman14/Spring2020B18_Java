package Day19_Array;
/*
// write a program that asks "enter a name" 10 times,
and store each of the names in the array students

 */

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        String[]names=new String[10];
        for(int i=0;i<=names.length-1;i++){
            System.out.println("Please enter a name");
            names[i]=scan.next();
        }
    }

}
