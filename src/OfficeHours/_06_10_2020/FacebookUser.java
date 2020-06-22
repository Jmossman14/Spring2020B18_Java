package OfficeHours._06_10_2020;

import java.util.ArrayList;

public class FacebookUser extends SocialMedia implements Groups{
    //username, password, full name, age, and number of friends
    // encapsulate to private & create getter & setter
    private String Username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private int numberOfGroups;
    private ArrayList<Post_Status> allPost; // holds all the post you make on facebook

    //static block so it does not change
    static {
        platform = "Facebook";
    }

    // create constructor; to initialize objects
    public FacebookUser(String Username, String password) {
        setUsername(Username);
        setPassword(password);
        //initialize instances from SocailMedia class
        personalUrl = "Facebook.com/" + Username;
        accountLength = 0;
        allPost = new ArrayList<>();

    }

    public FacebookUser(String Username, String password, String fullName) {

        this(Username, password);
        setFullName(fullName);
    }

    public FacebookUser(String Username, String password, String fullName, int age, int numberOfFriends) {

        this(Username, password, fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);

    }


    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.contains(Username)) {
            System.out.println("Invalid password, username cannot be in the password");
            password = "password"; // if invalid it will default to "password"
        }
        this.password = password; // if valid, it will allow user to use their own input
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {

        boolean isValid = true; // assuming name is always valid
        String check = fullName.replaceAll(" ", ""); // removes spaces

        for (int i = 0; i < fullName.length(); i++) { // checks each letter in fullName

            if (!Character.isLetter(fullName.charAt(i))) { // confirms if a character is a letter or not
                isValid = false; // isValid changes to false if this block is true
                break;

            }

        }
        if (isValid) {
            this.fullName = fullName; // will store the name if it is valid
        } else {
            System.out.println("Not a valid name");
            this.fullName = "no name";// system gives user default name if entered incorrectly
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            System.out.println("invalid age");
            age = 0; // sets age to 0 if age is invalid
        }
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {

        if (numberOfFriends >= 0) { // if # is more than 0, it will allow user input
            this.numberOfFriends = numberOfFriends;
        } else { // if not, it will set it to 0
            this.numberOfFriends = 0;
        }
    }

    @Override
    public boolean directMessage(String userName, String message) {

        if(message.isEmpty()) return false; // if message empty, it will return false

        System.out.println("Sent "+message+" to "+Username);
        return false;
    }

    @Override
    public boolean createPost(String body) {
        allPost.add(new Post_Status(body)); // calling the constructor of the Post_Status class and stores it into this arrayList
        return false;
    }

    @Override
    public void notification(int time) {

    }


    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public boolean joinGroup(String name) {
        System.out.println(fullName + " welcome to " + name);
        numberOfGroups++; // adds every group user joins to this
        return true;
    }

    public boolean leaveGroup(String name) {
        System.out.println(fullName + " do you really want to leave " + name+"?");
        numberOfGroups--;// removes every group user joins to this
        return false;
    }

}