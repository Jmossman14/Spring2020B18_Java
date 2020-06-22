package OfficeHours._06_10_2020;

public abstract class SocialMedia {
    /*

Social Media
(*) Create an abstract class for Social Media that has the following features:
    - Direct messaging(String username, String message)
    - Post(String body)
    - Notifications(int time)
(*) The Social Media will also have the following fields:

    - Personal URl (String)
    - Account length (int)
    - Platform (static String)


*/


    /*
    Created a class called "social media" and we set up the actions that this class can do
     */
    String personalUrl;
    int accountLength;
    static String platform;

    public abstract boolean directMessage (String userName, String message);

    public abstract boolean createPost(String body);

    public abstract void notification(int time);









}
