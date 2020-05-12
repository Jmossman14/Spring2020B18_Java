package Day37_Construct;
/*
1. Create a class called Employee
			instance variables:
					name, id, ssn, jobTitle, salary, gender
			actions:
					setEmployeeInfo(): can initialize all the instance variables
					toString(): can return the info of the employee as string

 */
public class WarmUp_Employee {
    // declares each instance variable
    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;


    //can initialize all the instance variables
    // needs to be an INSTANCE method because we declared instance variables
    public void setEmployee(   String name, long id, long ssn, String jobTitle,  double salary, char gender){
        // use THIS. to call the instance variables through the parameter
        //Every parameter is attached to an instance variable
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;

    }


    //can return the info of the employee as a string
    // STRING represents the return type of this method
    public String toString(){
        return "Employee name: "+name+" ID #: "+id+" SSN: "+ssn+" Job Title: "+jobTitle+" Salary: "+salary+" Gender: "+gender;
    // return will specify how this will print on the console
    }


}
