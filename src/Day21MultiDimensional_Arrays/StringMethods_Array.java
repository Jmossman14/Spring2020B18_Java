package Day21MultiDimensional_Arrays;

import java.util.Arrays;

/*
toCharArray(): returns char array from a string, returns char array
split(): splits the string with given (value) and returns a string array
 */
public class StringMethods_Array {
    public static void main(String[] args) {
        //ToCharsARRAY
        String name = "java"; // each letter in the string is a single CHAR 'J'=0 'A'=1 'V'=2 'A'=3

        char[] chars = name.toCharArray();//takes each letter in NAME and stores it in CHARS as
                                            // single characters
        System.out.println(chars[0]);// will print J
        System.out.println(chars[1]);// will print A
        System.out.println(chars[2]);// will print V
        System.out.println(chars[3]);// will print A
        // if you print a chars[#] that is larger than the length of the NAME like 4 it will be out of bounds

        // SPLIT

        String str = "I like Java";
        // output I like Java
        String[] arr = str.split(" ");
        // assigns str to an array
        System.out.println(Arrays.toString(arr));
        // output is [I, like, Java] - splitting 1 sentence into 3 different words

        /*
        Reverse sentence:
        - convert sentence to array

        - new string, variablename.split(" ");
             String sentence = "Today is great day";
             String[] reverse = sentence.split(" "); // [Today, is, great, day]
        - reverse each word, index by index using a FOR LOOP
             for (int i = reverse.length -1; i>=0; i--){
            // i is starting at largest index # and working back to 0
            String eachWord = reverse[i];
            // create new string to store each word
            // adding reverse to eachword, specifies index # at i
            System.out.print(eachWord+" ");
            // prints out each word separated by space

         */
        String sentence = "Today is great day";
        String[] reverse = sentence.split(" "); // [Today, is, great, day]

        for (int i = reverse.length -1; i>=0; i--){
            // i is starting at largest index # and working back to 0
            String eachWord = reverse[i];
            // create new string to store each word
            // adding reverse to eachword, specifies index # at i
            System.out.print(eachWord+" ");
            // prints out each word separated by space
        }





        String str2 = "ABCD";
        String arr2[] =   str2.split("")  ;      //["A", "B", "C", "D"]
        char[] ch2 = str2.toCharArray(); //['A', 'B', 'C', 'D']

        System.out.println( Arrays.toString(arr2) );
        System.out.println( Arrays.toString(ch2));






    }
}
