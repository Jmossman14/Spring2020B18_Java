package Day16_;
import java.util.Scanner;

public class PalindromePractice {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a word");
       String word = input.next();
       // LEVEL
       // 01234
       String result1 = "";
       String result2 = "";
       // chars from word will be stored in result1
       for(int a = 0; a <= word.length()-1; a++ ){
        // reading the word from front to back; the length of the word user input; increases a every loop
           result1 += word.charAt(a); }
       System.out.println(result1);

       // result1 string becomes all of the characters user input
       for(int b = word.length()-1; b >=0; b--){
       //  reading the word from back to front
           result2 +=word.charAt(b);}

       if(result1.equalsIgnoreCase(result2)){
           System.out.println("your word is a palindrome");
       }else{
           System.out.println("your word is not a palindrome");
       }



    }
}
