package Day17_While_DoWhile_Loop;
/*
While Loop: this is a repeated IF STATEMENT if the condition is true!
while(condition){statement}
condition must be true or false
statement will print over and over if TRUE
 */
public class WhileLoop {
    public static void main(String[] args) {

        for(int i = 0; i <=5 ;i++){
            System.out.println(i);
        }
        int i = 0;// initialize
         while(i <= 5){//condition
             System.out.println(i);
             i++; // if you put iterator BEFORE sout, then it will increase final # by 1
                // if you place AFTER sout, then it will output correct # based on condition
         }






    }
}
