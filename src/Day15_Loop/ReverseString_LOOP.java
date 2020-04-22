package Day15_Loop;

public class ReverseString_LOOP {
    public static void main(String[] args) {

    //reverse string using LOOP
    String str = "Judy Mossman";
                //0123 4 5678910111
        // identify characters using charAt
    String reverse1 = "" + str.charAt(3) + str.charAt(2)+ (str.charAt(1))+(str.charAt(0));
        //using INT, identify the count(length) of text and - 1 to count back down to 0
        int lastIndexNum = str.length() - 1;
        for(int i = lastIndexNum; i >=0; i--){
            System.out.print(str.charAt(i));
        }

}}
