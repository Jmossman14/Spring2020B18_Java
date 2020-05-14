package Day38_Constructors;
/*
step1: create a class called Item

		step2:	instance variables:
				name, unitPrice, quantity
			add a constructor that can initialize the fields

		step3:	instance methods:
				- calcCost(): returns the total cost as double
							hint: quantity * unitPrice

				- toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */
public class Item_WarmUp {
    // Create instance variables:
    //instance variables will allow variables to have multiple copies based on how many objects are created
  String nameOfItem;
  double unitPrice;
  int quantity;

    // add a constructor that can initialize the instance variables
    // methodName MUST be the class name (Item_WarmUp)
    public Item_WarmUp(String nameOfItem,double unitPrice, int quantity){
        this.nameOfItem = nameOfItem;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }

    //create an instance method calcCost to get total cost as double:
    // this will also be printed in the toString method below
    public double calcCost(){
        return quantity * unitPrice;
    }

    // create an instance method toString to get the name, unitprice, and quantity:
    //toString is used to print the objects that are created and will be printed the way it is typed in the method using "return"
    public String toString(){
        return "Name: " +nameOfItem+" Unit Price: "+unitPrice+" Quantity: "+quantity+
                "\nTotal Cost is: $"+calcCost();
    }

}
