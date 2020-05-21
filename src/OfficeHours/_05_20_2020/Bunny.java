package OfficeHours._05_20_2020;
/*
	Bunny:	variables:	name, age, color, size, breed, isPet, numberOfeyes
    		methods: eat, sleep, drink, toString,setInfo(), Dig
    	not inherited: Dig
 */
public class Bunny extends Pet {    // Bunny IS A Pet
    // since I inherited from Pet ==> we have here all variables and methods from Pet class

    public Bunny(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }


    //  Dig() method:
    public void dig(){
        System.out.println(name+" is digging");
    }
    // we are done with the Bunny class because we inherited variables and method
}