package Day05_Unary_ShortHandOperators;

public class Divisibility {
    public static void main(String[] args) {
        /*write a program that is easily divisible by 2, 3,5 = true or false*/

        int number = 65;
        boolean a1 = number/2==0;
        boolean b2 = number/3==0;
        boolean c3 = number/5!=0;
        String result1 = number +" is divisible by 2: " +a1;
        String result2 = number +" is divisible by 3: " +b2;
        String result3 = number +" is divisible by 5: " +b2;
        System.out.println(result1+"\n"+result2+"\n"+result3);
        //used String text to produce full line text
        System.out.println("========================================");
        System.out.println(number+" is divisible by 2: "+a1);
        System.out.println(number+" is divisible by 3: "+b2);
        System.out.println(number+" is divisible by 5: "+c3);
        // used indivdual line text to produce single line text
        System.out.println("========================================");
        int number1 = 80;
        boolean d1 = number1/2!=0;
        boolean e2 = number1/3==0;
        boolean f3 = number1/5!=0;
        System.out.println(number1+" is divisible by 2: "+d1);
        System.out.println(number1+" is divisible by 3: "+e2);
        System.out.println(number1+" is divisible by 5: "+f3);

    }

}
