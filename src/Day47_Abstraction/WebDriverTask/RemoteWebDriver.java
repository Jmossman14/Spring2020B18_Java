package Day47_Abstraction.WebDriverTask;
/*
Create an abstract class called RemoteWebDriver

attributes: browserName
methods:
    abstract methods: get(URL), close(), maximize();

    create sub classes of RemoteWebDriver:
            1. Chrome Browser
            2. FireFoxBrowser
            3. OperaBrowser

 */
public abstract class  RemoteWebDriver { // Abstract Class & Super Class

    protected abstract void get(String URL);// adding String parameter,

     /*{ // adding String parameter, will allow sub class to place the URL of browser here
        // no need to place a code here, the subclass will take care of that
    }*/

     public abstract void quit();


}
