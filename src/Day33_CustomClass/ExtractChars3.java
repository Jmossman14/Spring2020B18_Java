package Day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars3 {
    public static void main(String[] args) {

       // PREDICATE METHOD :
        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray(); // changes string to chars==> [A,B,C,D,1,2,3,$,%,#,@,&,4,5,6,E,F,G,!]

        Character[] ch = new Character[arr.length];
        for(int i = 0; i < arr.length; i++){
            ch[i] = arr[i];
        }
      //   System.out.println(Arrays.toString(ch));[A,B,C,D,1,2,3,$,%,#,@,&,4,5,6,E,F,G,!]

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch)); // letters will be added to this arrayList - isLetter(); or isAlphabetic();
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch)); // digits will be added to this arrayList - isDigit();
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> SpecialChars = new ArrayList<>(Arrays.asList(ch)); // SpecialChars will be added to this arrayList
        SpecialChars.removeAll(digits);
        SpecialChars.removeAll(letters);
        System.out.println(SpecialChars);


           }
}