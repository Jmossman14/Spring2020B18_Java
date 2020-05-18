package Day41_Inheritance.Task01;

import Day41_Inheritance.Task01.Employee;

public class Tester extends Employee {
    /*Inherited from Employee Class:
      public String name;
    public int Salary;
    public long ID;
    public String jobTitle;
    public char gender;
toString()

    actions:
        reportingBug()
        Testing()

        Create a constructor that can initizlize all the attributes of tester
     */
    public Tester(String name,double salary, long ID, String jobTitle,char gender){
        this.name=name;
        this.Salary=Salary;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }

    public void reporting(){
        System.out.println(name+" is reporting");
    }

    public void Testing(){
        System.out.println(name+" is testing");
    }

}
