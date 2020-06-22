package Day49_Polymorphisim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Employee {
    // name, ID, job title, salary
        String name;
        long id;
        String jobTitle;
        double Salary;

    // abstract method: Work
        public abstract void Work(String Description);
}

// Sub class: Tester
class Tester extends Employee{
    // create constructor & toString
    public Tester(String name, long id, String jobTitle, double Salary){

        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.Salary = Salary;


    }

    @Override
    public void Work(String Description) {
        System.out.println("As a tester, "+name+", Test and find bugs");
    }
    // 4 testers


}

//sub class: Developer
class Developer extends Employee{
    public Developer(String name, long id, String jobTitle, double Salary){

        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.Salary = Salary;


    }

    @Override
    public void Work(String Description) {
        System.out.println("As a Developer, "+name+", Codes and create application");
    }


}

//sub class; create arrayList
class ScrumTeam {

    public static void main(String[] args) {

        Employee t1 = new Tester("Judy",123,"SDET",115000);
        Employee t2 = new Tester("Anna",456,"SDET",12000);
        Employee t3 = new Tester("Natalya", 678,"QA Tester", 80000);

        Employee D1 = new Developer("Hunar",789,"Develoepr Intern",65000);
        Employee D2 = new Developer("Zuura", 234, "Developer II", 185000);
        Employee D3 = new Developer("Georg", 345, "Developer TL",19000);
        Employee D4 = new Developer("Baze",567, "Developer",152000);

        Employee[] ScrumTeam = { t1, t2, t3, D1, D2, D3, D4 };


    }

}

