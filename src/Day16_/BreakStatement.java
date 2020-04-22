package Day16_;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){

            if(i == 3){// break will stop loop @ the 3rd round and NOT print it a 3rd time
                break;
            }
            System.out.println("Hello World");
           // break; // forcefully stops loop
        }

    }
}
