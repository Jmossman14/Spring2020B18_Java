package Day22MultiDimensional_Continue;

public class NestedLoops {
    public static void main(String[] args) {
        //                    0   1 ,   0   1   2  ,  0   1   2    3
        char [] [] arr2D = {{'A','B'},{'C','D','E'},{'F','J','H', 'I'} };// each index in arr2D MUST be single dimensional array
        // Index of 1D Array:   0             1           2

       // arr2D[0]; ==> {'A','B'}, you can apply regular for loop to this
        for(int i = 0; i<arr2D[0].length; i++){
            System.out.println(arr2D[0][i]);
        }

        // arr2D[1] ==>{'C','D','E'}, you can apply regular for loop to this
        for(int i = 0; i <arr2D[1].length;i++){
            System.out.println(arr2D[1][i]);
        }
        // arr3D[2] ==>{'F','J','H', 'I'}, you can apply regular for loop to this
        for(int i = 0; i<arr2D[2].length;i++){
            System.out.println(arr2D[2][i]);
        }

        System.out.println("=====================================================");
        // combinding the top LOOPS to a nested loop
        // must change the [#s] to the outter loops initialized variable name
        // [j]

        for(int j = 0; j<arr2D.length; j++){

            // arr2D[0]; ==> {'A','B'}, you can apply regular for loop to this
            for(int i = 0; i<arr2D[j].length; i++){
                System.out.println(arr2D[j][i]);
            }
            }




        }


    }

