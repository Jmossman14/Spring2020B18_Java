package OfficeHours._05_20_2020;
/*
Cat:    variables:	name, age, color, size, breed, isPet, numberOfeyes
		methods: eat, sleep, drink, toString,setInfo(), scratch
	not inherited : scratch
 */
public class Cat extends Pet {      //  Cat IS A Pet
    // since I inherited from Pet ==> we have here all variables and methods from Pet class
    //cat constructor:
    public Cat(String name, int age, String color, String size, String breed){
        setInfo(name, age, color, size, breed);
    }
    // scratch() method:
    public void scratch(){
        System.out.println(name+" is scratching");
    }
    // we are done with the Cat class because we inherited variables and method
}