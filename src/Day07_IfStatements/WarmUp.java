package Day07_IfStatements;

public class WarmUp {
    public static void main(String[] args) {
        int FirstAngle = 75;
        int SecondAngle = 55;
        int ThirdAngle = 50;
        int TriangleTotal = 180;
        // Task 1 =
        if ((FirstAngle + SecondAngle + ThirdAngle) == TriangleTotal) {
            System.out.println("Triangle is valid");
        }
        if ((FirstAngle + SecondAngle + ThirdAngle) != 180) {
            System.out.println("Triangle is not valid");
        }
        // Task 2 = Max #
        if (FirstAngle < SecondAngle && FirstAngle < ThirdAngle) {
            System.out.println("Min # is " + FirstAngle);
        }
        if (SecondAngle < FirstAngle && SecondAngle < ThirdAngle) {
            System.out.println("Min # is " + SecondAngle);
        }
        if (ThirdAngle < FirstAngle && ThirdAngle < SecondAngle) {
            System.out.println("Min # is " + ThirdAngle);
        }
        //Task 4

        if (FirstAngle > SecondAngle && FirstAngle > ThirdAngle) {
            System.out.println("Maximum # is " + FirstAngle);
        }
        if (SecondAngle > FirstAngle && FirstAngle < SecondAngle) {
            System.out.println("Maximum # is " + SecondAngle);
        }
        if (ThirdAngle > FirstAngle && ThirdAngle > SecondAngle) {
            System.out.println("Maximum # is " + ThirdAngle);
        }
        double a = 100.5;
        double b = 200.5;
        double c = 300.5;
        boolean aGreater = a > b && a > c; // if a is > than a & c
        boolean bGreater = b > a && b > c;
        boolean cGreater = c > a && c > b;
        if (aGreater) {
            System.out.println(a + " is greater #");
        }
        if (bGreater) {
            System.out.println(b + " is greater #");
        }
        if (cGreater) {
            System.out.println(c + " is greater#");
        }
        /* task = minimum #

        boolean aMin = a < b && a < c;
        boolean bMin = b < a && b < c;
        boolean cMin = c < a && c < b;
        */
        // Task = Middle #
        // a > b && a < c || a > c && a < b
        double aa = 100;
        double bb = 200;
        double cc = 300;
        boolean aaMedium = aa>bb && aa<cc || aa>cc && aa<bb;
        boolean bbMedium = bb<aa && bb>cc || bb>aa && bb<cc;
        boolean ccMedium = cc<aa && cc<bb || cc>bb && cc<aa;
            if(aaMedium){
                System.out.println(aa+" is Medium #");
            }
        if(bbMedium){
            System.out.println(bb+" is Medium #");
        }
        if(ccMedium){
            System.out.println(cc+" is Medium #");
        }

        // Task : Elligable to vote in US
        // age of voting: 18
        int Age = 18;
        boolean citizen = true;

        boolean eligible = Age >= 18 && citizen == true ;
        if(eligible){
            System.out.println("You are eligible to vote");
        }
        if(!eligible){ // can also use eligible == fasle or != true
            System.out.println("You are not eligible to vote");
        }
    }



}