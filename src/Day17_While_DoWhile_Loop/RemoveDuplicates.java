package Day17_While_DoWhile_Loop;
/*
Task: count the word Java and replace the first one
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Java is fun, Java is cool";

        int count = 0;

        while(str.contains("Java")){
        // while str contains Java
            count++; // will count Java until there is no more to count
            str = str.replaceFirst("Java","");
            // after counting the first java it will be removed
        }
        System.out.println(count);
    }
}
