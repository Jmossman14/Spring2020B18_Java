package Day22MultiDimensional_Continue;

public class Java_Python {
    public static void main(String[] args) {

            String sentence = "I like java and javascript";
            sentence = sentence.toLowerCase();

            int countJava = 0;  // 2
            int countPython = 0;
            String[] words = sentence.split(" ");   //[I, like, java, and, javascript ]  5

            for (String each : words) {
                if (each.contains("java")) {
                    countJava++;
                }

                if (each.contains("python")) {
                    countPython++;
                }
            }

            System.out.println(countJava);
            System.out.println(countPython);
            System.out.println(countJava == countPython);

        }
    }
