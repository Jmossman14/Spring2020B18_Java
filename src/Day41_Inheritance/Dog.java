package Day41_Inheritance;
//SUB CLASS
// use: extends className, allowing all variables in Animal to be used in Dog class
public class Dog extends Animal{
    /*

    public String name;
    public String seize;
    public double weight;

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void move(){
        System.out.println(name+" is moving");

     */
    public void bark(){
        System.out.println(name+" is barking");
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Lucy"; // calls name from the Animal class
        System.out.println(dog1);

        dog1.move();
        dog1.eat();
        dog1.bark();
       //  dog1.swim(); - cannot call since that is in the FISH class, this calls is calling the ANIMAL class


    }
























}
