package Day08_IfStatements;

public class WarmUp {
    public static void main(String[] args) {
        //Task 1 = program that can check the equality of the 3 given #s
        double n1 = 100.5;
        double n2 = 200.5;
        double n3 = 300.5;
        // creating boolean conditions instead of putting all of that into IF statement
        boolean n1Equaln2 = n1 == n2 && n1 != n3; // condition for n1 == n2
        boolean n1Equaln3 = n1 == n3 && n1 !=n2; // condition for n1 == n3
        boolean n2Equaln3 = n2 == n3 && n2 !=n1; // condition for n2 == n3
        boolean AllEqual = n1 == n2 && n1 == n3; // condition for all equal
        boolean NoneEqual = n1 != n2 && n1 != n3 && n2 != n3; // condition for not equal
        /* ALL WAYS TO CODE "NONE EQUAL"
        boolean noneEqual = n1Equaln2 == false && n1Equaln2 == false && n2Equaln3 == false;
        boolean noneEqual = !n1Equaln2 && !n1Equaln2 && !n2Equaln3;
    */

       if(n1Equaln2){
           System.out.println(n1+" and "+n2+" are equal"); }
       if(n1Equaln3){
           System.out.println(n1+" and "+n3+" are equal"); }
       if(n2Equaln3){
           System.out.println(n2+" and "+n3+" are equal"); }
       if(AllEqual){
           System.out.println(n1+","+n2+","+n3+", are all equal"); }
       if(NoneEqual){
           System.out.println(n1+","+n2+","+n3+", are not equal"); }

        /* 2. write a program that can find the number of days in a month
        	 	(Assume that Feb has 28 days)
        28 days: 2
        30 days: 4,6,9,11
        31 days: 1,3,5,7,8,10,12 */
        byte month =  2; // this is representing the actual month
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31 = !days30 && !days28;
        if(days28){
            System.out.println("it has 28 days");}
        if(days30){
            System.out.println("it has 30 days"); }
        if (days31)
        {
            System.out.println("it has 31 days");}




    }
}
