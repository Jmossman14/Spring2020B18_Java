package Day47_Abstraction.WebDriverTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://www.google.com"); // must add URL for specific browser
        driver1.quit();// doesnt have a parameter

        FireFoxDriver driver2 = new FireFoxDriver();
        driver2.get("https://www.firefox.com"); // must add URL for specific browser
        driver2.quit();// doesnt have a parameter

        OperaDriver driver3 = new OperaDriver();
        driver3.get("https://www.opera.com");// must add URL for specific browser
        driver3.quit();// doesnt have a parameter


    }
}
