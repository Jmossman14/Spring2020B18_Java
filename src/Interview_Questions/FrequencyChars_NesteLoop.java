package Interview_Questions;
/*
2. write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"
 */
public class FrequencyChars_NesteLoop {


        public static void main(String[] args) {
            String str = "AABCC";     //"A2B1C2" < --- text
            String result = "";   //"A2B1C2" < -- expected

            String nonDup =""; //ABC < -- removes duplicates from STR

            for(int i=0; i <= str.length()-1; i++){

                if(!nonDup.contains( ""+str.charAt(i)) ){  // if the character at index i is not contained in nonDup,
                                                        // then it WILL be concated
                    nonDup += str.charAt(i);
                }

            }

            //  System.out.println(nonDup);

// how many times each letter is duplicated
            // nonDup ="ABC";     str = "AABCC";   ==> result= "A2B1C2"

            for(int j = 0 ; j <= nonDup.length()-1; j++ ){
                char ch = nonDup.charAt(j);// pulls the CHAR in J

                int count = 0;  // count the total number of occurence of each charcter from str
                for(int i = 0; i <= str.length()-1; i++){
                    if(str.charAt(i) == ch){
                        count++;
                    }
                }
                result +=   ""+ ch  + count;//

            }



            System.out.println(result);





        }
}
