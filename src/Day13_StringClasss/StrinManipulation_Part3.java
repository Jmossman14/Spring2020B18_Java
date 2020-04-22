package Day13_StringClasss;

public class StrinManipulation_Part3 {

    public static void main(String[] args) {
        //indexOf: gives the index # of the letter you provide instead of manually counting

        String str = "I like Java programming";
        int num1 = str.indexOf("J"); // give an INT variable
                        // when you have multiple Js it will give index # of the FIRST available
        System.out.println(num1); // out puts 7
        int num2 = str.indexOf("Java");
        System.out.println(num2);

        String str2 = "Cybertek school is awesome";
            int firstS = str2.indexOf("s");
        System.out.println(firstS);
            int SecondS = str.indexOf("is") + 1;// ("s aw") also works!
                //  returns index # of s
            // if no +1 it will give index # of i
        System.out.println(SecondS);

        // using multiple methods to manipulate string
            // index & substring

        String names = "Judy Mossman";
        String    FirstName = names.substring(0, names.indexOf(" ") );
        String lastName = names.substring( names.indexOf(" ")+1);

        System.out.println(FirstName);
        System.out.println(lastName);
        System.out.println();

    }
}
