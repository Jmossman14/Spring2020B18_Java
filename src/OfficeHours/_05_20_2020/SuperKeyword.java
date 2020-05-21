package OfficeHours._05_20_2020;
/*
* super :
            super() is used for calling constructor from super class into sub class
            super.  is used for calling super class instance methods and variables
 */
class Data{
    int a = 100;

    public void method(){
        System.out.println("hello world");
    }
}


public class SuperKeyword extends Data {
    int a = 200;

    public void method(){
        System.out.println("hello cybertek");
    }

    public SuperKeyword(){
        this.method();                 // hello cybertek (calling local method from sub class (local method) using this. keyword)
        // ==>  WE DO NOT NEED THIS. we can just call like this: method();
        super.method();                // hello world    (calling method inherited from super class using super. keyword)
        System.out.println(super.a);   // 100            (calling int variable inherited from super class using super. keyword)
    }

    // to execute constructor I need to create object:

    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();

        // this how it prints on console:
        //                               hello cybertek
        //                               hello world
        //                               100
    }

}