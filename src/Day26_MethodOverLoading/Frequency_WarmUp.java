package Day26_MethodOverLoading;
/*
Warmup tasks:
	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop

 */
public class Frequency_WarmUp {

    // create main method first
    public static void main(String[] args) {
        String str = "AAA";
        char ch = 'A';

        char [] arr = str.toCharArray(); // turns the array to a CHAR array -> [A,A,A]
        // you can compare ch to ever char in the arr array using loop

        int count = 0; // used to count
        for(char each:arr ){ // each represents every char at each index [0,1,2]

            if(each == ch){// if each is equal to char [A] = [A]
                count++;// then increase the count by 1
            }
        }
        System.out.println(count); // the same as "return count;"

        String str2 = "abcdefggghh";
        char ch2 = 'h';
        int res1 = FrequencyChar(str2,ch2);// use frequency method to skip repeating the same steps as above
        System.out.println(res1);
    }

    public static int FrequencyChar(String str, char ch){// counts the chars frequency
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
