package Day21MultiDimensional_Arrays;
/*
2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */
/*
How to:
- declare a string of text
    String [] names = {"Reem", "Omer", "Muhtar, "Emrah", "Mohammed"};
- Find Max length, so create an int that will find STRING length of first index in array
     int Max = names[0].length();
- create a String to store longest word
     String LongestWord = "";
- add an If statement so you can add max to longestword variable
    // compares names @ i (loop) length is greater than the word prior
                if(names[i].length() > Max) {
                Max = names[i].length();
                LongestWord = names[i];
 */
public class Longest_Shortest_Words {
    public static void main(String[] args){
        String [] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed"};

        int Max = names[0].length(); // stores max length at each loop iterations tarting at first word index [0]
        String LongestWord = ""; // create a String to store longest word

        int Min = names[0].length();
        String shortestWord = "";

        for(int i = 1; i < names.length; i++ ){
            if(names[i].length() > Max) { // compares names @ i (loop) length is greater than the word prior
                Max = names[i].length();
                LongestWord = names[i];
            }
            if(names[i].length()< Min){
                Min = names[i].length();
                shortestWord = names[i];
            }
        }

        System.out.println(LongestWord);
        System.out.println(shortestWord);
    }


}
