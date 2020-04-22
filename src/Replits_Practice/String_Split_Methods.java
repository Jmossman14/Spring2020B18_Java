package Replits_Practice;
/*
The method person get a string with this format : "name,last name,age"
for example:

person("jon,doe,30");

the output is:

person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array
where there is a "," char
 */
import java.util.Scanner;
public class String_Split_Methods {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {
        String[] arr=info.split(",");
        // takes the input and splits words by the ,
        System.out.println("person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]);


    }//end person
}
