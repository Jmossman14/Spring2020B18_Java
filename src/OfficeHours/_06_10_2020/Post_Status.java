package OfficeHours._06_10_2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post_Status {

    private String body;
    private String dateAndTime;


    public Post_Status(String body){ // define the body
        this.body = body; // reflects your facebook status post
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm");
        this.dateAndTime = dt.format(format);
    }

    @Override
    public String toString(){

        return body+"\n" + dateAndTime;
        //will print the body of the post and time and date it was posted
    }

}
