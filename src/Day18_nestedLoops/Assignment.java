package Day18_nestedLoops;
/*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter

 */
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Kingbed = 120;
        int QueenBed = 100;
        int Singlebed = 80;

        int totalPrice = 0;

        while (true) {
            System.out.println("Which bedroom do you want to reserve?: ");
            String room = input.nextLine();

            while (!(room.equalsIgnoreCase("King bed")
                    || room.equalsIgnoreCase("Queen bed")
                    || room.equalsIgnoreCase("Single bed"))) {
                System.out.println("Please re-enter bedroom choice:");
                room = input.next();

            }

            if (room.equalsIgnoreCase("King Bed")) {
                totalPrice += Kingbed;

            } else if (room.equalsIgnoreCase("Queen bed")) {
                totalPrice += QueenBed;

            } else if (room.equalsIgnoreCase("Single bed")) {
                totalPrice += Singlebed;

            }
            System.out.println("Your total price is: $" + totalPrice);
            System.out.println("do you want to reserve another room?");
            String answer = input.next();

            while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {
                System.out.println("Please re-enter 'Yes' or 'No' to continue");
                answer = input.next();

                if (answer.equalsIgnoreCase("Yes")) {
                    room = input.nextLine();
                }
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("your total price is: " + totalPrice + "$");
                break;
            }
            room = input.nextLine();
        }
    }
    // bug is when invalid entry, it outputs the below
    /*
        Which bedroom do you want to reserve?:
        queen b
        Please re-enter bedroom choice:
        queen bed
        Please re-enter bedroom choice:
        Please re-enter bedroom choice:     */
}