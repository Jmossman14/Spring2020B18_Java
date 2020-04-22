package Day13_StringClasss;

public class StringManipulation_Part2 {
    public static void main(String[] args) {
        String str = "Cybertek school is the best";
                //    01234567 // must include an additional index 3, for it to count
                            // the previous letter
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);


        String SchoolName = str.substring(9); // prints out everything from index # 9
        System.out.println(SchoolName);  // "school is the best"


        // PRACTICE
        String fullName = "Judy Mossman";
        String firstName = fullName.substring(0,4);
        String lastName = fullName.substring(5,12);
        System.out.println(firstName);
        System.out.println(lastName);

        String name = "judy mossman";
        String FirstName = name.substring(0,4);
        String LastName = name.substring(5,12);
        String gmail =      LastName.concat("_").concat(FirstName).concat("@gmail.com");
        // using + concat = LastName+"_"+FirstName+"@gmail.com";
        System.out.println(gmail);


        // Replace:

        String s2 = "I like C# programming C3 C3";
            s2 = s2.replace("C#", "Java");
            //              what to replace, replacement
        System.out.println(s2);

        String s3 = "COVID 18"; // change 18 to 19
                s3 = s3.replace("8", "9");
        System.out.println(s3);

        // replaceFIRST: replaces only the first target
        String Java = "Java Java C# C# Java";
            Java = Java.replaceFirst("C#" ,"Java");
        System.out.println(Java);

        String s4 = "Tomorrow is Monday, Tomorrow is Tuesday";
            s4 = s4.replaceFirst("Tomorrow", "Today");
        System.out.println(s4);
    }
}
