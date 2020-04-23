package Replits_Practice;

public class Methods_Return_Hamlet {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        boolean result=true;

        if (toBe==true || notToBe==true){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(hamletQuote(false,true));
    }
}