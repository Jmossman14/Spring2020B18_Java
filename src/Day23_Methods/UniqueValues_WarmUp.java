package Day23_Methods;
/*
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class UniqueValues_WarmUp {
    public static void main(String[] args) {
        String arr[] = {"A", "B", "A", "C"};// "B" will be the output
    // FOR LOOP:
        for (int i = 0; i < arr.length; i++) { //
            int count = 0;
            for (String each : arr) {
                if (arr[i] == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }


        }




        System.out.println("=====================================");
        // FOR EACH LOOP:
       // to count how many times a character is in an array
        for( String each2 : arr ){ // 3: A,



            int count = 0;

            for( String each : arr ) {

                if (each.equals(each2)) {

                    count++;
                }
            }

            if(count == 1){  // if the character is unique

                System.out.println(each2);



        }






          /*  int count1 = 0; // to count how many times a character is in an array
            // outter loop takes 1 index of the array, and compares it to every other element in the array
            for (String each : arr) {

                if (each.equalsIgnoreCase("A")) {
                    count1++;
                }


                if (count1 == 1) { // if the character we are counting is unique (only appears 1 time), then print
                    System.out.println(each2);
                }
            }
*/
        }


    }
        }
