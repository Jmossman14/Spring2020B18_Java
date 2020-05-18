package Replits_Practice;

public class Constructor_Pizza {
    //instance variables:
   private  String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    //Constructor(s) that set all of the instance variables.
    public Constructor_Pizza(String size, int cheese, int pepperoni, int ham){
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }

    //create instance methods :
    public String getSize(String size){
        return size;
    }
    public int getCheese(int cheese){
        return cheese;
    }
    public int getPepperoni(int pepperoni){
        return pepperoni;
    }
    public int getHam(int ham){
        return ham;
    }

    //use void for setter:
    //use this.instanceVariable to call through the parameter
    public void setSize(String size){
        this.size = size;
    }
    public void setCheese(int cheese){
      this.cheese = cheese;
    }
    public void setPepperoni(int pepperoni){
       this.pepperoni = pepperoni;
    }
    public void setHam(int ham){
        this.ham = ham;
    }

    // create a calCost IF STATEMENT returning the cost of the pizza
    public double calcCost() {
        double total = 0;
        if (size.equalsIgnoreCase("small")) {
            total +=  10 + (2 * (cheese+pepperoni+ham));
        }else if (size.equalsIgnoreCase("medium")){
            total += 12 + (2 * (cheese+pepperoni+ham));
        }else {
            total += 14 + (2 * (cheese+pepperoni+ham));
        }
        return total;
    }
    public String getDescription(){

        return size+"Pizza with "+cheese+" Cheese toppings, "+pepperoni+
                " Pepperoni toppings, and "+ham+" Ham toppings.\nTotal Price: "+calcCost();
    }



}