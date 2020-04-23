package Day26_MethodOverLoading;
/*
	2. use the above method to create another called uniques that accepts a string paramter
	and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
 */
public class Uniques {
    public static void main(String[] args) {
        String str = "ABBBCDB";
        String result = ""; // returns unique chars -> ACD

        // Find the frequency of each character in order to see if it is UNIQUE(only appears once)


        for(int i = 0; 0 < str.length();i++){ // i represents each index # in str
            int num = Frequency(str, str.charAt(0)); // use .CharAT since str is a STRING
            if(num == i){
                result += str.charAt(i); // concats the result to the character
            }

        }
        System.out.println(result);

        String str2 = "JujuuuMoss"; //
        String res2 = Uniques(str2);
        System.out.println(res2);

    }

    public static String Uniques (String str){
        String result = ""; // returns unique chars -> ACD

        for(int i = 0; 0 < str.length();i++){ // i represents each index # in str
            int num = Frequency(str, str.charAt(0));  // use .CharAT since str is a STRING
            if(num == i){
                result += str.charAt(i); // concats the result to the character
            }

        }
        return result;
    }



    public static int Frequency(String str, char ch){// counts the chars frequency
        char [] arr = str.toCharArray(); // turns the array to a CHAR array -> [A,A,A]
        // you can compare ch to ever char in the arr array using loop

        int count = 0; // used to count
        for(char each:arr ){ // each represents every char at each index [0,1,2]

            if(each == ch){// if each is equal to char [A] = [A]
                count++;// then increase the count by 1
            }
        }
        return count;
    }

}
