package Replits_Practice;

public class Methods_EvenOdd {

    public static boolean isEven(int n){
        boolean result = true;
        if(n%2==0){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(isEven(2));
    }
}
