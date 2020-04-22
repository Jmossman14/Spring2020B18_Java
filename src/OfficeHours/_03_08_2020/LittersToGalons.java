package OfficeHours._03_08_2020;
/*Tasks02:
        create a class called LittersToGalons, and write
        a program that can convert litters to galons and print out the result
*/
public class LittersToGalons {
    public static void main(String[] args) {
        int Liter = 15;
        double Gallon = 3.96;
        double LiterToGallon = Liter/ 3.785;
        System.out.println(LiterToGallon);
        System.out.println(Liter+" Liter is equal to "+LiterToGallon+" Gallon");
    }
}
