package Day02_Variables;

public class VariablesPractice {
    public static void main (String[]args) {
        //SALARY AFTER TAX * salary, tax rate,//

        int salary = 120000;
        double FederalTax = 0.18;
        float StateTax = 0.065F;
        double SumOfTaxes = FederalTax + StateTax;
        double SalaryAfterTax = salary * (1-SumOfTaxes);
        System.out.println(SalaryAfterTax);
        //salary after tax = salary(1 - StateTaxes + FederalTaxes)
        // 0.065 + 0.18 * 100,000 = 90600 //
        System.out.println("==========================");
//================================================================//
        // AREA OF A CIRCLE = r * r * pi//

        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);

        System.out.println("==========================");
        // CONVERT KG TO LBS //
        int kg = 90;
        double LB = kg * 2.25;
        System.out.println(LB);

        System.out.println("==========================");
        // CONVERT LIRA TO DOLLAR //
        int Lira = 1000;
        double LiraToDollar = Lira / 6.15;
        System.out.println(LiraToDollar);
        System.out.println("==========================");
        // CONVERT Rupi TO DOLLAR //
        int Rupi = 1000;
        double RupiToDollar = 0.014 * Rupi;
        System.out.println(RupiToDollar);
        System.out.println("==========================");
        // Convert Liter to Gallon//
        double liter = 10000;
        double LiterInGallon = 1000 / 3.7;
        System.out.println(LiterInGallon);




    }
}
