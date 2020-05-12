package Day37_Construct;

// import java.util.Arrays; - only imports Array Class
import java.util.*; // imports every class that is in java Utilities

import static Day37_Construct.Data.staticVariable; // imports the static variable from  Data
import static Day37_Construct.Data.staticMethod; // imports the static method from the Data class

import static Day37_Construct.Data.*; // imports ALL static methods and variables from Data Class
public class ImportStatement {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Arrays.sort(arr);

        // will print whatever is in staticVariable since we imported it from the Data class
        System.out.println(staticVariable); // will output 300

       staticMethod();
    }
}
