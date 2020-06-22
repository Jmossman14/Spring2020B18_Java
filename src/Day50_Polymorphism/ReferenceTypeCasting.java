package Day50_Polymorphism;



public class ReferenceTypeCasting {
    public static void main(String[] args) {
        // implicit casting - done automatically (smaller type can ALWAYS assign to larger type)
        int a = 100;
        double b = a;


        // Upcasting: (automatically and manually)
        Dog dog = new Dog(3,"Female","hie");
        Animal animal1 = dog; // upcasting done automatically, dog is casted to Animal class
        // Sub -> Super
        Animal animal2 = (Animal)dog; // upcasting done manually

        Cat cat = new Cat(10, "male", "OuiOui");
        Animal animal3 = (Animal)cat;

        System.out.println("===================================");
        //downcasting: (automatically and manually)
        double c = 10;
        int d =(int) c; // downcasting (Same or lesser DataType)


        Animal animal4 = new Dog(1,"Male","Dave");
        Dog dog3 = (Dog)animal4; // explicit / downcasting


        Animal animal5 = new Cat(9,"Male","Ju");
        // one way :
        Cat cat2 = (Cat)animal5;// downcasting: can call actions of a class, by using downcasting to get access to methods in the reference class
        cat2.Scratch();

       // second way :
       ((Cat)animal5).Scratch(); // cast then call method


    }
}
