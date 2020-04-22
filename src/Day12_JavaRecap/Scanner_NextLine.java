package Day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 13 + Enter

        System.out.println("Enter a number");
        int num = input.nextInt(); // 13
        System.out.println(num);

        input.nextLine(); // takes out the "Enter"

        System.out.println("Enter your name");
        String name = input.nextLine();




    }
}
