package Day16_;

public class continueStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue; // allows you to skip # 3 and continue to 4 & 5
            }
            System.out.println(i);
        }
    }
}
