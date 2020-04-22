package Day21MultiDimensional_Arrays;

public class Switch_Arrays {
    public static void main(String[] args) {
        int wd = 0;
        String[] days = {"sun","mon","wed","sat"};
                    //    0      1     2     3
        for(int i = 0; i < days.length; i++){
            switch(days[i]){
                case"sat":
                case"sun":
                    wd -= 1; // -1 now wd = -1
                    break; // exits the SWITCH statement only since its in the loops body it will continue to repeat
                // mon & wed get added together as 1 when mon is in loop (1+2)
                case "mon":
                    wd++; // increase by 1, now wd = 0
                    // 2 also gets added again when wed is in loop
                case "wed":
                    wd+=2; // increase by 2,
            }
        }// addition: -1 + 1 + 2 + 2 = 3
        System.out.println(wd);
    }
}
