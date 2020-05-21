package Day42_Inherited;
class Test2{

    //constructor w/ parameter
    public Test2(int a){
        System.out.println("A");
    }

}
public class constructor2 extends Test2{
    public constructor2(){
        super(15); // this calls the constructor w/ the parameter
        System.out.println("B");
    }

    public static void main(String[] args) {
        Test2 obj2 = new Test2(1);// this will call the 2nd constructor
         // output is -> A

        constructor2 obj1 = new constructor2(); // will output ->  A B since this is what was in the constructor2 constructor

    }
}
