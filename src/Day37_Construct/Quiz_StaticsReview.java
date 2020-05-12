package Day37_Construct;


//example3
class dog{
    // these instance variables belong to the DOG class
    String name;
    int age;


}
//example3
class Test{
    public static void main(String[] args) {
        Test obj = new Test();
       // cannot call name and age through the TEST class, ONLY DOG class
        // System.out.println(obj.name);
       //  System.out.println(obj.age);
    }
}

public class Quiz_StaticsReview {
    //example1
    static int a; /* static varibale has 1 copy, so if different data is assigned
    the latest data will print */
    int b; /* holds many copies, so whatever data is assigned to variable, all data will print

    */

    //example2
    static String name = "John"; // static variable = static ONLY accepts Static
        String id = "123"; // instance variable
    //============================================================================================




    //example1
    public static void main(String[] args) {
        Quiz_StaticsReview obj1 = new Quiz_StaticsReview();
        obj1.a = 20; // a copy 1
        obj1.b = 10; // b copy 1,

        Quiz_StaticsReview obj2 = new Quiz_StaticsReview();
        obj2.a = 30; // a copy 2
        obj2.b = 40; // b copy 2

        System.out.println(obj1.a); // 30
        System.out.println(obj2.a); // will remain the same (30) since static only holds 1 copy
        System.out.println(obj1.b); // 10
        System.out.println(obj1.b); // 40

        //============================================================================================
        //example2
        System.out.println(name); // John
       //  System.out.println(id); // COMPILE ERROR because static ONLY accepts static!

        //============================================================================================

    }
}
