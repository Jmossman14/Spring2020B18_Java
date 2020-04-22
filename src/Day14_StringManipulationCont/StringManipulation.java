package Day14_StringManipulationCont;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "my name Is judy mossman and I just came back from juggling";
        int s1 = str.indexOf("j"); // will find the FIRST index # of j
        System.out.println(s1); // will print the FIRST index # of j

        int s2 = str.indexOf("jus"); // will find the index # of j in the word Just
        System.out.println(s2); // will print the index # of j in the word Just

        int s3 = str.indexOf(" I") + 1; // finds the second I index #
        System.out.println(s3);

    }
}
