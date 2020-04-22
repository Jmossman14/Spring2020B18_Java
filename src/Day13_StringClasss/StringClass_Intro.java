package Day13_StringClasss;
/*

 */
public class StringClass_Intro {
    public static void main(String[] args) {

        String str1 = "cat";
        String str2 = new String("cat"); // typing NEW STRING allows same data "cat" to not be
                                                // EQUAL
        System.out.println(str1 + ":" + str2); // same data  but not =
        System.out.println(str1 == str2); // FALSE

        String str3 = "cat"; // this now makes str1 == to str3
        System.out.println(str1 == str3); // true

        String s1 = "Java"; // goes to the string pool, and cannot be changed or modified
                s1 = "Javascript"; // everytime you reassign, a new object is created in memory
        // reassigning value modifies
        System.out.println(s1);

        String s2 = "Java"; // no new object is created in the memory
            // goes to the stack of s1

        System.out.println(s1 == s2 );
            // s1 is now JavaScript because it was reassinged
            // FALSE







    }
}
