package Day14_StringManipulationCont;

public class StringManipulation_part3 {
    public static void main(String[] args) {

        // equals(): checks if strings are equal, case sensitive

        // equalsIgnoreCase(); checks if strings are equal, not case sensitive

        String str1 = "cybertek";
        String str2 = "CYBERTEK";

        System.out.println(str1.equalsIgnoreCase(str2));


        //contains(): checks if text is in a string, output BOOLEAN true or false

        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School");

        System.out.println(r1);

        // startsWith(): checks if the string starts with specific text, returns boolean
        //              true or false

        String s3 = "United States";
        System.out.println( s3.startsWith("U") );  // true

        // endsWith():  checks if the string starts with specific text, returns boolean
        //                    true or false

        String s4 = "Cybertel School";
        System.out.println( s4.endsWith("l") );  // true
        System.out.println( s4.endsWith("School") ); // true
        System.out.println(s4.endsWith("Cybertek")); // false

    }
}
