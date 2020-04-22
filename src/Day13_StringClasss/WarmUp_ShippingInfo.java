package Day13_StringClasss;

/* TASK:
ship to address:
output:
        Full Name
        Street # Street Name
        City, State, Zipcode

 */
import java.util.Scanner;

public class WarmUp_ShippingInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter building #: ");
        String BuildingNum = input.next();
        input.nextLine(); // removes ENTER

        System.out.println("Enter Street Address: ");
        String StreetAdd = input.nextLine();


        System.out.println("Enter City name: ");
        String City = input.nextLine();


        System.out.println("Enter State: ");
        String State = input.nextLine();


        System.out.println("Enter Zipcode: ");
        int Zipcode = input.nextInt();
        input.nextLine(); // removes ENTER

        System.out.println("Enter full name: ");
        String FullName = input.nextLine();


        String FullAddress = FullName+"\n"+"\t"+BuildingNum+" "+StreetAdd+"\n"+"\t"+City+", "+State+", "+Zipcode;

        System.out.println("Ship To: "+ FullAddress);




    }
}
