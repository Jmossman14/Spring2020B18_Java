package Day23_Methods;
/*
step1: Hello Cybertek
step2: Hello World 5 times
step3: Hello Btach 18
step4: Hello World 5 times
step5: Helle Saim
step6: Hello World 5 times
 */
public class MethodsPractice {
    public static void main(String[] args) {
        /* WITHOUT METHODS:
        // Step 1:
        System.out.println("Hello Cybertek");

        //Step 2:
        for(int i = 0; i <5; i++){
            System.out.println("Hello World");
        }

        //Step 3:
        System.out.println("Hello batch 18");

        //Step 4:
        for(int i = 0; i <5; i++){
            System.out.println("Hello World");
        }

        //Step 5:
        System.out.println("Hello Saim");

        //Step 6:
        for(int i = 0; i <5; i++){
            System.out.println("Hello World");*/

        // WITH METHODS:
        //step 1:
        System.out.println("Hello cybertek");
        //Step 2:
        printHello5();
        //Step 3:
        System.out.println("Hello Batch18");
        //Step 4:
        printHello5();
        //Step 5:
        System.out.println("Hello Saim");
        //Step 6:
        printHello5();
    }

        // Create your methods below, once complete, Paste above in MAIN METHOD to print
        public static void printHello5(){
            for(int i = 0; i < 5; i++){
                System.out.println("Hello World");
            }

        }
    }

