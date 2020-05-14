package Day38_Constructors;

public class dOG {
    // create instance variables
    String name;
    String Breed;
    int age;

    //create 1st constructor dOG with no parameters
    public dOG( ){ // sets the default for all instances
        // if this method was left blank it would print out as Null, Null, 0
        name = "unknown"; // assigned string text "unknown" to name variable
        Breed = "unknown";// assigned string text "unknown" to Breed variable
        age = 0;// // assigned int 0 to age variable


    }
    //create 2nd constructor dOG with parameters, which will be METHOD OVERLOADING
    // this parameter should ONLY be for string Breed
    public dOG(String Breed){
        //use this. for the instance variables you want to initalize
       this.Breed = Breed;
        name = "unknown"; // assigned string text "unknown" to name variable
        age = 0;
    }

    //create 3rd constructor dOG with parameters, which will be METHOD OVERLOADING
    // this parameter should ONLY be for string Breed & Age
    public dOG(String Breed, int age){
        //use this. for the instance variables you want to initalize
        this.Breed = Breed;
        this.age = age;
        name = "unknown"; // assigned string text "unknown" to name variable

    }

    //create a toString Method in order for ANY CONSTRUCTOR of dOGto be printed
public String toString(){
        return "name: "+name+", breed: "+Breed+", age: "+age;
}

}
