package Day41_Inheritance;
//SUPER CLASS
public class Animal {
    /*
    name
    size
    weight
     */

    public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name+" is eating");
    }
    public void move(){
        System.out.println(name+" is moving");
    }
}
