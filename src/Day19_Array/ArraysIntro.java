package Day19_Array;
/*
3 Data Structures in Java:
Arrays, Collections,maps
Arrays: a variable that stores multiple data.

 */

public class ArraysIntro {
    public static void main(String[] args) {

        //   int scores = 90; regular variables can only have one data
        //   int scores = 90 , 10, 20;  ARRAYS can store multiple

        /*
        declaration:
				DataType[]  variableName = { BODY OF ARRAY // data1, data2, data3 };
				                            // 70, 75, 85, 90, 95, 100
         */
                // [] brackets can next to data or variable name
                 int[] scores = {70, 75, 85, 90, 95, 100};
        //data becomes index #s   0   1   2   3   4   5
        // index #s can represent String or numbers
        // retrieve: variableName[index] < -- whatever index # we use will output that data

        int num1 = scores[2]; //85,  int
        // assigned to anther int variable then retreives data from array variable
        System.out.println(num1);


        int num2 = scores[5]; // 100, int
        // assigned to anther int variable then retreives data from array variable

        System.out.println(num2);
    }


    }
