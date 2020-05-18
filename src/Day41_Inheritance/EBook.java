package Day41_Inheritance;

public class EBook extends Book {
    /* inherited from Book class:
            public String title;
            public String author;
            public int price;
            toString()

    create the below variables:
            size
            pages

    create the methods:
            readbook() // the title of book being read
     */

    public String size;
    public int pages;


    public void readBook(){
        System.out.println("reading "+title); // title is inherited from  Book class
    }


}
