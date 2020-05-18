package Day41_Inheritance.Task01;

import Day41_Inheritance.Task01.BusinessAnalyst;
import Day41_Inheritance.Task01.Developer;
import Day41_Inheritance.Task01.Tester;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Judy",100000.00,23,"SDET",'F');

        dev1.fixingBug();
        System.out.println(dev1);

        Tester tester1 = new Tester("Kenaz",120000.00,45,"SDET",'M');
        tester1.reporting();
        System.out.println(tester1);

        BusinessAnalyst BA1 = new BusinessAnalyst("Keora",200000.00,45,"SDET",'F');
        BA1.Gathering();
        System.out.println(BA1);


    }
}
