package Day28_DateTime;

import java.time.LocalDate;

/*
Warmup task:
    1. create an array of string, store five of your friends names in it
    2. create Array of localdates and store thier birthdays in the same order
    3. use for loop to print out your friends' names and thier birthdays

 */
public class WarmUp_Birthday_Time {

    public static void main(String[] args) {
        String [] names = {"Shayla", "Jen","Jennifer","Pashae","Emily"};


        LocalDate birthday[] = {LocalDate.of(1995,8,9),LocalDate.of(1992,8,10),
                LocalDate.of(1994,12,19), LocalDate.of(1995,3,15),
                LocalDate.of(1992,9,7)};

       for(int i = 0; i < names.length; i++){
            String name = names[i];
            LocalDate Bday = birthday [i];
           System.out.println(name+" birthday is "+Bday);
        }


    }
}
