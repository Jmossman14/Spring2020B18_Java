package Day46_Final_Abstract;

import java.io.IOException;

public class Quiz {
    public static void main(String[] args) throws RuntimeException { // if you used the super Class (Exception) or the IOException then it will compile
       // method(); // cannot be used since we used RuntimeException

    }

    public static void method() throws IOException{

        throw new IOException();
    }
}
