package Day44_Exceptions;

import java.util.NoSuchElementException;

public class Multi_CatchBlocks {

    public static void main(String[] args) {

        try {
            System.out.println(100 / 0);

        } catch (ClassCastException e) {

            System.out.println("Class Cast");

        } catch (NoSuchElementException e) {


            System.out.println("No SUch Element");

        } catch (IndexOutOfBoundsException e) {


            System.out.println("Index out of bounds");

        } catch (RuntimeException e){

            System.out.println("Runtime");
        }


    }

}
