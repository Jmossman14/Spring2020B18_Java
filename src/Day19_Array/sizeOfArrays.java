package Day19_Array;
/*
		initializing the size of the array:
1. giving the values: size will be initialized automatically
			int[] arr = {10, 20, 30};
2. giving the size only: default value of the datatype will be assigned at each index
			int[] arr = new int[length];
			int[] arr = new int[5];
default values:
	byte, short, int, long ==> 0
	String or any object ==> null


 */
public class sizeOfArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println( arr.length ); // 3

        int[] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);


        String[] Testers = new String[3];  // {"Reem", "Madina", "Osman"};
        // index: 0, 1, 2

        Testers[0] = "Reem";
        Testers[2] = "Osman";
        Testers[1] = "Madina";
        System.out.println(Testers[0]);  // Reem
        System.out.println(Testers[1]); // null
        System.out.println(Testers[2]); // "Osman

        System.out.println(Testers.length);  // 3

        System.out.println("========================================");

        String[] students = new String[10];
        // write a program that asks "enter a name" 10 times, and store each of the names in the array students


    }
}
