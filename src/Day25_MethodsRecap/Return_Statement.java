package Day25_MethodsRecap;
/*
Return Statement: Exits the current method immediately, does not execute anything AFTER that, within the method
 */
public class Return_Statement {
    public static void main(String[] args) {

        method1();

        System.out.println("Hello"); // this will still print because RETURN is only exiting method1, method
    }

    public static void method1(){
        if(10 > 9){
            return; // ONLY USED IN "IF STATEMENTS" TO EXIT
        }

        System.out.println("Hello Cybertek"); // Will NOT Print because "return" is in this method
    }

    public static void method2(){

    }
}
