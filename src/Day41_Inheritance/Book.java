package Day41_Inheritance;

public class Book {
    public String title;
    public String author;
    public int price;

    public String toString(){
        return "Title: "+title+" Written by: "+author+", $"+price;
    }
}
