package Rescources;
import java.util.ArrayList;
import java.util.Arrays;
public class Library {
    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;
        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }
    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";
        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }
        return  Reverse;
    }

    public static String RemoveDuplicates(String str){
        String result =  "";      //AB
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }
        }
        return result;
    }
    public static int Frequency(String str1, String str2){
        int count = 0 ;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
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

    public static int Frequency(String str, char ch){// counts the chars frequency
        char [] arr = str.toCharArray(); // turns the array to a CHAR array -> [A,A,A]
        // you can compare ch to ever char in the arr array using loop

        int count = 0; // used to count
        for(char each:arr ){ // each represents every char at each index [0,1,2]

            if(each == ch){// if each is equal to char [A] = [A]
                count++;// then increase the count by 1
            }
        }
        return count;
    }

    public static int Max(ArrayList<Integer> nums){
        int maxNum = Integer.MIN_VALUE; // max is bigger then the smallest number INT can hold

        for(int i = 0; i < nums.size(); i++){

            if(nums.get(i) > maxNum){
                maxNum = nums.get(i);
            }

        }
        return maxNum;
    }






    // remove duplicates from string
    // Frequency of string
    // merge two array and return third one
    // max number from array
    // min number from array
}
