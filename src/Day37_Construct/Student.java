package Day37_Construct;

public class Student {

    // name, age, gender(M/F), and university
    // declare instance variables
    String name;
    int age;
    char gender;
    String university;


    /*  - constructor has the same functions as an INSTANCE METHOD
        - contructor execution ALWAYS depends on the objects*/
    //Constructor example:
    public  Student(String name, int age, char gender, String university){
       // always assign the paramters to the instance varibales in the constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;

    }

    // Instance method example:
    public void setInfo(   String name,int age,char gender,String university){
      // use this. to assign parameters to the instance variables
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.university = university;
    }

    // create a toString Method to print out the parameters/instance variables
    public String toString(){
        return "Name: "+name+" Age: "+ age+" Gender: "+gender+" Unversity: "+university;

        }
}
