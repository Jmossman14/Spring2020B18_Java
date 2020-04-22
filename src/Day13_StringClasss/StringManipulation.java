package Day13_StringClasss;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Cybertek";
        // index: # counts all of the characters(ABC,123, spaces etc.) starting from 0

        //String to char = variableName.method(index #);
         char ch1 =   str.charAt(3);
        System.out.println(ch1);
        // will print "e"
        System.out.println(ch1 == 'e');

        // length: counts all of the characters(ABC,123, spaces etc.) starting from 1
        int totalLength = str.length();
        System.out.println(totalLength); // will print out how many characters in data (8)
        System.out.println(totalLength > 10 ); // false because there is 8 ch. in Cybertek

        String str2 = "Today is great day, Java is fun";
        int maxIndexNum = str2.length() - 1;
            // index # starts from 0, making the length 1 unit above INDEX #
        System.out.println(maxIndexNum);


        // Concatination: .concat allows you to add multiple
        // text to a string and doesnt change original text
        String s1 = "Cybertek";
               s1 = s1.concat(" School"); // will output "Cybertek School"
        // .concat allows you to add multiple text to a string and doesnt change original text
        System.out.println(s1); // s1 = Cybertek School

        String s2 = "Java";
               s2 = s2.concat(" is a programing language!");
        System.out.println(s2);

        //Lowercase & Uppercase:
        String s3 = "JAVA JAVA";
                s3 = s3.toLowerCase();
        System.out.println(s3);

        String s4 = "java java";
                s4 = s4.toUpperCase();
        System.out.println(s4);

        // Trim: removing UNNECESSARY and UNUSED spaces, will not remove spaces from words
        String s5 = "    Judy    Mossman    ";
                    // only removes spaces from before and after words, not in between
        s5 = s5.trim();
        System.out.println(s5);






    }
}
