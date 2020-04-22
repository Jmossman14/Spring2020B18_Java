package Day14_StringManipulationCont;

import java.util.Scanner;

public class Credentials_Practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String ValidUserName = "cybertek";
        String ValidPassword = "Cybertekschool";

        System.out.println("Enter your username: ");
        String inputUsername = input.next();

        System.out.println("Enter your password: ");
        String inputPassword = input.next();

        if(inputUsername.equals(ValidUserName) && inputPassword.equals(ValidPassword)){
            // user input = valid username & user input = valid password
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");}


    }
}
