package Day41_Inheritance;

import Day41_Inheritance.Book;

public class AudioBooks extends Book {
       /* inherited from Book class:
            public String title;
            public String author;
            public int price;
             toString()

   create the instances:
        length
        narrator
   create the method:
        listen()

     */
       public String length;
       public String narrator;

       public void listen(){
           System.out.println("Listening to "+title);
       }


}
