package OfficeHours._03_08_2020;

public class Practive_Variables {
    public static void main(String[] args) {
        //Variables must be initialized with a DATA in order to use
        //
        /* brand, year, price, model, miles*/
        String Brand = "BMW";
        System.out.println(Brand);
        short Year = 2020; //can use INT since its # range is large enough,
        // preferred primitive but short works//
        System.out.println(Year);
        float Price = 50000.50F; // can use double, BUT if using FLOAT must have F at
        //end of the #
        System.out.println(Price);
        String Model = "X6"; // String can cover #s as well
        System.out.println(Model);
        short MaxMiles = 32767; // can use short because that is the MAX range it covers
        System.out.println(MaxMiles);

        System.out.println("The vehicle "+Year+" "+Brand+" "+Model+", has "+MaxMiles+" miles, price is "+Price+" dollars");

        /* + is used to add multiple variables/text to a code = concatination
        sout(9 + 10) = 19 <--- addition/math variable
        sout("9" + "10") = 910 <--- text
        Text + Text = Concatination
        Text + # = Concatination
        # + Text = Concatination
        # + # = addition
         */








    }
}
