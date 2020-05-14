package Day38_Constructors;
/*
METHOD OVER LOADING WITH CONSTRUCTORS
            testing the functions in dOG class
 */
public class dOG_Objects {
    public static void main(String[] args) {

        // 1st Constructor for dOG
        dOG dog1 = new dOG();

        System.out.println(dog1.name); // unknown
        System.out.println(dog1.Breed);// unknown
        System.out.println(dog1.age);// 0

        System.out.println(dog1); //name: unknown, breed: unknown, age: 0

        //========================================================
        //2nd Constructor for dOG
        dOG dog2 = new dOG("Husky");

        System.out.println(dog2.name); // unknown
        System.out.println(dog2.Breed);// Husky
        System.out.println(dog2.age);// 0

        System.out.println(dog2); //name: unknown, breed: Husky, age: 0

        //========================================================
        //3rd Constructor for dOG
        dOG dog3 = new dOG("Husky",3);

        System.out.println(dog3.name); // unknown
        System.out.println(dog3.Breed);// Husky
        System.out.println(dog3.age);// 3

        System.out.println(dog3);//name: unknown, breed: Husky, age: 3

        //========================================================
        /* parameter inputs need to be placed in the order it is created in the constructor
        example: dOG dog4 = new dOG(age:3,String:"Husky");
                this will NOT compile since there are no constructors with this exact parameter order

         */

    }
}
