package Day15_Loop;

public class forLoop_practice {
    public static void main(String[] args) {

        String resultOdd = "";
        for(int a = 1; a <= 100; a +=2){
           // System.out.print(a+" ");
            resultOdd += a+" ";//using this method we need to add a SOUT(resultOdd)
        }
        System.out.println(resultOdd);

        String resultEven = "";
        for(int b = 2; b <= 100; b += 2){
            System.out.print(b+" ");

        }



    }
}
