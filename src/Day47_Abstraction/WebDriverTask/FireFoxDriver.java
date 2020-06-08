package Day47_Abstraction.WebDriverTask;

public class FireFoxDriver extends RemoteWebDriver {

    //Can i have an abstract method in the regular class? NO; you can only have methods with the body
    // you need to override this class since the super class is an abstract class by adding the abstract method into this class below:


    @Override
    public void get(String URL) { // accessModifier must be the same or more visible in order to use
        System.out.println("Opening " + URL + " in FireFox Browser");
    }


    @Override
    public void quit() {
        System.out.println("Closing the FireFox Browser");

    }
}
