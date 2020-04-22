package Day12_JavaRecap;

//
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // task1: Print your first name:
        //String str = scan.next(); // returns the string, but only takes first word
       //  System.out.println(str);

        //Task2: Print your address
        String fullAddress = "";

        System.out.println("Enter the number of the building: ");
            short BNumber = scan.nextShort();
                fullAddress += BNumber+" ";

        System.out.println("Enter the street name: ");
        String streetName = scan.next();
                fullAddress += streetName+" ";

        System.out.println("Enter the type of road: ");
           String RdType = scan.next();
                fullAddress += RdType+", ";

        System.out.println("Enter the city, State, & Zipcode ");
            String City = scan.next();
                fullAddress += City+" ";

            String State = scan.next();
                fullAddress += State+", ";

            int ZipCode = scan.nextInt();
            fullAddress += ZipCode;

        System.out.println("Address is: "+fullAddress);






    }
}
