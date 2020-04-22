package Day14_StringManipulationCont;
import java.util.Scanner;
/*
	3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */
public class WarmUp {
    public static void main(String[] args) {


/*
1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
        System.out.println("Please enter one word: ");
        String word1 = input.next();
        input.nextLine();

        System.out.println("Please enter second word: ");
        String word2 = input.next();
        // concat using .concat instead of +
        String result = word1.concat(word2).concat(word2).concat(word1);
        System.out.println(result); */

        Scanner input = new Scanner(System.in);
/*
	2. Ask user to enter two words. Print first word without its first character then print
	the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana*/

        System.out.println("Enter one word: ");
        String w1 = input.next();

        input.nextLine();

        System.out.println("Enter second word: ");
        String w2 = input.next();

        String ww1 = w1.substring(1);
        String ww2 = w2.substring(1);
        String result = ww1.concat(ww2);

        System.out.println(result);





    }
}
