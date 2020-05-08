package Day33_CustomClass;
import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setCatInfo("Siemes", "White",2, "Sasha");

        // System.out.println( cat1 ); // Sasha, breed is Siemes, color is  White,  2 years old

        Cat cat2 = new Cat();
        System.out.println(cat2); // doesnt output anything since there is nothing assigned to the variable
        cat2.setCatInfo("Scottish", "Beige", 7,"Bobo" );
        System.out.println(cat2); // will output since there is a variable assigned


        Cat cat3 = new Cat();
        cat3.setCatInfo("Calico","brown-white",6,"Cinnamon");


        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1, cat2, cat3) );

        for(int i = 0; i < catList.size(); i++){
            System.out.println(  catList.get(i)  );
        }

        System.out.println("=====================================");
        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("====================================");
        // calling each method and adding catFood
        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kabab");

        System.out.println("=================================");
        // calling each method and adding drink
        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");







    }

}