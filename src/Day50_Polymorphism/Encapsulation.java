package Day50_Polymorphism;

public class Encapsulation {

   private  String username = "cybertek";

   //create a getter using PUBLIC
    public String getUsername(){ // return type is always whatever the variableData type is
        return username; // place the variableName here

    }

    // create a setter using public
    public void setUsername(String username){
        this.username = username; // setting this allows you to modify
    }
}

//======================================================================================================================

class Test{
    public static void main(String[] args) {
        // call the class to create an object, must use getter to get the info from private variable
        Encapsulation obj = new Encapsulation();
             //         System.out.println(obj.username); < - must create getter in order to use
                      System.out.println(obj.getUsername());

        obj.setUsername("Judy"); // use the setter to assign or use the variable

            // use the get method, one more time to get the data you just set": \\
        obj.getUsername();


    }
}
