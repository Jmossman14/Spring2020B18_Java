package Day40_Encapsulation;

public class Encapsulation {
    //instance variables:
    private long SSN; // cannot use outside of the class

    //use GETTER, to returns the private data & read only  :
    // preferred name for getter is -> getInstanceVariableName
    // must use public access modifier so it can be used in other packages
    public long getSSN(){
        return SSN;
    }

    //use SETTER, to return the value type of the private info you used in GETTER
    // Setter needs to have a parameter, the same as the instance variable that it wants to SET(initialize)
   // must use public access modifier so it can be used in other packages
    public void setSSN(long SSN){
        this.SSN = SSN;
    }



}
