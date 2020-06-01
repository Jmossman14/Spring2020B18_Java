package Day46_Final_Abstract;

public class Final_method {

    //instance method, once declared as FINAL method - the method cannot be overridden
    public final void method1(){

    }
    // can a final method be overloaded? - YES
    public final void method1(int a){

    }
    // you can use a return type instead of void
    public final int method1(int a, int b){
         return 100;
    }

    // can you override the static method? - NO, even if it is not FINAL, you cannot override it
    public final static void main(String[] args) {

    }

    // declaring a constructor = accessModifier & name of Constructor (Class name)
    // Can you add final or static to a constructor? NO
    public Final_method(){


    }
}
