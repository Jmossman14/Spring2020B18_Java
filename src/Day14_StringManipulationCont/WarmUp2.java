package Day14_StringManipulationCont;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* 3. Write a Java method to display the middle character of a string
        a) If the length of the string is even there will be two middle characters.
        b) If the length of the string is odd there will be one middle character.
        Input :
        elephant
        Output:
        The middle character in the string: ph */

        System.out.println("Enter your word:");
        String word = input.next();

        String middleCharacter = ""; // to store the middle characters from the word, user inputs

        int totalChars = word.length(); // returns the total # of letters
        int middleNum = totalChars / 2;

        if(totalChars % 2 != 0){ // ODD Number of letters
            middleCharacter += word.charAt(middleNum);}


    }
}
