package Day25_MethodsRecap;

import Rescources.Library;

/*
-Call library.RemoveDuplicates in a new string to remove dups
- create a String(""+ to get char)
-

 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AABBCC"; // expected result : A2B2C2
        String NonDups = Library.RemoveDuplicates(str); // removes duplicates from str --> ABC
        String result = "";
        for(int i = 0 ; i <NonDups.length(); i++){ // creat int loop, will stop at the last index of Non Dups

            String ch =""+ NonDups.charAt(i);// use ""+ to get the CHAR
            int num = Library.Frequency(str,ch); // returns the # of frequency

           // System.out.print(ch+num); can print it this way or declare a variable
            result+= ch+num;
        }


    }
    public static String FrequencyOfChars(String str) {

        String NonDups = Library.RemoveDuplicates(str); // removes duplicates from str --> ABC
        String result = "";
        for (int i = 0; i < NonDups.length(); i++) { // creat int loop, will stop at the last index of Non Dups

            String ch = "" + NonDups.charAt(i);// use ""+ to get the CHAR
            int num = Library.Frequency(str, ch); // returns the # of frequency

            // System.out.print(ch+num); can print it this way or declare a variable
            result += ch + num;
        }
        return result;

    }
}
