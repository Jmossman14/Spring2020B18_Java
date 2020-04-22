package Day22MultiDimensional_Continue;

public class nested_ForEach {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        //            0 1 2 3 4

        for(int each : arr){
            System.out.println(each);
        }
        System.out.println("===============================================");
        // NESTED
        int [][] arr2D = {{1,2,3},{4,5,6}};
        //                   0       1
        for(int [] each1D : arr2D){
            for(int eachElement : each1D){
                System.out.print(eachElement+" ");
            }
        }
        System.out.println();
        System.out.println("===============================================");
        char [] [] ch2D = {  {'A','B'} , {'C', 'D', 'E'} };
        //                    0                 1

        for(char[] each1D : ch2D){

            for(char eachChElement : each1D){
                System.out.print(eachChElement+" ");
            }
        }

    }
}
