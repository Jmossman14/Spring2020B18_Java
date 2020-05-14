package OfficeHours._05_13_2020;

public class Student {
    //instance variables:
    String name;
    long ID;
    // static variable: - there will always only be 1 copy
    static String SchoolName = "Cybertek";

    //instance methods: toString (prints name & ID of student)
    public String toString() { // will NOT compile if you place STATIC here
        return "Name: " + name + ", ID: " + ID+", School Name: "+SchoolName; // return will print out in this format
    }

    public void printScoolName(){
        System.out.println(SchoolName+" School");
    }
}
    //===================================================
    //Create a new CLASS inside this class ->Student Objects -> main method -> create objects:

    class studentObjects{
        public static void main(String[] args) {
            // create objects to test functions of Student class
            Student student1 = new Student(); // obj 1 = copy 1
                    student1.name = "Madina";
                    student1.ID = 123;
                  // if you wanted to change the schoolName you can assign it again:
                    student1.SchoolName = "harvard"; // will change original copy to -> Harvard

            Student student2 = new Student();// obj 2 = copy 2
                    student2.name = "Emrah";
                    student2.ID = 456;


            System.out.println(student1);
            System.out.println(student2);
        }
    }

