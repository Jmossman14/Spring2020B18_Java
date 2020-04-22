package Day05_Unary_ShortHandOperators;

public class LeapYear {
    public static void main(String[] args) {
        //Figure out if 2020 is a leap year, boolean should be math
        short year = 2020;
        boolean LeapYear = year%4==0;

        System.out.println(year+" is a leap year: "+LeapYear);
        System.out.println("=========================================");

    }
}
