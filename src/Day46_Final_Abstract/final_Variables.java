package Day46_Final_Abstract;

public class final_Variables {

   final int InstanceVariable = 300; //called through the object

    public static void main(String[] args) {


        final double PI = 3.14; // PI never changes

        final String gender = "Male";
        //cannot change to anything else, there is only THIS COPY

        final int score; // not initialized
        score = 100; // initliazed
      //  score = 200; -> will not allow a 2nd initialize since this is a FINAL
        System.out.println(score ); // will give a compile error if not initalized before printing


        //create an object in order to call the InstanceVaribale final variable:
       final_Variables  InstanceVariable = new final_Variables();

        // final Instance Variables need to be initialized right away!

    }
}
