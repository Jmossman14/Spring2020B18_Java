package Day38_Constructors;

public class ConstructorPractice {
    //default constructor
    public ConstructorPractice(){
        this(10.0); // calls the 3rd constructor [ double ] and will output "C"
        System.out.println("A");
      //  this(10.0); -> Rule #3 = cannot place this here or it will give ==> Compiler error
    }

    //2nd constructor, int
    public ConstructorPractice(int a){
        this();// calls the 1st constructor [ default ] and output "A"
        //this(10.0); Rule #4 = One constructor can only call 1 constructor, and this constructor already contains 1st default constructor
        System.out.println("B");
    }

    //3rd constructor, double
    public ConstructorPractice(double a){
        //this(); Rule #5 = Constructor cannot call itself or call another constructor that it is contained in  [ default contains -> double ]
        //this(10);Rule #5 = Constructor cannot call itself or call another constructor that it is contained in [ int contains -> default contains -> double ]

        System.out.println("C");
    }

    //======================================================================
    // create main method

        public static void main(String[] args) {
            new ConstructorPractice(10);

        }



}
