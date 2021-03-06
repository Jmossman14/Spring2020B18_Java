package Day42_Inherited.Task01;
/*
task01:
		create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, setPersonInfo
		create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
		create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString
		create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID
		create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeIDwe-00
 */
/*
create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, drink, setPersonInfo
*/
public class Person {
    // instance variable with public access modifier
    public String name;
    public int age;
    public char gender;

    // methods
    // setPersonInfo(): public to be accessible, instance to use instance variables, void not returning any thing, 3 parameters
    public void setPersonInfo(String name, int age, char gender){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // eat() method : instance: each object has its own copy and to use instance variables
    public void eat(String food){
        System.out.println(name + " is eating "+food);
    }
    // sleep() method
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
    public void walk(){
        System.out.println(name + " is walking");
    }
    public void drink(String drink){
        System.out.println(name +" is drinking "+drink);
    }


}







