package Day06_Shorthnd_LogisticsOperators;

public class WarmUp {
    public static void main(String[] args) {
    /*
    warmup task:
	1. write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785*/
        double Gallon = 1;
        double Litter = Gallon*3.785;
        System.out.println(Gallon+" Gallon = "+Litter+" Litters");
    /*

	2. write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785
        */
        double litter = 20;
        double gallon = litter*.264;
        System.out.println(+litter+" litters= "+gallon+" gallon");
    /*
	3. manually calculate the following code fragments:
				1. int a = 200;
					int b = -a++ + - --a * a-- % 2
					b = ?

				2. int x = 300;
				   int y = 400;
				   int z = x + y - x * y +x / y;
     */
        int a = 200; // -201 // -200 // 199
        int b = -a++ + - --a * a--%2;
        // b = -200 + -200 * 200 % 2 ( mulitplication first)
        // b = -200 + -40000 % 2 (% = 0 since there is no remainder )
        // b = -200 + 0
        // b = -200
        System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        // 300 + 400 - 300 * 400 + 300 / 400;
        // 300 * 400 = 120000 // MULTIPLICATION
        //300+400 - 120000 + 300 / 400; // DIVISiON = 0 BECAUSE 'INT' VARIABLE WILL NOT COUNT DECIMAL
        // 300 + 400 - 120000 + 0; // ADDITION
        // 700 - 120000 // SUBTRACTION
        // 119300
        System.out.println(z);













    }
}
