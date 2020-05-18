package Day41_Inheritance.Task01;

import Day41_Inheritance.Task01.Employee;

public class BusinessAnalyst extends Employee {
       /*Inherited from Employee Class:
      public String name;
    public int Salary;
    public long ID;
    public String jobTitle;
    public char gender;
toString()
    actions:
        writingRequirements
        Gathering

        Create a constructor that can initizlize all the attributes of BA
     */
       public BusinessAnalyst(String name,double salary, long ID, String jobTitle,char gender){
           this.name=name;
           this.Salary=Salary;
           this.ID=ID;
           this.jobTitle=jobTitle;
           this.gender=gender;
       }

       public void writingRequirements(){
           System.out.println(name+" is writng the requirements");
       }
    public void Gathering(){
        System.out.println(name+" is gathering the documents");
    }

}
