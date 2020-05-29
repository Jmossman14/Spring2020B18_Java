package Day45_Exceptions;

public class WarmUp {
    public static void main(String[] args) {

        int pushups = 0;
        int count = 0;
        while (pushups < 20){
            System.out.println("pushup "+pushups +1);
            try{
                Thread.sleep(300);
            }catch(Exception e){

            }
            pushups++;
        }
    }








}
