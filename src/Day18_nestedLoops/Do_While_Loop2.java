package Day18_nestedLoops;

public class Do_While_Loop2 {
    public static void main(String[] args) {
        //tASK: print numbers between 103 - 100
        // WHILE:
        int number = 103; // print #s between 100 and number

        while(number>=100){// stops count at 100
            System.out.println(number); // prints #s
            number--;}// decresease # from 103 to 102 to 101 to 100

        System.out.println(" ================================================== ");
        //tASK: print numbers between 103 - 100
         // DO WHILE:

         int number2 = 103;
         do{
             System.out.println(number2); // prints #s
             number2--;// decresease # from 103 to 102 to 101 to 100
         }
         while(number2 >= 100); // if this is false it will still print statement once
        }

}
