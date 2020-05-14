package Day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

/*
create a class called ShoppingList
			create 5 objects of Item and store them into List of Items
			calculate the total cost of all Items in the list
 */
public class ShoppingList_WarmUp {
    public static void main(String[] args) {
        // creating an object
  //ConstructorClassName    objName = new  ConstructorClassName(String name,double unitPrice, int quantity);
    Item_WarmUp obj1 = new Item_WarmUp("Toilet Paper", 4.20,3);
                                     // ^^fill out based on the parameter in the constructor: name, unitPrice, quantity
        Item_WarmUp obj2 = new Item_WarmUp("Toilet Paper", 4.20,3);
        Item_WarmUp obj3 = new Item_WarmUp("oranges", 5,5);
        Item_WarmUp obj4 = new Item_WarmUp("banana", 6.10,2);
        Item_WarmUp obj5 = new Item_WarmUp("coffee", 20,1);


        // obj1.calcCost will allow you to print out total cost in double
        System.out.println(obj1.calcCost()); // outputs:

        // to get the all the information printed to console,
        System.out.println(obj1); // outputs:

    //add all objects into an ArrayList
        ArrayList<Item_WarmUp> shoppingList = new ArrayList<>();
        // use add.All w/ Arrays.asList in order to add objects to the ArrayList
        shoppingList.addAll( Arrays.asList (obj1,obj2,obj3,obj4,obj5)  );

        //declare a double variable to get the totalCost of all the items:
        double totalCost = 0;

        //create a FOR EACH loop to get the objects totalcost from the arrayList
        // use Item_WarmUp as the dataType in this loop since we are calling the info from that class
        for(Item_WarmUp each : shoppingList){ // each == each object in the shoppingList
                totalCost += each.calcCost(); // totalCost will store the total cost of each item and add it to every obj
            // totalCosat = obj1 + obj2 + obj3 + obj4 + obj5
            // each.calcCost = will calculate each obj based on the calcCost method [ which is quantity * UnitPrice ]
        }

        //create a FOR loop to get the objects totalcost from the arrayList

    for(int i = 0; i <shoppingList.size(); i++){// loop will stop running at the end of the shopping list depending on how many objects are added
        totalCost+=shoppingList.get(i).calcCost();/*gets each obj @ i in the shopping list and uses the calculation in calcCost
                                        to get the totalCost [ will add all objects together ]     */
    }

    }
}
