package OfficeHours._06_10_2020;

public class User {
    public static void main(String[] args) {
        // password must not contain username, or it will output "Invalid"
        FacebookUser user = new FacebookUser("Java5", "Juju");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println("=============================================================");
        FacebookUser user2 = new FacebookUser("Java5", "Juju","Judy Mossman");
        System.out.println(user2.personalUrl);
        System.out.println(user2.accountLength);
        System.out.println(user2.getFullName());
    }
}
