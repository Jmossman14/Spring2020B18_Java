package Day33_CustomClass;

import java.util.ArrayList;

/*
3. task:
			Write a program that can extract the special chars, digits and letters from a string arrayList
			into seperate Arraylist of chars
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
 */
public class ExtractChars2 {
    public static void main(String[] args) {

        // CHAR AT METHOD :
        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray(); // changes string to chars==> [A,B,C,D,1,2,3,$,%,#,@,&,4,5,6,E,F,G,!]

        ArrayList<Character> letters = new ArrayList<>(); // letters will be added to this arrayList - isLetter(); or isAlphabetic();
        ArrayList<Character> digits = new ArrayList<>(); // digits will be added to this arrayList - isDigit();
        ArrayList<Character> SpecialChars = new ArrayList<>(); // SpecialChars will be added to this arrayList


        for(int i = 0; i < str.length(); i++){
           char each = str.charAt(i); // will execute a char for each index of the string
            // during each iteration, if i is letter we add it to letters list
            // if each is digits ==> add it to digits list
            // if each is special character ==> add to specialChars list
            // either create condition depending on ascii table
            // or we use this Character.isLetter() method, or Character.isAlphabetic() method
            if(Character.isLetter(each)){// if character at arr is a Letter add to Letters
                letters.add(each); // output => [A, B, C, D, E, F, G]
            }
            else if(Character.isDigit(each)){ // if character at arr is a digit add to digits
                digits.add(each); // output => [1, 2, 3, 4, 5, 6]
            }
            else{ // if not digit or letter
                SpecialChars.add(each); // output => [$, %, #, @, &, !]
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(SpecialChars);
    }
}
