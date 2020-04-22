package Day21MultiDimensional_Arrays;
import java.util.Arrays;
public class ArrayQuiz {
    public static void main(String[] args) {

        /*char[] array = {'D', 'C', 'A', 'B'};
        Arrays.sort(array);

        for(char each: array){
            System.out.println(each +" " );
            if(each == 'D'){
                continue;
            }
        }
        output = A B C D*/

        /*int [] num1 = new int[3];
        int[] num2 = {1,2,3,4,5};

        num1 = num2;

        for(int i = 0; i<num1.length; i++){
            System.out.println(num1[i]);
        }
        output = 1 2 3 4 5*/

       /* int numbers [];
        numbers = new int[2];
        numbers[0] = 10;
        numbers[1] = 20;
        // above eliminates itself once we declared NEW INT [4]
         numbers = new int[4];
         numbers[2] = 30;
         numbers[3] = 40;
        System.out.println(Arrays.toString(numbers));
        outputs: [0,0,30,40]*/

       /*
       int[] intArr = {15,30,45,60,75}; // {0,1,2,3,4}
               intArr[2] = intArr[4]; // position 2(45) now equals position 4(75)
                    intArr[4] = 90; // position 4(75) now becomes 90
                    System.out.println(Arrays.toString(intArr));}
        outputs: 15,30,75,60,90

        */

   }
}
