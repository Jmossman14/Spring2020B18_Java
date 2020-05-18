package Day41_Inheritance.Task01;

import Day41_Inheritance.Task01.Employee;

public class Developer extends Employee {
       /*Inherited from Employee Class:
      public String name;
    public int Salary;
    public long ID;
    public String jobTitle;
    public char gender;
    toString()

    actions:
        fixingBug
        coding


       Create a constructor that can initizlize all the attributes of developer
*/

    public Developer(String name,double salary, long ID, String jobTitle,char gender){
        this.name=name;
        this.Salary=Salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void fixingBug(){
        System.out.println(name+" is fixing the bug");
    }

    public void coding(){
        System.out.println(name+" is coding");
    }
}
