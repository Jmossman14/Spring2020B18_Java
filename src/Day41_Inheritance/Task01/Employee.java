package Day41_Inheritance.Task01;
/*
Task:
	creata  class called Employee:
			variables: salary, name, id, jobTitle, gender
			Actions: toString
	create sub class of employee name it Tester:
			variables: salary, name, id, jobTitle, gender
			actions: reportingBug, testing
			creata a constructor that can initialize all the attributes of Tester
	create subclass of employee name it developer:
	     variables: salary, name, id, jobTitle, gender
	     action: fixingBug, coding
	     creata a constructor that can initialize all the attributes of developer
     create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		creata a constructor that can initialize all the attributes of businessAnalyst
 */
public class Employee {
    public String name;
    public int Salary;
    public long ID;
    public String jobTitle;
    public char gender;

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Job Title: "+jobTitle+", Salary: "+Salary+", ID: "+ID;
    }

}
