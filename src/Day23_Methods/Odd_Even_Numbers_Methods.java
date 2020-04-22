package Day23_Methods;
/*
task:
	1. write a method that can print all odd number between 1 ~ 100
	2. write a method that can print all even number between 1 ~ 100
 */
public class Odd_Even_Numbers_Methods {
    public static void main(String[] args) {
        EvenNum();
        System.out.println("");
        OddNum();

    }

    public static void EvenNum (){

        for(int i = 1; i <=100; i++){
            if(i %2 ==0){
                System.out.print(i+ ", ");
            }
        }
    }

    public static void OddNum (){

        for(int a = 1; a <=100; a++ ){
            if(a % 2 !=0){
                System.out.print(a+ ", ");
            }
        }

    }


}
