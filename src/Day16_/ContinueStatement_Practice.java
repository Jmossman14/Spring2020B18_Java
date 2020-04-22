package Day16_;

public class ContinueStatement_Practice {

    public static void main(String[] args) {
        for(char i = 'Z'; i<= 'A'; i--){
            if(i== 'D' || i == 'J'|| i == 'H'|| i == 'Y'){
            continue;
        }
        System.out.print(i+" ");}


        for(int a = 1; a <= 100; a++){
            if(a % 3 == 0 || a % 5 == 0){
                continue;
            }
            System.out.println(a);
        }
    }
}

