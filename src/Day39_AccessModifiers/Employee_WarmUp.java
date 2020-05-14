package Day39_AccessModifiers;
/*
2. create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */
public class Employee_WarmUp {
    //create instance variables:
    String name;
    String jobTitle;
    long ID;
    double salary;

    //create 1st constructor to initialize the name by filling in the parameter & using this. method:
    public Employee_WarmUp(String name) {
        this.name = name;
    }

    //create 2nd constructor to initialize the jobTitle by filling in the parameter & using this. & this() method:
    // use this() to initialize whatever is in the parameter from another constructor
    public Employee_WarmUp(String name,String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    //create 3rd constructor to initialize the ID by filling in the parameter & using this. & this() method:
    // use this() to initialize whatever is in the parameter from another constructor
    public Employee_WarmUp(String name,String jobTitle,long ID) {
        this(name,jobTitle);
        this.ID = ID;
    }

    //create 4th constructor to initialize the salary by filling in the parameter & using this. & this() method:
    // use this() to initialize whatever is in the parameter from another constructor
   public Employee_WarmUp(String name,String jobTitle,long ID,double salary) {
       this(name,jobTitle,ID);
        this.salary = salary;
    }

//create toString method:
    public String toString(){
        return "Name: "+name+", Job Title: "+jobTitle+", ID: "+ID+", salary: $"+salary;
    }

}
