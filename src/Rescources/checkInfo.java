package Rescources;

import Day39_AccessModifiers.PersonalInfo;

public class checkInfo {
    public static void main(String[] args) {
        //check the static variables from package Day39_AccessModifiers.PersonalInfo;
        System.out.println("Name: "+ PersonalInfo.name);// compiles since this is a PUBLIC modifier
        System.out.println("Gender: "+PersonalInfo.gender);// compiles since this is a PUBLIC modifier

        /*System.out.println("Grade: "+PersonalInfo.grade); -> will not compile since this is a PRIVATE modifier
        System.out.println("SSN: "+PersonalInfo.SSN); -> will not compile since this is a PRIVATE modifier
        System.out.println("ID: "+PersonalInfo.ID); -> will not compile since this is a PRIVATE modifier
        System.out.println("Age: "+PersonalInfo.Age); -> will not compile since this is a PRIVATE modifier
*/
        //check static variables through an object:
        PersonalInfo obj1 = new PersonalInfo();
        System.out.println(obj1.name);// compiles since this is a PUBLIC modifier
        System.out.println(obj1.gender);// compiles since this is a PUBLIC modifier

        /*System.out.println(obj1.grade); -> will not compile since this is a PRIVATE modifier
        System.out.println(obj1.SSN); -> will not compile since this is a PRIVATE modifier
        System.out.println(obj1.ID); -> will not compile since this is a PRIVATE modifier
        System.out.println(obj1..Age); -> will not compile since this is a PRIVATE modifier

        */

    }
}
