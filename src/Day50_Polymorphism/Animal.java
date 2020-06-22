package Day50_Polymorphism;

public abstract class  Animal {

        //variables: age / gender
        public int age;
        public String gender;

        // methods: eat / sleep

    public void Eat(){
        System.out.println("Animal is eating");
    }

    public void Sleep(){
        System.out.println("Animal is sleeping");
    }

    public static void methodA(){
         // static method can be inherited BUT cannot be overridden in child class
        System.out.println("Animal class");
    }

}
