package Day12_JavaRecap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // 7921 JonesBranch Dr, Mclean VA 22034
        // fullAddress = BuildingNumber Street, City, State, Zipcode

        System.out.println("Building Number: ");// ask user to input
        int BNumber = input.nextInt(); // user will type: Bldg # +Hit ENTER key
       // System.out.println("Building Number is: "+BNumber);// Prints out User input of bldg #
        input.nextLine(); // removes the ENTER key that user hit

        System.out.println("Street: "); // ask user to input
        String Street = input.nextLine(); // user will type: street name +Hit ENTER key
      //  System.out.println("Street is: "+Street); // Prints out User input of street name


        System.out.println("Enter the ZipCode: ");// ask user to input
        int Zipcode = input.nextInt();// user will type: zip Code +Hit ENTER key
       // System.out.println("ZipCode is: "+Zipcode);// Prints out User input of Zip code
        input.nextLine();// removes the ENTER key that user hit

        System.out.println("Enter the City, State: ");// ask user to input
        String CityState = input.nextLine();// user will type: City,State +Hit ENTER key
        //System.out.println("City, State is: "+CityState);// Prints out User input of  City,State


        String FullAddress = BNumber+" "+Street+", "+CityState+", "+Zipcode;

        System.out.println(FullAddress);





    }
}
