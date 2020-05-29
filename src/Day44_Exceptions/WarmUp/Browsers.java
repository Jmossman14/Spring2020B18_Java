package Day44_Exceptions.WarmUp;
/*
warmup task:
	1. create a class called Browsers
			actions: openBrowser(): prints "opens the default browser"
					 closeBrowser(): closes the default browser

 */
public class Browsers { // super class

    // create instance methods

    protected void openBrowser(){
        System.out.println("opens the default browser");
    }

    protected void closeBrowser(){
        System.out.println("close the default browser");
    }

}
//===============================================================================
class ChromeBrowser extends Browsers{ // sub class
// over ride accessModifier must be the same or more visible
    @Override
    protected void openBrowser() {
        System.out.println("open the Chrome Browser");
    }

    @Override
    protected void closeBrowser() {
        System.out.println("close the Chrome Browser");
    }
}

//===============================================================================
class FireFoxBrowser extends Browsers{
    @Override
    protected void openBrowser() {
        System.out.println("open the FireFox Browser");
    }

    @Override
    protected void closeBrowser() {
        System.out.println("close the FireFox Browser");
    }

}

//===============================================================================
class OperaBrowser extends Browsers{
    @Override
    protected void openBrowser() {
        System.out.println("open the Opera Browser");
    }

    @Override
    protected void closeBrowser() {
        System.out.println("close the Opera Browser");
    }

}
//===============================================================================
class Test1{
public static void main(String[]args){
        ChromeBrowser obj1 = new ChromeBrowser();
        obj1.openBrowser();
        obj1.closeBrowser();
    System.out.println("===================================");
        FireFoxBrowser obj2 = new FireFoxBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();
    System.out.println("===================================");
        OperaBrowser obj3 = new OperaBrowser();
        obj3.closeBrowser();
        obj3.openBrowser();



        }

        }

