package Replits_Practice;
/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:


*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that,
 and an if that checks if its the last or first iteration of the loop
  (so you will know whet to print "*" or " ")
 */
public class StarSquare_Methods {
    public static void printHollowRect(){



            for(int j = 1; j <=5; j++){
                if(j == 1 || j ==5){
                    System.out.println("*****");
                }
                else if(j == 2 || j == 3 || j == 4){
                    System.out.println("*   *");
                }

        }



    }// end your code

    public static void main(String[] args) {

        printHollowRect();
    }




}
