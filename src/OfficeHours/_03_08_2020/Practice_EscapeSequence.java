package OfficeHours._03_08_2020;

public class Practice_EscapeSequence {
    public static void main(String[] args) {
        /*shows difference of adding spaces manually and having \t do it
        automatically*/
        System.out.println("    Java is a programming language");
        System.out.println("\tJava is a programming language");
        /* shows difference of adding a new line without having to use
        an empty sout
         */
        System.out.println("");
        System.out.println("\nWe love learning Java");
        //shows how to use \n & \t together         */
         System.out.println("\n\tWe love learning Java");
        //Shows how to add double quotes within regular text quotes
        System.out.println("I love the TV Show \"Law and Order\"");
        System.out.println("My favorite quote is \"Dedication, hard work plus patience\"");
        //shows how to add single back slash \, must have two \\ for 1 \ to output
        System.out.println("/\\");
        System.out.println("\\ \\ \\ \\ \\ \\");
        System.out.println("\\\\\\\\\\");


    }
}
