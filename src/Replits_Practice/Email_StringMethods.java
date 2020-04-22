package Replits_Practice;

import java.util.Scanner;

public class Email_StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("EMail:");
        String email = scan.next();

        String firstName = email.substring(0,email.indexOf("_"));




       // String topDomain = email.substring(email.contains());
        //String Domain = email.substring();

        System.out.println(firstName);


    }
}
