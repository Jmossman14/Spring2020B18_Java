package Day25_MethodsRecap;
/*
Warm up tasks:
    1. write a return method named getDriver1 that accepts a string parameter called Browser
                if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
                    Ex: getDriver("chrome");  ==> "Chrome Driver"
                        getDriver("fireFOX"); ==> "FireFox Driver"
                            ....
                if the browser name does not match with any of browsers above, the method should return "Invalid"
                APPLY SWITCH STATEMENTS
    2. do the first task with multi-branch if statement instead of switch statement
    3. do the first task with ternaries instead of switch statements
 */
import java.util.Scanner;

public class Driver_WarmUp {
    public static void main(String[] args) {

       String str =  getDriver1("chrome"); // ( ) argument is mandatory
        System.out.println(str);
    }


    public static String getDriver1(String browserName) {//parameter is whatever you want it to return
        // use STRING to return a string value

        String result = "";
        switch (browserName.toLowerCase()) {// allows any input to be converted to all lower case
            case "chrome":result = "chrome Driver";
                                break;
            case "safari":result = "safari Driver";
                                break;
            case "firefox":result = "firefox Driver";
                                break;
            case "edge":result = "edge Driver";
                                break;
            case "opera":result = "opera Driver";
                                break;
            default:result = "Invalid";

        }
        return result;

    }

    public static String getDriver2(String browserName){

        browserName = browserName.toLowerCase();  //to ignore case sensitivity

        String result = "";

        if(browserName.equals("chrome")){
            result = "Chrome Driver";
        }else if(browserName.equals("firefox")){
            result = "FireFox driver";
        }else if(browserName.equals("safari")){
            result = "Safari Driver";
        }else if(browserName.equals("edge")){
            result = "Edge Driver";
        }else if(browserName.equals("opera")){
            result = "Opera Driver";
        }else{
            result = "Invalid Driver";
        }
        return result;

    }



//:()?, : ,  ()?

    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();

        String result = (browserName.equals("chrome"))? "Chrome Driver"

                :(browserName.equals("firefox"))? "Firefox Driver"

                :(browserName.equals("safari"))? "Safari Driver"

                :(browserName.equals("edge"))? "Edge Driver"

                :(browserName.equals("Opera"))?"Opera Driver" : "Invalid Driver" ;
        return result;
    }
}
