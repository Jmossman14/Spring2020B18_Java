package Day41_Inheritance;

import Day41_Inheritance.EBook;
import Day41_Inheritance.AudioBooks;

public class BooksObjects {

    public static void main(String[] args) {
        //testing EBOOK:
        EBook book1 = new EBook();
        // must assign objects to a variable
        book1.title = "Power vs. Force";
        book1.author = "David Hawkins";
        book1.price = 20;

        book1.size = "1.5MB";
        book1.pages = 280;
        //needs to be in a SOUT method because these are only instances and NOT METHODS
        System.out.println(book1);
        System.out.println("Size: "+ book1.size);
        System.out.println("Pages: "+book1.pages);

        book1.readBook();// does not need to be in a SOUT statement because its a METHOD

        System.out.println("===================================================================");
        // testing AUDIOBOOK:
        AudioBooks book2 = new AudioBooks();
        // must assign objects to a variable
            book2.title = "Becoming";
            book2.author = "Michelle Obama";
            book2.price = 30;
            book2.length = "19 hours and 3 minutes";

        //needs to be in a SOUT method because these are only instances and NOT METHODS
        System.out.println(book2);
        System.out.println("Length of the audio book: "+book2.title+" is "+book2.length);

        book2.listen();// does not need to be in a SOUT statement because its a METHOD


    }

}
