package Day16_;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abab"; // text
        String result = ""; // we store expected result in this variable

        for(int i = 1; i <= 3; i++){ // str.length () - 1 will be used if string of text is unknown
         // must give INT variable to represent Index # of text
             /* if(!result.contains(" "+str.charAt(i)) ){
           // if character is already contained in the result it will only print once
                  result += str.charAt(i);*/

             if(result.contains(""+str.charAt(i))){
                 continue;
             // if character is already contained in the result it will only print once, no duplicates will print
              }
        }
        System.out.println(result);
    }
}
