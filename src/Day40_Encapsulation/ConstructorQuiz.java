package Day40_Encapsulation;



public class ConstructorQuiz {
    /*

*/
    // # 1
    public ConstructorQuiz(){
        System.out.println("A ");
    }
    // # 2
    public ConstructorQuiz(int a){
        this(2.5);
        System.out.println("B ");
    }
    // # 3
    public ConstructorQuiz(double a){
        this();
        System.out.println("C ");
    }

    public static void main(String[] args) {
        ConstructorQuiz obj1 = new ConstructorQuiz(100);
        // this is calling constructor 2 and will output everything in #3 ( #1 & "C ") & # 2 ("B ")
        System.out.println(obj1); //  ACB
    }
}