package Replits_Practice;
/*
This method gets two strings (text and badWord)  and returns a string.

basicly what it dose is take out all the occurrences of badWord in text.

for example:

clean ("one two three","two")
returns "one three"

clean ("foo bar","foo")
returns "bar"

clean ("he said bla bla bla","bla")
returns "he said "
 */
public class Method_String_CleanWord {
    public static void main(String[] args) {
        String result = clean("hello Hi Hi", "Hi");

        System.out.println(result);
    }

        public static String clean (String text ,String badWord) {

        return (text.replace(badWord,""));
        }

}
