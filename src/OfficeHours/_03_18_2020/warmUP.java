package OfficeHours._03_18_2020;


/*HTTP is the protocol that governs communications
between web servers and web clients (i.e. browsers).
Part of the protocol includes a status code returned by
the server to tell the browser the status of its most recent page request.
Some of the codes and their meanings are listed below:
status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself,
the appropriate label from the above list based on status.
Example:
        if status code = 200
        output:
                ok
                int statusCode = 200;
     if(statusCode == 200){
     System.out.println("ok");}
        if status code = 201:
        output:
                accepted
*/
public class warmUP {
    public static void main(String[] args) {
        int statusCode = 200;
        if (statusCode == 200) {
            System.out.println("ok");
        }
        if ((statusCode + 1) == 201) {
            System.out.println("accepted");}
    }
}
