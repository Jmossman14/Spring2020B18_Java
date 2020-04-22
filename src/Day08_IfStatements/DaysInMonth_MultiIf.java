package Day08_IfStatements;

public class DaysInMonth_MultiIf {
    public static void main(String[] args) {
        byte months = 4;// represents month of April
        String result = " "; // use this instead of SOUT to change the months data when
                              // it outputs


        if (months == 1){
            result = "January has 31 days";
        }
        else if (months == 2){
            result = "February has 28 days";
        }
        else if (months == 3){
            result = "March has 31 days";
        }
        else if (months == 4){
            result = "April has 30 days";
        }
        else if (months == 5){
            result = "May has 31 days";
        }
        else if (months == 6){
            result = "June has 30 days";
        }
        else if (months == 7){
            result = "July has 31 days";
        }
        else if (months == 8){
            result = "August has 31 days";
        }
        else if (months == 9){
            result = "September has 30 days";
        }
        else if (months == 10){
            result = "October has 31 days";
        }
        else if (months == 11){
            result = "November has 30 days";
        }
        else if (months == 12){
            result = "December has 31 days";
        }
        else{
            result = "Month invalid";
        }

        System.out.println(result);











    }
}
